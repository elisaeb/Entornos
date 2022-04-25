/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.herenciaobject.equals;

/**
 *
 * @author alumnot
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class EjemploEquals {

    /**recibe dos parametros con informacion de coche
     * @param args
     */
    public static void main(String[] args) {

        // Coche no tiene implementado equals
        // Toma el comportamiento por defecto de object
        Coche tesla = new Coche("Mercedes", "A200", "2.0 TDI");
        Coche volkswagen = new Coche("VolksWagen", "Passat", "2.0 TDI");

        salidas(tesla, volkswagen, 1);

        //Asigna a las dos referencias el mismo objeto en memoria
        //No copia valores
        volkswagen = tesla;

        // Esta l�nea de c�digo es equivalente al bloque if/else de arriba
        System.out.println((tesla.equals(volkswagen))
                ? "Los dos coches son iguales" : "Son diferentes");

        System.out.println("Mercedes: " + tesla);
        System.out.println("Volkswagen: " + volkswagen);

        System.out.println("\n\n\n");
        //Persona s� que tiene implementado el m�todo equals
        Persona rafaNadal = new Persona("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
        Persona otroRafaNadal = new Persona("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
        Persona rogerFederer = new Persona("Roger", "Federer", LocalDate.of(1981, 8, 8));

        System.out.println((rafaNadal.equals(otroRafaNadal))
                ? "Las dos personas son iguales" : "Son diferentes");

        System.out.println((rafaNadal.equals(rogerFederer))
                ? "Las dos personas son iguales" : "Son diferentes");

        System.out.println("rafaNadal:" + rafaNadal);
        System.out.println("otroRafaNadal:" + otroRafaNadal);
        System.out.println("rogerFederer:" + rogerFederer);
        
        
        // ArrayList: sin polimorfismo
        ArrayList lista = new ArrayList();
        lista.add(rafaNadal);
        lista.add(otroRafaNadal);
        lista.add(rogerFederer);
        
        // ------------- PROGRAMACIÓN IMPERATIVA --> ESTRUCTURADA, MODULAR ---> 
        //dices instrucción a instrucción qué tienes que hacar
        System.out.println("* Recorriendo la lista al estilo clásico:");
        for (int i=0; i<lista.size();i++)
            System.out.println(lista.get(i).toString());
        
        System.out.println("* Recorriendo la lista con Iterator:");
        Iterator it=lista.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("* Recorriendo la lista con for each:");
        //Inferencia
        for(Object p: lista)
            System.out.println(p);
        
        // ---------- PROGRAMACIÓN DECLARATIVA --> PROGRAMACIÓN FUNCIONAL ----> 
        //dices lo que tiene que hacer
        System.out.println("* Recorriendo la lista con expresiones lambdas:");
        lista.forEach( p ->System.out.println());
        lista.forEach( p ->{System.out.println();System.out.println(" tela marinera");});
        
        System.out.println("* Recorriendo la lista con streams:");
        //It's called a "method reference" and it's a syntactic sugar. A partir de java 8
        lista.forEach(System.out::println);
        
        // ---------------------------------------------------------------
        // ArrayList:
        //ArrayList<Persona> lista2 = new ArrayList<Persona>();
        ArrayList<Persona> lista2 = new ArrayList<>();
        lista2.add(rafaNadal);
        lista2.add(otroRafaNadal);
        lista2.add(rogerFederer);
        
        Iterator it2=lista2.iterator();
        while(it2.hasNext())
            System.out.println(it2.next().getClass());
        
        for(Persona p: lista2)
            System.out.println(p);
        
        // -------------------------------------------------------------
        System.out.println("RafaNadal hashCode:"+rafaNadal.hashCode());
        System.out.println("OtroRafaNadal hashCode:"+otroRafaNadal.hashCode());
    }

    private static void salidas(Coche tesla, Coche volkswagen, int BBMV) {
        if (tesla.equals(volkswagen)) {
            System.out.println("Los dos coches son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }


}