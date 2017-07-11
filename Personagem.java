/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_of_zuul_pow;

import java.util.Random;



/**
 *
 * @author aluno
 */
public abstract class Personagem{
    private int energia;
    private String nome;
    private int energiaMaxima;
    private static Random dado = new Random();
    
    public Personagem(String nome, int energia){
        this.nome = nome;
        this.energia = energia;
    }
    
    public String pegaNome(){
        return nome;
    }
    
    public int pegaEnergia(){
        return energia;
    }
    
    public void incremento(){
        if(energia < energiaMaxima)
            energia++;
        
    }
    
    
    public void decremento(){
        if(energia > 0)
            energia--;
        if(energia == 0){
            System.out.println("# " + getNome() + " morreu mas passa bem");
        }
    }
    public void alimentar(){
        incremento();
        incremento();
    }   
    
    public int sorte(){
        Random rand = new Random();
        int  dado = rand.nextInt(6) + 1;
        
        return dado;
    }
    /*
    public int destreza(){
        return destreza;
    }
    */
    public void imprimir(){
        System.out.println("#######################");
        System.out.println("# Nome: " + getNome());
        System.out.println("# Vida: " + getEnergia());
        System.out.println("########################");
    }
    /*
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    
    public int getDestreza() {
        return destreza;
    }
    */
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public int getEnergia() {
        return energia;
    }

    public String getNome() {
        return nome;
    }
    
    

}
