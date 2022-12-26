package ClassPBO;

 class Buku {
      String pengarang;
      String judul;
      void Isi(String isi1, String isi2){
         judul = isi1;
         pengarang = isi2;
      }
        void CetakKeLayar(){
            if (judul == null&&pengarang==null) return;
            System.out.println("Judul:"+judul + ",Pengarang:"+ pengarang);
        }
    }

    class Karangan{
        public static void main(String[] args) {
            Buku a,b,c,d;
            a=b=c=d= new Buku();
            a.Isi("Pemrogram java","Asep Herman Suyanto");
            a.CetakKeLayar();
            b.Isi(null,null);
            b.CetakKeLayar();
            c.Isi(null,"Johan Prasetyo Hendriyanto");
            c.CetakKeLayar();
            d.Isi("Pemrograman Web",null);
            d.CetakKeLayar();
        }
    }
