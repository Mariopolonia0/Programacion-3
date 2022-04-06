import java.awt.*;
import java.awt.event.*;

public class Dibujo extends Frame{

	public Dibujo(){
		inicializar();
	}

	public Dibujo(String titulo){
		inicializar();
		setTitle(titulo);
	}

	public void inicializar(){
		setSize(900,700);
		setTitle("Ventana de Dibujo");
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowDeactivated(WindowEvent e){
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.blue);
		g.fillRect(50,100,200,200);
		g.drawRect(250,100,200,200);
		g.fillOval(50,350,200,200);
		g.drawOval(250,350,200,200);
	}

	public static void main(String[] args) {
		Dibujo d = new Dibujo();
	}
}