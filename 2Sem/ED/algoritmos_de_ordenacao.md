#1. Algoritmos de Ordenação

##1.1. Método da seleção

###1.1.1. Descrição

<p>
A ideia do método de seleção é, a cada passagem pelo vetor, selecionar o menor elemento e colocar este elemento o mais a esquerda possível. 
</p>

###1.1.2. Exemplo

```java
vet[46, 15, 91, 59, 62, 76, 10, 93]
```

<p>Operações:</p>
<p><i>Primeira varredura: </i></p>
<p>[<strong>46</strong>, <strong>15</strong>, 91, 59, 62, 76, 10, 93]</p>
<p>[<strong>15</strong>, 46, 91, 59, 62, 76, <strong>10</strong>, 93]</p>
<p><i>Segunda varredura: </i></p>
<p>[10, <strong>46</strong>, 91, 59, 62, 76, <strong>15</strong>, 93]</p>
<p><i>Terceira varredura: </i></p>
<p>[10, 15, <strong>91</strong>, <strong>59</strong>, 62, 76, 46, 93]</p>
<p>[10, 15, <strong>59</strong>, 91, 62, 76, <strong>46</strong>, 93]</p>
<p><i>Quarta varredura: </i></p>
<p>[10, 15, 46, <strong>91</strong>, <strong>62</strong>, 76, 59, 93]</p>
<p>[10, 15, 46, <strong>62</strong>, 91, 76, <strong>59</strong>, 93]</p>
<p><i>Quinta varredura: </i></p>
<p>[10, 15, 46, 59, <strong>91</strong>, <strong>76</strong>, 62, 93]</p>
<p>[10, 15, 46, 59, <strong>76</strong>, 91, <strong>62</strong>, 93]</p>
<p><i>Sexta varredura: </i></p>
<p>[10, 15, 46, 59, 62, <strong>91</strong>, <strong>76</strong>, 93]</p>
<p>[10, 15, 46, 59, 62, 76, 91, 93]</p>

###1.1.3. Exercício

<p>
Desenvolver um método Java de ordenação pelo método SELEÇÂO.
</p>

```java
public int[] selecao(int[] vetor)
{
    // armazenam o menor valor e o índice do menor valor
    int menor, indiceMenor;

    for (int i = 0; i < vetor.length - 1; i++) {
        // antes de comparar, considera-se menor o valor atual do loop
        menor = vetor[i];
        indiceMenor = i;

        // compara com os outros valores do vetor
        for (int j = i + 1; j < vetor.length; j++){
            if (vetor[j] < menor){
                menor = vetor[j];
                indiceMenor = j;
            }
        }

        // troca os valores menor e maior
        vetor[indiceMenor] = vetor[i];
        vetor[i] = menor;
    }

    return vetor;
}
```
---
##1.2. Método da bolha

###1.2.1. Descrição
<p>
O "Bubble Sort" (Método da bolha) recebeu esse nome pela imagem pitoresca usada para descrevê-la: os elementos maiores são mais leves e sobem como bolha até suas posições corretas.
</p>

###1.2.2. Exemplo
```java
vet[3, 9, 7, 5, 11, 1]
```
<p><i>Primeira varredura</i></p>
<p>[3, 9, 7, 5, 11, 1]</p>
<p>[3, <b>7</b>, <b>9</b>, 5, 11, 1]</p>
<p>[3, 7, <b>5</b>, <b>9</b>, 11, 1]</p>
<p>[3, 7, 5, 9, <b>11</b>, <b>1</b>]</p>
<p><i>Segunda varredura</i></p>
<p>[3, <b>7</b>, <b>5</b>, 9, 11, 1]</p>
<p>[3, 5, 7, 9, <b>11</b>, <b>1</b>]</p>
<p><i>Terceira varredura</i></p>
<p>[3, 5, 7, <b>9</b>, <b>1</b>, 11]</p>
<p><i>Quarta varredura</i></p>
<p>[3, 5, <b>7</b>, <b>1</b>, 9, 11]</p>
<p><i>Quinta varredura</i></p>
<p>[3, <b>5</b>, <b>1</b>, 7, 9, 11]</p>
<p><i>Sexta varredura</i></p>
<p>[<b>3</b>, <b>1</b>, 5, 7, 9, 11]</p>
<p>[1, 3, 5, 7, 9, 11]</p>

###1.2.3. Exercício
<p>
Desenvolver um método Java que implemente o método de ordenação bolha.
</p>

```java
public int[] bubble(int[] vetor)
{
    int aux = 0;
    int i = 0;
    
    for (i = 0; i < vetor.length; i++) {
        for (i = 0; i < vetor.length - 1; i++) {
            if (vetor[j] > vetor[j + 1]) {
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }
    
    return vetor;
}
```
---
##1.3. Método classificação por inserção
####1.3.1. Descrição
<p>
Neste algoritmo será eleito o segundo número do vetor para iniciar a ordenação assim os elementos à esquerda do número eleito estão sempre ordenados.
</p>

###1.3.2. Exemplo
```java
vet[10, 8, 6, 2, 16, 4, 18, 11, 14, 12]
```

<p><i>Primeira varredura (6)</i></p>
<p>[<i>10, <b>8</b>, <b>6</b></i>, 2, 16, 4, 18, 11, 14, 12]</p>
<p>[<i><b>10</b>, <b>6</b>, 8</i>, 2, 16, 4, 18, 11, 14, 12]</p>
<p><i>Primeira varredura</i></p>
<p>[6, 10, 8, 2, 16, 4, 18, 11, 14, 12]</p>
<p><i>Primeira varredura</i></p>
<p>[ ]</p>
<p><i>Primeira varredura</i></p>
<p>[ ]</p>
<p><i>Primeira varredura</i></p>
<p>[ ]</p>
<p><i>Primeira varredura</i></p>
<p>[ ]</p>

###1.3.3. Exercício
<p>
Desenvolver um método Java que implemente o método de ordenação por inserção.
</p>

```java
public int[] insercao(int[] vetor) {
    int j;
    int key;
    int i;

    for (j = 1; j < vetor.length; j++)
    {
        key = vetor[j];
        
        for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)                                                                                                        
        {
            vetor[i + 1] = vetor[i];
        }
        vetor[i + 1] = key;
    }
    
    return vetor;
}
```

<p>Referências:</p>
<p>https://profrodrigosilva.wordpress.com/2010/08/12/algoritmo-selection-sort-ordenacao-por-selecao-java/</p>
<p>http://www.devmedia.com.br/entendendo-o-algoritmo-bubble-sort-em-java/24812</p>
<p>http://www.devmedia.com.br/algoritmos-de-ordenacao-em-java/32693</p>