package bai22;

public class SinhVienIT extends SinhVien {
    private double java;
    private double html;

    public SinhVienIT(double java, double html) {
        this.java = java;
        this.html = html;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    @Override
    double tinhdiem() {
        return (java * 2 + html)/3;
    }
}
