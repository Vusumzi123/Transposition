//clase que permite desencriptar un mensaje
//por medio del metodo Dec() que resibe una cadena
//como parametro y regresa la misma cadena desencriptada
//por el metodo de desencripción de transposicion simple.
//////////////////////////////////////////////////////////

package transposition;

/**
 *
 * @author vuszi
 */
public class Decrypt {
    
     public String decrypt(String encMessage){
        
        //If necesario para que el numero de caracteres en
        // encMessage sea par.
        if (encMessage.length()%2 != 0){
            encMessage=encMessage+" ";
        }
        
        int length=encMessage.length();
	char [] r1CharArray = new char[length];
	char [] r2CharArray = new char[length];
        String decripted="";
        
        
        // variables que evitan el desfazamiento del indice "i" en el ciclo
        // y la posicion deseada para R2 y R1
        int ir1=0; 
        int ir2=0;
        
        
        //ciclo para dividir el mensaje encriptado en dos partes "R1 y R2"
            for(int i = 0; i< length;i++){
                
                if (i >= length/2){
                    r2CharArray[ir2]=encMessage.charAt(i);
                    ir2++;
                    
                }else {
                    r1CharArray[i]=encMessage.charAt(i);
                }
            }
            
            
        //ciclo para reacomodar uno por uno los caracteres de R1 y R2 en Una Cadena
            ir2=0;
		for (int i=0; i<length; i++){

			if (i%2 != 0){
				decripted=decripted+r2CharArray[ir2];
                                ir2++;
			}else{
				decripted=decripted+r1CharArray[ir1];
                                ir1++;
			}
		}
            
                return decripted;
    }
     
}
