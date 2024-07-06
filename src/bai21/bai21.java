//1: (Sử dụng hàm tạo không có tham số === không khởi tạo constructor)
//Cần tạo 2 class là:
//SinhVienIT:
//- id //mã số sinh viên
//- name //tên
//- language //ngôn ngữ lập trình
//- price //học phí
//- tax //tỉ lệ thuế
//Method: getPriceTax = price * tax
//SinhVienKeToan
//- id //mã số sinh viên
//- name //tên
//- skill //kỹ năng
//- price //học phí
//- tax //tỉ lệ thuế

package bai21;

public class bai21 {
    public static void main(String[] args){

        sinhVienIT sv1 = new sinhVienIT("java", "hieu", "123", 20, 10);
        System.out.println("check Sv1 : "+ sv1.id);

        sinhVienKT sv2 = new sinhVienKT("thao nieng", "nhung","4456", 50, 3);
        System.out.println("Check Sv2 : "+ sv2.name);


    }

}
