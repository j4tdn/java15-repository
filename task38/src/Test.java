
public class Test {
	public static void main(String[] args) {
		Country country1 = new Country(81, "Nhật Bản");
		Country country2 = new Country(86, "Hàn Quốc");
		Country country3 = new Country(84, "Việt Nam");
		Country country4 = new Country(44, "Vương Quốc Anh");
		
		
		Date date1 = new Date(13, 9, 2008);
		Date date2 = new Date(31, 11, 2002);
		Date date3 = new Date(8, 10, 2010);
		Date date4 = new Date(15, 6, 2002);
		
		
		Manufacturer manufacturer1= new Manufacturer("Fujitsu", country1);
		Manufacturer manufacturer2= new Manufacturer("Samsung", country2);
		Manufacturer manufacturer3= new Manufacturer("CSM", country3);
		Manufacturer manufacturer4= new Manufacturer("Lenovo", country4);
		
		ComputerManufacturer computerManufacturer1= new ComputerManufacturer("Fujitsu Lifebook", manufacturer1, date1, 606.5, 6);
		ComputerManufacturer computerManufacturer2= new ComputerManufacturer("Samsung Notebook 9", manufacturer2, date2, 902.3, 24);
		ComputerManufacturer computerManufacturer3 = new ComputerManufacturer("Xaohu 90", manufacturer3, date3, 713.2, 12);
		ComputerManufacturer computerManufacturer4= new ComputerManufacturer("Mackbook Pro", manufacturer4, date4, 1005.3, 36);
		
		System.out.println("Gía máy 1 lớn hơn máy 3: "+computerManufacturer1.comparePrice(computerManufacturer3));
		System.out.println("Gía máy 2 lớn hơn máy 4: "+computerManufacturer2.comparePrice(computerManufacturer4));
		
		
		System.out.println("Tên quốc gia: "+computerManufacturer1.takeCountryName());
		System.out.println("Tên Quốc Gia lLaptop2:"+computerManufacturer2.takeCountryName());
	}

}
