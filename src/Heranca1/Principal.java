package Heranca1;

/**
 *
 * @author Fenias
 */
public class Principal {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
         
        a1.setNome("Fenias Manhenge");
        a1.setIdade(17);
        a1.setSexo('M');
        a1.setMatricula(11255);
        a1.pagarMensalidade();
        a1.setCurso("Informatica!");
        
        //System.out.println(a1.toString());
        
        
    }
    
}
