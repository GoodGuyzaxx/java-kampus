// menginpor java util Scanner, Scanner berfungi untuk mengambil inputan dari keyboard
import java.util.Scanner;

public class Input {
    public static void main (String[] args){
        //Membuat Variabel
        String namaIn,alamatIn,emailIn,tanggalIn;

        //Membuat Scanner agar dapat dipanggil
        Scanner scanItem = new Scanner(System.in);

        //Tampilan infromasi yang akan ditampilkan pada output
        System.out.println("Silakan Masukan Nama,Alamat,Tanggal Lahir,Email");

        //Tampilan Output
        System.out.print("Nama: ");
        //Memangil Fungsi Scanner dan akan disimapn di variable
        namaIn = scanItem.nextLine();

        System.out.print("Masukan Alamat: ");
        alamatIn = scanItem.nextLine();
        System.out.print("Masukan Tanggal Lahir: ");
        tanggalIn = scanItem.nextLine();
        System.out.print("Masukan Email: ");
        emailIn = scanItem.nextLine();

        //Tampilan Output program
        System.out.println("Nama: "+namaIn);
        System.out.println("Alamat: "+alamatIn);
        System.out.println("Tanggal Lahir: "+tanggalIn);
        System.out.println("Email: "+emailIn);
    }
}
