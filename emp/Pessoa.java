package empresa.emp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Pessoa implements Serializable {

    private final String nome;
    private final String sobrenome;
    private final String sexo;
    private final String cpf;
    private LocalDate idade;
    private String endereco;
    private String telefone;
    private final Date dataAdmissao;

    // Construtor
    public Pessoa(String nome, String sobrenome, String sexo, String cpf, LocalDate idade, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.dataAdmissao = new Date(); // Data e hora atuais no momento da criação
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        LocalDate birthDate = idade;
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        int years = period.getYears();
        this.idade = idade.minusYears(years);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }
}
