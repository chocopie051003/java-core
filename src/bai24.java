//Cho user nhập input từ bàn phím, và thực hiện phép chia : 10/x (với x nhập từ bàn phím)
//        Nếu nhập vào "ký tự" (ví dụ a,b, c...) hoặc nhập vào số 0, chương trình sẽ báo lỗi và
//        "dừng lại".
import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhap x : ");
            try {
                int x = scanner.nextInt();
                try {
                    System.out.println("ket qua 10/x la : "+ 10/x);
                    break;

                }catch (Exception e){
                    System.out.println("run with x = " +x);

                }
            }catch (Exception e){
                scanner.next();
                System.out.println("run erro");
                continue;

            }
        }

    }
}
