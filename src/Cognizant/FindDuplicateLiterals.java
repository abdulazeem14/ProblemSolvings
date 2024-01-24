package Cognizant;

import java.awt.desktop.ScreenSleepEvent;
//without using collection
public class FindDuplicateLiterals {

    public static void main(String args[]){
        String arr[]= {"abdul","abdul","azeem","vijay","abdul","sam","azeem"};
        String visited[]= new String[arr.length];
        for(int i=0;i<arr.length;i++) {
            String name = arr[i];
            boolean flag = true;
            for (int j = 0; j < visited.length; j++) {
                if (visited[j] == null) {
                    visited[j] = name;
                }
                else if (visited[j].equals(name)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int start = i;
                int end = arr.length - 1;
                int count = 1;
                while (start < end) {
                    if (arr[start].equals(arr[end])) {
                        count++;
                    }
                    end--;
                }
                if (count > 1) {
                    System.out.println(name + "-" + count);
                }
            }
        }
    }
}
