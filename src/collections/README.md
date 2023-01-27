# Trabalhando com Collections Java

Collection é um objeto que agrupa múltiplos elementos sendo variáveis primitivas ou objetos dentro de uma única unidade.

Serve para armazenar e processar coleções de dados de forma eficiente.

As interfaces que estendem diretamente da interface Collection são
1. List
2. Set
3. Queue

## Composição dos Collections

1. **Interfaces:** É um contrato que quando assumido por uma classe deve ser implementado.
2. **Classes ou Implementações:** são as materializações, a codificação das interfaces.
3. **Algoritmos:** É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

## Collections com iterações ordenadas

### Lists
A interface **list** fica dentro do package **java.util.List**, tendo duas características:

1. Elementos duplicados
2. Garante ordem de inserção.

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
2. TreeSet: ordena por ordem crescente (0-9|a-z) no console.

Ordem de performance das  implementacoes da interace Set:
HashSet > LinkedHashSet > TreeSet
### Maps
A interface **map** faz parte do package **java.util.Map**, tendo elementos únicos (key) para cada valor (value).
É possível oredenar um Map pelo valor.
A função de uma operação map() é converter cada elemento recebido em um outro objeto, de acordo com a função passada.
1. TreeMap: utiliza bastante quando estivermos falando de comparação e ordenação
2. HashMap:
3. LinkedHashMap:

Para adicionar ou atualizar um elemento em um Map, passando como argumento 'key' e 'value', utilizamos o: *Map.put(key,value)*

### Streams API
