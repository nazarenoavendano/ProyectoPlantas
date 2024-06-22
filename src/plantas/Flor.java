package plantas;

public class Flor extends Planta {

    private String colorPetalos;
    private int cantPetalos;
    private String colorPistillo;
    private String variedad;
    private String estacion;

    //constructor vacio
    public Flor() {
    }

    //constructor con parametros
    public Flor(String nombre, double altoTallo, boolean tieneHojas,
                String climaIdeal, String colorPetalos, int cantPetalos,
                String colorPistillo, String variedad, String estacion) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistillo = colorPistillo;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    //GETTERS
    public String getColorPetalos() {
        return colorPetalos;
    }
    public int getCantPetalos() {
        return cantPetalos;
    }
    public String getColorPistillo() {
        return colorPistillo;
    }
    public String getVariedad() {
        return variedad;
    }
    public String getEstacion() {
        return estacion;
    }

    //SETTERS
    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }
    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }
    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    //METODO HEREDADO PERO PERSONALIZADO ⬇️⬇️⬇️

    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy una flor.");
        System.out.println("------------------------");
    }
}
