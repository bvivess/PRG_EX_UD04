package EX_UD04;



import java.util.ArrayList;

public class EX_1_OK {

    static ArrayList<String> historial = new ArrayList();
    static int index;

    public static void main(String[] args) {
       // Inicialitzaci� de l'historial de navegaci�
        historial.add("www.paginaInicial.com"); // historial[0]
        historial.add("www.primeraPagina.com"); // historial[1]
        historial.add("www.segonaPagina.com");  // historial[2]
        historial.add("www.terceraPagina.com"); // historial[3]
        historial.add("www.quartaPagina.com");  // historial[4]
        historial.add("www.paginaFinal.com");   // historial[5]
        index = historial.size() - 1;

        // Simulaci� 
        retrocedir(historial);      // retrocedir 1 posici� --> historial[4]
        retrocedir(historial,10); // retrocedir 10 posicions (o b� fins a l'inici) --> historial[0]
        avancar(historial);         // avan�ar 1 posici� --> historial[1]
        avancar(historial,2);     // avan�ar 2 posicions --> historial[3]
        
        System.out.println(visitarPagina(historial));       // visitar actual --> "www.terceraPagina.com"
        System.out.println(visitarPagina(historial,100)); // visitar posici� 100 (o b� fins el final) --> "www.paginaFinal.com"
        System.out.println(visitarPagina(historial));       // visitar actual--> "www.paginaFinal.com"

    }
    
    private static String visitarPagina(ArrayList<String> historial) {
        String web;
        
        // es comprova si la llista est� buida
        if (!(historial.isEmpty())) 
            web = historial.get(index);
        else
            web = "";
        
        return web;
    }

    private static String visitarPagina(ArrayList<String> historial, int i) {
        String web;
        
        // es comprova si la llista est� buida
        if (!(historial.isEmpty())) {
            // es comprova si l'�ndex est� entre els l�mits
            index = Math.max(0,Math.min(historial.size()-1, i));
            web = historial.get(index);
        } else
            web = "";
        
        return web;
    }
    
    private static void retrocedir(ArrayList<String> historial) {
        // es comprova si la llista est� buida
        if (!(historial.isEmpty()))
            retrocedir(historial,1);  // es reutilitza el m�tode sobrecarregat
    }
    
    private static void retrocedir(ArrayList<String> historial, int i) {
        // es comprova si la llista est� buida
        if (!(historial.isEmpty()))
            index = Math.max(0, index-i);  // es comprova si l'�ndex est� entre els l�mits
    }
    
    private static void avancar(ArrayList<String> historial) {
        if (!(historial.isEmpty()))
            avancar(historial,1);  // es reutilitza el m�tode sobrecarregat
    } 
    
    private static void avancar(ArrayList<String> historial, int i) {
        if (!(historial.isEmpty()))
            index = Math.min(historial.size()-1, index+i);  // es comprova si l'�ndex est� entre els l�mits
    }

    private static void mostrarHistorial(ArrayList<String> historial) {
        // es comprova si la llista est� buida
        if(historial.isEmpty() == true)
            for (String h : historial)
                System.out.println(h);
    }

}