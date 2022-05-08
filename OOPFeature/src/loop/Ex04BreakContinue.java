package loop;

public class Ex04BreakContinue {
    public static void main(String[] args) {
        for (int i = 1 ; i <10;i++){
            if (i==4){
//                break;
               continue;//kết thúc sớm vòng lập hiện tại, tại điểm đó
            }
            System.out.print(i + "\t");
        }
    }
}
