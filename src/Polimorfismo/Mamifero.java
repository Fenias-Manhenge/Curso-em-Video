package Polimorfismo;

/**
 *
 * @author Fenias
 */
public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(String corPelo) {
        this.corPelo = corPelo;
    }

    public Mamifero() {
    }
    
    public void locomover(){
        System.out.println("Correndo!");
    }
    
    public void alimentar(){
        System.out.println("Mamando!");
    }
    
    public void emitirSom(){
        System.out.println("Som de mamifero!");
    }
}
