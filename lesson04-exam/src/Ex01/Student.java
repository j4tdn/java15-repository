package Ex01;

public class Student {
	private int maSV;
    private String tenSV;
    private float diemLT, diemTH;
 
  
    public Student() {
    }

    public Student(int maSV, String tenSV, Float diemLT, Float diemTH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
       
    }
 
  
    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getTenSV() {
        return tenSV;
    }
 
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
 
    public float getDiemLT() {
        return diemLT;
    }
 
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
 
    public float getDiemTH() {
        return diemTH;
    }
 
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
 
    public float MediumScore() {
        return (diemTH + diemLT) / 2;
    }
    @Override
    public String toString() {
        return maSV + " - " + tenSV + " diem Tb : " + MediumScore();
    }
   

}
