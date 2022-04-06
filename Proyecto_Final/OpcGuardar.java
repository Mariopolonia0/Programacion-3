import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//en esta clase se guardan los datos en personal.dat 
class OpcGuardar {
	
	OpcGuardar(PanelVentana panel){

		CalculoPrestacion calcular =new CalculoPrestacion();
		calcular.Calcular(panel);
		try{
      		ObjectOutputStream guardarp = new ObjectOutputStream(new FileOutputStream("personal.dat"));
      		guardarp.writeObject(panel);
      		guardarp.close();

		}catch(Exception e){
			System.out.print("Eroor:"+e);
		}

		JLabel imp = new JLabel("Guardado Con Exito");
		imp.setFont(new Font("arial",2,25));
		imp.setForeground (Color.BLUE);

		JOptionPane seguro =new JOptionPane();
		seguro.showMessageDialog(panel,imp,"Aviso",1);
	}
}
