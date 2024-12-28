import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int number = 2;
//        int number2 = 5;
//
//        if(number%2 == 0){
//            System.out.println("É  par");
//        }else{
//            System.out.println("É impar");
//        }

        //EXEMPLO 03
//        Scanner scan = new Scanner(System.in);
//        System.out.println("digite um dia da semana em numero: ");
//        int dia = scan.nextInt();
//
//        switch (dia){
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            default:
//                System.out.println("Dia invalido");
//        }

        //EXEMPLO 04
        int senha = 1234;
        String email = "belo@email";
        int tentativas = 0;
        Scanner scan = new Scanner(System.in);

        while(true){
            if(tentativas >= 3){
                System.out.println("Excedeu o limite de tentativas");
                break;
            }
            System.out.println("Digite seu email");
            String novoEmail = scan.nextLine();

            System.out.println("Digite sua senha");
            int novaSenha = Integer.parseInt(scan.nextLine());

            if(senha==novaSenha && email.equals(novoEmail)){
                System.out.println("Login realizado com sucesso!");
                break;
            }else{
                System.out.println("Email ou senha invalidos!");
            }
            tentativas++;
        }


    }
}