/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Funcionario extends Pessoa implements Serializable{
    
    private Integer baseSalary;
    private final Integer cadastro;
    private Cargos cargo;
    private Date dataAdmissao;
    
    public Funcionario(String nome, String sobrenome, String sexo,
            String cpf,  LocalDate idade, String endereco, Integer baseSalary,  Integer cadastro, Cargos cargo) {
        
        super(nome, sobrenome, sexo, cpf, idade, endereco);
        this.baseSalary = baseSalary;
        this.cadastro = cadastro;
        this.cargo = cargo;
        this.dataAdmissao = new Date();
    }
    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public Integer getCadastro() {
        return cadastro;
    }
    
    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
    
    
}
