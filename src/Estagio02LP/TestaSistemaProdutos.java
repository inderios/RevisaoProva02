package Estagio02LP;

import java.util.ArrayList;

public class TestaSistemaProdutos {
    public static void main(String[] args) {
        ListaDeProdutos sistema = new ListaDeProdutos();
        Produto p1 = new Produto();
        System.out.println(p1.toString());
        sistema.cadastrarProduto(p1);
        /* todo Cadastre mais um Produto no sistema e que tem código  "123", nome "Arroz", descrição "Arroz Urbano" e preço 8 reais.*/
        Produto p2 = new Produto("123", "Arroz", "Arroz Urbano", 8);
        System.out.println(p2.toString());
        sistema.cadastrarProduto(p2);
        /* todo Verifique no sistema, utilizando o método apropriado, se o sistema contém um produto de código "123".
            Caso tenha, mostre na saída padrão (System.out) a mensagem "Produto cadastrado com sucesso". Caso contrário, mostre a mensagem "Produto não cadastrado".*/
        boolean produtoCadastrado = sistema.existeProduto("123");
        String mensagem;
        if (produtoCadastrado) {
            mensagem = "Produto cadastrado com sucesso";
        }
        else {
            mensagem = "Produto não cadastrado";
        }
        System.out.println(mensagem);
        /*todo  Pesquise no sistema, com o método apropriado, a lista de todos os produtos cadastrados cujo nome é
           "Arroz" e imprima o código de cada um dos produtos retornados nessa lista, percorrendo essa lista com um laço (ex: for/while).*/
        ArrayList<Produto> produtos = sistema.pesquisaProdutosPeloNome("Arroz");
        for (Produto j : produtos) {
            System.out.println(j.getCodigo());
        }
    }
}
