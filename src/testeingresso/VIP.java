package testeingresso;

public class VIP extends Ingresso {

    protected double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double valorVIP() {
        double ingressoVIP = valor + valorAdicional;

        return ingressoVIP;
    }

}
