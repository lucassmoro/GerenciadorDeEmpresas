/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.Serializable;

/**
 *
 * @author Lucas
 */
public enum Cargos implements Serializable{
    CHEFE(0,"Chefe"), GERENTE(1,"Gerente"), ESTAGIARIO(2,"Estagiario"), SECRETARIA(3,"Secretaria"), FAXINEIRO(4,"Faxineiro"), JUNIOR(5,"Junior"), PLENO(6,"Pleno"), SENIOR(7,"Senior");
    
    private final Integer indice;
    private final String nome;
    Cargos(Integer indice,String nome){
        this.indice=indice;
        this.nome=nome;
    }

    @Override
    public String toString() {
        return "Cargos{" + "nome=" + nome + '}';
    }

    public Integer getIndice() {
        return indice;
    }

    public String getNome() {
        return nome;
    }


}

