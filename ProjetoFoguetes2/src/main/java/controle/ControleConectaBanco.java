/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bancodados.ConexaoBanco;

/**
 *
 * @author ulyss
 */
public class ControleConectaBanco {
    private ConexaoBanco conexaoBanco;
    private String mensagem;
    
    public ControleConectaBanco(){
        conexaoBanco = ConexaoBanco.getInstanceConexaoBanco();
    }

    public String getMensagem() {
        return mensagem;
    }
    
    public boolean abrirConexao(
                                String usuario,
                                String senha){
        boolean conectou;
        conectou = conexaoBanco.abrirConexao(usuario, senha);
        mensagem = conexaoBanco.getMensagem();
        return conectou;
    }
    
}
