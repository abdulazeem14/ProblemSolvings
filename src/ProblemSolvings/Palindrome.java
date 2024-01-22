package ProblemSolvings;

public class Palindrome {

    public static void main(String args[]){
        String str1="mom";
        int start=0;
        int end=str1.length()-1;
        boolean flag= true;
        while(start<end){
            if(str1.charAt(start)!=str1.charAt(end)){
                flag=false;
            }
            start++;
            end--;
        }
        if(flag) {
            System.out.println("Palindrome");
        }
            else{
                System.out.println("Not a Palindrome");
            }
    }
}
