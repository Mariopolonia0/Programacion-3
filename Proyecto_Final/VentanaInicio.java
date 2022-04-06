import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//esta es la clase para inicial la ventana principal y llamar los botones de el programa
public class VentanaInicio extends JFrame{
	
	VentanaInicio(){

		setSize(800,700);
        setTitle("Bienvenido A Su Sistema De Prestaciones Laborales");
        setLocation(600,200);
        setLocationRelativeTo(null);
        setLayout(null);

       	JMenuBar menuprincipar = new JMenuBar () ;
		JButton opcnuevo = new JButton ("Nuevo") ;
		JButton opcguardar = new JButton ("Guardar") ;
		JButton opccalcular = new JButton ("Calcular") ;
		JButton opcbuscar = new JButton ("Buscar") ;
		JButton opcsalir = new JButton ("Salir") ;
		
		opcnuevo.setForeground (Color.RED);
		opcguardar.setForeground (Color.RED);
		opccalcular.setForeground (Color.RED);
		opcbuscar.setForeground (Color.RED);
		opcsalir.setForeground (Color.RED);
		
		menuprincipar.add(opcnuevo);
		menuprincipar.add(opcguardar);
		menuprincipar.add(opccalcular); 
		menuprincipar.add(opcbuscar); 
		menuprincipar.add(opcsalir);  

		PanelVentana panel=new PanelVentana();
		panel.setVisible(true);
		add(panel);
		setJMenuBar (menuprincipar);
		setVisible(true);
       
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    addWindowListener(new WindowAdapter(){
			@Override
			public void  windowClosing(WindowEvent e){
				JLabel imp = new JLabel("Seguro Que Cerrar El Programa");
                imp.setFont(new Font("arial",1,25));
                imp.setForeground (Color.BLUE);
                JOptionPane seguro =new JOptionPane();
                if(seguro.showConfirmDialog(panel,imp,"Aviso Importante",2,2)==0)
                        System.exit(0);
                
			}
		});

		opcnuevo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	OpcNuevo nuevo=new OpcNuevo(panel);
                    	
            }
        });

        opcguardar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me){
                   OpcGuardar guardar = new OpcGuardar(panel);
            } 
        });

        opccalcular.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent me){
                    	OpcCalcular calcular=new OpcCalcular(panel);
                    } 
        });


        opcbuscar.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    OpcCargar buscar =new OpcCargar(panel);
                }
        });
        

        opcsalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                        
                JLabel imp = new JLabel("Seguro Que Salir Del Programa");
                imp.setFont(new Font("arial",1,25));
                imp.setForeground (Color.BLUE);

                JOptionPane seguro =new JOptionPane();
                if(seguro.showConfirmDialog(panel,imp,"Aviso Importante",2,2)==0)
                            System.exit(0);
            }
        });
	}
}