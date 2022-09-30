
package testeingresso;

public class Ingresso {
    protected double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println("Valor: " + valor);
    }
    
}
