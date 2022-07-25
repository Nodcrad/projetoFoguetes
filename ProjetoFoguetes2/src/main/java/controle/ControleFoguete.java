/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import bancodados.BDFoguete;
import interfacedados.IFoguete;
import java.util.ArrayList;
import modelo.Foguete;

/**
 *
 * @author N&N
 */
public class ControleFoguete  {
    private String mensagem;
    private IFoguete dadosFoguete;
    
    public  ControleFoguete()  {
    dadosFoguete = new BDFoguete();
    }
    public boolean adicionarFoguete(String nomeFoguete, String inicioConstrucao, String terminoConstrucao, String missaoFoguete){
        boolean inseriu;
        Foguete foguete = new Foguete(0, nomeFoguete, inicioConstrucao, terminoConstrucao, missaoFoguete);
        inseriu = dadosFoguete.adicionarFoguete(foguete);
        mensagem = dadosFoguete.getMensagem();
        return inseriu;
    }
    public String getMensagem() {
        return mensagem;
    }
    public ArrayList<Foguete> consultarTodosFoguetes(){
        ArrayList<Foguete> foguetes;
        foguetes = dadosFoguete.consultarFoguetes();
        mensagem = dadosFoguete.getMensagem();
        return foguetes;
    }
    public ArrayList<Foguete> consultarTodosFoguetes(String strNomeFoguete){
        ArrayList<Foguete> foguetes;
        foguetes = dadosFoguete.consultarFoguetes(strNomeFoguete);
        mensagem = dadosFoguete.getMensagem();
        return foguetes;
    }
}
