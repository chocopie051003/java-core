import java.util.ArrayList;
import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrNumber = new ArrayList();

        while (true){
            System.out.println("Nhap vao mot so bat ky ");
            double a = scanner.nextDouble();
            arrNumber.add(a);
            scanner.nextLine();

            System.out.println("Tiep tuc ? Y/N");
            String b = scanner.nextLine();
            if(b.equals("n") || b.equals("N")){
                break;
            }
        }

        System.out.println("Day vua nhap : " + arrNumber);
        double sum = 0;

        for(int i =0; i< arrNumber.size(); i++){
            sum+= arrNumber.get(i);
        }

        System.out.println("Tong cua day la : " + sum);
        scanner.close();
    }
}
