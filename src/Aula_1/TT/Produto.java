package Aula_1.TT;

public class Produto {
    private String nome;
    private String qtd;
    private String preco;
    private int index;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index + 1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
}
