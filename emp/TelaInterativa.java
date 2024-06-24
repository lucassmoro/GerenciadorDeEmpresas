/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.math.BigInteger;
import java.util.Scanner;


public class TelaInterativa{
    
   
    Scanner input =  new Scanner(System.in);
    
    TelaInterativa(){
        
    }
    
    
    public void BoasVindas(){
        System.out.println("-==--==--==--==--==--==--==--==--==--==--==--==-");
        System.out.println("Bem vindo ao registrador de empresas!");
        System.out.println("-==--==--==--==--==--==--==--==--==--==--==--==-");
        System.out.println();
    }
    
    public void entradaDeDadosEmpresa(){
        
        System.out.printf("Registre o nome da sua empresa: ");
        String nomeEmpresa = input.nextLine();
        System.out.printf("Registre o CNPJ da sua empresa: ");
        String cnpjEmpresa = input.nextLine();
        System.out.printf("Registre a area de atuacao da sua empresa:\nDIGITE\n'0' para SAUDE\n'1' para INDUSTRIA\n'2' para COMERCIO\n'3' para FINANCAS\n'4' para TECNOLOGIA\n'5' para TRANSPORTE\n'6' para ENTRETENIMENTO\n");
        Integer areaEmpresa = input.nextInt();
        System.out.println("Digite o numero do endereco");
        String n = input.nextLine();
        
        Empresa empresa = new Empresa(nomeEmpresa,cnpjEmpresa, AreaDeAtividade.values()[areaEmpresa],null);
        System.out.printf(empresa.toString());
    }
    
     public void MensagemDeRegistroDeProduto(){
        System.out.println();
        System.out.println("-==--==--==--==--==--==--==--==--==--==--==--==-");
        System.out.println("Agora registre o(s) produto(s) da sua empresas");
        System.out.println("-==--==--==--==--==--==--==--==--==--==--==--==-");
        System.out.println();
    }
    
      public void registroDeProduto(){
        
        int N;
        System.out.printf("Digite quantos produtos voce quer registrar: ");
        
        N = input.nextInt();
        for (int i = 1; i <= N; i++){
        input.nextLine();
        System.out.println();
        System.out.printf("Registre o nome do seu produto: ");
        String nomeProduto = input.nextLine();
        System.out.printf("Registre o preco do seu produto: R$ ");
        Double precoProduto = input.nextDouble();
        System.out.printf("Registre a categoria do seu produto:\nDIGITE\n'0' para ALIMENTICIOS\n'1' para FARMACEUTICOS\n'2' para ELETRODOMESTICOS\n'3' para ELETRONICOS\n'4' para PECAS\n'5' para ROUPAS\n'6' para MAQUIAGENS\n'7' para ACESSORIOS\n'8' para JOIAS\n'9' para BRINQUEDOS\nafsa");
        Integer categoriaProduto = input.nextInt();
        System.out.printf("Registre a quantidade do seu produto no estoque: ");
        Integer estoqueProduto = input.nextInt(); 
        
        Produto produto = new Produto(nomeProduto,precoProduto,Categoria.values()[categoriaProduto],estoqueProduto);
    
    
        }
        
    }
    
    
    
    
    
    
    
    
    
}