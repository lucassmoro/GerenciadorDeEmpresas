/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package empresa.emp;

/**
 *
 * @author Lucas
 */
public enum AreaSetor {
    ADMNISTRATIVO(0,"Administrativo"),FINANCEIRO(1,"Financeiro"),DESENVOLVIMENTO(2,"Desenvolvimento"),MARKETING(3,"Marketing");

    
    private final Integer indice;
    private final String nome;
    
    AreaSetor(Integer indice, String nome){
        this.indice=indice;
        this.nome=nome;
    
}

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
