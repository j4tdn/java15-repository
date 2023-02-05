package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.IntegerType;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao{

	private static String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM LoaiHang\n"
			+ " WHERE MaLH < :maxIgId";
	
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
	
}