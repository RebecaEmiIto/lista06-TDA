# Projeto e implementação de TDA (Pilha, Fila e Lista)

Crie um novo projeto de código em sua IDE preferida e copie os códigos de interfaces de `Colecoes`, `Pilha`, `Fila` e `Lista` desenvolvidos no repositório de códigos da disciplina.

## Roteiro

1. Escreva especificação javadocs para todos os métodos das interfaces importadas do código do professor.

#

2. Crie uma nova classe denominada `PilhaIntegerCSV`, que implementa a interface `Pilha<Integer>`. Essa classe utiliza uma `String` para armazenar os valores dos objetos empilhados, separados por vírgulas. Um objeto empilhado é tranformado em string e concatenado à string CSV (_Comma-separated Values_) da coleção. Quando desempilhado, a substring do objeto em CSV é removida e tornada objeto novamente.

Por exemplo, se empilharmos os Integers 20, 11 e 48, terminaremos com o armazenamento CSV igual a `"20,11,48"`. Ao desempilhar um elemento, a substring `",48"` é removida de CSV, que se torna `"20,11"`, e o método retona o Integer `48`.

#

3. Utilizando lógica similar à `PilhaIntegerCSV`, implemente uma nova classe denominada `FilaIntegerCSV`, que implementa a interface `Fila<Integer>`.

#

4. Ainda se pautando pela lógica de `PilhaIntegerCSV`, implemente uma nova classe denominada `ListaIntegerCSV`, que implementa a interface `Lista<Integer>`.

#

5. Faça testes para as TDAs implementadas, para mostrar que estão funcionando. Todos os métodos implementados de cada TDA devem ser exercitados.

#

6. Faça uma análise de complexidade assintótica de desempenho para cada uma das três TDAs implementadas. Compare o desempenho assintótico dessas implementações com as implementações com nós-encadeados e arranjos, feitas em sala de aula.

#

7. **Desafio opcional**. É possível generalizar essas classes de coleções implementadas, para que armazenem objetos de quaisquer tipos de dados. Para tal, as classes precisam receber uma `Function<String, T> valueOf`, tal que, para qualquer instância de objeto do tipo `T obj`, a expressão `obj.equals(valueOf.apply(obj.toString()))` é sempre verdadeira. Com essa informação, implemente:
* `PilhaCSV<T>`
* `FilaCSV<T>`
* `ListaCSV<T>`
#
## Entrega

Entregue os códigos .java do projeto, **sem empacotar** em formatos de compressão. Trabalho em duplas, lembre-se de identificar os nomes da dupla.
Comentários da turma