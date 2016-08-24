import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * El propocito de esta clase es el desentramado de una cadena de texto con maximo
 * dos identificadores direntes
 *
 * @author: DIEGO FERNANDO CARDODOZO
 * @version: 1.0
 * 
 */
public class DataManager {
    
    String delimitador1;
    String delimitador2;
    
     /**
     * Constructor para la serie de números aleatorios
     * @param delimitador1 Se refiere al delimitador principal de la trama y por el primero que se va a separar
     * @param delimitador2 Se refiere al delimitador secundario de la trama y por el segundo que se va a separar
     */

    public DataManager(String delimitador1, String delimitador2) {
        this.delimitador1 = delimitador1;
        this.delimitador2 = delimitador2;
    }

    public String getDelimitador1() {
        return delimitador1;
    }

    public String getDelimitador2() {
        return delimitador2;
    }
     
    public ArrayList dataIncoming(String data){

        ArrayList<ArrayList> desentramado = new ArrayList<>();

        String[] secmentos = data.split(getDelimitador1());
         
        desentramado.add(desentramandoSistema(secmentos[0]));
        desentramado.add(desentramandoDatos(secmentos[1]));
        desentramado.add(desentramandoInstrucciones(secmentos[2]));


        return desentramado;
    }

    private ArrayList desentramandoSistema(String string){

        ArrayList<String> sistema = new ArrayList<>();

        String[] strsistema = string.split(getDelimitador2());
        
        sistema.addAll(Arrays.asList(strsistema));

        return sistema;
    }
    
    private ArrayList desentramandoDatos(String string){

        ArrayList<String> datos = new ArrayList<>();

        String[] strsistema = string.split(getDelimitador2());
        
        datos.addAll(Arrays.asList(strsistema));

        return datos;
    }
    
    private ArrayList desentramandoInstrucciones(String string){

        ArrayList<String> instruccion = new ArrayList<>();

        String[] strsistema = string.split(getDelimitador2());
        
        Collections.addAll(instruccion, strsistema);

        return instruccion;
    }
}
