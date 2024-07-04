package bai14;

public class MatHang {
    private String name;
    private double price;
    private double tax;

    public MatHang(String name, double price, double tax){
        this.name =  name;
        this.price = price;
        this.tax = tax;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public double getPrice() {

        return price;
    }
    public void setPrice(double price) {

        this.price = price;
    }
    public double getTax() {

        return tax;
    }
    public void setTax(double tax) {

        this.tax = tax;
    }

    public MatHang(){

    }

    public MatHang nhapThongTin(String name, double price, double tax) {
        MatHang mh = new MatHang(name, price, tax);

        return mh;

    }
    public void xuatThongTin(MatHang mh) {
        System.out.println("Ten = "+ mh.getName()+" Gia = "+ mh.getPrice()+" Thue = "+ mh.getTax());
    }
    public  double getTaxPrice(double price, double tax) {
        return  price * tax;
    }

}
