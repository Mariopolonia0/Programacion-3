import java.awt.*;
import java.awt.event.*;

public class Botones extends Frame{
	private Button btnSi;
	private Button btnNo;
	private Label lbNombre;
	private Label lbApellido;
	private TextField tfNombre;
	private TextField tfApellido;
	private Panel lamina;

	public Botones(){
		inicializar();
	}

	private void inicializar(){
		setSize(500,500);
		setTitle("TEAM QUEMAO'");
		setLayout(null);
		lamina = new Panel();
		lamina.setLayout(null);
		lamina.setBounds(0,50,getWidth(),300);
		add(lamina);
		lbNombre = new Label("Nombre: ");
		lbApellido = new Label("Apellido: ");
		lbNombre.setBounds(20,5,60,22);
		lbApellido.setBounds(20,28,60,22);
		lamina.add(lbNombre);
		lamina.add(lbApellido);
		tfNombre = new TextField();
		tfApellido = new TextField();
		tfNombre.setBounds(83,5,200,22);
		tfApellido.setBounds(83,28,200,22);
		lamina.add(tfNombre);
		lamina.add(tfApellido);
		btnSi = new Button("Si");
		btnNo = new Button("No");
		btnSi.setBounds(190,450,60,42);
		btnNo.setBounds(250,450,60,42);
		add(btnSi);
		add(btnNo);
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		Botones b=new Botones();
	}
}
