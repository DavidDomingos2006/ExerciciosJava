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
public class Aluno {
    private float notas1;
    private float notas2;
    private float notas3;
    private float notas4;
    private float total;
    private float media;
    
    private String nome;
    
    public void Aluno(){
        
//        this.setNota1(0);
//        this.setNota2(0);
//        this.setNota3(0);
//        this.setNota4(0);
//        this.setMedia(0);
//        this.setTotal(0);
//        this.setNome("");
        this.Aluno(0,0,0,0,0,0,"");
    }
    
    public void Aluno(float not1, float not2, float not3, float not4, float tot, float med, String nom){
        
        this.setNota1(not1);
        this.setNota2(not2);
        this.setNota3(not3);
        this.setNota4(not4);
        this.setMedia(med);
        this.setTotal(tot);
        this.setNome(nom);
       
    }
    
    public void Aluno(Aluno novo){
        this.setNota1(novo.getNota1());
        this.setNota2(novo.getNota2());
        this.setNota3(novo.getNota3());
        this.setNota4(novo.getNota4());
        this.setMedia(novo.getTotal());
        this.setTotal(novo.getMedia());
        this.setNome(novo.getNome());
        
    }
    
    
    //metodos setters
    //metodos setters
    //metodos setters
    
    public void setNota1(float valor){
        
        this.notas1 = valor;
        
    }
    public void setNota2(float valor){
        
        this.notas2 = valor;
        
    }
    public void setNota3(float valor){
        
        this.notas3 = valor;
        
    }
    public void setNota4(float valor){
        
        this.notas4 = valor;
        
    }
    public void setTotal(float valor){
         valor = getNota1()+ getNota2()+ getNota3()+ getNota4();
        this.total = valor;
        
    }
    public void setMedia(float media){
        
        this.media = total/4 + media;
        
    }
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    
    //metodos getters
    //metodos getters
    //metodos getters
        
    public float getNota1 (){
    return notas1;
    }
    public float getNota2 (){
    return notas2;
    }
    public float getNota3 (){
    return notas3;
    }
    public float getNota4 (){
    return notas4;
    }
    public float getTotal (){
    return total;
    }
    public float getMedia (){
    return media;
    }
    public String getNome(){
    return nome;}
    
    /////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////
    
    public void mostrarNotas(){
    
        System.out.println("Nota 1: "+ getNota1() + "\nNota 2: "+ getNota2() + "\nNota 3: "+ getNota3() + 
                "\nNota 4: "+ getNota4() + "\nTotal: "+ getTotal() + "\nMédia: " + getMedia()
                );
       }
    
    
    
}
