Class: 
+ Customer:  id, name, phone address
+ Item: id, os, color, cost
=> ItemDetail: item, quantity
=> Order: customer, item_details[], date_time

B1: Create list of cusstomers
B2: Create array of items in store
B3: Shopping function

+ Who is buying
+ List of items
+ Amount of each item
+ DateTime

=> Order: customer, item_details[], date_time
=> ItemDetail: item, quantity

c1: KH1, Adam , 123, NewYork
c2: KH2, Kate, 243, California

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4+, IOS, White, 280
i4: IP12, IOS, Black, 880
i5: WP8, Windowphone, Blue, 560

o1: c1, {id1(i1, 3), id2(i4, 1), id3(i2, 1)}, 10:10:10, 08.05.2021
o2: c2, {id1(i3, 2), id2(i5, 1), id3(i2, 1)}, 20:10:12, 07.05.2021
o3: c2, {id1(i4, 1)}, 10:10:10, 09:28:32 08.05.2021

Function: export(order) => TotalOfAmount: Void
 