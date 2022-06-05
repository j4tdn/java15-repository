package inheritance.multiple;

//public class Child extends Father, Mother{
public class Child implements Dad, Mom {

	public static void main(String[] args) {
		Child son = new Child();
		son.smoking();
		son.playSport();
	}

	@Override
	public void shopping() {

	}

	@Override
	public void smoking() {

	}

	@Override
	public void playSport() {

	}

}
// Java khong ho tro da thua ke / multiple extends , vi khi class con ke thua tu class cha --> khong bat buoc override
// --> neu cac class cha co cac ham trung ten ma minh khong override 
// lai trong class con thi khi Con con = new Con() roi goi con X, thi no khong biet goi X trong class cha nao
