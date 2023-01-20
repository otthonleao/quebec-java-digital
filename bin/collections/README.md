# Trabalhando com Collections Java

Collection é um objeto que agrupa múltiplos elementos sendo variáveis primitivas ou objetos dentro de uma única unidade.

Serve para armazenar e processar coleções de dados de forma eficiente.

## Composição dos Collections

- **Interfaces:** É um contrato que quando assumido por uma classe deve ser implementado.
- **Classes ou Implementações:** são as materializações, a codificação das interfaces.
- **Algoritmos:** É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

## Collections com iterações ordenadas

### Lists
A interface **list** fica dentro do package **java.util.List**, tendo duas características:
- Elementos duplicados
- Garante ordem de inserção.

- **ArrayList**: deve ser usado onde mais operações de pesquisas são necessárias, ou seja quando temos que pesquisar várias vezes dentro da array.
- **LinkedList**: deve ser usado onde mais operações de inserção e exclusão são necessárias.

### Sets
A interface **set** faz parte do package **java.util.Set**, tendo como caracteristica:
- Não permite elementos duplicados
- Não possui index.

1. <<interface>> Collection
   1. <<interface>> Set
   2. HashSet
      1. LinkedHashSet


