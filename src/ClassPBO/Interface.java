package ClassPBO;

interface Control {
    public void pindahChannel(int channel);
    public void PerbesarVolume (int intensitas);
    public void PerkecilVolume (int intensitas);
}

class TelevisiA implements Control{
    String[] channelTv= {"RCTI","SCTV","Indosiar","Trans TV","TPI"};
    public void pindahChannel(int channel){
        System.out.println("Pindah channel pada tv A ke: "+ channelTv[channel]);
    }
    public void PerbesarVolume(int intesitas){
        System.out.println("Perbesar intesitas volume pada tv A sebanyak: "+intesitas);
    }
    public void PerkecilVolume(int intesitas){
        System.out.println("Perkecil intesitas volume pada tv A sebanya: "+intesitas);
    }
}

class TelevisiB implements Control{
    String[] channelTv= {"TVRI","LA TV","TV 7","RCTI","SCTV"};
    public void pindahChannel(int channel){
        System.out.println("Pindah channel pada tv B ke: "+ channelTv[channel]);
    }
    public void PerbesarVolume(int intesitas){
        System.out.println("Perbesar intesitas volume pada tv B sebanyak: "+intesitas);
    }
    public void PerkecilVolume(int intesitas){
        System.out.println("Perkecil intesitas volume pada tv B sebanya: "+intesitas);
    }
}

class RemotControl {
    public static final int PINDAH_CHANNEL = 1;
    public static final int PERBESAR_VOLUME = 2;
    public static final int PERKECIL_VOLUME = 3;
    public void kirimPerintahKeTv(int aksi, Control tv, int tombol){
        switch (aksi){
            case PINDAH_CHANNEL:
                tv.pindahChannel(tombol);
                break;
            case PERBESAR_VOLUME:
                tv.PerbesarVolume(tombol);
                break;
            case PERKECIL_VOLUME:
                tv.PerkecilVolume(tombol);
                break;
        }
    }
}

class Interface {
    public static void main(String[] args) {
        TelevisiA tvA =new TelevisiA();
        TelevisiB tvB = new TelevisiB();
        RemotControl rc = new RemotControl();
        rc.kirimPerintahKeTv(RemotControl.PINDAH_CHANNEL,tvA,2);
        rc.kirimPerintahKeTv(RemotControl.PERBESAR_VOLUME,tvA,5);

        rc.kirimPerintahKeTv(RemotControl.PINDAH_CHANNEL,tvB,1);
        rc.kirimPerintahKeTv(RemotControl.PERKECIL_VOLUME,tvB,3);
    }

}
