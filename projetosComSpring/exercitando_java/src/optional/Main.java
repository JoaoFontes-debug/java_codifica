package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable("resultado")
                .filter(text -> text.equals("resultad"));

        if (optional.isPresent()){
            System.out.println(optional.get());
        }else {
            System.out.println("Não existe valor");
        }

        Optional<String> condicao = Optional.ofNullable("result");

        System.out.println(condicao.isPresent());

    }
}
