/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa.emp;

import java.io.Serializable;


/**
 *
 * @author Lucas
 */
public class Setor implements Serializable{
    private String nome;
    private String responsavel;
    private AreaSetor areaSetor;
    
    
    //Setor(String nome, String responsavel)
    Setor(String nome, String responsavel, AreaSetor areaSetor){
        this.nome=nome;
        this.responsavel=responsavel;
        this.areaSetor=areaSetor;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public AreaSetor getAreaSetor() {
        return areaSetor;
    }

    public void setAreaSetor(AreaSetor areaSetor) {
        this.areaSetor = areaSetor;
    }

    
}