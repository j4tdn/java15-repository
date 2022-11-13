-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: java13_shopping
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `chitietdonhang`
--

LOCK TABLES `chitietdonhang` WRITE;
/*!40000 ALTER TABLE `chitietdonhang` DISABLE KEYS */;
INSERT INTO `chitietdonhang` VALUES (1,1,'M',1),(1,3,'L',2),(1,4,'XL',1),(2,6,'S',2),(2,8,'S',2),(3,1,'M',4),(3,2,'M',2);
/*!40000 ALTER TABLE `chitietdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `chitietmathang`
--

LOCK TABLES `chitietmathang` WRITE;
/*!40000 ALTER TABLE `chitietmathang` DISABLE KEYS */;
INSERT INTO `chitietmathang` VALUES (1,'L','undefined.png',199,220,44),(1,'M','undefined.png',199,190,88),(1,'S','undefined.png',199,80,20),(2,'M','undefined.png',199,180,120),(2,'S','undefined.png',199,130,60),(3,'L','undefined.png',620,550,10),(3,'XL','undefined.png',190,130,20),(4,'XL','undefined.png',630,580,40),(4,'XXL','undefined.png',200,180,60),(5,'S','undefined.png',120,80,80),(6,'M','undefined.png',410,350,20),(6,'S','undefined.png',140,120,10),(7,'M','undefined.png',230,200,40),(7,'S','undefined.png',999,170,60),(8,'S','undefined.png',230,180,200),(9,'L','undefined.png',320,190,50),(9,'M','undefined.png',140,120,30),(10,'M','undefined.png',80,60,90),(10,'S','undefined.png',560,520,70);
/*!40000 ALTER TABLE `chitietmathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `chitiettinhtrangdonhang`
--

LOCK TABLES `chitiettinhtrangdonhang` WRITE;
/*!40000 ALTER TABLE `chitiettinhtrangdonhang` DISABLE KEYS */;
INSERT INTO `chitiettinhtrangdonhang` VALUES (1,3,2,'2020-12-14 18:20:20'),(1,4,2,'2020-12-15 18:20:20'),(1,5,2,'2022-04-23 00:00:00'),(2,3,2,'2020-12-14 18:20:20'),(2,4,2,'2020-12-15 18:20:20'),(2,5,2,'2020-12-16 18:20:20'),(3,3,2,'2020-12-14 18:20:20'),(3,4,2,'2020-12-15 18:20:20'),(3,5,2,'2020-12-16 18:20:20');
/*!40000 ALTER TABLE `chitiettinhtrangdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `chucvu`
--

LOCK TABLES `chucvu` WRITE;
/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
INSERT INTO `chucvu` VALUES (1,'Bộ phận quản lý'),(2,'Nhân viên bán hàng'),(3,'Nhân viên giao hàng');
/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (1,'Âu Cơ - Hòa Khánh','034 767 2514','2020-12-18 16:33:20',20,0,1,1,1,'Giao hàng sau 10H sáng'),(2,'Nam Cao - Hòa Khánh','034 167 2514','2020-12-18 20:12:44',50,0,2,2,1,NULL),(3,'Phan Chu Trinh - Hải Châu','034 267 2514','2020-12-17 18:19:24',0,0,3,1,1,NULL),(4,'Lê Lai - Hải Châu','034 367 2514','2021-01-05 21:07:53',120,0,3,2,1,NULL);
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
INSERT INTO `hoadon` VALUES (1,1,'2022-05-07 00:00:00',2069),(2,2,'2022-05-07 00:00:00',740),(3,3,'2022-05-07 00:00:00',1194);
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Lê Văn Khách','defaul.com.tp@gmail.com','Nam Cao - Hòa Khánh - Đà nẵng','0936 126 363','nf'),(2,'Hoàng Văn Nam','defaul.com.tp@gmail.com','Phan Chu Trinh - Hải Châu 1 - Đà nẵng','036 126 363','nf'),(3,'Nguyễn Nam Bằng','defaul.com.tp@gmail.com','Phan Chu Trinh - Hải Châu 1 - Đà nẵng','097 126 363','nf');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `kichco`
--

LOCK TABLES `kichco` WRITE;
/*!40000 ALTER TABLE `kichco` DISABLE KEYS */;
INSERT INTO `kichco` VALUES ('L','L - Nam Nữ 41 - 50KG'),('M','M - Nam Nữ 31 - 40KG'),('S','S - Nam Nữ 21 - 30KG'),('XL','XL - Nam Nữ 51 - 60KG'),('XXL','XXL - Nam Nữ 61 - 70KG');
/*!40000 ALTER TABLE `kichco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `loaihang`
--

LOCK TABLES `loaihang` WRITE;
/*!40000 ALTER TABLE `loaihang` DISABLE KEYS */;
INSERT INTO `loaihang` VALUES (1,'Áo'),(2,'Quần'),(3,'Giày dép'),(4,'Thắt lưng'),(5,'Mũ'),(6,'Ví'),(7,'Nón'),(8,'LH8'),(9,'LH9'),(10,'LH10'),(11,'LH11'),(12,'LH12'),(13,'LH13'),(14,'LH14'),(15,'LH15'),(16,'LH16'),(17,'LH17'),(18,'LH18'),(19,'LH19'),(20,'LH20'),(21,'LH21'),(22,'LH22'),(111,'IG 111'),(123,'LH123'),(222,'IG 222'),(333,'IG 333'),(999,'LH999'),(1111,'IG 1111'),(3333,'IG 3333');
/*!40000 ALTER TABLE `loaihang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `loaihinhthanhtoan`
--

LOCK TABLES `loaihinhthanhtoan` WRITE;
/*!40000 ALTER TABLE `loaihinhthanhtoan` DISABLE KEYS */;
INSERT INTO `loaihinhthanhtoan` VALUES (1,'Cash'),(2,'Visa Card');
/*!40000 ALTER TABLE `loaihinhthanhtoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `mathang`
--

LOCK TABLES `mathang` WRITE;
/*!40000 ALTER TABLE `mathang` DISABLE KEYS */;
INSERT INTO `mathang` VALUES (1,'Áo sơ mi Nam','Trắng',1),(2,'Áo sơ mi Nữ','Đen',1),(3,'Quần tây Nam','Xanh',2),(4,'Quần jean Nam','Nâu',2),(5,'Quần jean Nữ','Trắng',2),(6,'Giày da Nam','Đen',3),(7,'Giày thể thao Nữ','Vàng',3),(8,'Thắt lưng Nam','Hồng',4),(9,'Thắt lưng Nữ','Xanh',4),(10,'Mũ thể thao Nam','Trắng',5),(11,'Áo khoác','Hồng',1),(12,'Áo khoác','Trắng',1),(13,'Máy Quạt','Trắng',8),(14,'Công tắc điện','Trắng',8);
/*!40000 ALTER TABLE `mathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Lê Tèo','com1.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng','0936 978 033','827ccb0eea8a706c4c34a16891f84e7b',1),(2,'Lê Na','com2.default.tp@gmail.com','Âu Cơ - Hòa Khánh - Đà Nẵng','0936 978 033','adcaec3805aa912c0d0b14a81bedb6ff',2),(3,'Hoàng Bửi','com3.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng','0936 978 033','992a6d18b2a148cf20d9014c3524aa11',2),(4,'Ngọc Thành','com4.default.tp@gmail.com','Lê Độ - Hòa Khánh - Đà Nẵng','0936 978 033','c4ded2b85cc5be82fa1d2464eba9a7d3',3),(5,'Công Danh','com5.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng','0936 978 033','099ebea48ea9666a7da2177267983138',3),(6,'','com6.default.tp@gmail.com','','','46a208654142b8f07a6e08288ad6fe0a',1),(7,'','com7.default.tp@gmail.com','','','e1d538156b8a5d4ffa8a308d8402d066',1);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tinhtrangdonhang`
--

LOCK TABLES `tinhtrangdonhang` WRITE;
/*!40000 ALTER TABLE `tinhtrangdonhang` DISABLE KEYS */;
INSERT INTO `tinhtrangdonhang` VALUES (1,'Yêu cầu đặt hàng'),(2,'Đặt hàng thành công'),(3,'Đang đóng gói'),(4,'Đang vận chuyển'),(5,'Giao hàng thành công');
/*!40000 ALTER TABLE `tinhtrangdonhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-30 18:55:10
