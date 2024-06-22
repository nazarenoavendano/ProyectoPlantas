package plantas;

public abstract class Planta {
    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    //constructor vacio
    public Planta() {
    }

    //constructor con parametros
    public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public double getAltoTallo() {
        return altoTallo;
    }
    public boolean isTieneHojas() {
        return tieneHojas;
    }
    public String getClimaIdeal() {
        return climaIdeal;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }
    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }
    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    //metodos
    protected abstract void decirLoQueSoy ();

}
