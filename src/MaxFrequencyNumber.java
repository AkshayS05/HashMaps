import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequencyNumber {
    private static int getMaxFreqNum(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i])){
                int value= map.get(arr[i]);
                map.put(arr[i], value+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int max= Integer.MIN_VALUE;
        int key=-1;
        for (int i = 0; i <arr.length ; i++) {
            int value= map.get(arr[i]);
            if(value>max){
                max=value;
                key=arr[i];
            }
        }
        return key;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(getMaxFreqNum(arr));
    }
}
