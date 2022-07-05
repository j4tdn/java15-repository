package view;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {
	public static final String KHONG = "không";
	public static final String MOT = "một";
	public static final String HAI = "hai";
	public static final String BA = "ba";
	public static final String BON = "bốn";
	public static final String NAM = "năm";
	public static final String SAU = "sáu";
	public static final String BAY = "bảy";
	public static final String TAM = "tám";
	public static final String CHIN = "chín";
	public static final String LAM = "lăm";
	public static final String LE = "lẻ";
	public static final String MUOI = "mươi";
	public static final String MUOIF = "mười";
	public static final String MOTS = "mốt";
	public static final String TRAM = "trăm";
	public static final String NGHIN = "nghìn";
	public static final String TRIEU = "triệu";
	public static final String TY = "tỷ";

	public static final String[] number = { KHONG, MOT, HAI, BA, BON, NAM, SAU, BAY, TAM, CHIN };

	public static ArrayList<String> readNum(String a) {
		ArrayList<String> kq = new ArrayList<String>();


		ArrayList<String> List_Num = Split(a, 3);

		while (List_Num.size() != 0) {
			switch (List_Num.size() % 3) {
			case 1:
				kq.addAll(read_3num(List_Num.get(0)));
				break;
			case 2:
				ArrayList<String> nghin = read_3num(List_Num.get(0));
				if (!nghin.isEmpty()) {
					kq.addAll(nghin);
					kq.add(NGHIN);
				}
				break;
			case 0:
				ArrayList<String> trieu = read_3num(List_Num.get(0));
				if (!trieu.isEmpty()) {
					kq.addAll(trieu);
					kq.add(TRIEU);
				}
				break;
			}

			if (List_Num.size() == (List_Num.size() / 3) * 3 + 1 && List_Num.size() != 1)
				kq.add(TY);

			List_Num.remove(0);
		}

		return kq;
	}

	public static ArrayList<String> read_3num(String a) {
		ArrayList<String> kq = new ArrayList<String>();
		int num = -1;
		try {
			num = Integer.parseInt(a);
		} catch (Exception ex) {
		}
		if (num == 0)
			return kq;

		int hang_tram = -1;
		try {
			hang_tram = Integer.parseInt(a.substring(0, 1));
		} catch (Exception ex) {
		}
		int hang_chuc = -1;
		try {
			hang_chuc = Integer.parseInt(a.substring(1, 2));
		} catch (Exception ex) {
		}
		int hang_dv = -1;
		try {
			hang_dv = Integer.parseInt(a.substring(2, 3));
		} catch (Exception ex) {
		}

		if (hang_tram != -1) {
			kq.add(number[hang_tram]);
			kq.add(TRAM);
		}

		switch (hang_chuc) {
		case -1:
			break;
		case 1:
			kq.add(MUOIF);
			break;
		case 0:
			if (hang_dv != 0)
				kq.add(LE);
			break;
		default:
			kq.add(number[hang_chuc]);
			kq.add(MUOI);
			break;
		}

		switch (hang_dv) {
		case -1:
			break;
		case 1:
			if ((hang_chuc != 0) && (hang_chuc != 1) && (hang_chuc != -1))
				kq.add(MOTS);
			else
				kq.add(number[hang_dv]);
			break;
		case 5:
			if ((hang_chuc != 0) && (hang_chuc != -1))
				kq.add(LAM);
			else
				kq.add(number[hang_dv]);
			break;
		case 0:
			if (kq.isEmpty())
				kq.add(number[hang_dv]);
			break;
		default:
			kq.add(number[hang_dv]);
			break;
		}
		return kq;
	}

	public static ArrayList<String> Split(String str, int chunkSize) {
		int du = str.length() % chunkSize;
		// Nếu độ dài chuổi không phải bội số của chunkSize thì thêm # vào trước cho đủ.
		if (du != 0)
			for (int i = 0; i < (chunkSize - du); i++)
				str = "#" + str;
		return splitStringEvery(str, chunkSize);
	}
	
	public static ArrayList<String> splitStringEvery(String s, int interval) {
		ArrayList<String> arrList = new ArrayList<String>();
		int arrayLength = (int) Math.ceil(((s.length() / (double) interval)));
		String[] result = new String[arrayLength];
		int j = 0;
		int lastIndex = result.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			result[i] = s.substring(j, j + interval);
			j += interval;
		}
		result[lastIndex] = s.substring(j);
		arrList.addAll(Arrays.asList(result));
		return arrList;
	}
	
	public static void main(String[] args) {
		ArrayList<String> kq = readNum("1114");
		for (int i = 0; i < kq.size(); i++) {
			System.out.print(kq.get(i) + " ");
		}
	}

}
