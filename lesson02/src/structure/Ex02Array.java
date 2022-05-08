package structure;

public class Ex02Array {
    public static void main(String[] args) {
        int b [] = {5,7,9,12,4};
        // tìm những số bội của 3 và in ra
        //duyệt : forIndex(duyệt theo chỉ số), forEach(duyệt theo giá trị)

        // foreach - duyệt từng element trong mảng b, giá trị trong mảng
        for (int element:b){
            if (element % 3 ==0){
                System.out.println(element + "");
            }
        }

        System.out.println("=================");

        //forIndex

        for (int i = 0;i<5;i++){
            int element = b[i];
            if (element % 3 == 0){
                System.out.println(element + "");
            }
        }
    }

}
