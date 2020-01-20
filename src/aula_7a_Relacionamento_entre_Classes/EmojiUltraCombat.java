package aula_7a_Relacionamento_entre_Classes;

/**
 *
 * @author Fenias
 */
public class EmojiUltraCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[3];
        
        l[0] = new Lutador("Fenias", "Moçambicano", 17, 1.70f, 55.5, "Pesado", 6, 3, 1);
        
        l[0].apresentar();
        l[0].status();
    }
    
}
