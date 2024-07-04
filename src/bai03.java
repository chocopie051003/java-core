//Bài 3: Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//        Tính và xuất ra thể tích của hình lập phương.

import java.util.Scanner;

public class bai03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh hinh lap phuong : ");
        int a = scanner.nextInt();
        double thetich = Math.pow(a, 3);

        System.out.println("The tich hinh lap phuong la : " + thetich);
        scanner.close();
    }
}
