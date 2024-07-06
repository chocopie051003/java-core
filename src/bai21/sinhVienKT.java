package bai21;

public class sinhVienKT extends sinhVien {
    private  String skill;

    public sinhVienKT(String skill, String name, String id , double price, double tax) {
        super(name, id, price, tax);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    void tinhDiem() {

    }
}
