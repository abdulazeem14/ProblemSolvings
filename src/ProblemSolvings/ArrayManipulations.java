package ProblemSolvings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.
//        5 3
//        1 2 100
//        2 5 100
//        3 4 100
//After the first update the list is 100 100 0 0 0.
//        After the second update list is 100 200 100 100 100.
//        After the third update list is 100 200 200 200 100.
//
//        The maximum value is .
public class ArrayManipulations {

    public static void main(String args[]){
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(Arrays.asList(1,5,3)));
        queries.add(new ArrayList<>(Arrays.asList(4,8,7)));
        queries.add(new ArrayList<>(Arrays.asList(6,9,1)));

        System.out.println(arrayManipulation(10,queries));
    }
    public static long arrayManipulation(int n, List<List<Integer>> queries){
       Integer data[]= new Integer[n];
       Arrays.fill(data,0);
        List<Integer> result= new ArrayList<>(Arrays.asList(data));
        for(List<Integer> arr: queries){
            for(int i=arr.get(0)-1;i<arr.get(1);i++){
                result.set(i,arr.get(2)+result.get(i));
            }
        }
        result.sort((a,b)->{
            if(a>b){
                return 1;
            }
            else{
                return -1;
            }
        });
        return result.get(result.size()-1);
    }

}
