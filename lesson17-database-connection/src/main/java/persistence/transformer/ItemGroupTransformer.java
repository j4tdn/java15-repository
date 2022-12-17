package persistence.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import persistence.ItemDto;
import persistence.ItemGroupDto;

public class ItemGroupTransformer {
    private ItemGroupTransformer() {
		// TODO Auto-generated constructor stub
	}
    public static ItemGroupDto transform(ResultSet rs) throws SQLException {
    	String itemAsString = rs.getString("DanhSachMatHang");
    	return new ItemGroupDto(rs.getInt("MaLH")
    			, rs.getString("TenLH")
    			, rs.getInt("Soluong")
    			,Pattern.compile(",")
     	       .splitAsStream(itemAsString) // Stream<String>
     	       .map(ItemDto::convert)
     	       .collect(Collectors.toList()));
    }
    
}
