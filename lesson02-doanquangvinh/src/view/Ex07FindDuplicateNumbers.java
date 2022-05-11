package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ex07FindDuplicateNumbers {
	  public static void main(String[] args) {

	    findRandomNumber();
	  }

	  public static boolean isDuplicateNumber(int[] arrayOfNumbers, int i) {
	    for (int j : arrayOfNumbers) {
	      if (j == i) {
	        return true;
	      }
	    }
	    return false;
	  }

	  public static void findRandomNumber() {
	    int[] arrayOfNumbers = new int[5];
	    int count = 0;

	    for (int i = 0; i < arrayOfNumbers.length; i++) {
	      int tmp = ThreadLocalRandom.current().nextInt(20, 31);
	      if (count == 5) {
	        break;
	      }
	      if (!isDuplicateNumber(arrayOfNumbers, tmp)) {
	        arrayOfNumbers[count] = tmp;
	        count++;
	      }
	    }
	    for (int number : arrayOfNumbers) {
	      System.out.println(number);
	    }
	  }
	}

