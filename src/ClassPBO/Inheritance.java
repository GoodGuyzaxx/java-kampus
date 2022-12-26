package ClassPBO;

class A {
    int x;
    int y;
    void TampilkanNilaixy(){
        System.out.println("Nilai X:"+x+" ,y: "+y);
    }
}

class B extends A {
    int z;
    void TampilkanJumlah(){
        System.out.println("Jumlah: "+(x+y+z));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A VarsuperOb = new A();
        B VarsubOb = new B();
        System.out.println("SuperClass");
        VarsuperOb.x=10;
        VarsuperOb.y=20;
        VarsuperOb.TampilkanNilaixy();
        System.out.println("SubClass");
        VarsubOb.x =5;
        VarsubOb.y=4;
        VarsubOb.TampilkanNilaixy();

        System.out.println("SubClass Jumlah");
        VarsubOb.z = 30;
        VarsubOb.TampilkanJumlah();

        System.out.println("SuperClass");
        VarsuperOb.x=10;
        VarsuperOb.y=20;
        VarsuperOb.TampilkanNilaixy();

        System.out.println("SubClass Jumlah");
        VarsubOb.z=60;
        VarsubOb.TampilkanJumlah();
    }
}
