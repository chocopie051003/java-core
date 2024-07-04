//Viết chương trình tính số tiền điện (in kết quả ra console)
//        Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//        - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//        - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dien : ");
        int a = scanner.nextInt();
        if(a <= 100){
            int x = a *1000;
            System.out.printf("So tien la : %d", x );
        }else{
            int y = 100 *1000 + (a -100) * 1500;
            System.out.printf("So tien la : %d ", y );
        }
        scanner.close();
    }

}

