package Kiemtra;

public class Bai1 {
public boolean isPowerOf(int a, int b) {
	double logab = Math.log(a)/Math.log(b);
	int logabi =(int)(Math.floor(logab));
	if(logab - logabi == 0)
		return true;
	else
		return false;
}
}
