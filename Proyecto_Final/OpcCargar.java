import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//aqui se len los archivos guardado en los archivos .dad
class OpcCargar{
	
	OpcCargar(PanelVentana panel){
		CalculoPrestacion calcular=new CalculoPrestacion();
		try{
      		ObjectInputStream cargarp = new ObjectInputStream(new FileInputStream("personal.dat"));
      		PanelVentana pane = (PanelVentana) cargarp.readObject();
      		cargarp.close();

      		panel.Cargar(pane);
      	}catch(Exception e){
			System.out.print("Eror ");
		}	

		JLabel imp = new JLabel("Cargado Con Exito");
		imp.setFont(new Font("arial",2,25));
		imp.setForeground (Color.BLUE);

		JOptionPane seguro =new JOptionPane();
		seguro.showMessageDialog(panel,imp,"Aviso",1);
	}


}