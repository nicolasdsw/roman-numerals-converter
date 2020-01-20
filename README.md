Instruções para executação:
- clonar o repositório: https://github.com/nicolasdsw/roman-numerals-converter.git
- entrar na pasta do projeto e após rodar os comandos a seguir:
- cd src
- javac br/com/wojcichoski/roman/*.java
- jar cvfm  RomanConverter.jar ../manifest.mf br/com/wojcichoski/roman/*.class
- java -jar RomanConverter.jar argumento  
Obs: O argumento pode ser tanto um número inteiro quanto em algarismos romanos.

Obs 2: Necessário JAVA 11 ou superior, devido a utilização do novo método repeat da classe String.

Descrição da resolução do problema: 

Para a resolução do problema foram criados dois vetores na classe RomanNumeralConverter, 
um com os valores inteiros em algarismos arábicos e outro com os algarismos romanos nas respectivas posições.

Após foram criados dois métodos estáticos, um para conversão de um valor inteiro para um algarismo romano, 
e outro para converter um valor composto por algarismos romanos para um valor inteiro.

No método toRomanNumeral é inicializada a variável que armazenará o resultado da operação e após é executado um laço de repetição da posição 12 até 0, 
representando cada posição do vetor.
Em cada iteração do laço é verificado se o valor contido na variável value é maior ou igual ao valor contido na posição corrente do vetor dos valores arábicos, 
caso a condição seja verdadeira, é obtido o primeiro algarismo da variável value através de uma divisão de inteiros, 
após é concatenado na variável de resultado o algarismo romano da posição respectiva multiplicado pelo primeiro caractere obtido 
e em seguida é subtraído de value o valor calculado.
Após a execução do laço de repetição é retornado o resultado da conversão em algarismos romanos.

No método toIntValue é inicializada a variável que armazenará o resultado da operação e após é executado um laço de repetição percorrendo cada caractere do número romano passado por parâmetro, 
Em cada iteração é armazenado na variável 'a' o valor inteiro equivalente ao algarismo romano que está sendo iterado. 
Se o caractere percorrido não for o ultimo do parâmetro, é armazenado na variável 'b' o valor inteiro do próximo caractere romano.
Se o valor de ‘a’ for menor que o valor de ‘b’ é incrementado no resultado o valor de ‘b’ menos o valor de ‘a’ e o índice é incrementado em 1, pois o algarismo seguinte já foi computado.
Se o valor de ‘a’ não for menor que o de ‘b’, o valor de ‘a’ é incrementado no resultado.
Se o caractere percorrido for o último do parâmetro o valor de a é incrementado no resultado.
Após a execução do laço de repetição é retornado um valor inteiro resultante da operação.