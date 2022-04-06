import java.io.*;
//esta es la clase para hacer los calculos para las prestaciones de servicios 
class CalculoPrestacion implements Serializable {
	
	private double salario;
	private double salariodiario;
	private double preaviso;
	private double cesantia;
	private double vacaciones;
	private double navidad;
	private double bonificacion;
	private int tiempotrabajando;
	private int tipoPago;
	private boolean esAnostrabajado;

    CalculoPrestacion(){
    	this.salario=0;
    	this.tiempotrabajando=0;
    	this.esAnostrabajado=false;
    	this.tipoPago=0;
    } 

    void setSalario(Double a){
    	this.salario=a;
    }

    Double getSalario(){
    	return this.salario;
    }

    Double getSalarioDiario(){
 		return salariodiario;
    }

    void setSalarioDiario(){
    	switch(tipoPago){
    		case 0: this.salariodiario=this.salario/5.5;break;
    		case 1: this.salariodiario=this.salario/11.91;break;
    		case 2: this.salariodiario=this.salario/23.83;break;
 		}
    }

    void setTipoPago(int a){
    	this.tipoPago=a;
    }

    int getTipoPago(){
    	return tipoPago;
    }

    int getTiempoTrabajando(){
    	return this.tiempotrabajando;
    }

    void setTiempoTrabajando(String a){
    	int b =Integer.parseInt(a);
    	this.tiempotrabajando=b;
    }

    void setEsAnosTrabajado(int a){
    	if(0==a)
    		this.esAnostrabajado=true;
    	else
    		this.esAnostrabajado=false;
    }

    boolean getEsAnosTrabajado(){
    	return esAnostrabajado;
    }

    void setEsAnosTrabajado(boolean a){
    	this.esAnostrabajado=a;
    }

    Double getPreaviso(){

    	if(esAnostrabajado){
    		this.preaviso=28*salariodiario;
    	}else if(tiempotrabajando >= 3 && tiempotrabajando<=5){
    		this.preaviso=7*salariodiario;
    	}else if(tiempotrabajando>=6 && tiempotrabajando<=11){
    		this.preaviso=14*salariodiario;
    	}
    	return preaviso;
    }

    void setVacacione(){
    	if(esAnostrabajado)
    		if(tiempotrabajando>=1 && tiempotrabajando <5)
    			this.vacaciones=14*salariodiario;
    		else if (tiempotrabajando >=5)
    			this.vacaciones=18*salariodiario;
    }

    void setNavidad(){
    	if(esAnostrabajado)
    		this.navidad=(salario*12)/12;
    }

    Double getNavidad(){
    	return this.navidad;
    }

    Double getVacacione(){
    	return this.vacaciones;
    }

    void setCesantia(){

    	if(esAnostrabajado){
    		if(tiempotrabajando>=1 && tiempotrabajando<5)
    			this.cesantia=(21*tiempotrabajando)*salariodiario;
    		else if(tiempotrabajando >=5)
    			this.cesantia=(23*tiempotrabajando)*salariodiario;
    	}else if(tiempotrabajando>=3 && tiempotrabajando<6)
    		this.cesantia=(6*tiempotrabajando)*salariodiario;
    	else if(tiempotrabajando>=6 && tiempotrabajando<12)
    		this.cesantia=(13*tiempotrabajando)*salariodiario;
    }
//Mario Peña Polonia 2016-0037
    Double getCesantia(){
    	return this.cesantia;
    }

    void setBonificacion(){
    	if(esAnostrabajado)
    		if(tiempotrabajando >=1 && tiempotrabajando < 3)
    			this.bonificacion= 45*salariodiario;
    		else if(tiempotrabajando >=3)
    			this.bonificacion=60*salariodiario;
    }

    Double getBonificacion(){
    	return this.bonificacion;
    }

    void Calcular(PanelVentana panel){

		setSalario(Double.parseDouble(panel.tfdigSalario.getText()));
        setTipoPago(panel.cbtiposalario.getSelectedIndex());
        //System.out.print(panel.cbtiposalario.getSelectedIndex());
        setSalarioDiario();
        setTiempoTrabajando(panel.tfdigtiempoTrabajado.getText());
        setEsAnosTrabajado(panel.cbtiempoTrabajado.getSelectedIndex());
		setCesantia();
		setVacacione();
		setNavidad();
		setBonificacion();
	}


	void ImprimirCalculo(PanelVentana panel){
        
        panel.lbsalariodiario.setText("Salario Diario:"+String.format("%.2f",getSalarioDiario()));
        panel.lbpreaviso.setText("Preaviso:"+String.format("%.2f",getPreaviso()));
        panel.lbcesantia.setText("Cesantia:"+String.format("%.2f",getCesantia()));
        panel.lbvacacione.setText("Vacacione:"+String.format("%.2f",getVacacione()));
        panel.lbnavidad.setText("Navidad:"+String.format("%.2f",getBonificacion()));
        panel.lbbonificacion.setText("Bonificacion:"+String.format("%.2f",getNavidad()));
	}

}//Mario Peña Polonia 2016-0037
//Mario Peña Polonia 2016-0037