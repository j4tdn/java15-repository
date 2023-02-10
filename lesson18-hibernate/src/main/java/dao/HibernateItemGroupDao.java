package dao;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
	
	private static String PARAM_MAX_IG_ID = "maxIgId";
	private static String SQL_PARAM_MAX_IG_ID = ":" + PARAM_MAX_IG_ID;
	
	
	private static String GET_ALL_ITEM_GROUPS = "" 
            + "SELECT * FROM LoaiHang\n" 
			+ "WHERE MaLH < :maxIgId";

	
	private static String GET_ALL_ITEM_GROUPS_HQL = "" 
	        + "SELECT ig FROM ItemGroup ig\n"
	        + "WHERE ig.id < :maxIgId";
    
	private static String GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP = ""
			+ "SELECT lh.MaLH "+ ItemGroupDto.PROP_IG_ID+","
			+ "        LH.TenLH "+ ItemGroupDto.PROP_IG_NAME + ","
			+ "        sum(ctmh.SoLuong) "+ ItemGroupDto.PROP_AMOUNT_OF_ITEM + " \n "
			+ "  FROM MatHang mh\n"
			+ "  JOIN ChiTietMatHang ctmh\n"
			+ "    ON mh.MaMH = ctmh.MaMH"
			+ "  JOIN LoaiHang lh\n"
			+ "    ON mh.MaMH = ctmh.MaMH\n"
			+ " WHERE mh.MaLH <" + SQL_PARAM_MAX_IG_ID + "\n"
			+ " GROUP BY mh.MaLH";
			
	@Override
	public List<ItemGroup> getAll() {
		Session session = openSession();
//		NativeQuery<ItemGroup> query = session.
//				createNativeQuery(GET_ALL_ITEM_GROUPS, ItemGroup.class);
//		

		// query.setParameter("maxIgId", 10);
		// Opt2: jpql/hql
		// Query<ItemGroup> query =
		// session.createQuery(GET_ALL_ITEM_GROUPS_HQL,ItemGroup.class);
		// Opt2 jdql/hql -->namedquery;
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.GET_ITEM_GROUPS, ItemGroup.class);
		query.setParameter("maxIgId", 10, IntegerType.INSTANCE);
		List<ItemGroup> result = query.getResultList();
		return result;
		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroups() {
	NativeQuery<?> query =	openSession().createNativeQuery(GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP);
	
	query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
	     .addScalar(ItemGroupDto.PROP_IG_NAME,StringType.INSTANCE)
	     .addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEM,LongType.INSTANCE)
	     .setParameter(PARAM_MAX_IG_ID, 8 ,IntegerType.INSTANCE)
	     .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
          return	safeList(query);
	     
		
		
	}
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		
		executeInTransaction( session -> session.saveOrUpdate(itemGroup));
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
		
		ItemGroup s1Ig2Again = session1.get(ItemGroup.class, 2); // GET from 1st cache
		System.out.println("s1Ig2Again --> " + s1Ig2Again);
		
		ItemGroup s1Ig4Again = session1.get(ItemGroup.class, 4); // GET from 1st cache
		System.out.println("s1Ig4Again --> " + s1Ig4Again);
		
		System.out.println();
		
		doTask(5);
		
		ItemGroup s2Ig2 = session2.get(ItemGroup.class, 2); // GET from DB
		System.out.println("s2Ig2 --> " + s2Ig2);
		
		// proxy, call procedure, function
	}
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
