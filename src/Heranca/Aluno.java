package Heranca;

/**
 *
 * @author Fenias
 */
public class Aluno extends Pessoa{
    
    private int matr;
    private String curso;

    public Aluno() {
    }

    public Aluno(int matr, String curso) {
        this.matr = matr;
        this.curso = curso;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatr(){
        
    }
    
}
