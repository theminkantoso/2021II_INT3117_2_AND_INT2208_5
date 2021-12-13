package cnpm;

public class CnpmMain {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    public static int getRandomNumberInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static double getRandomNumberDouble(double min, double max) {
        return round((Math.random() * (max - min)) + min, 1);
    }
    public static void main(String[] args) {
//        double[] dtb = {5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0,
//        -0.1, 0.0, 0.1, 7.9, 8.0, 8.1, 8.9, 9.0, 9.1, 9.9, 10.0, 10.1, 5.0};
//        int[] drl = {-1, 0, 1, 89, 90, 91, 99, 100, 101, 50, 50, 50, 50,
//                50, 50, 50, 50, 50, 50, 50, 50, 50};
//        for(int i = 0; i < dtb.length; i ++) {
//            System.out.println((i + 1) + " " + Cnpm.hocBongLoi(drl[i], dtb[i]));
//        }
//        int dRL = getRandomNumberInt(90, 100);
//        double dTb = getRandomNumberDouble(9.0, 10.0);
//        System.out.println(dRL + " " + dTb + " " + Cnpm.hocBongLoi(dRL, dTb));
        System.out.println(CnpmBaiToan.execute(22,	1488921,	1567));
        System.out.println(CnpmBaiToan.execute1(22,	1488921,	1567));
    }
}
