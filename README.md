# day3-java
📚 Explorando Java na Prática: Collections, Streams API e Programação Orientada a Objetos (POO)
Durante meus estudos recentes de Java, decidi praticar alguns conceitos fundamentais que aparecem com frequência em processos seletivos, entrevistas técnicas e no dia a dia de um desenvolvedor backend.

Neste post, trago um resumo didático de alguns dos pontos que estudei e pratiquei:

✅ Tópicos trabalhados:
Programação Orientada a Objetos (POO)

Collections (List, Set, Map)

Streams API

Operações como filter, mapToDouble, flatMap, max, collect

Boas práticas de manipulação de dados com Java

🚀 Exercício 1: Mapeamento de Projetos por Funcionário
Contexto:
Criei um Map<String, Set<String>> para representar projetos e os funcionários alocados.

Exemplo da estrutura inicial:

java
Copiar
Editar
Map<String, Set<String>> projetosPorFunc = Map.of(
    "Projeto TI", Set.of("Pedro", "João"),
    "Projeto RH", Set.of("Pedro"),
    "Projeto XPTO", Set.of("Maria", "João")
);
Desafio:
👉 "Para cada funcionário, exibir os projetos únicos dele."

Principais aprendizados:
Inversão de Map: Converti de Projeto → Funcionários para Funcionário → Projetos.

Uso de Streams com Map e Set.

Cuidado com sobrescrita de chaves no Map.

Entendimento claro de como o Set impede duplicidade de elementos.

🚀 Exercício 2: Filtrando e Listando Produtos por Categoria
Cenário:
Criei uma classe Produto com os seguintes atributos:

nome

categoria

preco

Populei uma lista com pelo menos 6 produtos de diferentes categorias (Laticínios, Carnes, Eletrodomésticos, etc).

Desafio:
👉 Filtrar apenas os produtos da categoria "Laticínios" e exibir os nomes deles.

Técnicas utilizadas:
Uso de .filter() na Stream.

Impressão de mensagens para produtos fora da categoria (para fins didáticos).

Uso de Stream para transformar uma lista em um Map, caso fosse necessário mapear Nome → Categoria.

🚀 Exercício 3: Estatísticas sobre os Produtos
Parte 1: Calculando a média dos preços
👉 Objetivo: Calcular a média de preço de todos os produtos da lista.

Técnica usada:
java
Copiar
Editar
double media = produtos.stream()
    .mapToDouble(Produto::getPreco)
    .average()
    .orElse(0.0);
✅ Por que usar mapToDouble?
Permite trabalhar com tipos primitivos (double) de forma mais performática para cálculos como média, soma, mínimo e máximo.

Parte 2: Encontrando o produto mais caro
👉 Objetivo: Encontrar o produto de maior preço e transformar o resultado num Map<String, Double>, onde:

Chave: Nome do produto

Valor: Preço

Técnica usada:
java
Copiar
Editar
Optional<Produto> produtoMaisCaro = produtos.stream()
    .max(Comparator.comparingDouble(Produto::getPreco));

Map<String, Double> resultado = produtoMaisCaro
    .map(p -> Map.of(p.getNome(), p.getPreco()))
    .orElse(Map.of());
✅ Por que usar .max() com Comparator?
Porque é a forma mais direta de encontrar o maior elemento com base em um critério específico (neste caso, o preço).

