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
public class Endereco implements Serializable {
    
        private String cidade;
        private String rua;
        private String numero;

        public Endereco(String cidade, String rua, String numero)throws Exception{
            if (cidade.equals("") || rua.equals("") || numero.equals("")){
                throw new Exception();
            }
            this.cidade=cidade;
            this.rua=rua;
            this.numero=numero;
        }

    @Override
        public String toString() {
            return getCidade() + ", Rua "+ getRua() + ", " + getNumero();
        }

        
        
        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

    }
