package testeingresso;

public class CamaroteSuperior extends Ingresso {
    private double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double imprimeCamaroteSuperior(){
        double valorCamaroteSuperior = valor + valorAdicional;

        return valorCamaroteSuperior;
    }
}
