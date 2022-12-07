package Cargas;

import java.util.ArrayList;

public class ContenedorComposite extends Carga{

    private double pesoContenedor;
    private ArrayList<Carga> cargas = new ArrayList();

    @Override
    public double calcularPeso() {
        double pesoTotal = 0.0;
        for (Carga cargas : this.cargas) {
            pesoTotal += cargas.calcularPeso();
        } return pesoTotal + this.pesoContenedor;
    }

    public void agregarCarga(Carga carga){
        this.cargas.add(carga);
    }

    public void quitarCarga(Carga carga){
        this.cargas.remove(carga);
    }

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public ArrayList<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(ArrayList<Carga> cargas) {
        this.cargas = cargas;
    }
}
