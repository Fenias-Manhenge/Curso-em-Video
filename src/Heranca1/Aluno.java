package Heranca1;

/**
 *
 * @author Fenias
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno() {
    }

    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Aluno!");
    }
}
