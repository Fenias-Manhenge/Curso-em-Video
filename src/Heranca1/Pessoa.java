package Heranca1;

/**
 *
 * @author Fenias
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa() {
        
    }

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public final void fazerAniver(){
        this.idade ++;
    }
}
