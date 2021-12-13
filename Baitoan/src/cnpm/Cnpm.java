package cnpm;
public class Cnpm {
    private double diemTB;
    private int diemRenLuyen;
    public Cnpm() {}
    public Cnpm(double diemTB, int diemRenLuyen) {
        this.diemRenLuyen = diemRenLuyen;
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public int getDiemRenLuyen() {
        return diemRenLuyen;
    }

    public void setDiemRenLuyen(int diemRenLuyen) {
        this.diemRenLuyen = diemRenLuyen;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public static String hocBong(int diemRenLuyen, double diemTB) {
        if(diemRenLuyen < 0 || diemRenLuyen > 100 || diemTB < 0 || diemTB > 10) {
            return "Không hợp lệ";
        } else if(diemRenLuyen < 90 || diemTB < 8.0) {
            return "Không có HB";
        } else if(diemRenLuyen >= 90) {
            if(diemTB < 9.0) {
                return "HB loại 1";
            } else {
                return "HB loại 2";
            }
        }
        return "";
    }

    public static String hocBongLoi(int diemRenLuyen, double diemTB) {
        if(diemRenLuyen < 0 || diemRenLuyen > 150 || diemTB < 0 || diemTB > 14.0) {
            return "Không hợp lệ";
        } else if(diemRenLuyen < 80 || diemTB <= 8.0) {
            return "Không có HB";
        } else if(diemRenLuyen >= 95) {
            if(diemTB < 9.0) {
                return "HB loại 1";
            } else {
                return "HB loại 2";
            }
        }
        return "";
    }
}
