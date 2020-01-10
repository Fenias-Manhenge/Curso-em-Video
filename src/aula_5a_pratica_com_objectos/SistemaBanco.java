package aula_5a_pratica_com_objectos;

/**
 *
 * @author Fenias
 */
import java.util.*;
import java.io.*;

public class SistemaBanco {
    
    Scanner t = new Scanner(System.in);
    
    Vector <ContaBanco> x = new Vector<>();
    
    public void abrirConta(){
        ContaBanco a = new ContaBanco();
        
        System.out.printf("INTRODUZA O TIPO DE CONTA: ");
        a.setTipo(t.next());
        System.out.printf("INTRODUZA O STATUS: ");
        a.setStatus(t.nextBoolean());
        
        if(a.getTipo().equalsIgnoreCase("CC")){
            a.setSaldo(50);
        }else if(a.getTipo().equalsIgnoreCase("CP")){
            a.setSaldo(150);
        } 
        
        x.addElement(a);
        
        System.out.println("CONTA CRIADA COM SUCESSO!");
    }
    
    public void fecharConta(){
        ContaBanco b = new ContaBanco();
        
        for (int i = 0; i < x.size(); i++) {
            
            if(x.get(i).getSaldo() > 0){
                System.out.println("CONTA COM DINHEIRO!");
            }else if(x.get(i).getSaldo() < 0){
                System.out.println("CONTA EM DEBITO!");
            }else{
                b.setStatus(false);
            }
            
            x.setElementAt(b, i);
        }        
    } 
    
    public void depositar (){
        ContaBanco c;
        
        for (int i = 0; i < x.size(); i++) {
            c = x.get(i);
            
            System.out.println("INTRODUZA O SALDO: ");
            double saldo = t.nextDouble();
            
            if(c.getStatus() == true){
                c.setSaldo(c.getSaldo() + saldo);
                System.out.println("DEPOSITO FEITO COM SUCESSO \n");

            }else{
                System.err.println("IMPOSSIVEL DEPOSITAR!\n");
            }
            
            x.setElementAt(c, i);
        }
    }
    
    public void sacar(){
        ContaBanco d;
        
        for (int i = 0; i < x.size(); i++) {
            d = x.get(i);
            
            System.out.println("INTRODUZA O SALDO: ");
            double saldo = t.nextDouble();
            
            if(d.getStatus() == true){
                if(d.getSaldo() > saldo){
                    d.setSaldo(d.getSaldo() - saldo);
                    System.out.println("ENVIO FEITO COM SUCESSO!");
                }else{
                    System.out.println("SALDO INSUFICIENTE!");
                }    
            }else{
                System.out.println("IMPOSSIVEL SACAR!");
            }
            x.setElementAt(d, i);
        }    
    }
    
    public void pagarMensal(){
        ContaBanco e;
        
        double valor = 0;
        
        for (int i = 0; i < x.size(); i++) {
            e = x.get(i);
            
            if(e.getTipo().equalsIgnoreCase("CC")){
                valor = 12;
            }else if(e.getTipo().equalsIgnoreCase("CP")){
                valor = 20;
            }
            
            if(e.getStatus() == true){
                if(e.getSaldo() > valor){
                    e.setSaldo(e.getSaldo() - valor);
                }else{
                    System.out.println("SALDO INSUFICIENTE!");
                }
            }else{
                System.out.println("IMPOSSIVEL PAGAR!");
            }
        }    
    }
    
    public void escFich(){
        
        try{
            File f = new File("ContaBanco.Dat");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(x);
            oos.close();
        }catch(Exception e){
            System.err.println(e.getMessage() + " ERRO!");
        }    
    }
    
    public void lerFich(){
        
        try{
            File f = new File("ContaBanco.Dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            x = (Vector) ois.readObject();
            ois.close();
        }catch(Exception e){
            System.err.println(e.getMessage() + " ERRO!");
        }
        
    }
    
    
    public SistemaBanco(){
        lerFich();
    }
    
    public void menu(){
        
        do{
            System.out.println("1.ABRIR CONTA...");
            System.out.println("2.FECHAR CONTA...");
            System.out.println("3.DEPOSITAR DINHEIRO...");
            System.out.println("4.SACAR DINHEIRO...");
            System.out.println("5.PAGAR MENSALIDADE...");
            
            int g = t.nextInt();
            
            switch(g){
                case 1: abrirConta(); escFich(); break;
                case 2: fecharConta(); escFich(); break;
                case 3: depositar(); escFich(); break;
                case 4: sacar(); escFich(); break;
                case 5: pagarMensal(); escFich(); break;
            }
        }while(true);
    }
    
    public static void main(String[] args) {
        SistemaBanco l = new SistemaBanco();
        l.menu();
    }
}
