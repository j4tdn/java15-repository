import java.util.Scanner;
/**
 *	Có tham khảo trên mạng, chưa hiểu vì sao khai báo int minrow[] = new int[3] thay vì minrow = 0;
 */
public class FindSaddleElement {
	static int row, col;

	public static void main(String[] args) {
		int row, col;
		int arr[][] = new int[3][3];
		input(arr);
		show(arr);
		findSaddleElement(arr);
	}

	public static void input(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng: ");
		row = sc.nextInt();
		System.out.print("Nhập số cột: ");
		col = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Nhập phần tử " + i + " , " + j + ": ");
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public static void show(int arr[][]) {
		System.out.println("Hiển thị ma trận: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void findSaddleElement(int arr[][]) {
		int minrow[] = new int[3];
		int maxcol[] = new int[3];
		for (int i = 0; i < row; i++) {
			minrow[i] = arr[i][0];
			for (int j = 0; j < col; j++) {
				if (minrow[i] > arr[i][j]) {
					minrow[i] = arr[i][j];
				}
			}
		}

		for (int j = 0; j < row; j++) {
			maxcol[j] = arr[0][j];
			for (int i = 0; i < col; i++) {
				if (maxcol[j] < arr[i][j]) {
					maxcol[j] = arr[i][j];
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if ((arr[i][j] == minrow[i]) && (arr[i][j] == maxcol[j])) {
					System.out.println("Phần tử yên ngựa là: " + arr[i][j]);
				}
			}
		}
	}
}
