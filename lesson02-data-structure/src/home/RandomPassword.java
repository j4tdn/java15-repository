package home;

import java.util.Random;

public class RandomPassword {
	
		private static String username= "admin";
				private static String password="147";
				                                  
				private static Random rd= new Random();
				public static void main(String[] args){
				    String ipUsername="admin";
				    String ipPassword="" +rd.nextInt(10)+rd.nextInt(10)+rd.nextInt(10);
				    do{
				    }
				    while(!signIn(ipUsername, ipPassword));
				}
				private static boolean signIn(String ipUsername, String ipPassword){
				    return ipUsername.equals(username) && ipPassword.equals (password);
				}
				/**
				if (isExists(storage, ipPassword)){
				    continue;
				storage[currentIndex++]-ipPas sword;
				System.out.print(ipPassword+"");
				if (breakline%12 == 0){
				    System.out.println();
				}
				breakline++;
				}while(!signIn(ipUsername, ipPassword));
				// storage: 1000
				private static boolean isExists(String[] stor,String ipPassword){
				for (String password: storage){
				if (password.équals(ipPassword)){
				    return true;
				}
				return false;
				**/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
}
