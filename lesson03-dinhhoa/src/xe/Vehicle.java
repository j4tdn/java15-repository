package xe;

public class Vehicle {
	private int dungTich;
    private double giaTri;
    private String chuXe,loaiXe;
 
    public Vehicle( int dungTich, double giaTri, String chuXe, String loaiXe) {
        this.dungTich = dungTich;
        this.giaTri = giaTri;
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
    }
    public Vehicle(){
 
    }
 
    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getGiaTri() {
        return giaTri;
    }
 
    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }
 
    public String getChuXe() {
        return chuXe;
    }
 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
 
    public String getLoaiXe() {
        return loaiXe;
    }
 
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
 
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=giaTri*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = giaTri * 0.03;
        else thue = giaTri * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return chuXe + "-" + "loaiXe" + "-" +dungTich + "-" + giaTri;
}
 
    void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",chuXe,loaiXe,dungTich,giaTri,tinhThue());
    }
}
