import java.awt.* ;
import java.awt.event.*;

class bio {
    static Frame win;
    static Label ketrNama,ketrAlamat,ketrTanggal;
    static Label emptyNama,emptyAlamat,emptyTanggal;
    static TextField fieldNama,fieldAlamat,fieldTanggal;
    static Button btnInput;

    public static void main(String[] args) {
        win = new Frame();
        ketrNama = new Label("Nama");
        ketrAlamat = new Label("Alamat");
        ketrTanggal = new Label("Tanggal Lahir");
        fieldNama = new TextField(50);
        fieldTanggal = new TextField(50);
        fieldAlamat = new TextField(50);
        btnInput = new Button("OK");
        emptyNama = new Label();
        emptyAlamat = new Label();
        emptyTanggal =new Label();

        btnInput.setPreferredSize(new Dimension(415,35));
        win.setLayout(new FlowLayout(FlowLayout.LEFT));
        win.setSize(450,350);
        win.add(ketrNama);
        win.add(fieldNama);
        win.add(ketrAlamat);
        win.add(fieldAlamat);
        win.add(ketrTanggal);
        win.add(fieldTanggal);
        win.add(btnInput);
        win.add(emptyNama);
        win.add(emptyAlamat);
        win.add(emptyTanggal);
        win.show();
        win.setTitle("Masukan Data Diri");

        win.addWindowListener(new CloseApp());
        btnInput.addActionListener(new clickButton());

    }
    static void outputView(){
        emptyNama.setPreferredSize(new Dimension(400,20));
        emptyTanggal.setPreferredSize(new Dimension(400,15));
        emptyAlamat.setPreferredSize(new Dimension(400,20));
        emptyNama.setText(fieldNama.getText());
        emptyAlamat.setText(fieldAlamat.getText());
        emptyTanggal.setText(fieldTanggal.getText());
        win.validate();
    }
}

class CloseApp extends WindowAdapter {
    public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
    }
}

class clickButton implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent){
        bio.outputView();
    }
}

