/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_of_zuul_pow;

/**
 *
 * @author StupDude
 */
public class Simulador_de_Batalha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Npc npc1 = new Npc(31, "Vendedor");
        Heroi heroi1 = new Heroi(6, "Diablo", 666, 10);
        Heroi heroi2 = new Heroi(7, "Varian", 80, 8)
        heroi1.imprimir();
        
        Vilao vilao1 = new Vilao(5, "Minion");
        vilao1.imprimir();
      
        int i=1;
        do{     
            System.out.println("Turno: "+ i);
            Heroi.lutar(heroi1, vilao1);
            i++;
        }while(heroi1.pegaEnergia() > 0 && vilao1.pegaEnergia() > 0);
        
        
        
        if(heroi1.pegaEnergia() > vilao1.pegaEnergia()){
            System.out.println("# " + heroi1.pegaNome() + " Venceu");
            heroi1.imprimir();
            //vilao1.imprimir();
        }
        else{
            System.out.println("# "+ vilao1.pegaNome() + " Venceu");
            //heroi1.imprimir();
           vilao1.imprimir();
        }
        
          
    }
    
    
    
}
