//The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
//Comparator doesn't affect the original class, i.e., the actual class is not modified.
//Comparator provides compare() method to sort elements.

package Core_Java;

import java.util.*;

public class Comparator_Concept {

    public static void main(String args[]){

        List<String> lst = new ArrayList<>();

        Comparator<Integer> com= new Comparator<Integer>(){
            public int compare(Integer a,Integer b){ //compare is the method present in Comparator FunctionalInterface
                if(a>b){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Integer> num = new ArrayList<>(Arrays.asList(25,34,43,52,61));
        num.sort(com);
        System.out.println(num);
        //Lambda Expression
        num.sort((a,b)-> a%10>b%10?1:-1);  //in lambda we don't need a return statement if we have single line to sort an array based on the second digit
        System.out.println(num);
    }
}
