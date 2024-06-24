/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package empresa;

/**
 *
 * @author Lucas
 */
public enum Categoria {
    ALIMENTICIOS(0), FERRAMENTAS(1), ELETRODOMESTICOS(2), ELETRONICOS(3), PEÇAS(4), ROUPAS(5), MAQUIAGENS(6), ACESSORIOS(7), JOIAS(8), BRINQUEDOS(9);
    
    Integer indice;
    Categoria(Integer indice){
        this.indice=indice;
    }
}
    