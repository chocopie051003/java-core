//Tạo 3 class:
//        - SinhVien (super class)
//+ getDiem (phương thức trừu tượng)
//- SinhVienIT (child class)
//+ scoreJava : double
//+ scoreHTML : double
//        getDiem = (scoreJava * 2 + scoreHTML)/3;
//
//- SinhVienCoKhi (child class)
//+ scoreCNC : double
//+ scorePLC : double
//        getDiem = (scoreCNC + scorePLC)/2;

package bai22;

public class bai22 {
    public static void main(String[] args){
        SinhVien a = new SinhVienIT(10,7);
        System.out.println("Diem SVIT " + a.tinhdiem());

        SinhVien b = new SinhVienCK(9,4);
        System.out.println("Diem SVCK " + b.tinhdiem());
    }
}
