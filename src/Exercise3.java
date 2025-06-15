import model.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Tapioca");
        produto1.setCategoria("Flocos");
        produto1.setPreco(10.99);

        Produto produto2 = new Produto();
        produto2.setNome("Manteiga Qualy");
        produto2.setCategoria("Manteiga");
        produto2.setPreco(15.99);

        Produto produto3 = new Produto();
        produto3.setNome("Queijo");
        produto3.setCategoria("Laticínios");
        produto3.setPreco(30);

        Produto produto4 = new Produto();
        produto4.setNome("Requeijão");
        produto4.setCategoria("Laticínios");
        produto4.setPreco(22);


        Produto produto5 = new Produto();
        produto2.setNome("Alcatra");
        produto2.setCategoria("Carne");
        produto2.setPreco(50);


        Produto produto6 = new Produto();
        produto2.setNome("Geladeira");
        produto2.setCategoria("Eletrodoméstico");
        produto2.setPreco(1600);

        List<Produto> produtos = List.of(produto1, produto2, produto3, produto4, produto5, produto6);
        Map<String, String> produtosLaticinios = produtos.stream()
                .filter(p -> {
                    boolean isLaticinio = p.getCategoria().equals("Laticínios");
                    if (!isLaticinio) {
                        System.out.println(p.getNome() + " não faz parte da categoria Laticínios!");
                    }
                    return isLaticinio;
                })
                .collect(Collectors.toMap(Produto::getNome, Produto::getCategoria));

        double media = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .average()
                .orElse(0);

        Optional<Produto> produtoMaisCaro = produtos.stream()
                .max(Comparator.comparingDouble(Produto::getPreco));
    }
}
