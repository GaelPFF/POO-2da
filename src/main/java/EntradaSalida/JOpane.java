package EntradaSalida;

import javax.swing.JOptionPane;

public class JOpane {

	public static byte leerByte(String msje) {
	       
	         while (true) {
	            String leer = JOptionPane.showInputDialog(null, msje, 
	                    "Entero: " + Byte.MIN_VALUE + "..." + Byte.MAX_VALUE,
	                    JOptionPane.INFORMATION_MESSAGE);
	            try {
	                if (leer == null) {
	                        throw new NumberFormatException("Cancelado por usuario");
	                    }
	                return Byte.parseByte(leer);
	                
	            } catch (NumberFormatException e) {
	                String mensajeError = (leer == null) 
	                        ? "Debe ingresar un valor, no cancelar la operación."
	                        : "Error: Debe ingresar un número byte válido en el rango: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE;
	                salidaError( mensajeError);
	            }
	        }
	       }
	
	// incluir metodos para short, int, long
	    public static short leerShort(String msje) {
		       
	         while (true) {
	            String leer = JOptionPane.showInputDialog(null, msje, 
	                    "Entero: " + Short.MIN_VALUE + "..." + Short.MAX_VALUE,
	                    JOptionPane.INFORMATION_MESSAGE);
	            try {
	                if (leer == null) {
	                        throw new NumberFormatException("Cancelado por usuario");
	                    }
	                return Short.parseShort(leer);
	                
	            } catch (NumberFormatException e) {
	                String mensajeError = (leer == null) 
	                        ? "Debe ingresar un valor, no cancelar la operación."
	                        : "Error: Debe ingresar un número byte válido en el rango: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE;
	                salidaError( mensajeError);
	            }
	        }
	       }
	    
	    public static int leerInt(String msje) {
		       
	         while (true) {
	            String leer = JOptionPane.showInputDialog(null, msje, 
	                    "Entero: " + Integer.MIN_VALUE + "..." + Integer.MAX_VALUE,
	                    JOptionPane.INFORMATION_MESSAGE);
	            try {
	                if (leer == null) {
	                        throw new NumberFormatException("Cancelado por usuario");
	                    }
	                return Integer.parseInt(leer);
	                
	            } catch (NumberFormatException e) {
	                String mensajeError = (leer == null) 
	                        ? "Debe ingresar un valor, no cancelar la operación."
	                        : "Error: Debe ingresar un número byte válido en el rango: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE;
	                salidaError( mensajeError);
	            }
	        }
	       }
            
            public static float leerFloat(String msje) {
		       
	         while (true) {
	            String leer = JOptionPane.showInputDialog(null, msje, 
	                    "Entero: " + Float.MIN_VALUE + "..." + Float.MAX_VALUE,
	                    JOptionPane.INFORMATION_MESSAGE);
	            try {
	                if (leer == null) {
	                        throw new NumberFormatException("Cancelado por usuario");
	                    }
	                return Float.parseFloat(leer);
	                
	            } catch (NumberFormatException e) {
	                String mensajeError = (leer == null) 
	                        ? "Debe ingresar un valor, no cancelar la operación."
	                        : "Error: Debe ingresar un número float válido en el rango: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE;
	                salidaError( mensajeError);
	            }
	        }
	       }
            
            public static int leerDouble(String msje) {
		       
	         while (true) {
	            String leer = JOptionPane.showInputDialog(null, msje, 
	                    "Entero: " + Double.MIN_VALUE + "..." + Double.MAX_VALUE,
	                    JOptionPane.INFORMATION_MESSAGE);
	            try {
	                if (leer == null) {
	                        throw new NumberFormatException("Cancelado por usuario");
	                    }
	                return Integer.parseInt(leer);
	                
	            } catch (NumberFormatException e) {
	                String mensajeError = (leer == null) 
	                        ? "Debe ingresar un valor, no cancelar la operación."
	                        : "Error: Debe ingresar un número byte válido en el rango: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE;
	                salidaError( mensajeError);
	            }
	        }
	       }
	 // incluir metodos para float, double
	
