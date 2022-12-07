package Cargas;

public class Simple extends Carga {

        private double peso;
        private boolean necesitaRefrigeracion;


    @Override
    public double calcularPeso() {
        double pesoFinal = 0.0;
        if(this.necesitaRefrigeracion == true){
            pesoFinal+= 2.0 + this.peso;
        }else{
            pesoFinal += this.peso;
        } return pesoFinal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isNecesitaRefrigeracion() {
        return necesitaRefrigeracion;
    }

    public void setNecesitaRefrigeracion(boolean necesitaRefrigeracion) {
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }

}
