package bai25;

public class SinhVien {
    private int masv;
    private String tensv;
    private float diem;
    private double tuoi;

    public SinhVien(int masv, String tensv, float diem, double tuoi) {
        this.masv = masv;
        this.tensv = tensv;
        this.diem = diem;
        this.tuoi = tuoi;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public double getTuoi() {
        return tuoi;
    }

    public void setTuoi(double tuoi) {
        this.tuoi = tuoi;
    }

    public String toString() {
        return "SinhVien{" +
                "masv=" + masv +
                ", tensv='" + tensv + '\'' +
                ", diem=" + diem +
                ", tuoi=" + tuoi +
                '}';
    }
}
