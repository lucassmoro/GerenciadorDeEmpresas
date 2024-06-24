/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

public class Produto{
 //dados básicos como nome do produto, categoria, descrição, preço e quantidade em estoque;   
    private String nome;
    private Double preco;
    private Categoria categoria;
    private Integer estoque;
    
    Produto(String nome,Double preco,Categoria categoria,Integer estoque){
        
        this.nome = nome;
        this.preco = preco;
        this.categoria=categoria;
        this.estoque = estoque;
    } 
    
    public void setNome(String nome){
        this.nome=nome;
        
    };
    
     public String getNome(){
        return nome;
        
    };
    
    
    
    public void setPreco(Double preco){
        this.preco = preco;
        
    };
    
       public Double getPreco(){
        return preco;
        
    };
    
       public void setEstoque(Integer estoque){
        this.estoque = estoque;
        
    };
    
       public Integer getEstoque(){
        return estoque;
        
    };
    
}
