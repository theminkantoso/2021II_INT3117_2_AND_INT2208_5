

public class Main {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int x = Main.getRandomNumber(144, 9999);
        int y = Main.getRandomNumber(-8000000, 0);
        int z = Main.getRandomNumber(1000, 4420);
//        int x = 857;
//        int y = 2000;
//        int z = 1000;
        TestDemo a = new TestDemo(x, y, z);
        System.out.println(a.execute());
        System.out.println(x + " " + y + " " + z);
//        System.out.println(TestDemo.troCap(x, z,y) + " " + TestDemo.thoiGian(x, 1000000));
    }
}
