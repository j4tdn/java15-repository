package dao;

import java.util.List;

import javax.transaction.Transaction;
import javax.xml.crypto.dsig.Transform;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToBeanConstructorResultTransformer;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import dto.ItemGroupDto;
import persistence.Item;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {
	//native query --> query(ngôn ngữ truy vấn) chỉ thưc hiện đươc trên 1 hệ quản trị csdl nào đó
	private static String PARAM_MAX_IG_ID = "maxIgId";
	private static String SQL_PARAM_MAX_IG_ID = ":" + PARAM_MAX_IG_ID;
	private static String GET_ALL_ITEM_GROUPS = " "
			+ "select * from LoaiHang"
			+ "where MaLH < :maxIgId";
	
	//hibernate query language
	private static String GET_ALL_ITEM_GROUPS_HQL = " "
			+ "SELECT ig from ItemGroup ig\n"
			+ "where ig.id< :maxIgId";
	private static String GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP = ""
			+ "SELECT lh.MaLH " + ItemGroupDto.PROP_IG_ID + ","
			+ "       lh.TenLH " + ItemGroupDto.PROP_IG_NAME + ","
			+ "       SUM(ctmh.SoLuong) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM MatHang mh\n"
			+ "  JOIN ChiTietMatHang ctmh\n"
			+ "	   ON mh.MaMH = ctmh.MaMH"
			+ "  JOIN LoaiHang lh\n"
			+ "    ON mh.MaLH = lh.MaLH"
			+ " WHERE mh.MaLH < " + SQL_PARAM_MAX_IG_ID + "\n"
			+ " GROUP BY mh.MaLH";
	//Yêu cầu
	//1. Câu truy vấn trả dữ liệu về 1||n bảng trong database
	//2. Các bảng đã được ánh xạ/mapping với JAVA class(Entity)
	//Ví dụ: Bảng: LoaiHang
	//			Lớp: ItemGroup(entity)
	@Override
	public List<ItemGroup> getAll() {
		Session session = openSession();
		// option1: native query 
		//NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ALL_ITEM_GROUPS, ItemGroup.class);
		
		//option2:jpql/hql
		//Query<ItemGroup> query = session.createQuery(GET_ALL_ITEM_GROUPS_HQL, ItemGroup.class);
		
		// option 3: jpql/hql --> named query
		Query<ItemGroup> query  = session.createNamedQuery(ItemGroup.GET_ITEM_GROUPS, ItemGroup.class);
		query.setParameter("maxIgId", 14, IntegerType.INSTANCE);
		List<ItemGroup> result = query.getResultList();
		return result;
		
		//option4: Hibernate OOP query language --> criteriaQuery
	}
	@SuppressWarnings("deprecation")
	public List<ItemGroupDto> getItemGroups() {
		// EntityManager(JPQ) = Session(Hibernate)
		NativeQuery<?> query = openSession()
				.createNativeQuery(GET_AMOUNT_OF_ITEMS_PER_ITEM_GROUP);
		
		// get values via alias(s) in query --> set values into dto
		query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE) // rs.getInt("MaLH") --> igId
		     .addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE) // rs.getString("TenLH")
		     .addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, LongType.INSTANCE)
		     .setParameter(PARAM_MAX_IG_ID, 8, IntegerType.INSTANCE)
		     .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		// JPA -> Hibernate -> Spring Data
		
		return safeList(query);
	}
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		//openSession().saveOrUpdate(itemGroup);
		executeInTransaction(session -> session.saveOrUpdate(itemGroup));
	}
	@Override
	public void demo1stLevelCache() {
		Session session1 = openSession();
		Session session2 = openSession();
		ItemGroup s1Ig2 = session1.get(ItemGroup.class, 2);
		System.out.println("s1Ig2 = " + s1Ig2);
	}
}
