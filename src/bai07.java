//Cho phương trình: ax^2 + bx + c = 0
//Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//trên

import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao b : ");
        int b = scanner.nextInt();
        System.out.println("Nhap vao c : ");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem ");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem ");
            } else {
                float x = (float) -c / b;
                System.out.printf("Phuong trinh co nghiem : %.5f", x);
            }
        } else {
            int d =  b*b - 4 * a * c;

            if (d < 0) {
                System.out.println("Phuong trinh vo nghiem ");
            } else if (d == 0) {
                float y = (float) -b / (2 * a);
                System.out.printf("Phuong trinh co nghiem : %.5f", y);
            } else {
                float z = (float) (-b + Math.sqrt(d)) / (2 * a);
                float t = (float) (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("Phuong trinh co hai nghiem : x1 = %.5f, x2 = %.5f", z, t);
            }
        }
        scanner.close();
    }
}
