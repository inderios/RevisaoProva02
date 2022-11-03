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
        this("Sem código", " ", " ", 0.0);
    }
    public String toString() {
        String mensagem = String.format("Codigo: %s; Nome: %s; Descrição: %s; Preço: %d.",
                this.codigo, this.nome, this.descricao, this.preco);
        return mensagem;
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
