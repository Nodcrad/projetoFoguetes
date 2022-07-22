/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author ulyss
 */
public class ConexaoBanco {
    private Connection conexao;
    private String driver;
    private String url, usuario, senha;
    private String mensagem;
    private static boolean conectado = false;
    private static ConexaoBanco conexaoBanco = null;
    
    private ConexaoBanco(){
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost/controle_da_missao";
    }

    public Connection getConexao() {
        return conexao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public static boolean isConectado() {
        return conectado;
    }
    
    public static ConexaoBanco getInstanceConexaoBanco(){
        if (conexaoBanco == null){
            conexaoBanco = new ConexaoBanco();
        }
        return conexaoBanco;
    }
    
    public boolean abrirConexao(String usuario,
                                String senha){
        
        this.senha = senha;
        this.usuario = usuario;
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            mensagem = "Conexão realizada com sucesso.";
            conectado = true;
            //System.out.println("conectou");
            
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            mensagem = ex.getMessage();
            this.url = "jdbc:mysql://localhost/controle_da_missao";
            return false;
        }
    }
    
    public boolean fecharConexao(){
        if (conectado){
            try {
                conexao.close();
                mensagem = "Conexão fechada com sucesso.";
                return true;
            } catch (SQLException ex) {
                mensagem = ex.getMessage();
                return false;
            } catch (Exception ex){
                mensagem = ex.getMessage();
                return false;
            }
        }
        mensagem = "A conexão já estava fechada";
        return false;
    }
}
