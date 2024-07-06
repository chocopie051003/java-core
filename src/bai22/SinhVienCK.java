package bai22;

public class SinhVienCK extends  SinhVien{
    private double CNC;
    private double PLC;

    public SinhVienCK(double CNC, double PLC) {
        this.CNC = CNC;
        this.PLC = PLC;
    }

    public double getPLC() {
        return PLC;
    }

    public void setPLC(double PLC) {
        this.PLC = PLC;
    }

    public double getCNC() {
        return CNC;
    }

    public void setCNC(double CNC) {
        this.CNC = CNC;
    }

    @Override
    double tinhdiem() {
        return (CNC + PLC)/2;
    }
}
