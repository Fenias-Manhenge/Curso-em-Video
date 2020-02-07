package Heranca;

/**
 *
 * @author Fenias
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private double salario;

    public Professor() {
    }

    public Professor(String especialidade, double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void receberAum(double sal){
        this.salario = sal;
    }
    
}
