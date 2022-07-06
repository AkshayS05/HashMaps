import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicates {

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.containsKey(arr[i])) {
                continue;
            } else {
                seen.put(arr[i], true);
                output.add(arr[i]);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= s.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i <size ; i++) {
            arr[i]= s.nextInt();
        }
        ArrayList<Integer> output= removeDuplicates(arr);
        System.out.println(Arrays.toString(new ArrayList[]{output}));
    }

}
