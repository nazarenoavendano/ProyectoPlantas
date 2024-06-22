package plantas;

public class Plantas {
    public static void main(String[] args) {
        System.out.println("Programa Plantas.");
        System.out.println("------------------------");

        Arbol arbolito = new Arbol();
        Flor florcita = new Flor();
        Arbusto arbustito = new Arbusto();

        arbolito.decirLoQueSoy();
        florcita.decirLoQueSoy();
        arbustito.decirLoQueSoy();

    }
}