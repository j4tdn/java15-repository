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

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {
	private static final String PARAM_MAX_IG_ID = "maxIgId";
	private static final String SQL_PARAM_MAX_IG_ID = ":" + PARAM_MAX_IG_ID;
	
	private static String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM LoaiHang\n"
			+ "WHERE  MaLH < :maxIgId";
	
	private static String GET_ALL_ITEM_GROUPS_HQL = ""
			+ "SELECT ig FROM ItemGroup ig\n"
			+ "WHERE ig.id < :maxIgId";
	
	private static String GET_AMOUNT_ITEM_PER_ITEM_GROUP = ""
			+ "SELECT lh.MaLH " + ItemGroupDto.PROP_IG_ID + ", "
			+ "		  lh.TenLH " + ItemGroupDto.PROP_IG_NAME + ", "
			+ "		  SUM(ctmh.SoLuong) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM LoaiHang lh\n"
			+ "  JOIN MatHang mh\n"
			+ "    ON lh.MaLH = mh.MaLH\n"
			+ "  JOIN ChiTietMatHang ctmh\n"
			+ "    ON mh.MaMH = ctmh.MaMH\n"
			+ " WHERE mh.Malh < " + SQL_PARAM_MAX_IG_ID + ""
			+ " GROUP BY lh.MaLH";
	
	// GROUP BY theo lh.MaLH hoặc mh.MaLH có khác nhau
	// trên lý thuyết là như này:
	// nếu lấy lh.MaLH mà không có mặt hàng nào trong loại hàng, thì số lượng = 0 (không nên)
	// Ở trường hợp trên thi vẫn ok vì đã join các bảng lại với nhau
	
	// data warehouse
	public List<ItemGroup> getAll() {
		Session session = openSession();
		//opt1: native query
//		NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ALL_ITEM_GROUPS,ItemGroup.class);
		//opt2: hql
//		Query<ItemGroup> query = session.createQuery(GET_ALL_ITEM_GROUPS_HQL,ItemGroup.class);
		//opt2: 
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.GET_ITEM_GROUPS, ItemGroup.class);
		query.setParameter("maxIgId", 10, IntegerType.INSTANCE);
		return query.getResultList();
		
		//opt3: Hibernate OOP query language --> criteriaQuery
	}
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroups() {
		System.out.println(GET_AMOUNT_ITEM_PER_ITEM_GROUP);
		NativeQuery<?> query = openSession().createNativeQuery(GET_AMOUNT_ITEM_PER_ITEM_GROUP);
		
		query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
			 .addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
			 .addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, LongType.INSTANCE)
			 .setParameter(PARAM_MAX_IG_ID, 8)
			 .setResultTransformer(new AliasToBeanResultTransformer(ItemGroupDto.class));
		return safeList(query);
	}
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		executeInTransaction(session -> session.saveOrUpdate(itemGroup));
	}
	@Override
	public void demo1stLevelCache() {
		Session session1 = openSession();
		Session session2 = openSession();
		
		ItemGroup s1Ig2 = session1.get(ItemGroup.class, 2); // GET from DB
		System.out.println("s1Ig2 --> " + s1Ig2);
		
		ItemGroup s1Ig4 = session1.get(ItemGroup.class, 4); // GET from DB
		System.out.println("s1Ig4 --> " + s1Ig4);

		
		System.out.println();
//		session1.evict(s1Ig2);
//		session1.clear();
		
		
		ItemGroup s1Ig2Again = session1.get(ItemGroup.class, 2); // GET from 1st Cache
		System.out.println("s1Ig2Again --> " + s1Ig2Again);
		ItemGroup s1Ig4Again = session1.get(ItemGroup.class, 4); // GET from 1st Cache
		System.out.println("s1Ig4Again --> " + s1Ig4Again);
		
		System.out.println();
		
		ItemGroup s2Ig2 = session2.get(ItemGroup.class, 2); // GET from DB
		System.out.println("s2Ig2 --> " + s2Ig2);
		
	}
}
