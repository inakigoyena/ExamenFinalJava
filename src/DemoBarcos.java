import Cargas.Carga;
import Cargas.ContenedorComposite;
import Cargas.Simple;

public class DemoBarcos {

    public static void main(String[] args) {

        CargaFactoryMethodSinglton creador = CargaFactoryMethodSinglton.obtenerInstancia();

        Simple tv32 = (Simple) creador.crearCarga("SIMPLE");
        tv32.setNombre("samsung");
        tv32.setDescripcion("35 pulgadas");
        tv32.setPeso(15.5);
        tv32.setNecesitaRefrigeracion(false);

        Simple ibuprofeno = (Simple) creador.crearCarga("SIMPLE");
        ibuprofeno.setNombre("pfizer");
        ibuprofeno.setDescripcion("ibu 800");
        ibuprofeno.setPeso(5);
        ibuprofeno.setNecesitaRefrigeracion(true);

        ContenedorComposite contenedor100= (ContenedorComposite) creador.crearCarga("CONTENEDOR");
        contenedor100.setNombre("evergreen");
        contenedor100.setDescripcion("ibu y tele");
        contenedor100.setPesoContenedor(200);
        contenedor100.agregarCarga(tv32);
        contenedor100.agregarCarga(ibuprofeno);

        Barco nuevosHorizontes = new Barco();
        nuevosHorizontes.agregarCarga(tv32);
        nuevosHorizontes.agregarCarga(ibuprofeno);
        nuevosHorizontes.agregarCarga(contenedor100);
        nuevosHorizontes.mostarCarga();


    }
}
