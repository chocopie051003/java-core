//Viết chương trình tổ chức menu:
//
//        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//        System.out.println("++ ----------------------------------------- ++");
//        System.out.println("| 1. Giải phương trình bậc nhất |");
//        System.out.println("| 2. Giải phương trình bậc hai |");
//        System.out.println("| 3. Tính số tiền điện |");
//        System.out.println("| 4. Kết thúc |");
//        System.out.println("++ ------------------ ++");
import java.util.Scanner;

public class bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println(" LỰA CHỌN TÍNH NĂNG  : ");
        int z1 = scanner.nextInt();

        switch (z1) {
            case 1:
                System.out.println("Nhap vao a: ");
                int a = scanner.nextInt();
                System.out.println("Nhap vao b: ");
                int b = scanner.nextInt();
                if (a == 0 && b == 0) {
                    System.out.println("phuong trinh co vo so nghiem");
                } else if (a == 0 && b != 0) {
                    System.out.println("phong trinh vo nghiem ");
                } else {
                    float x = (float) -b / a;
                    System.out.printf("Phương trình có nghiệm = %.5f  ", x);
                }
                    break;
            case 2:
                System.out.println("Nhap vao a : ");
                int a1 = scanner.nextInt();
                System.out.println("Nhap vao b : ");
                int b1 = scanner.nextInt();
                System.out.println("Nhap vao c : ");
                int c1 = scanner.nextInt();

                if (a1 == 0) {
                    if (b1 == 0 && c1 == 0) {
                        System.out.println("Phuong trinh vo so nghiem ");
                    } else if (b1 == 0 && c1 != 0) {
                        System.out.println("Phuong trinh vo nghiem ");
                    } else {
                        float x = (float) -c1 / b1;
                        System.out.printf("Phuong trinh co nghiem : %.5f", x);
                    }
                } else {
                    int d = b1 * b1 - 4 * a1 * c1;

                    if (d < 0) {
                        System.out.println("Phuong trinh vo nghiem ");
                    } else if (d == 0) {
                        float y = (float) -b1 / (2 * a1);
                        System.out.printf("Phuong trinh co nghiem : %.5f", y);
                    } else {
                        float z = (float) (-b1 + Math.sqrt(d)) / (2 * a1);
                        float t = (float) (-b1 - Math.sqrt(d)) / (2 * a1);
                        System.out.printf("Phuong trinh co hai nghiem : x1 = %.5f, x2 = %.5f", z, t);
                    }
                }

                break;

            case 3:
                System.out.println("Nhap vao so dien : ");
                int a2 = scanner.nextInt();
                if (a2 <= 100) {
                    int x = a2 * 1000;
                    System.out.printf("So tien la : %d", x);
                } else {
                    int y = 100 * 1000 + (a2 - 100) * 1500;
                    System.out.printf("So tien la : %d ", y);
                }

                break;

            default:
                System.out.printf("ket thuc ");
                System.exit(0);

        }

        scanner.close();
    }
}
