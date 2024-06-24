/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class CompraProduto extends Produto{
    
    private Integer quantidade;
    private ArrayList<Produto> carrinho = new ArrayList<>();
    private ArrayList<String> notafiscal = new ArrayList<>();
   
    public CompraProduto(String nome, Double preco, Categoria categoria, Integer estoque,Integer quantidade) {
        super(nome, preco,categoria,estoque);
        this.quantidade = quantidade;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public void Compra(Produto produto, Integer quantidade){
        
        if(produto.getEstoque()<quantidade){
            System.out.println("Produto em falta ou em menor quantidade que requisitado");
        }
        else{
            carrinho.add(produto);
            produto.setEstoque(produto.getEstoque()-quantidade);
            String notaFiscalEntry = String.format("%d %s(s)", quantidade, produto.getNome());
            notafiscal.add(notaFiscalEntry);
            System.out.println("Produto adicionado ao carrinho!\nDigite outro produto ou digite 0 para finalizar.");
        }
    }
    
}
