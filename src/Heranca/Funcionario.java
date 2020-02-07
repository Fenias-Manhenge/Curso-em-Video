package Heranca;

/**
 *
 * @author Fenias
 */
public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;

    public Funcionario(String seto, boolean trabalhando) {
        this.setor = seto;
        this.trabalhando = trabalhando;
    }

    public Funcionario() {
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrabalho(){
        
    }
    
}