	//  tipo de dato char y String
	
	public static char leerChar(String msje)
	{
		
	return (JOptionPane.showInputDialog(null,msje,"char..caracter",
			JOptionPane.INFORMATION_MESSAGE).charAt(0));
	}
	
	public static String leerString(String msje)
	{
		
	return (JOptionPane.showInputDialog(null,msje,"Cadena",
			JOptionPane.INFORMATION_MESSAGE));
	}
	
	// Salida de datos
	
	public static void imprimeSalida(String msje,String msje1)
	{
		JOptionPane.showMessageDialog(null,msje,msje1,
				JOptionPane.INFORMATION_MESSAGE);
	}
	public static void salidaError(String msje)
	{
		JOptionPane.showMessageDialog(null,msje,"Error!!",
				JOptionPane.ERROR_MESSAGE);
	}
	
	// otros metodos
	public static int seguirSino(){

	    return JOptionPane.showConfirmDialog(null, "Deseas capturar otra figura?",
	    		"Capturando invitados", JOptionPane.YES_NO_OPTION);

	 }

	public static String seleccionaGenero() {
		 String valores[]= {"Hombre","Mujer"};
       String res = (String) JOptionPane.showInputDialog(null, 
    		   "Selecciona genero",
    		   "Invitado", 
       		    JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
       return (res);
   }
        
        public static String plato1() {
		 String valores[]= {"Sopa de verduras","Ensalada cesar","Crema de champiñones"};
       String res = (String) JOptionPane.showInputDialog(null, 
    		   "Selecciona primer plato: ",
    		   "Pedido", 
       		    JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
       return (res);
   }
        
        public static String plato2() {
		 String valores[]= {"Pollo al horno","Carne asada","Pescado empanizado"};
       String res = (String) JOptionPane.showInputDialog(null, 
    		   "Selecciona segundo plato: ",
    		   "Pedido", 
       		    JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
       return (res);
   }
        
        public static String bebida() {
		 String valores[]= {"Agua mineral","Refresco","Jugo natural"};
       String res = (String) JOptionPane.showInputDialog(null, 
    		   "Selecciona bebida: ",
    		   "Pedido", 
       		    JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
       return (res);
   }
        
        public static String postre() {
		 String valores[]= {"Flan","Pastel de chocolate","Helado"};
       String res = (String) JOptionPane.showInputDialog(null, 
    		   "Selecciona postre: ",
    		   "Pedido", 
       		    JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
       return (res);
   }
	
	
	public static String opcionesListaDesplegable(String menu) {
		 String valores[]=menu.split(",");
        String res = (String) JOptionPane.showInputDialog(null, 
        		"Opciones del Menu", 
        		"Selecciona opcion",
        		JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
        return (res);
    }
	public static String botonOpciones(String menu) {
		 String valores[]=menu.split(",");
		 int n;
		 n = JOptionPane.showOptionDialog(null,"SELECCIONA "
		 		+ " DANDO CLICK ", " M E N U", 
		JOptionPane.NO_OPTION, //sin botones
		 JOptionPane.QUESTION_MESSAGE,null, 
		 // utiliza icono predeterminado
		 valores,valores[0]); // botón determinado
		 return( valores[n]);// retorno el contenido de la posicion de n
	 }
        
        public static void imprimeCuadro (String titulo, String datos) {
            String unir = "\n Elaborado por: ";
            // encabezado
            unir+="\n"+"=".repeat(50)+"\n";
            unir+=" ".repeat(15)+titulo+"  \n";
            unir+="\n"+"=".repeat(50);
            // imprime contenido
            unir+="\n  "+datos;
            // imprime al final del reporte
            unir+="\n"+"=".repeat(50)+"\n";
            unir+="\n Copyright (@) [Incluir su nombre]";
            
            JOptionPane.showMessageDialog(null,unir,"Reporte de salida:",
                    JOptionPane.INFORMATION_MESSAGE);
        }
	
}