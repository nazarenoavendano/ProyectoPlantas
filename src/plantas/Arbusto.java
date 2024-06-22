package plantas;

public class Arbusto extends Planta {
    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private boolean sePodaONo;

    //constructor vacio

    public Arbusto() {
    }

    //constructor con parametros SUPER

    public Arbusto(String nombre, double altoTallo, boolean tieneHojas,
                   String climaIdeal, double ancho, boolean esDomestico,
                   String variedad, String colorHojas, boolean sePodaONo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    //GETTER

    public double getAncho() {
        return ancho;
    }
    public boolean isEsDomestico() {
        return esDomestico;
    }
    public String getVariedad() {
        return variedad;
    }
    public String getColorHojas() {
        return colorHojas;
    }
    public boolean isSePodaONo() {
        return sePodaONo;
    }

    //SETTER

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }
    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    //METODO HEREDADO PERO PERSONALIZADO ⬇️⬇️⬇️

    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto.");
        System.out.println("------------------------");
    }
}
