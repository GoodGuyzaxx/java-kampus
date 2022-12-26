package Operator;

class Bitwise{
    public static void main(String[]args){
        int x,y;
        x =~100;
        System.out.println("Nilai negasi x:"+x);
        x = 17 & 30;
        System.out.println("Nilai and :"+x);
        x = 17 | 30;
        System.out.println("Nilai or :"+x);
        x = 17 ^ 30;
        System.out.println("Nilai xor :"+x);
        x = 111;
        y = x >> 1;
        System.out.println("Nilai geser kanan :"+x);
        x = -111;
        y = x >> 1;
        System.out.println("Nilai geser kanan neg :"+x);
        x = 111;
        y = x >>> 1;
        System.out.println("Nilai geser kanan 1 bit 0 :"+x);
        x = -111;
        y = x >>> 1;
        System.out.println("Nilai geser kanan 1 bit 0 neg :"+x);
        x = 111;
        y = x << 1;
        System.out.println("Nilai geser kiri :"+x);
        x = 1000;
        y = x << 1;
        System.out.println("Nilai geser kiri :"+x);
    }
}
