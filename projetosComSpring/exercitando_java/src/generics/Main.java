package generics;

public class Main {
    public static void main(String[] args) {

        ClasseGenerica<Integer> g = new ClasseGenerica<>();
        g.add(6);

        System.out.println(g.getValue());
    }
}
