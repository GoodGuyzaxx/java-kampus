package VariableDanTipeData;

public class Variabel {
    public static void main(String[] args) {
        int x;
        x = 10;
        int a = 2;
        System.out.println("Nilai a:"+a);
        {
            int y;
            y = 20;
            System.out.println("Nilai x:" + x);
            System.out.println("Nilai a:" + a);
            {
                int z;
                z = 20;
                System.out.println("Nilai x + y + z + a :" + (x + y + z + a));
            }
            System.out.println("Nilai y: "+y);
        }
        System.out.println("Nilai x: "+x);
    }
}
