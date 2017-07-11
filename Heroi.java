/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_of_zuul_pow;


import java.util.Map;
import java.util.HashMap;
import world_of_zuul_pow.Item;
import java.util.TreeMap;

/**
 *
 * @author aluno
 */
public class Heroi extends Personagem{

    private Map<String, Item> mochila;
    private float limitePeso;
    private int energiaMaxima;
    
    public Heroi(int energia, String nome, float limitePeso, int energiaMaxima) {
        super(nome, energia);
        this.energiaMaxima = energiaMaxima;
        this.limitePeso = limitePeso;
        mochila = new TreeMap();
        
    }
    /*
    public int calcularPeso(){
        int pesoTotal = 0;
        for(Item item : mochila.values()){
            pesoTotal += item.getPeso();
        }
        return pesoTotal;
    }
    */
    
    public static void lutar(Heroi heroi, Personagem vilao){
        
       int heroiDado = heroi.sorte();
       int vilaoDado = vilao.sorte();
       System.out.println("Dado do Herói : " + heroiDado);
       System.out.println("Dado do Vilão : " + vilaoDado);
       if(heroiDado > vilaoDado){
            vilao.decremento();
            heroi.incremento();
       }else {
            if(vilaoDado > heroiDado){
                vilao.incremento();
                heroi.decremento();
            }else{
                if(heroiDado == vilaoDado){
                    heroi.decremento();
                    vilao.decremento();
                }
            }
        }
        
        
    }

    
}
