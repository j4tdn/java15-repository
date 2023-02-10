package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import dto.ItemDto;
import dto.ItemGroupDto;

public class ItemGroupTransformer {
	private ItemGroupTransformer() {}
	public static ItemGroupDto transform(ResultSet rs) throws SQLException {

	List<ItemDto> items = Pattern.compile(",")
			   .splitAsStream(rs.getString("DanhSachMatHang"))
			   .map(ItemDto::new)
			   .collect(Collectors.toList());
	return new ItemGroupDto(
			rs.getInt("MaLH"),
			rs.getString("TenLH"), 
			items,
			rs.getInt("SoLuong"));
		
	}
}
