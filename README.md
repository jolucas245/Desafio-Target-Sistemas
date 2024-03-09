# Fibonacci-Target
Esse repositório faz parte do desafio técnico referente ao estágio da Target Sistemas. 

## Desafio 1
1) Observe o trecho de código abaixo:
```
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);
```


Ao final do processamento, qual será o valor da variável SOMA?
### Implementação feita em Dart <img align="center" alt="Joao-Dart" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/dart/dart-original.svg">
[Clique para acessar a solução](https://github.com/jolucas245/Desafio-Target-Sistemas/blob/main/soma/soma.dart)<br>
Resposta 1: **91** 

## Desafio 2
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
### Implementação feita em Kotlin <img align="center" alt="Joao-Kotlin" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/kotlin/kotlin-original.svg">
[Clique aqui para acessar a solução](https://github.com/jolucas245/Desafio-Target-Sistemas/blob/main/fibonacci/Fibonacci.kt)

## Desafio 3
3) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, <strong><code>9</code></strong>

b) 2, 4, 8, 16, 32, 64, <strong><code>128</code></strong>

c) 0, 1, 4, 9, 16, 25, 36, <strong><code>49</code></strong>

d) 4, 16, 36, 64, <strong><code>100</code></strong>

e) 1, 1, 2, 3, 5, 8, <strong><code>13</code></strong>

f) 2,10, 12, 16, 17, 18, 19, <strong><code>20</code></strong>

## Desafio 4
4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

<strong><code>Passo 1.</code></strong> Ligar o primeiro interruptor e deixar ligado durante 20 minutos.<br>
<strong><code>Passo 2.</code></strong>Após isso, desligar o primeiro interruptor e ligar o segundo interruptor.<br>
<strong><code>Passo 3.</code></strong> Correr até uma das 3 salas e verificar os casos:
- Se a lâmpada estiver apagada, mas quente, será o primeiro interruptor
- Se a lâmpada estiver acesa, será o segundo interruptor
- Se a lâmpada estiver apagada, mas fria, será o terceiro interruptor<br>

<strong><code>Passo 4.</code></strong> Após encontrar qual interruptor acende a lâmpada da sala visitada, voltamos nos interruptores e ligamos um dos dois interruptores que sobraram.<br>
<strong><code>Passo 5.</code></strong> Vamos a uma das duas salas restantes e verificamos:
- Se a lâmpada estiver ligada, é o último interruptor que ligamos
- Se a lâmpada estiver apagada, é o interruptor que não ligamos<br>

<strong><code>Passo 6.</code></strong> Pela lógica, é o interruptor que restou

## Desafio 5
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;
### Implementação feita em Dart <img align="center" alt="Joao-Dart" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/dart/dart-original.svg">
[Clique aqui para acessar a solução](https://github.com/jolucas245/Desafio-Target-Sistemas/blob/main/stringReversa/revert.dart)
