package lession02-manual;

public class App.java {
    public static void main(String[] args) {
        MonHoc mh1 = new MonLapTrinhJava();
        MonHoc mh2 = new MonTHLapTrinhJava();
        System.out.println(mh1.diem(5.2, 7.2));
        System.out.println(mh2.diem(4.7, 10.0));
    }
}
interface MonHoc {
       double diem(double TP, double CK);
}
class MonLapTrinhJava implements MonHoc{

    public MonLapTrinhJava() {}
    @Override
    public double diem(double TP, double CK) {
        return TP*0.4+CK*0.6;
    }

}
class MonTHLapTrinhJava implements MonHoc{
    public MonTHLapTrinhJava() {}

    @Override
    public double diem(double TP, double CK) {
        return TP*0.5+CK*0.5;
    }

}