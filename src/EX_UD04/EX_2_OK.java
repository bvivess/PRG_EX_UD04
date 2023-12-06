package EX_UD04;


import java.util.ArrayList;

/**
 *
 * @author T.Vives
 */
public class EX_2_OK {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num = 25;
        array = UtilitatsClasses.arrayToArrayListInt(  // es transforma a ArrayList
                UtilitatsRecOrdCerca.ordenaArrayBimbolla(  // s'ordena l'array
                        UtilitatsArrays.generaArray(10, 0, 199))); // es genera un array
        
        // cos del programa
        UtilitatsClasses.mostrarArrayListInt(array);
        afegeixNum(array, num);  
        UtilitatsClasses.mostrarArrayListInt(array);
    }
     
    private static void afegeixNum(ArrayList<Integer> array, int num) {
        // Cerca dins l''ArrayList' array fins a trobar un element igual o superior al que es vol introduir.
        // Emmagatzema la posici� en una variable. 
        // Insereix el n�mero en la posici� emmagatzemada.
        
        // TO-DO code application logic here
        int i = 0;  // posici� a insertar 'num'
        
        for (Integer a : array) {  // per a cada element de l'array
            if (a >= num)  // es comprova l'element
                break;
            i++;
        }
        array.add(i, num);
    }

}
