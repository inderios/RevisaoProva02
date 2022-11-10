package Estagio02LP;

public class Produto {
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    public Produto(String codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Produto() {
        this("", "", "", 0.0);
    }
    public String toString() {
        return String.format("Produto de nome %s e código %s", this.nome, this.codigo);
    }
    //set
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    //get
    public String getCodigo() {
        return this.codigo;
    }
    public String getNome() {
        return this.nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public double getPreco() {
        return this.preco;
    }
}
