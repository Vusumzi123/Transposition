//Clase que resibe una cadena y la encripta por medio
//del metodo de encriptación de Transposicion simple.
//////////////////////////////////////////////////////////

package transposition;

/**
 *
 * @author vuszi
 */
public class Encrypt {
    public String encrypt(String message){
        
        int length= message.length();
	char [] r1CharArray = new char[length];
	char [] r2CharArray = new char[length];
        String encripted;
        String r1="", r2="";
        

		for (int i=0; i< length; i++){

			if (i%2 == 0){
				r1CharArray[i]=message.charAt(i);
                                r1=r1+r1CharArray[i];
			}else{
				r2CharArray[i]=message.charAt(i);
                                r2=r2+r2CharArray[i];
			}
		}
                        
		if (message.length()%2 != 0){
			r2=r2+" ";
		}
                
                encripted=r1+r2;

                
                return encripted;
    }
}
