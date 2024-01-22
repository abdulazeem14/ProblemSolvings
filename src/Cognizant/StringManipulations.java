package Cognizant;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class StringManipulations {


    public static void main(String args[]){

        String s1="i love java";
        String s2="Fix problem quickly with galvanized jets$#.";
        System.out.println(problem1(s1));
        System.out.println(problem2(s2));

    }
    public static String problem1(String s1){
        String arr[]=s1.split(" ");
        String output="";

        for(int i=arr.length-1;i>=0;i--){
            output = output+arr[i]+" ";
        }
        return output;
    }
    public static boolean problem2(String s1) {
        s1 = s1.toLowerCase(Locale.ROOT);
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            if (!Character.isAlphabetic(s1.charAt(i))) {
                continue;
            } else {
                set.add(s1.charAt(i));
            }
        }

        return set.size()==26?true:false;
    }

}
