package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ItemGroupTransformer {
    public ItemGroupTransformer() {
		// TODO Auto-generated constructor stub
	}
    public static ItemGroupDto transform(ResultSet rs) throws SQLException {
    	String itemAsString = rs.getString("DanhSachMatHang");
    	return new ItemGroupDto(rs.getInt("MaLH"),
    			rs.getString("TenLH"), 
    			rs.getInt("SoLuong"),
    			Pattern.compile(",")
    			.splitAsStream(itemAsString)
    			.map(ItemDto::convert)
    			.collect(Collectors.toList()));
    }
}
