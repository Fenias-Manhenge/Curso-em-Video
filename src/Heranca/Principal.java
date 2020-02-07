package Heranca;

/**
 *
 * @author Fenias
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();
        Aluno P2 = new Aluno();
        Professor P3 = new Professor();
        Funcionario P4 = new Funcionario();
        
        P1.setNome("Fenias");
        P2.setNome("Miguel");
        P3.setNome("Leu");
        P4.setNome("Sheila");
        
        P2.setCurso("Informartica");
        P3.setSalario(500000);
        P4.setSetor("CEO");
    }    
}
