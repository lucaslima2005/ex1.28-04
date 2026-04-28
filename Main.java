public class Main {

    // Função que imprime os elementos do array
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        // Declarando um array com 5 valores
        int[] numeros = {10, 20, 30, 40, 50};

        // Chamando a função
        imprimirArray(numeros);
    }
}