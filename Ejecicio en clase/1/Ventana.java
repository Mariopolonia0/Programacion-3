import java.awt.*;
import javax.swing.*;

public class Ventana{
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(400,500);
		f.setTitle("Soy tu papi");
		f.setVisible(true);

		FileDialog d = new FileDialog(f,"File Dialog");
		d.setSize(200,300);
		d.setTitle("MMG");
		d.setVisible(true);
	}
}