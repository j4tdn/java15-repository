package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoV2;
import persistence.ItemDtoV3;
import persistence.ItemDtoV4;
import persistence.ItemGroup;
import utils.DateUtils;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;

	private final String sql = "select mh.MaMH ," + " mh.TenMH , " + " cast(dh.ThoiGianDatHang as time) ThoiGianDatHang"
			+ " from mathang mh " + " join chitietdonhang ctdh " + " on mh.MaMH = ctdh.MaMH " + " join donhang dh "
			+ " on dh.MaDH = ctdh.MaDH " + " where Date(dh.ThoiGianDatHang)" + " = ? ;";

	private final String GET_ITEMS_WITH_HIGHEST_PRICE = " with ThongTinMatHang as (\r\n"
			+ "   select mh.* , lh.TenLH , ctmh.GiaBan \r\n" + "   from loaihang lh \r\n" + "   join mathang mh \r\n"
			+ "   on lh.MaLH = mh.MaLH\r\n" + "   join chitietmathang ctmh \r\n" + "   on ctmh.MaMH = mh.MaMH\r\n"
			+ " ),\r\n" + " ThongTinGiaBan as (\r\n" + "   select  MaLH , max(GiaBan) GiaBanCaoNhat \r\n"
			+ "   from ThongTinMatHang\r\n" + "   group by MaLH )\r\n"
			+ "select mh.MaMH , mh.TenMH , mh.MauSac , mh.MaLH,gb.GiaBanCaoNhat  from ThongTinMatHang mh\r\n"
			+ "          join ThongTinGiaBan gb\r\n" + "          on mh.MaLH = gb.MaLH\r\n"
			+ "          and mh.GiaBan = gb.GiaBanCaoNhat\r\n" + "         ;";

	private final String GET_HOT_ITEMS = "select mh.TenMH  from mathang mh join chitietdonhang ctdh on mh.MaMH = ctdh.MaMH\r\n"
			+ "						 join donhang dh on dh.MaDH = ctdh.MaDH\r\n"
			+ "                         where Year(dh.ThoiGianDatHang) = ?\r\n"
			+ "                         group by mh.MaMH order by mh.MaMH asc , sum(ctdh.SoLuong) desc limit 3;" ;
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemDtoV2> getItems(LocalDate deliveryDate) {
		ArrayList<ItemDtoV2> result = new ArrayList<ItemDtoV2>();
		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, DateUtils.toSDate(deliveryDate));
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemDtoV2 item = new ItemDtoV2(rs.getInt("MaMH"), rs.getString("TenMH"),
						rs.getTime("ThoiGianDatHang").toLocalTime());
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<ItemDtoV3> getItemWithHighestPrice() {
		List<ItemDtoV3> result = new ArrayList<ItemDtoV3>();

		try {
			st = connection.createStatement();
			rs = st.executeQuery(GET_HOT_ITEMS);
			while (rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getString("MaLH"));
				result.add(new ItemDtoV3(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getString("MauSac"), itemGroup,
						rs.getDouble("GiaBanCaoNhat")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<ItemDtoV4> getHotItems(int findingYear) {
		List<ItemDtoV4> result = new ArrayList<ItemDtoV4>();
		try {
			Year year = Year.of(findingYear);
			pst = connection.prepareStatement(GET_HOT_ITEMS);
			pst.setInt(1, year.getValue());
			rs	 =	pst.executeQuery();
			while (rs.next()) {
				result.add(new ItemDtoV4(rs.getString("TenMH")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
