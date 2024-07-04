import java.util.Scanner;
import java.util.Arrays;
public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.print("Nhập phần tử ");
        // For reading the element
        for (int i = 0; i < size; i++) {
            System.out.printf("a[%d] : ", i);
            a[i] = scanner.nextInt();

        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("So lon nhat : " + a[a.length-1]);
        System.out.println("So nho nhat : " + a[0]);
    }
}
