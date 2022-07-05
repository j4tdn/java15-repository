import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String pass = null ;

        do {
            System.out.println("Enter password :");
            try {
                pass = scanner.nextLine();
                validatePassword(pass);
                System.out.println(validatePassword(pass));
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }

    private static boolean validatePassword(String pass){
        String patten = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
        return Pattern.matches(patten,pass);
    }
}
