package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao{
	
	public static final String PARAM_MAX_IG_ID = "maxIgId";


	private static String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM LoaiHang\n"
			+ " WHERE MaLH < :maxIgId";
	
	private static String GET_ALL_ITEM_GROUPS_HQL = ""
			+ "SELECT ig FROM ItemGroup ig\n"
			+ "WHERE ig.id < :maxIgId";
	
	private static String GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP = ""
			+ "SELECT lh.MaLH" + ItemGroupDto.PROP_IG_ID + ","
			+ "lh.TenLH" + ItemGroupDto.PROP_IG_NAME + ","
			+ "SUM(ctmh.SoLuong)" + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "SoLuongMatHang\n"
			+ "FROM MatHang mh\n"
			+ "JOIN ChiTietMatHang ctmh\n"
			+ "ON mh.MaMH = ctmh.MaMH"
			+ "JOIN LoaiHang lh\n"
			+ "ON mh.MaLH = lh.MaLH\n"
			+ "WHERE mh.MaLH < :maxIgId\n"
			+ "GROUP BY mh.MaLH";
	
	
	// Yêu cầu
	// 1. Câu truy vấn trả dữ liệu về 1||n bảng trong database
	// 2. Các bảng đã được ánh xạ/mapping với JAVA class
	// Ví dụ: Bảng: LoaiHang
	//        Lớp : ItemGroup(entity)
	
	public List<ItemGroup> getAll() {
		Session session = openSession();
		NativeQuery<ItemGroup> query = session.createNativeQuery(
				GET_ALL_ITEM_GROUPS, ItemGroup.class);
		query.setParameter("maxIgId", 10, IntegerType.INSTANCE);
		List<ItemGroup> result = query.getResultList();
		return result;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroups() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP);
		
		// get values via alias(s) in query --> set values into dto
		query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
			 .addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
			.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
			.setParameter(PARAM_MAX_IG_ID, 8, IntegerType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		executeInTransaction(session -> session.saveOrUpdate(itemGroup));
	}
	
	@Override
	public void demo1stLevelCache() {
		Session sesson1 = openSession();
		Session sesson2 = openSession();
		
		ItemGroup s1Ig2 = sesson1.get(ItemGroup.class, 2); 
		System.out.println("s1I1 --> " + s1Ig2);
		
//		sesson1.evict(s1Ig2);
		sesson1.clear();
		System.out.println();
		
		ItemGroup s1Ig2Aganin = sesson1.get(ItemGroup.class, 2); 
		System.out.println("s1I1 --> " + s1Ig2Aganin);
		
		ItemGroup s2Ig2 = sesson2.get(ItemGroup.class, 2); 
		System.out.println("s1I1 --> " + s2Ig2);
	}
}