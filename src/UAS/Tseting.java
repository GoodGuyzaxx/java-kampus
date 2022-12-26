package UAS;

class Lingkaran {
        int jari;
        double Pi;
        double Luas;
        Lingkaran(int inputJari){
            jari = inputJari;
            Pi = 3.14;
            Luas = Pi * jari * jari;
            int i = (int) Luas;
            System.out.println(i);
        }
}


public class Tseting {
    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran(30);

    }

}
