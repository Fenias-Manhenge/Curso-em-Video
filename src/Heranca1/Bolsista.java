package Heranca1;

/**
 *
 * @author Fenias
 */
public class Bolsista extends Aluno{
    private float bolsa;

    public Bolsista(float bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista() {
    }
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarMatr(){
        System.out.println("Renovado bolsa de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagmento facilitado");
    }
}
