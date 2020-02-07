package Heranca1;

/**
 *
 * @author Fenias
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private Pessoa aluno;
    
    public Aluno() {
    }

    public Aluno(int matricula, String curso, Pessoa aluno) {
        this.matricula = matricula;
        this.curso = curso;
        this.aluno = aluno;
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

    public Pessoa getAluno() {
        return aluno;
    }

    public void setAluno(Pessoa aluno) {
        this.aluno = aluno;
    }
    
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Aluno!" + this.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + ", Nome=" + getNome() + 
                       
                '}';
    }
    
}
