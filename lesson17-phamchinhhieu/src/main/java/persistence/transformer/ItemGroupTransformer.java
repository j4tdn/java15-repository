package persistence.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import persistence.ItemDto;
import persistence.ItemGroupDto;

public class ItemGroupTransformer {

	public ItemGroupTransformer() {
		// TODO Auto-generated constructor stub
	}
	
	public static ItemGroupDto transform(ResultSet rs) throws SQLException {
		ItemGroupDto  result = new ItemGroupDto(
				rs.getInt("MaLH"),
				rs.getString("TenLH"),
				rs.getInt("SoLuong"),
				Pattern.compile(",")
					.splitAsStream( rs.getString("DanhSachMatHang"))
					.map(ItemDto::convert)
					.collect(Collectors.toList())
		);
		return result; 
		
	
	}
}
