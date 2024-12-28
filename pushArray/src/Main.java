
public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[5];

        vetor[0] =5;
        vetor[1] =6;
        vetor[2] =7;
        vetor[3] =8;
        vetor[4] =9;

        int[] newArray =  new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            newArray[i] = vetor[i];
        }

        newArray[vetor.length] = 1;

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("vetor: " + newArray[i]);
        }



    }
}