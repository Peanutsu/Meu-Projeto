package Projeto_p2;
public class escolha {

    private String texto;
    private Capitulo proximo;

    public escolha(String texto, Capitulo proximo) {
        setTexto(texto);
        setProximo(proximo);
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Capitulo getProximo() {
        return proximo;
    }

    public void setProximo(Capitulo proximo) {
        this.proximo = proximo;
    }

}