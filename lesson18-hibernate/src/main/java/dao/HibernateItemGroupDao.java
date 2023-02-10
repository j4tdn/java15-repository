package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {

//	private static String GET_ALL_ITEM_GROUPS = ""
//			+ "SELECT * FROM LoaiHang\n"
//			+ " WHERE MaLH < :maxIgId";
	// HQL
//	private static String GET_ALL_ITEM_GROUPS = "" + "SELECT ig " + "FROM ItemGroup ig \n" + "WHERE ig.id < :maxIgId";
	// data warehouse : luu tru du lieu lon trong database

	// Yêu cầu
	// 1. Câu truy vấn trả dữ liệu về 1||n bảng trong database
	// 2. Các bảng đã được ánh xạ/mapping với JAVA class
	// Ví dụ: Bảng: LoaiHang
	// Lớp : ItemGroup(entity)

	private static String GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP = "" + "SELECT lh.MaLH " + ItemGroupDto.PROP_IG_ID + ","
			+ "		  lh.TenLH " + ItemGroupDto.PROP_IG_NAME + "," + "		  SUM(ctmh.SoLuong)"
			+ ItemGroupDto.PROP_AMOUNT_OF_ITMES + " \n" + " FROM MatHang mh\n" + "JOIN ChiTietMatHang ctmh \n"
			+ " ON mh.MaMH = ctmh.MaMH" + " JOIN loaihang lh \n" + "	ON mh.MaMH = lh.MaLH"
			+ " WHERE mh.MaLH < :maxIgId" + " GROUP BY mh.MaLH ";

	public List<ItemGroup> getAll() {
		Session session = openSession();
		// Option 1 : Native querys
		// NativeQuery<ItemGroup> query = session.createNativeQuery(
		// GET_ALL_ITEM_GROUPS, ItemGroup.class);
		// Option 2 : jpql/hql
		// Query<ItemGroup> query =
		// session.createQuery(GET_ALL_ITEM_GROUPS,ItemGroup.class);
		// Option 3 : jql/hql namedquerries
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.GET_ITEM_GROUPS, ItemGroup.class);
		query.setParameter("maxIgId", 14, IntegerType.INSTANCE);
		List<ItemGroup> result = query.getResultList();
		return result;

		// Option 4 : Hibernate OOP query language --> CriteriaQuery
	}

	@Override
	@SuppressWarnings("deprecation")
	public List<ItemGroupDto> getItemGroups() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP);

		// get values via alia(s) in query --> set values into dto
		query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_ID, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITMES, LongType.INSTANCE)
				.setParameter(PARAM_MAX_IG_ID, 8, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		// TODO Auto-generated method stub
		executeInTransaction(session -> session.saveOrUpdate(itemGroup));
	}

	@Override
	public void demo1stCacheLevel() {
		Session session1 = openSession();
		Session session2 = openSession();
		
		ItemGroup s1I2 = session1.get(ItemGroup.class, 2); // get from database
		System.out.println("s1T1 ->" + s1I2);
		System.out.println();
		
		ItemGroup s1I2Again = session1.get(ItemGroup.class, 2);
		System.out.println("s1T2 ->" + s1I2Again);
		
	}

}