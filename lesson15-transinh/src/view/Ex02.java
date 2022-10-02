package view;

public class Ex02 {
	
    public static void main(String[] args)
    {
    	String str ="aaaababbbbddc"; 
        int[] tan_suat = new int[255];
        int i = 0, max, l;
        int ascii;
        l = str.length();
        for (i = 0; i < 255; i++)
        {
            tan_suat[i] = 0;
        }
        i = 0;
        while (i < l)
        {
            ascii = str.charAt(i);
            tan_suat[ascii] += 1;

            i++;
        }
        max = 0;
        for (i = 0; i < 255; i++)
        {
            if (i != 32)
            {
                if (tan_suat[i] > tan_suat[max])
                    max = i;
            }
        }
        System.out.println("Ky tu xuat hien nhieu nhat : "+(char)max);

    }
}
