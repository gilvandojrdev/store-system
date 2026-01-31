# Store System🏪

A Store System é uma loja com foco em cadastramento de produtos com scanner que o usuário deve iniciar para começar a cadastrar os seus produtos, as opçoes estão armazenadas dentro de um Enum.

Futuramente, quando eu dominar o banco de dados, eu vou atualizar o projeto. Ele é bem simples, mas funcional.

Como utilizar?

Digite a opção que está salva no Enum que você pode ver nos utils ou só interpretar o texto e, com base nas perguntas, você dá uma entrada no produto.

Importações interessantes:

Conversão de String em Array:
1. O código começa criando um objeto `StringTokenizer` chamado `tokenizer` com a string de entrada e o delimitador `","`.
2. O método `countTokens()` é usado para obter o número total de tokens presentes na string de entrada. Este valor é armazenado na variável `tokenCount`.
3. Um array chamado `stringArray` é criado com tamanho igual a `tokenCount`.
4. O método `nextToken()` é usado em um loop para iterar através de cada token e atribuí-lo ao índice correspondente em `stringArray`.
5. Finalmente, um loop `for` é usado para imprimir cada elemento no `stringArray`.

Referências: 
FreecodeCamp
