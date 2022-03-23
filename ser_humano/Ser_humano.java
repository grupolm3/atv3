/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser_humano;

/**
 *
 * @author alunocmc
 */
public class Ser_humano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Corpo_Humano c1 = new Corpo_Humano();
        
        c1.setMassa(2);
        c1.massa = 2;
        //c1.setVolume(10);
        
        
        
       //??System.out.println(c1.getDensidade());
        
        c1.setAltura(1.8);
        c1.setMassa(92.5);
        
        System.out.printf("%.2f%n", c1.calcIMC());
        
        // 1 - Ao tentar setar o valor c1.massa igual a 2 ele gera um erro pois o atributo está como private
        
        // 2 - Após alterar de private para public é possivel mudar diretamente o atributo massa sem precisar do set
        
        // 3 - Ao definir o metodo setVolume como private ele gera um erro ao acessar o metodo na main
        
        
       // Lucas Torino 11211101115
       // Maria Clara 11211101482
       // Matheus Cardoso 11211100367
       // Marcos Antonio 11211501848
        
        
    }
    
}

