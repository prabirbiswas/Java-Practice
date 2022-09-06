//Find duplicate element from comparing two arrays using single loop
//Using Hashset

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class array1 {
//    static Set<Integer> convertToSet (int[] arr){
//        Set<Integer> Set= new HashSet<>();
//        for (int element:arr){
//            Set.add(element);
//        }
//        return Set;
//    }

    static ArrayList<Integer> findDuplicate(int arr[],ArrayList set){
        ArrayList<Integer> duplicate = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                duplicate.add(arr[i]);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] arr1 =  {2, 4, 3, 5, 6,1};
        int[] arr2 = {1, 4, 7, 5, 3};

        ArrayList<Integer> Set2= new ArrayList<>();
        for (int element:arr2){
            Set2.add(element);
        }
        System.out.println(findDuplicate(arr1,Set2));
    }
}
