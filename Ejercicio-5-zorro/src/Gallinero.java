import java.util.ArrayList;

public class Gallinero {
    private String nombre;
    private ArrayList<Alimento> alimentos;


    public Gallinero(String nombre) {
        this.nombre = nombre;
        this.alimentos = new ArrayList<Alimento>(0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public void agregarComidaAlGallinero(Alimento alimentos){
        getAlimentos().add(alimentos);
    }
    public void removerComidaAlGallinero(Alimento alimentos){
        getAlimentos().remove(alimentos);
    }
}
