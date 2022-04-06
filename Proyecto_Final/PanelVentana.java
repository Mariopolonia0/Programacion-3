import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//creacion del panel de las ventana
public class PanelVentana extends JPanel{
	
	JLabel bienvenida = new JLabel ("Bienvenido A Su Sistema De Prestaciones Laborales",SwingConstants.CENTER);
	JLabel imagenprestacion=new JLabel(new ImageIcon("PrestacionesLaborales.jpg"));
	JLabel lbdignombre=new JLabel("Nombre");
	JLabel lbdigindentidad=new JLabel("Identidad");
	JLabel lbdigsexo=new JLabel("Sexo");
	JLabel lbdigedad=new JLabel("Edad");
	JLabel lbdigEmpresa=new JLabel("Empresa");
	JLabel lbdigtiempoTrabajado=new JLabel("Tiempo Trabajado");
	JLabel lbdigSalario = new JLabel("Salario");
	JLabel lbsalariodiario = new JLabel();
	JLabel lbpreaviso = new JLabel();
	JLabel lbcesantia = new JLabel();
	JLabel lbvacacione = new JLabel();
	JLabel lbnavidad = new JLabel();
	JLabel lbbonificacion = new JLabel();

	JTextField tfdignombre = new JTextField("");
	JTextField tfdigindentidad = new JTextField("");
	JTextField tfdigedad = new JTextField("");
	JTextField tfdigEmpresa = new JTextField("");
	JTextField tfdigtiempoTrabajado= new JTextField("0");
	JTextField tfdigSalario = new JTextField("0");

	JComboBox cbtiempoTrabajado = new JComboBox();
	JComboBox cbtiposalario = new JComboBox();
	JComboBox cbdigsexo = new JComboBox();

	PanelVentana(){

		super();
		setBackground(Color.DARK_GRAY);
		setLayout(null);
        setBounds(0,0,800,700);
        setVisible(true);
		Formarto();
		VentarResultado();
		setLayout(null);
		
	}

	void Formarto(){
		bienvenida.setFont(new Font("arial",1,25));
		bienvenida.setForeground (Color.BLUE);
        bienvenida.setBounds(0,5,800,50);
        bienvenida.setOpaque(true);
        bienvenida.setBackground(Color.GRAY);
        add(bienvenida,"North");

		imagenprestacion.setBounds(600,75,150,150);
		imagenprestacion.setOpaque(true);
		imagenprestacion.setBackground(Color.GRAY);
		add(imagenprestacion);

		lbdignombre.setForeground (Color.BLACK);
		tfdignombre.setForeground (Color.BLACK);
		lbdignombre.setFont(new Font("arial",1,20));
		tfdignombre.setFont(new Font("arial",1,20));
		lbdignombre.setBounds(50,75,150,30);
		tfdignombre.setBounds(135,75,150,23);
		add(lbdignombre);
		add(tfdignombre);

		lbdigindentidad.setForeground (Color.BLACK);
		tfdigindentidad.setForeground (Color.BLACK);
		lbdigindentidad.setFont(new Font("arial",1,20));
		tfdigindentidad.setFont(new Font("arial",1,20));
		lbdigindentidad.setBounds(300,75,200,30);
		tfdigindentidad.setBounds(390,75,150,23);
		add(lbdigindentidad);
		add(tfdigindentidad);
		
		cbdigsexo.addItem("Masculino");
		cbdigsexo.addItem("Femenino");
		lbdigsexo.setForeground (Color.BLACK);
		cbdigsexo.setForeground (Color.BLACK);
		lbdigsexo.setFont(new Font("arial",1,20));
		cbdigsexo.setFont(new Font("arial",1,20));
		lbdigsexo.setBounds(50,110,150,30);
		cbdigsexo.setBounds(135,110,150,23);
		add(lbdigsexo);
		add(cbdigsexo);
		
		lbdigedad.setForeground (Color.BLACK);
		tfdigedad.setForeground (Color.BLACK);
		lbdigedad.setFont(new Font("arial",1,20));
		tfdigedad.setFont(new Font("arial",1,20));
		lbdigedad.setBounds(300,110,200,30);
		tfdigedad.setBounds(390,110,150,23);
		add(lbdigedad);
		add(tfdigedad);

		lbdigEmpresa.setForeground (Color.BLACK);
		tfdigEmpresa.setForeground (Color.BLACK);
		lbdigEmpresa.setFont(new Font("arial",1,20));
		tfdigEmpresa.setFont(new Font("arial",1,20));
		lbdigEmpresa.setBounds(50,145,200,30);
		tfdigEmpresa.setBounds(135,145,150,23);
		add(lbdigEmpresa);
		add(tfdigEmpresa);

		lbdigtiempoTrabajado.setForeground (Color.BLACK);
		tfdigtiempoTrabajado.setForeground (Color.BLACK);
		lbdigtiempoTrabajado.setFont(new Font("arial",1,20));
		tfdigtiempoTrabajado.setFont(new Font("arial",1,20));
		lbdigtiempoTrabajado.setBounds(300,145,200,30);
		tfdigtiempoTrabajado.setBounds(475,145,35,23);
		add(lbdigtiempoTrabajado);
		add(tfdigtiempoTrabajado);

		lbdigSalario.setForeground (Color.BLACK);
		tfdigSalario.setForeground (Color.BLACK);
		lbdigSalario.setFont(new Font("arial",Font.BOLD,20));
		tfdigSalario.setFont(new Font("arial",1,20));
		lbdigSalario.setBounds(50,180,200,30);
		tfdigSalario.setBounds(135,180,150,23);
		add(lbdigSalario);
		add(tfdigSalario);
		
		cbtiempoTrabajado.addItem("A\u00f1os");
		cbtiempoTrabajado.addItem("Menses");
		cbtiempoTrabajado.setFont(new Font("arial",1,17));
		cbtiempoTrabajado.setForeground (Color.BLACK);
		cbtiempoTrabajado.setBounds(510,145,85,23);
		add(cbtiempoTrabajado);

		cbtiposalario.addItem("Semanal");
		cbtiposalario.addItem("Quicenar");
		cbtiposalario.addItem("Mensual");
		cbtiposalario.setFont(new Font("arial",1,17));
		cbtiposalario.setForeground (Color.BLACK);
		cbtiposalario.setBounds(290,180,100,23);
		add(cbtiposalario);


	}


