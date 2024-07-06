package bai21;

public class sinhVienIT extends sinhVien{
    private  String language;

    public sinhVienIT(String language, String name, String id, double price, double tax) {
        super(name, id, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    void tinhDiem() {

    }
}
