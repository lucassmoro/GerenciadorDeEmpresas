/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Empresa implements Serializable{
    private  String nome;
    private final String cnpj;
    private Endereco endereco;
    private AreaDeAtividade area;
    

    Empresa(String nome, String cnpj, AreaDeAtividade area, Endereco endereco){
        this.nome = nome;
        this.cnpj = cnpj;
        this.area = area;
        this.endereco = endereco;
        
        
    }
    public void Salvar(File arquivo)throws Exception{
        try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(arquivo.toPath())) //
        ) {
            output.writeObject(this);
        }
        
    }
    public static Empresa Ler(File arquivo)throws IOException{
        ObjectInputStream input = new ObjectInputStream(Files.newInputStream(arquivo.toPath()));
            Empresa novaEmpresa = null;
            try {
                novaEmpresa = (Empresa) input.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
            return novaEmpresa;
    }
    
    public void setNome(String nome){
        this.nome=nome;
        
    };
    
     public String getNome(){
        return nome;
        
     }
    
     public String getCnpj(){
        return cnpj;
    }

    public AreaDeAtividade getArea() {
        return area;
    }

    public void setArea(AreaDeAtividade area) {
        this.area = area;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

   
    
    public String formato(){
        return " / ";
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome +
                ". CNPJ: " + cnpj +
                ". Endereco: " + endereco +
                ". Area: " + area;
                
    }
  
    
    
}
