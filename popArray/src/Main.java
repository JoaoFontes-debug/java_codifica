//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[5];

        vetor[0] =5;
        vetor[1] =6;
        vetor[2] =7;
        vetor[3] =8;
        vetor[4] =9;
        int countRemocao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] != 5){
                countRemocao++;
            }
        }

        int [] newArray = new int [countRemocao];

        int index = 0;

        for (int j = 0; j < newArray.length ; j++) {
            if(vetor[j] != 5){
                newArray[index] = vetor[j];
                index++;
            }
        }

        for (int k = 0; k < newArray.length; k++) {
            System.out.println("Elemento na posiçao " + k + ":" + newArray[k]);
        }
    }
}