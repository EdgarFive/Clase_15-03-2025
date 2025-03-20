package umg.progra2;

import umg.progra2.arbolbinario.arbol;
import umg.progra2.arbolcadena.arbolcadena;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        arbol aarbol = new arbol();
        aarbol.insertar(6);
        aarbol.insertar(10);
        aarbol.insertar(4);
        aarbol.insertar(8);
        aarbol.insertar(5);
        aarbol.insertar(3);
        aarbol.insertar(15);
       // aarbol.insertar(8);
        //aarbol.insertar(11);

        arbolcadena ar = new arbolcadena();
        ar.insertar("Farore");
        ar.insertar("Impa");
        ar.insertar("Navi");
        ar.insertar("Farore");


        System.out.println("fin!");
    }
}