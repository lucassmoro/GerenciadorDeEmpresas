/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;

public class Main_GerenciamentoEmpresas {

    public static void main(String[] args) {
        
        TelaInterativa tela = new TelaInterativa();
        
        tela.BoasVindas();
        
        tela.entradaDeDadosEmpresa();

        tela.MensagemDeRegistroDeProduto();
        tela.registroDeProduto();
        
        //System.out.println("FIM DO PROGRAMA");
    }
}