	//panel de resultados 
	void VentarResultado(){
		lbsalariodiario.setForeground (Color.BLACK);
		lbsalariodiario.setFont(new Font("arial",Font.BOLD,20));
		lbsalariodiario.setBounds(250,300,400,30);
		add(lbsalariodiario);

		lbpreaviso.setForeground (Color.BLACK);
		lbpreaviso.setFont(new Font("arial",Font.BOLD,20));
		lbpreaviso.setBounds(250,350,400,30);
		add(lbpreaviso);

		lbcesantia.setForeground (Color.BLACK);
		lbcesantia.setFont(new Font("arial",Font.BOLD,20));
		lbcesantia.setBounds(250,400,400,30);
		add(lbcesantia);

		lbvacacione.setForeground (Color.BLACK);
		lbvacacione.setFont(new Font("arial",Font.BOLD,20));
		lbvacacione.setBounds(250,450,400,30);
		add(lbvacacione);

		lbnavidad.setForeground (Color.BLACK);
		lbnavidad.setFont(new Font("arial",Font.BOLD,20));
		lbnavidad.setBounds(250,500,400,30);
		add(lbnavidad);

		lbbonificacion.setForeground (Color.BLACK);
		lbbonificacion.setFont(new Font("arial",Font.BOLD,20));
		lbbonificacion.setBounds(250,550,400,30);
		add(lbbonificacion);

	}
	//Limpia todo el programa 
	void Limpiar(){
		tfdignombre.setText("");
		tfdigindentidad.setText("");
		tfdigedad.setText("");
		tfdigEmpresa.setText("");
		tfdigtiempoTrabajado.setText("0");
		tfdigSalario.setText("0");
		
		cbtiempoTrabajado.setSelectedIndex(0);
		cbtiposalario.setSelectedIndex(0);
		cbdigsexo.setSelectedIndex(0);
		lbsalariodiario.setText("");
     	lbpreaviso.setText("");
        lbcesantia.setText("");
        lbvacacione.setText("");
        lbnavidad.setText("");
        lbbonificacion.setText("");
	}


	void Cargar(PanelVentana pane){

		Limpiar();
		tfdignombre.setText(pane.tfdignombre.getText());
		tfdigindentidad.setText(pane.tfdigindentidad.getText());
		tfdigedad.setText(pane.tfdigedad.getText());
		tfdigEmpresa.setText(pane.tfdigEmpresa.getText());
		tfdigtiempoTrabajado.setText(pane.tfdigtiempoTrabajado.getText());
		tfdigSalario.setText(pane.tfdigSalario.getText());				
		cbtiempoTrabajado.setSelectedIndex(pane.cbtiempoTrabajado.getSelectedIndex());
		cbtiposalario.setSelectedIndex(pane.cbtiposalario.getSelectedIndex());
		cbdigsexo.setSelectedIndex(pane.cbdigsexo.getSelectedIndex());
		lbsalariodiario.setText(pane.lbsalariodiario.getText());
     	lbpreaviso.setText(pane.lbpreaviso.getText());
        lbcesantia.setText(pane.lbcesantia.getText());
        lbvacacione.setText(pane.lbvacacione.getText());
        lbnavidad.setText(pane.lbnavidad.getText());
        lbbonificacion.setText(pane.lbbonificacion.getText());
	}
}