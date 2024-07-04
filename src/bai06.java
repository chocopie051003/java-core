
//Cho phương trình ax + b = 0
//Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//trên
import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao b: ");
        int b = scanner.nextInt();
        if(a==0 && b==0){
            System.out.println("phuong trinh co vo so nghiem");
        }else if(a==0 && b!= 0){
            System.out.println("phong trinh vo nghiem ");
        }else {
            float x = (float) -b / a;
            System.out.printf("Phương trình có nghiệm = %.5f  ", x);

        }
    }
}
