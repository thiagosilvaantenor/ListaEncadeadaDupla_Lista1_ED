# Lista Encadeada Dupla, lista 1 - Estrutura de Dados

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

## Sobre o projeto
Lista 1 de exercícios sobre Lista Encadeada Dupla, da materia de Estrutura de Dados do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>

## Índice
=================
<!--ts-->
* [Título](#lista-encadeada-dupla-,-lista-1--estrutura-de-dados)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercícios](#exercícios)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercícios
1. Simular o comportamento de listas dinâmicas para os algoritmos abaixo (A simulação deve deixar
evidente a Lista que sobrou na memória):

<div align="center">
  
  ![image](https://github.com/thiagosilvaantenor/ListaEncadeadaDupla_Lista1_ED/assets/99970279/ed951296-d313-4afa-8852-fb89b565b360)

</div>

2. Em Java:<br>
a) Ajustar o projeto de aula para criar uma biblioteca de Lista Genérica, gerando o JAR Lista

3. Dada a Lista L abaixo, fazer: <br>
  a) Determine a sequência de passos para inverter os elementos da própria lista e fazer a
  exibição dos elementos<br>
  b) Fazer, em Java, um novo projeto que insira a Lista L como acima e implemente operações
  que permita inverter os elementos da própria Lista e a exibição dos elementos<br>
  * É permitida a utilização de TADs (Estruturas de Dados) auxiliares

<div align="center">
  
  ![image](https://github.com/thiagosilvaantenor/ListaEncadeadaDupla_Lista1_ED/assets/99970279/37efb7da-bc12-41cc-beaa-d432d0da0626)

</div>


## Status do projeto
  ✅ Finalizado ✅
* Exercicíos completos:
  * [Exercicio 1, 3](https://github.com/thiagosilvaantenor/ListaEncadeadaDupla_Lista1_ED/blob/main/src/controller/ListaEncadeadaDuplaController.java)

* Projeto utiliza o padrão **MVC** *(Model View Controller)*, todos os arquivos estão dentro do diretório **src**
  * Dentro do pacote **Model/estrutura** estão as classes "modelo" que contem os objetos que serão utilizados:
    * Na classe `No`:
      
      * Atributos:
        * T valor
        * No<T> anterior
        * No<T> proximo
    
      * Métodos
        * Construtor que recebe o `T valor` e coloca `null` em anterior e proximo
        * `Getters e Setters` para encapsulamento dos atributos
        * `To String` que retorna o valor em string
           
    * Na classe `ListaEncadeadaDuplaModel`:
      
      * Atributos:
        * `No<T> inicio` que inicia como `null`
        * `No<T> fim` que inicia como `null`
          
      * Métodos:
        * `append, insert, prepend` adicionam um elemento na lista, seja no inicio, fim ou meio dela
        * `get` retorna o `No` do indice informado
        * `index` retorna o indice do elemento informado, caso esteja na lista
        * `remove`
        * `total` retorna o total de elementos da lista
        * `toString` mostra os elementos da lista em string  
    
  * Dentro do pacote **controller** está a classe com métodos, que será instanciada na camada **view**:
      
    * Na classe `ListaEncadeadaDuplaController`:
      
      * Métodos:
        * `ex1A()` cria uma `ListaEncadeadaDuplaModel` e realiza, em java, os passos do pseudo-código   
        * `ex1B()` cria uma `ListaEncadeadaDuplaModel` e realiza, em java, os passos do pseudo-código
        * `ex3()` cria as seguintes variaveis inteiras: inicio, meio e fim, para servirem de ponteiros, um vetor de `No` com o tamanho da lista que será recebida, por fim cria uma instancia de `ListaEncadeadaDuplaModel`<br>
        utiliza um `for` para percorrer o vetor até o meio dele, e depois outro `for` para percorrer do `meio + 1` até o fim, guardando os `No`s de cada item da `lista` recebida, para depois rodar um for que realiza a inversão da lista recebida

* Dentro do pacote **view** está a camada de interacao direta com o usuario:
  
    * Na classe `ListaEncadeadaDupla`:
      * Atraves de um `switch e while` cria um menu para escolha do exercicio a ser executado, chamando o método estatico do exercício equivalente, que estão presentes nesta mesma classe
      * Método `ex1`, instancia a classe `ListaEncadeadaDuplaController`, e chama o método `ex1A`, para executar o exercicio 1 letra a
      * Método `ex2`, instancia a classe `ListaEncadeadaDuplaController`, e chama o método `ex1B`, para executar o exercicio 1 letra b
      * Método `ex3`, instancia a classe `ListaEncadeadaDuplaController`, cria uma `ListaEncadeadaModel` de inteiros, preenche a lista conforme o exercicio pede, mostra a lista no terminal e chama o método `ex3`, para executar o exercicio 3 letra B
  
## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Generics](https://docs.oracle.com/javase/8/docs/technotes/guides/language/generics.html)

## Agradecimentos
Agradeço ao professor da disciplina de Estrutura de dados, Wellignton Pinto de Oliveira, por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
