package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao{
	
	private static final String PRAM_MAX_IG_ID = "maxIgId";
	private static final String SQL_GET_MAX_IG_ID = ":" + PRAM_MAX_IG_ID;
	
//	private static String GET_ALL_ITEM_GROUPS = ""
//			+ "SELECT * FROM LoaiHang\n"
//			+ " WHERE MaLH < :maxIgId";
//	
//	private static String GET_ALL_ITEM_GROUPS_HQL = ""
//			+ "SELECT ig FROM ItemGroup ig\n"
//			+ " WHERE ig.id < :maxIgId";
	
	private static String GET_AMOUNT_OF_ITEM_PER_ITEM_GROUPS = ""
			+ "SELECT lh.MaLH "+ ItemGroupDto.PROP_IG_ID +",\n"
			+ "		  lh.TenLH "+ ItemGroupDto.PROP_IG_NAME +", \n"
			+ "		  sum(ctmh.SoLuong) "+ ItemGroupDto.PROP_AMOUNTS_OF_ITEMS +"\n"
			+ "  FROM MatHang mh\n"
			+ "  JOIN ChiTietMatHang ctmh\n"
			+ "    ON mh.MaMH = ctmh.MaMH\n"
			+ "  JOIN LoaiHang lh\n"
			+ "    ON mh.MaLH = lh.MaLH\n"
			+ " WHERE mh.MaLH < " + SQL_GET_MAX_IG_ID + "\n"
			+ " GROUP BY  mh.MaLH\n";
	
	// data warehouse --> big data
	
	/* Yêu cầu
	 * 1. Câu truy vấn trả dữ liệu về 1 || n bảng trong database
	 * 2. Các bảng đã được ánh xa/mapping với JAVA class (entity)
	 * vd: Bảng: LoaiHang
	 * 	   Lớp: ItemGroup
	 * */
	@Override
	public List<ItemGroup> getAll() {
		Session session = openSession();
		// Otp1: native query
		// NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ALL_ITEM_GROUPS, ItemGroup.class);
		
		// Otp2.1: jphl/hql
		// Query<ItemGroup> query = session.createQuery(GET_ALL_ITEM_GROUPS_HQL, ItemGroup.class);
		
		// Otp2.2: jphl/hql
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.GET_ITEM_GROUPS,ItemGroup.class);
		query.setParameter("maxIgId", 10, IntegerType.INSTANCE);
		List<ItemGroup> result = query.getResultList();	
		return result;
		
		// Opt3: Hibernate OOP query language --> CriteriaQuery
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public List<ItemGroupDto> getItemGroups() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_AMOUNT_OF_ITEM_PER_ITEM_GROUPS); 
		// get values via alias(s) in query --> set values into dto
		query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
			 .addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
			 .addScalar(ItemGroupDto.PROP_AMOUNTS_OF_ITEMS, LongType.INSTANCE)
			 .setParameter(PRAM_MAX_IG_ID, 8, IntegerType.INSTANCE)
			 .setResultTransformer(new AliasToBeanResultTransformer(ItemGroupDto.class));
		return safeList(query);
	}
	
	@Override
	public void saveOrUpate(ItemGroup itemGroup) {
		executeInTransaction(session -> session.saveOrUpdate(itemGroup));
	}
	
	@Override
	public void demo1stLevelCache() {
		// just save in cache memory
		
		Session session1 = openSession();
		Session session2 = openSession();
		
		ItemGroup s1I1 =  session1.get(ItemGroup.class, 1); // GET FROM DB
		System.out.println("s1I1 ---> " + s1I1);
		
		System.out.println();
		
		
		ItemGroup s1I1Again =  session1.get(ItemGroup.class, 1); // GET FROM DB
		System.out.println("s1I2 ---> " + s1I1Again);
		
		ItemGroup s1I2 =  session2.get(ItemGroup.class, 2); // GET FROM DB
		System.out.println("s2I2 ---> " + s1I2);
		
		
	}
}
