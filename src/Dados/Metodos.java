/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author david
 */
public class Metodos {
        private String nome1;
        private String nome2;
    
   public void Metodos(){
       setNome1("");
       setNome2("");
    }
   
   public void Metodos(String nom1, String nom2){
    
       this.setNome1(nom1);
       this.setNome2(nom2);
   }
   
   public void setNome1(String nome){
       this.nome1 = nome;
   }
   
   public void setNome2(String nome){
        this.nome2 = nome;
    }
   public String getNome1(){
       return nome1;
   }
   public String getNome2(){
       return nome2;
   }
   
   
    public void tabuada(int x){
        int i = 0;
        for(i=0; i<=10; i++){
            System.out.println("Tabuada de "+ x+ "*"+ i + "=" + i*x);
        
        }
        
    }
   
   }
    
   
    

