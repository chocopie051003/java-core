package bai14;

public class bai14 {
    public static void main(String[] args) {
        MatHang test = new MatHang();

        MatHang p1 = test.nhapThongTin("Nieng rang", 200, 20);
        test.xuatThongTin(p1);
        System.out.println("tax = " +  test.getTaxPrice(p1.getPrice(), p1.getTax()));
   
    }
}
