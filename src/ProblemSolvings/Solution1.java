


//write a function that takes in a string of lower case English alphabet letters
// and returns the index of the string  first non repeating character.
// The first non repeating character is the first character in the string that occurs only ones.
// If the input string does not have a non repeating character, the function should return -1
//example :
// input: abcdcaf
//output: 1


package ProblemSolvings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String args[]){
       System.out.println(indexOfNonRepeatingChar("abcdcaf"));
    }
    public static int indexOfNonRepeatingChar(String s){
        LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
        int index=0;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry :hm.entrySet()){
            if(entry.getValue()==1){
                return index;
            }
            index++;
        }
        return -1;
    }
}
