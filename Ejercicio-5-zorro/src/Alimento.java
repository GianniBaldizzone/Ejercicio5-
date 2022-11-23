public class Alimento {
    private String nombre;
    private int energía;
    private String sabor;
    private String gradoDePeligrosidad;

    public Alimento(String nombre, int energía, String sabor, String gradoDePeligrosidad) {
        this.nombre = nombre;
        this.energía = energía;
        this.sabor = sabor;
        this.gradoDePeligrosidad = gradoDePeligrosidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergía() {
        return energía;
    }

    public void setEnergía(int energía) {
        this.energía = energía;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getGradoDePeligrosidad() {
        return gradoDePeligrosidad;
    }

    public void setGradoDePeligrosidad(String gradoDePeligrosidad) {
        this.gradoDePeligrosidad = gradoDePeligrosidad;
    }
}
