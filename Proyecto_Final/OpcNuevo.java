import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class OpcNuevo{
	
	OpcNuevo(PanelVentana panel){
		JLabel imp = new JLabel("Seguro Que Desea Borrar Lo Digitado");
		imp.setFont(new Font("arial",1,25));
		imp.setForeground (Color.BLUE);

		JOptionPane seguro =new JOptionPane();
		if(seguro.showConfirmDialog(panel,imp,"Aviso Importante",2,2)==0)
			panel.Limpiar();
	}

	
}