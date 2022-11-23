import java.util.ArrayList;

public class Zorro {
    private String nombre;
    private ArrayList<Alimento> alimentosComidos;
    private int energia;

    public Zorro(String nombre, int energia) {
        this.nombre = nombre;
        this.alimentosComidos = new ArrayList<Alimento>(0);
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alimento> getAlimentosComidos() {
        return alimentosComidos;
    }

    public void setAlimentosComidos(ArrayList<Alimento> alimentosComidos) {
        this.alimentosComidos = alimentosComidos;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public  void comerAlimentos(){

    }
}
