import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so : ");
        int a = scanner.nextInt();

        int count = 0;
        for(int i=2; i<a/2; i++){
            if(a % i == 0){
                System.out.println("Uoc so khac la : " +i);
                count ++;
                break;
            }
        }
        if(count == 0){
            System.out.println("So tren la so nguyen to ");
        }else {
            System.out.println("So tren khong la so nguyen to ");
        }
        scanner.close();
    }

}
