package UAS;


class Mahasiswa {
    String nama;
    int npm;
    String jenisKelamin;

    Mahasiswa(String inputNama, int inputNpm,String inputJenisKelamin){
        nama = inputNama;
        npm =  inputNpm;
        jenisKelamin = inputJenisKelamin;

    }
}

class MataKuliah {
    String namaMK1 = "Pemrograman Berorientasi Objek";
    String namaMK2 = "Pemrograman Berbasis Visual";
    String namaMK3 = "Kecerdasan Buatan";
}

class UAS {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Dewantara",210301025,"Laki-Laki");
        Mahasiswa mahasiswa2 = new Mahasiswa("Arief Khoirul Anwar",210301001,"Laki-Laki");
        Mahasiswa mahasiswa3 = new Mahasiswa("Lina Mul",210301044,"Perempuan");
        MataKuliah mk1 = new MataKuliah();

        System.out.println("Nama Mahasiswa: "+mahasiswa1.nama);
        System.out.println("NPM: "+mahasiswa1.npm);
        System.out.println("Jenis Kelamin "+mahasiswa1.jenisKelamin);
        System.out.println("Mata Kuliah: "+mk1.namaMK1);
        System.out.println("===================================");
        System.out.println("Nama Mahasiswa: "+mahasiswa2.nama);
        System.out.println("NPM: "+mahasiswa2.npm);
        System.out.println("Jenis Kelamin "+mahasiswa2.jenisKelamin);
        System.out.println("Mata Kuliah: "+mk1.namaMK3);
        System.out.println("=================================");
        System.out.println("Nama Mahasiswa: "+mahasiswa3.nama);
        System.out.println("NPM: "+mahasiswa3.npm);
        System.out.println("Jenis Kelamin "+mahasiswa3.jenisKelamin);
        System.out.println("Mata Kuliah: "+mk1.namaMK2);
    }
}