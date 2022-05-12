#Giải thích code bài 4
##### Đề bài

Viết chương trình nhập vào một dãy các số nguyên từ bàn phím.  
Tìm số lẻ lớn nhất trong dãy số và in ra.  
Gợi ý : 5 1 9 11 20 19 17 21 30 => Kết quả : 21

##### Ý tưởng từng bước để giải quyết bài toán

1. Các phần tử số nguyên nhập từ bàn phím sẽ đưa vào một Array (int[] nums) với số lương (int size) cố định, chưa phân biệt chẵn hay lẻ.
2. Duyệt qua từng phần tử và check là số lẻ thì đưa phần tử đó vào một Array (int[] oddNums). Size của Array oddNums sẽ bằng size của Array nums chứ không thể hơn.
3. Duyệt qua từng phần tử trong Array oddNums và tìm số lẻ lớn nhất (int maxOddNum).
4. Trường hợp user nhập các phần tử mà không có phần tử nào là số lẻ thì sẽ output một message là không có số lẻ nào cả.
5. Validation cho tất cả data được nhập từ bàn phím của user. Tránh bị lỗi do data không hợp lệ.

##### Implement từng bước theo ý tưởng
- **Nhập size và nhập lần lượt các phần tử vào Array nums.**

![Tux, the Linux mascot](..\..\img\Step 1.png)

- **Viết hàm check một số lẻ hay không.**

![Tux, the Linux mascot](..\..\img\Step 2.png)

- **Copy các phần tử là số lẻ từ Array nums sang Array oddNums và so sánh từng phần tử để tìm số lẻ lớn nhất maxOddNum**

![Tux, the Linux mascot](..\..\img\Step 3.png)

- **In ra kết quả số lẻ lớn nhất được trả về. Nếu trường hợp user không nhập số lẻ nào cả thì in ra message**

![Tux, the Linux mascot](..\..\img\Step 4.png)