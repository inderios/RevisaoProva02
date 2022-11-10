package Estagio02LP;
import java.util.ArrayList;
public class ListaDeProdutos {
    private ArrayList<Produto> listaDeProdutos;
    public ListaDeProdutos(){
        this.listaDeProdutos = new ArrayList<>();
    }
    public void cadastrarProduto(Produto p){
        listaDeProdutos.add(p);
    }
    public ArrayList<Produto> getProdutos() {
        return this.listaDeProdutos;
    }
    public ArrayList<Produto> pesquisaProdutosQueCustamMenosDe (double valor) {
        ArrayList<Produto> produtosPorValor = new ArrayList<>();
        for (Produto p : this.listaDeProdutos) {
            if (p.getPreco() < valor) {
                produtosPorValor.add(p);
            }
        }
        return produtosPorValor;
    }
    public boolean existeProduto (String codigoDoProduto) {
        boolean existe = false;
        for (Produto p : listaDeProdutos) {
            if (p.getCodigo().equals(codigoDoProduto)) {
                existe = true;
            }
        }
        return existe;
    }
    public ArrayList<Produto> pesquisaProdutosPeloNome (String nomeDosProdutos) {
        ArrayList<Produto> produtosComOMesmoNome = new ArrayList<>();
        for ( Produto q : this.listaDeProdutos) {
            String nomeProdutoLista = q.getNome();
            if (nomeProdutoLista.equals(nomeDosProdutos)) {
                produtosComOMesmoNome.add(q);
            }
        }
        return produtosComOMesmoNome;
    }
}
