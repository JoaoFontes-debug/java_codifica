package classes_abstratas;

public abstract class Conta {
    protected  int total = 100;

    public void viewValue(){
        System.out.println(total);
    }

    abstract int getFee ();
}
