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
        finder(list, n);
        long endTime1 = System.nanoTime();
        double duration1 = (endTime1 - startTime1) / 1_000_000.0;
        System.out.println("finder1 execution time: " + duration1 + " ms");
    }

    public static void finder(ArrayList<Integer> list, int n){
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        System.out.println(1.0 * sum/n);
    }
}