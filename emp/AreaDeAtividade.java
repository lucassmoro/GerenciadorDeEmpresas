/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author Lucas
 */
public enum AreaDeAtividade {
    SAUDE(0,"Saúde"), INDUSTRIA(1,"Indústria"), COMERCIO(2,"Comércio"), FINANCAS(3,"Finanças"), TECNOLOGIA(4,"Tecnologia"), TRANSPORTE(5,"Transporte"), ENTRETENIMENTO(6,"Entretenimento");
    
    private final Integer indice;
    private final String name;

    
    AreaDeAtividade(Integer indice,String name){
        this.indice=indice;
        this.name=name;
    }

    @Override
    public String toString() {
        return  name;
    }
    public Integer getInteger(){
        return indice;
    }
    public String getName() {
        return name;
    }
    
    
    
}

