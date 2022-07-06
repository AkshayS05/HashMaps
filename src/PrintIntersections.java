import java.util.HashMap;
import java.util.Scanner;

public class PrintIntersections {
    private static void printIntersections(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <arr1.length ; i++) {
            if(map.containsKey(arr1[i])){
                int value= map.get(arr1[i]);
                map.put(arr1[i], value+1);
            }else{
                 map.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length ; i++) {
            if (map.containsKey(arr2[i])) {
                int value = map.get(arr2[i]);
                if (value > 0) {
                    System.out.println(arr2[i] + " ");
                    map.put(arr2[i], value - 1);
                }
            }
        }
    }
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array 1");
    int size = s.nextInt();
    int arr1[] = new int[size];
    System.out.println("Enter the elements of the array1");
    for (int i = 0; i < size; i++) {
        arr1[i] = s.nextInt();
    }
    System.out.println("Enter the size of the array 2");
    int size2 = s.nextInt();
    int arr2[] = new int[size2];
    System.out.println("Enter the elements of the array2");
    for (int i = 0; i < size; i++) {
        arr2[i] = s.nextInt();
    }
    printIntersections(arr1, arr2);
}


}
