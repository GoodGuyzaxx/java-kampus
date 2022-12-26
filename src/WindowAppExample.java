import java.awt.* ;

public class WindowAppExample {
    public static void main(String[] args) {
        Frame win = new Frame();
        Label pesan = new Label("Membuat Program window");

        pesan.setAlignment(Label.CENTER);
        win.add(pesan);
        win.setAlwaysOnTop(true);
        win.setTitle("Contoh Window");
        win.setSize(300,250);
        win.show();
    }

}
