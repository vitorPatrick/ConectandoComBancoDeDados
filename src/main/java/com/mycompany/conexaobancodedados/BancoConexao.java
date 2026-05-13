package com.mycompany.conexaobancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoConexao {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca_pessoal_v1";
    private static final String USUARIO = "root";
    private static final String SENHA = "*******";
    
    public Connection criarConexao() throws Exception{
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
           System.out.println ("Conexao com o banco de dados estabelecida com sucesso!");
           return conexao;
           
       } catch (ClassNotFoundException e) {
           throw new Exception("Driver JDBC do MySQL nao encontrado: " + e.getMessage());
           
       } catch (SQLException e){
           throw new Exception("Erro ao conectar ao Banco de Dados: " +e.getMessage());
           
       } catch (Exception e){
           System.out.print("Exceção não identificada " + e.getMessage());
           return null;
       }
    }
}
