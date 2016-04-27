public class Classificacao 
{
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
}