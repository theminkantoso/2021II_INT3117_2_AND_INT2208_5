package cnpm;

public class CnpmBaiToan{
    private int luong;
    private int thang;
    private int toiThieu;

    public CnpmBaiToan() {
        this.luong = 0;
        this.thang = 0;
        this.toiThieu = 1;
    }
    public CnpmBaiToan(int thang, int luong, int toiThieu) {
        this.luong = luong;
        this.thang = (thang);
        this.toiThieu = toiThieu;
    }

    private static int max(int a, int b) {
        return Math.max(a, b);
    }

    private static int min(int a, int b) {
        return Math.min(a, b);
    }

    public int getLuong() {
        return luong;
    }

    public int getThang() {
        return thang;
    }

    public int getToiThieu() {
        return toiThieu;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setToiThieu(int toiThieu) {
        this.toiThieu = toiThieu;
    }

    public int troCapHangThang() {
        if (thang < 12) {
            return 0;
        } else {
            int duKien = (int) (luong * 0.6);
            int cuoiCung = min(duKien, 5 * toiThieu);
            return cuoiCung;
        }
    }

    public int thoiGianHuong() {
        if(thang < 12 || troCapHangThang() == 0) {
            return 0;
        } else {
            int huongThemDuKien = (thang - 36) / 12;
            return 3 + max(huongThemDuKien, 0);
        }
    }

    public String execute() {
        if(thang < 0 || luong < 0 || toiThieu < 1000) {
            return ("Ban nhap so lieu khong hop le");
        } else if(luong > 2000000 || toiThieu > 4420 || thang > 144) {
            return ("Ban nhap so lieu khong hop le");
        } else {
            return ("Tro cap hang thang: " + troCapHangThang()
                    + "000đ"
                    + " Thoi gian huong tro cap: " + thoiGianHuong());
        }
    }

    public static int troCap(int thang, int toiThieu, int luong) {
        int cuoiCung;
        if (thang < 0 || luong < 0 || luong > 2000000 || toiThieu < 1000 || toiThieu > 4420 || thang > 144) {
            cuoiCung = -1; //hàm main xử lý -1 để in ra không hợp lệ
        } else if (thang < 12) {
            cuoiCung = 0;

        } else {
            int duKien = (int) (luong * 0.6);
            cuoiCung = min(duKien, 5 * toiThieu) * 1000;
        }
        return cuoiCung;
    }

    public static int thoiGian(int thang, int troCap) {
        if (thang < 0 || troCap == -1 || thang > 144) {
            return -1; //hàm main xử lý -1 để in ra không hợp lệ
        } else if(thang < 12 || troCap == 0) {
            return 0;
        } else {
            int huongThemDuKien = (thang - 36) / 12;
            return 3 + max(huongThemDuKien, 0);
        }
    }
    public static String execute(int thang, int thuNhap, int luongToiThieu) {
        if(thang < 0 || thang >= 144 || thuNhap < 0 || thuNhap >= 2000000 || luongToiThieu <= 1000 || luongToiThieu > 4420) {
            return "Không hợp lệ";
        } else {
            if(thang <= 12) {
                return "t = 0, w = 0";
            } else {
                int duKien = (int) (thuNhap * 0.6);
                int cuoiCung = min(duKien, 5 * luongToiThieu) * 1000;
                int huongThemDuKien = (thang - 36) / 12;
                int thoiGianHuong =  3 + max(huongThemDuKien, 1);
                if(false) { //sai điều kiện
                    return "t = 0, w = 0";
                } else {
                    return "t = " + thoiGianHuong + " w = " + cuoiCung;
                }
            }
        }
    }

    public static String execute1(int thang, int thuNhap, int luongToiThieu) {
        if (thang < 0 || thang > 144 || thuNhap < 0 || thuNhap > 2000000 || luongToiThieu < 1000 || luongToiThieu > 4420) {
            return "Không hợp lệ";
        } else {
            if (thang < 12) {
                return "t = 0, w = 0";
            } else {
                int duKien = (int) (thuNhap * 0.6);
                int cuoiCung = min(duKien, 5 * luongToiThieu) * 1000;
                int huongThemDuKien = (thang - 36) / 12;
                int thoiGianHuong = 3 + max(huongThemDuKien, 0);
                if (cuoiCung == 0) {
                    return "t = 0, w = 0";
                } else {
                    return "t = " + thoiGianHuong + " w = " + cuoiCung;
                }
            }
        }
    }
}

