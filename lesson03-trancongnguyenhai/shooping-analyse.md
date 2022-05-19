A. Class
-Customers: id, name, phone, address
-Item: id, os, color, cost

Step1: Create list of customers
Step2: Create array of items in store
Step3: Shopping function

- Who is buying?
- List of item
- Amount of each item
- Datetime

=> Order: customers, item_details[],date_time
=> ItemDetail: item, quantity

============================================

B.Object
c1: KH1, Yasuo, 1234, Lonia
c2: Kh2, Jayce, 4567, Piltover

i1: SS10+, Android, Black, 620
i2: IPX, IOS, Gray, 1500
i3: IP7,IOS, White, 500
i4: HuaweiX1, Android, Blue, 500
i5: OppoF5, Android, Red, 500

o1: c1, {id1(i1,3), id2(i3,1), id3(i4,1)}, 10:10:10 18.05.2022
o1: c1, {id1(i2,1), id2(i3,1), id3(i4,1)}, 11:10:10 19.05.2022
o1: c1, {id1(i1,6)}, 15:10:10 28.05.2022

Function: export(order)