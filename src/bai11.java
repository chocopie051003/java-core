//Viết bảng cửu chương của 1 số nguyên bất kỳ
//        Gợi ý:
//        - Dùng vòng lặp từ 1 tới 10
//        sysout(" %d x %d = %d ", x, i, x*i)
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so : ");
        int x = scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf(" \n%d x %d = %d ", x, i, x*i);
        }

    scanner.close();

    }
}
