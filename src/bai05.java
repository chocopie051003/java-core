//Bài tập: Viết chương trình lựa chọn chức năng
//
//        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//        System.out.println("++ ------------------ ++");
//        System.out.println("| 1. Cộng |");
//        System.out.println("| 2. Trừ |");
//        System.out.println("| 3. Kết thúc |");
//        System.out.println("++ ------------------ ++");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lựa chọn của bạn là : ");
import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println("Lựa chọn của bạn là : ");

        int a = scanner.nextInt();

        switch (a){
            case 1 :
                System.out.println("Chon phep cong");
                break;
            case 2 :
                System.out.println("Chon phep tru ");
                break;
            default:
                System.out.println("thoat chuong trinh ");
                System.exit(0);

        }
        int a1 = scanner.nextInt();
        scanner.close();


    }
}
