package testeingresso;

public class CamaroteInferior extends VIP {
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println(
                "Localização: " + localizacao);
    }
}
