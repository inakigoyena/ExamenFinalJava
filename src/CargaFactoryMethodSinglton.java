import Cargas.Carga;
import Cargas.ContenedorComposite;
import Cargas.Simple;

public class CargaFactoryMethodSinglton {

private static CargaFactoryMethodSinglton instancia;

private CargaFactoryMethodSinglton(){}

public static CargaFactoryMethodSinglton obtenerInstancia(){
    if (CargaFactoryMethodSinglton.instancia == null) {
        CargaFactoryMethodSinglton.instancia = new CargaFactoryMethodSinglton();
    }
    return CargaFactoryMethodSinglton.instancia;
}

    public Carga crearCarga(String tipo) {
        switch (tipo.toUpperCase()) {
            case "SIMPLE":
                return new Simple();
            case "CONTENEDOR":
                return new ContenedorComposite();
        }

        return null;
    }


}
