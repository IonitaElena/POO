import java.util.Arrays;
import java.util.Random;

public class Prob8 {
    public static void main(String[] args) {
        Random nr = new Random();
        double[] v = new double[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = nr.nextDouble(100);
            System.out.printf("%.2f"+"%n",v[i]);
        }
        Arrays.sort(v);
        System.out.println("Sorted array:");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%.2f"+"%n",v[i]);
        }


        double key=v[7];
        System.out.println(
                key+" at index = " + Arrays.binarySearch(v, key));
    }


}
