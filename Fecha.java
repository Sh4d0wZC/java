
public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
	}
	
	public Fecha(int dia,int mes,int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		
		
	}
	
	
	public boolean sonIguales(Fecha f) {
		boolean answer=false;
		if ((this.dia==f.dia)&&(this.mes==f.mes)&&(this.anio==f.anio)){
			answer=true;
		}
		return answer;
	}
	
	
	public static boolean validarFecha(int dia,int mes,int anio) {
		int limitFeb;
		boolean answer=false;

	    if ((mes>=1) &&(mes<=12)&&(dia>=1)&&(dia<=31)) 
	    {
		    if (mes==2) {
		    	
		    			if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
		    				//comprobamos si el a�o es bisiesto
		    				{
		    				limitFeb=29;
		    				}
		    			else {
		    				//System.out.println("El a�o no es bisiesto");
				        	limitFeb=28;
		    				}
		    			
		    			
		    			if (dia<=limitFeb) {
		    				answer=true;
		    				}
		    			
		    			
		    			
		    			
		    			}else {
		    					//los meses que deberian tener 30 dias
			    				if (((mes==4)||(mes==6)||(mes==9)||(mes==11)))
			    				{
			    						if (dia<=30)
			    						{
			    						answer=true;
			    						}	
			    						
			    				}else {
			    					//los meses que deberian tener 31 dias 
				    					if (dia<=31)
				    						{
				    						answer=true;
				    						}
									}
		    				}
	    }else {
	    	answer=false;
	    }
		return answer;
	}
	


	
	/*
	public static boolean validar(int dia,int mes,int anio) {
		int limiteDias1=30;
		int limiteDias2=31;
	    int limiteExcepcion;
	    int dias;
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	    	limiteExcepcion=29;
	    else {
	    	limiteExcepcion=28;
	    	}
		
		if ((mes==1)||((mes>=3)&&(mes<=7))||((mes>=9)&&(mes<=12))) {
			
			
			if (mes!=8){
				
				if (mes%2==0) {
					dias=31;
				}else {
					dias=30;
				}
				
				
			}else {
				dias=31;
			}

			
		}
	    
		return false;	
	}*/

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}


	public boolean equals(Object obj) {
		Fecha f =(Fecha)obj; //casting
		boolean answer=false;
		 if(this.dia==f.dia && this.mes==f.mes && this.anio==f.anio) {
			 answer=true;
		 }
		 return answer;
	}


	

	
	
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}


	

}
