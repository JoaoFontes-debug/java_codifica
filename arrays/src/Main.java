//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nomeVetor = new int[5];

        nomeVetor[0] = 1;
        nomeVetor[1] = 2;
        nomeVetor[2] = 3;
        nomeVetor[3] = 4;
        nomeVetor[4] = 5;

        int start = 0;
        int end =  nomeVetor.length - 1;

        while (start < end){
            int temp =  nomeVetor[start];

            nomeVetor[start] = nomeVetor[end];

            nomeVetor[end] = temp;

            start++;
            end--;

            System.out.println("Array 'vetor' invertido: ");

            for (int i = 0; i < nomeVetor.length; i++) {
                System.out.println(nomeVetor[i]);
            }

        }
    }
}