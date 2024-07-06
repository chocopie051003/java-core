//Tạo class SinhVien bao gồm:
//masv: String
//hoten: String
//diem: double
//age: int
//- Viết setter, getter, constructor, toString
//- Nhập dữ liệu sinh viên từ bàn phím và in ra màn hình (với hàm toString)
//- Xử lý ngoại lệ cho các trường hợp
//+ 0< điểm < 10. điểm là số thực
//+ 18 < age < 100. tuổi là số nguyên
//=> nếu có ngoại lệ thì thông báo lỗi và yêu cầu nhập lại

package bai25;

import java.util.Scanner;

public class bai25 {
    public static int nhapMSV(){
        int a;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhap ma sv :");
            try{
                a = scanner.nextInt();
                break;

            }catch (Exception e){
                System.out.println("Mã số sv không hợp lệ. nhập vào số nguyên");
                scanner.next();

            }
        }
        return a;

    }

    public static String nhapten() {
        String a;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ten sv :");
            try {
                a = scanner.next();
                break;

            } catch (Exception e) {
                System.out.println("ten sv k hop le nhap vao String");
                scanner.next();

            }
        }
        scanner.close();
        return a;
    }
        public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            int masv = nhapMSV();
            String tensv = nhapten();
            SinhVien sv = new SinhVien(masv, tensv, 6, 8);
            System.out.println("Sinh vien : "+ sv);

        }

    }
}
