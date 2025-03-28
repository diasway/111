import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of elements: ");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Fill array with elemnets");
        for(int i =0;i<n;i++){
            list.add(scanner.nextInt());
        }
        long startTime1 = System.nanoTime();
        finder1(list, 0, Integer.MAX_VALUE, n);
        long endTime1 = System.nanoTime();
        double duration1 = (endTime1 - startTime1) / 1_000_000.0;
        System.out.println("finder1 execution time: " + duration1 + " ms");

        long startTime2 = System.nanoTime();
        finder2(list, n);
        long endTime2 = System.nanoTime();
        double duration2 = (endTime2 - startTime2) / 1_000_000.0;
        System.out.println("finder2 execution time: " + duration2 + " ms");
    }
    public static void finder1(ArrayList<Integer> list, int count, int min,int n){
        if (count < n) {
            if (min > list.get(count)) {
                min = list.get(count);
            }
            finder1(list, count + 1,min,n);
        } else {
            System.out.println(min);
        }
    }
    public static void finder2(ArrayList<Integer> list, int n){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println(min);
    }
}