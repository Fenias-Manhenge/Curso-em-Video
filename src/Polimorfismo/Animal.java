package Polimorfismo;

/**
 *
 * @author Fenias
 */
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public Animal() {
    }
    
    public abstract void locomover();
        
    public abstract void alimentar();
    
    public abstract void emitirSom();
}
