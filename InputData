import java.util.Scanner;

public class InputData {
	public static int readInt() {
		Scanner teclado=new Scanner(System.in);
		int n;
		n= teclado.nextInt();
		return n; 
	}
	
	public static Fecha readDate() {
		//Metodo pide datos hasta que sean validos para crear un objeto fecha
		//Si los datos son validos se retornada un objeto fecha con dichos datos
		
		// Meses y dias de un a�o bisiesto
		//1   2   3   4   5   6   7   8   9   10   11  12
		//31 29   31  30  31  30  31  31  30  31   30  31
		
		
	boolean answer=false;
	int limitFeb=0;
    int dia;
	int mes;
	int anio;
	Fecha f1=new Fecha();
	
	   do {
	   System.out.println("Introduce dia: ");
	   dia=InputData.readInt();
	   
	   System.out.println("Introduce mes: ");
	   mes=InputData.readInt();
	   
	   System.out.println("Introduce a�o: ");
	   anio=InputData.readInt();
	   

	    answer=Fecha.validarFecha(dia,mes,anio);
	    
	    
	    if (answer==false) {
	    	System.out.println("\nIntentalo otra vez.");
	    }else {
	    	//Se crear los atributos del objeto
	    	f1.setDia(dia);
	    	f1.setMes(mes);
	    	f1.setAnio(anio);
	    	}
	    
	    
	   }while(answer==false);
	   
		//Devolvemos el objeto construido
		return f1;
	}
	
	
}
