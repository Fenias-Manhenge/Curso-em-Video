package aula_7a_Relacionamento_entre_Classes;

/**
 *
 * @author Fenias
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, double peso, String categoria, int vitorias, int derotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derotas = derotas;
        this.empates = empates;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(this.peso < 52.2){
            this.categoria = "INVALIDA";
        }else if(this.peso <= 70.3){
            this.categoria = "LEVE";
        }else if(this.peso <= 83.9){
            this.categoria = "MEDIO";
        }else if(this.peso <= 120.2){
            this.categoria = "PESADO";
        }else{
            this.categoria = "INVALIDA";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerotas() {
        return derotas;
    }

    public void setDerotas(int derotas) {
        this.derotas = derotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
