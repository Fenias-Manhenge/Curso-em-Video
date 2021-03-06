package aula_6b_Encapsulamento;

/**
 *
 * @author Fenias
 */
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU----");
        System.out.println("ESTA LIGADO? " + this.getLigado());
        System.out.println("ESTA TOCANDO? " + this.getTocando());
        System.out.println("VOLUME: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+= 10) {
            System.out.printf("|||||"); 
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("FECHANDO MENU...");
    }

    @Override
    public void maisVolume() {
        this.setVolume(this.getVolume() + 3);
    }

    @Override
    public void menosVolume() {
        this.setVolume(this.getVolume() - 1);   
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }
    }
    
}
