//Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//        Tính toán và in ra console:
//        - chu vi hình chữ nhật
//        - diện tích hình chữ nhật
//        - cạnh nhỏ nhất của hình chữ nhật

import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong : ");
        int a = scanner.nextInt();

        System.out.println("Nhap vao chieu dai : ");
        int b = scanner.nextInt();

        int chuvi = (a + b) * 2;
        int dientich = a * b;
        int canhmin = Math.min(a, b);

        System.out.println("Chu vi la : " + chuvi);
        System.out.println("Dien tich la : " + dientich);
        System.out.println("canh nho nhat la : " + canhmin);
        scanner.close();
    }

}
