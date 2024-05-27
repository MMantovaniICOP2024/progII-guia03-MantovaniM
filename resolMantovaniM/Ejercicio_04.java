package resolMantovaniM;


	import java.util.Scanner;

	
	public class Ejercicio_04 extends menuPrincipal {

		public String contraseña;
		
		public Ejercicio_04(String contraseña) {
			this.contraseña = contraseña;
		}

		public Ejercicio_04() {
			Scanner scanner = new Scanner(System.in);
			String contraseñaIngresada;				
			System.out.print("Ingrese una contraseña: ");
			contraseñaIngresada = scanner.nextLine();
			this.contraseña = contraseñaIngresada;
		}

	    public boolean contieneAlMenos2May() {
	        boolean dictamen = false;
	        int cantMay = 0;
	        int posicion = 0;
	        while (cantMay < 2 && posicion < this.contraseña.length() )
	        {
	           if (this.contraseña.charAt(posicion) >=65 && this.contraseña.charAt(posicion) <= 90)
	           {cantMay++;};
	           posicion++;
	        }
	        
	        if (cantMay >=2) {dictamen = true;};
	        
	    	return dictamen; 
	    }
		
	    public boolean contieneAlMenos2Num() {
	        boolean dictamen = false;
	        int cantNum = 0;
	        int posicion = 0;
	        while (cantNum < 2 && posicion < this.contraseña.length() )
	        {
	           if (this.contraseña.charAt(posicion) >=48 && this.contraseña.charAt(posicion) <= 57)
	           {cantNum++;};
	           posicion++;
	        }
	        
	        if (cantNum >=2) {dictamen = true;};
	        
	    	return dictamen; 
	    }

	    public boolean contieneAlMenos3Min() {
	        boolean dictamen = false;
	        int cantMin = 0;
	        int posicion = 0;
	        while (cantMin < 3 && posicion < this.contraseña.length() )
	        {
	           if (this.contraseña.charAt(posicion) >=97 && this.contraseña.charAt(posicion) <= 122)
	           {cantMin++;};
	           posicion++;
	        }
	        
	        if (cantMin >=3) {dictamen = true;};
	        
	    	return dictamen; 
	    }
	    
	    
	    
	    public boolean esMayor8() {
	    	boolean dictamen = false;
			if (this.contraseña.length()>= 8) { 
							dictamen = true;
				}
			
			return dictamen;
	    }
	    
	    
		public boolean esSegura()
		{
			boolean dictamen = false;
			if (this.esMayor8() && this.contieneAlMenos2May() && this.contieneAlMenos3Min() && this.contieneAlMenos2Num()) 
			{dictamen = true;}
			
			if (!this.esMayor8()) {System.out.println("No cumple con ser de longitud >= a 8.");};
			if (!this.contieneAlMenos2May()) {System.out.println("No cumple con tener al menos 2 mayusculas");};
			if (!this.contieneAlMenos3Min()) {System.out.println("No cumple con tener al menos 3 minusculas");};
			if (!this.contieneAlMenos2Num()) {System.out.println("No cumple con tener al menos 2 numeros");};
			
			return dictamen;
		}
	}