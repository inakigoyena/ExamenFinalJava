import Cargas.Carga;

import java.util.ArrayList;

public class Barco {
    private String matricula;
    private ArrayList<Carga> cargasBarco = new ArrayList();

    public void agregarCarga(Carga carga){
        this.cargasBarco.add(carga);
    }

    public void quitarCarga(Carga carga){
        this.cargasBarco.remove(carga);
    }

    public void mostarCarga(){
            for (Carga carga : this.cargasBarco) {
                System.out.println(carga.getNombre() + "   "+ carga.getDescripcion() +"   "+ carga.calcularPeso());
            }

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Carga> getCargasBarco() {
        return cargasBarco;
    }

    public void setCargasBarco(ArrayList<Carga> cargasBarco) {
        this.cargasBarco = cargasBarco;
    }
}
