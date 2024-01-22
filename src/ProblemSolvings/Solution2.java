package ProblemSolvings;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution2 {
    public static void main(String args[])
    {
        List<String> dates= new ArrayList<>(Arrays.asList("09 Mar 2021","03 Feb 1958", "05 Jan 1978","04 Feb 1978","04 Jan 1968","03 Jan 1968"));
        System.out.println(sortDates(dates));


    }
    public static List<String> sortDates(List<String> dates){

        //dates.sort((s1,s2)->Integer.parseInt(s1.split(" ")[2])>Integer.parseInt(s2.split(" ")[2])?1:-1);
        dates.sort((s1,s2)-> {
            HashMap<String, Integer> hm = new HashMap<>();
            hm.put("Jan", 1);
            hm.put("Feb", 2);
            hm.put("Mar", 3);
            hm.put("Apr", 4);
            hm.put("May", 5);
            hm.put("Jun", 6);
            hm.put("Jul", 7);
            hm.put("Aug", 8);
            hm.put("Sep", 9);
            hm.put("Oct", 10);
            hm.put("Nov", 11);
            hm.put("Dec", 12);

            if((Integer.parseInt(s1.split(" ")[2]+hm.get(s1.split(" ")[1]))+Integer.parseInt(s1.split(" ")[0])>Integer.parseInt(s2.split(" ")[2]+hm.get(s2.split(" ")[1]))+Integer.parseInt(s2.split(" ")[0])))

            {
                return 1;
            }
            else {
                return -1;
            }

        });
////         dates.sort((s1,s2)->{
//            HashMap<String,Integer> hm = new HashMap<>();
//            hm.put("Jan",1);
//            hm.put("Feb",2);
//            hm.put("Mar",3);
//            hm.put("Apr",4);
//            hm.put("May",5);
//            hm.put("Jun",6);
//            hm.put("Jul",7);
//            hm.put("Aug",8);
//            hm.put("Sep",9);
//            hm.put("Oct",10);
//            hm.put("Nov",11);
//            hm.put("Dec",12);
//
//            if(
//                    (Integer.parseInt(s1.split(" ")[0])>Integer.parseInt(s2.split(" ")[0]))&&
//                    (hm.get(s1.split(" ")[1])>hm.get(s2.split(" ")[1]) || hm.get(s1.split(" ")[1])==hm.get(s2.split(" ")[1]) )&&
//                            (Integer.parseInt(s1.split(" ")[2])>Integer.parseInt(s2.split(" ")[2]) || Integer.parseInt(s1.split(" ")[2])==Integer.parseInt(s2.split(" ")[2]))
//            ){
//                return 1;
//            }
//            else{
//                return -1;
//            }
//        });
        return dates;
    }
}
