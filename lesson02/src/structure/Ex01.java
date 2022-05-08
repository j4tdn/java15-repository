package structure;

/**
 khi nào biến dùng KDL nguyên thủy, đối tượng

 KDL Nguyên thủy khi:
 + int, float,char,double: lưu dữ liệu (luôn luôn tồn tại, không được null)
 KDL Đối tượng  khi:
 + Integer, String, Double,...: single value
 + Item,Custom -- > dối tượng mình tạo ra: wrapper chứa thông tin các thuộc tính bên trong
 + giá trị co thể NULL hoặc NON- NULL
 + (class(biến(lưu trữ dữ liệu), hàm(chức năng)):

 Extends: Collections
 csdl: lưu trữ dữ liệu(cột(KDL)) >> có hoặc không
 >> đổ ra ứng dụng (thuộc tính) >> đối tượng
 */

public class Ex01 {
    public static void main(String[] args) {
        char a = 'y';
        System.out.println("is digit:" + Character.isAlphabetic(a));
     }
}
