import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path arquivo = Paths.get("C:/Users/Calebe/Documents/GitHub/TrabalhoOrdenacao/Arquivos/Instâncias-TP1/DicionarioAleatorio-29855.txt");
        String vecto[] = new String[29855];
        int i =0;
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha:linhas){
                vecto[i] = linha;
                i++;
                //System.out.println(linha);
            }
        }catch (Exception e){
            System.out.println("Erro");
        }

        long tempoInicial = System.currentTimeMillis();
        bubbleSort(vecto, 29855);
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Ordenado\n");
        for (int j = 0; j < 29855; j++){
            System.out.println(vecto[j]);
        }

        System.out.println("\nTempo: " + (tempoFinal - tempoInicial)/1000 + " segundos");
    }

    public static void bubbleSort(String lista[], int tam) {
        String aux;
        int troca;
        int cont = 0;
        for (int i = 0; i < tam - 1; i++) {
            troca = 0;
            for (int j = 1; j < tam - i; j++) {
                if (lista[j].compareTo(lista[j-1]) < 0) {
                    aux = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = aux;
                    troca = 1;
                    cont ++;
                }
            }
            if (troca == 0){
                break;
            }
        }
        System.out.println("Trocas: " + cont + "\n");
    }

    public static void bubbleSortDecrescente(int lista[], int tam) {
        int aux, troca;
        for (int i = 0; i < tam - 1; i++) {
            troca = 0;
            for (int j = 1; j < tam - i; j++) {
                if (lista[j] > lista[j-1]) {
                    aux = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = aux;
                    troca = 1;
                }
            }
            if (troca == 0){
                break;
            }
        }
    }
}