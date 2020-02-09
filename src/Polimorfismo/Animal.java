package Polimorfismo;

/**
 *
 * @author Fenias
 */
public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membros;

    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public Animal() {
    }
    
    public void abstract locomover(){
        
    }
    
    public void abstract alimentar(){
        
    }
    
    public void abstract locomover(){
        
    }
}
