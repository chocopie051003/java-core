//Ứng dụng quản lý sinh viên
//- Tạo class Student với thuộc tính name, id
//- Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
//eg: new Student("Nam", 1); new Student("Eric", 2);
//Yêu cầu: tìm và xuất ra:
//        - các student có tên bắt đầu là "hieu"
package bai17;

import java.util.ArrayList;
import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        student st1 = new student("nhung", 132);
        student st2 = new student("hieu", 145);
        student st3 = new student("ly", 165);
        student st4 = new student("cuong", 188);
        student st5 = new student("duy", 133);

        ArrayList<student> arr = new ArrayList<>();
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);
        arr.add(st4);
        arr.add(st5);

        System.out.println("Danh sach : " + arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().startsWith("hieu")) {
                System.out.println("Thao nieng " + arr.get(i));
            }
        }
        scanner.close();
    }
}
