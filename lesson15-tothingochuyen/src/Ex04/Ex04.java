package Ex04;

import java.io.File;

/**
 * Miss IT - Cuộc thi hoa hậu đang diễn ra hàng tuần tại học viện hoàng gia. Ở
vòng chung kết để tìm ra những thí sinh xuất sắc nhất, ban tổ chức đưa ra cách tính điểm
mới, trong đó mỗi giám khảo không chấm điểm mà chọn tối thiểu 1 và tối đa 3 thí sinh
mà mình đánh giá cao nhất để xếp hạng.
Thí sinh đầu tiên trong danh sách sẽ được 3 điểm, thí sinh thứ 2 được 2 điểm và thí sinh
thứ 3 được 1 điểm.
Tổng điểm của các thí sinh sẽ quyết định người chiến thắng.
Nếu có các thí sinh bằng điểm nhau, thí sinh nào được chọn ở vị trí số 1 nhiều hơn sẽ
chiến thắng
Nếu tất cả các thí sinh có cùng số điểm bình chọn ở vị trí số 1 sẽ được xem xét vị trí thứ 2.
Nếu vẫn bằng nhau, tất cả các thí sinh sẽ chiến thắng.
Dữ liệu được đọc từ file miss.txt với format như sau
Đối với mỗi bài thi, dòng đầu tiên ghi số lượng giám khảo N (không quá 100).
N dòng tiếp theo sẽ ghi lại thông tin số lượng lựa chọn của giám khảo (từ 1 đến 3), tiếp
theo là các giá trị id ứng cử viên đã chọn.
 * */
public class Ex04 {

	private static String pathname = String.join(File.separator, "miss.txt");
	public static void main(String[] args) {
		
	}
}
