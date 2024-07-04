//Bài tập: Viết chương trình tính thuế
//        Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//        - dưới 10M: không đóng thuế
//        - từ 10M tới 15M: thuế 10%
//        - từ 15 tới 30M : thuế 20%
//        - trên 30M: thuế 50%

import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thue : ");
        int a = scanner.nextInt();

        if(a<10){
            System.out.println("Khong phai dong thue ");
        }else if(a >= 10 && a<= 15){
            System.out.println("Dong thue 20%");
        }else if(a>15 && a<=30){
            System.out.println("Dong the 50%");
        }else{
            System.out.println("Dong thue 80%");
        }
    }

}
