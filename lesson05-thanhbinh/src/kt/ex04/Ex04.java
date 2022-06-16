package kt.ex04;

import kt.ex02.util.ArrayUtils;

import java.util.Arrays;

public class Ex04 {
    /**
     * option 1: me
     *      *step 1: loop elements with i from 0 to n
     *      * step 2: looop elements with j from 0 to n except i
     *      * if elements[i] == elements[j] --> non-unique
     *      * else for all --> unique
     *
     *
     * option 2: hieu
     *      step 1: loop elements with i from 0 to n
     *      step 2 : loop elements with j from 0 to n except i
     *              : if (elements[i] == elements[j] --> elements[i,j] = -1)
     *      step 3: print out elements != -1
     *
     * option 3: khoa
     *      step 1: create array of elements consist of 101 element 0
     *      represents for amount of display in input array
     *      step 2:
     * @param args
     */
    public static void main(String[] args) {
        int [] elements = {3, 15, 21, 0, 15, 17, 21};
        int [] foundElements = getUniqueElements(elements);
        System.out.println(ArrayUtils.printf(foundElements));


    }
    private static int [] getUniqueElements(int [] elements){
        boolean [] flags = new boolean[elements.length];
        for (int pivotIndex = 0; pivotIndex< elements.length; pivotIndex++){
            for (int i =0 ; i < elements.length; i++){
                if (pivotIndex!= i && elements[pivotIndex] == elements[i]){
                    flags[pivotIndex] = true;
                    flags[i] = true;
                }
            }
        }
        int [] result = new int[elements.length];
        int count = 0;
        for (int i = 0;i<flags.length; i++){
            if (!flags[i]){
                result[count++] = elements[i];
            }
        }
        return Arrays.copyOfRange(result,0,count);
    }
}
