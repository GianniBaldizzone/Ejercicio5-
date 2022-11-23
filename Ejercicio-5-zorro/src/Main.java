public class Main {
    public static void main(String[] args) {

        Alimento pato = new Alimento("Pato",
                5,
                "rico",
                "bajo");
        Alimento huevo = new Alimento("Huevo",
                3,
                "rico",
                "bajo");
        Alimento gallina = new Alimento("Gallina",
                4,
                "rico",
                "bajo");
        Alimento gallo = new Alimento("Gallo",
                10,
                "rico",
                "bajo");

Gallinero gallinero = new Gallinero("Gallinero de juan");

Zorro zorrito = new Zorro("El zorro tito");


System.out.println("Hola soy "+zorrito.getNombre());
gallinero.agregarComidaAlGallinero(pato);
gallinero.agregarComidaAlGallinero(huevo);
gallinero.agregarComidaAlGallinero(gallina);
gallinero.agregarComidaAlGallinero(gallo);

zorrito.comerAlimentos(pato,gallinero);
System.out.println(zorrito.getAlimentosComidos());
System.out.println(gallinero.getAlimentos());


    }
}