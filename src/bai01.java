
//Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//        In ra màn hình với định dạng:
//        <tên_sinh_viên> có điểm = <điểm>
//        Ví dụ: "Eric" có điểm = 9.6
//        <tên sinh viên>: Eric
//        <điểm> : 10
import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.println("Nhập điểm: ");
            int score = scanner.nextInt();

            System.out.println(name + " có điểm = " + score);

            scanner.close();

    }
}
