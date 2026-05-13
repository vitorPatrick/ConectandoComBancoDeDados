/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexaobancodedados;

import java.sql.Connection;

/**
 *
 * @author Patrick
 */
public class ConexaoBancoDeDados {

    public static void main(String[] args) {
        BancoConexao banco = new BancoConexao();
        Connection conexao = null;
        
        try {

            conexao = banco.criarConexao();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
