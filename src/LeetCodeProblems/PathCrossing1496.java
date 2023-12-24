//Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively.
// You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
//
// Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.


package LeetCodeProblems;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class PathCrossing1496 {
public static void main(String args[]){
    System.out.println(isPathCrossing("NWS"));

}
    public static boolean isPathCrossing(String path) {

        LinkedHashMap<String, String> directionslog = new LinkedHashMap<>();
        int arr[] = {0, 0};
        String coordinates="";
        for (int i = 0; i < path.length(); i++) {

            if (i == 0) {
                coordinates= "("+arr[0]+","+arr[1]+")";
                directionslog.put(coordinates, "Start");

            }
            switch (path.charAt(i)) {
                case 'N':
                    arr[1] = arr[1] + 1;
                    coordinates= "("+arr[0]+","+arr[1]+")";
                    if (directionslog.containsKey(coordinates)) {
                        return true;
                    } else {
                        directionslog.put(coordinates, "North");
                    }
                    break;
                case 'S':
                    arr[1] = arr[1] - 1;
                    coordinates= "("+arr[0]+","+arr[1]+")";
                    if (directionslog.containsKey(coordinates)) {
                        return true;
                    } else {
                        directionslog.put(coordinates, "South");
                    }
                    break;
                case 'E':
                    arr[0] = arr[0] - 1;
                    coordinates= "("+arr[0]+","+arr[1]+")";
                    if (directionslog.containsKey(coordinates)) {
                        return true;
                    } else {
                        directionslog.put(coordinates, "East");
                    }
                    break;
                case 'W':
                    arr[0] = arr[0] + 1;
                    coordinates= "("+arr[0]+","+arr[1]+")";
                    if (directionslog.containsKey(coordinates)) {
                        return true;
                    } else {
                        directionslog.put(coordinates, "West");
                    }
                    break;

            }

        }

        return false;
    }
}
///Leetcode best solution
//Class Solution {
//public boolean isPathCrossing(String path) {
//        int x = 0;
//        int y = 0;
//
//        HashSet<String> visited = new HashSet<>();
//        visited.add("0,0");
//
//        for (char direction: path.toCharArray()) {
//        switch (direction) {
//        case 'N':
//        y--;
//        break;
//        case 'E':
//        x++;
//        break;
//        case 'S':
//        y++;
//        break;
//        case 'W':
//        x--;
//        break;
//        }
//        StringBuilder locationBuilder = new StringBuilder();
//        locationBuilder.append(x);
//        locationBuilder.append(',');
//        locationBuilder.append(y);
//        String newLocation = locationBuilder.toString();
//
//        if (visited.contains(newLocation)) {
//        return true;
//        } else {
//        visited.add(newLocation);
//        }
//        }
//
//        return false;
//        }
//        }