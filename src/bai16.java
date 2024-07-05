// Nhập username và password từ bàn phím. Nếu username = "hoidanit" và
//        password > 6 ký tự thì hợp lệ
//        gợi ý: sử dụng equals để so sánh; length để check chiều dài
import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ten ");
        String ten = scanner.nextLine();
        System.out.println("Nhap vao mat khau");
        String mk = scanner.nextLine();

        System.out.println("Ten " + ten + "  Mat khau " +mk);

        if(ten.equals("kieuhieu") || mk.length() > 6){
            System.out.println("Thao nieng!!!");
        }

        scanner.close();

    }
}
