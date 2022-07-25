/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import bancodados.BDLancamento;
import interfacedados.ILancamento;
import java.util.ArrayList;
import modelo.Lancamento;

/**
 *
 * @author 201912030004
 */
public class ControleLancamento {
    private String mensagem;
    private ILancamento dadosLancamento;
    
    public ControleLancamento(){
        dadosLancamento = new BDLancamento();
    }
    
    public boolean adicionarLancamento(String nomeFoguete, String missaoTripulada, String tripulantes, String dataLancamento){
        Lancamento lancamento = new Lancamento(0, nomeFoguete, missaoTripulada, tripulantes, dataLancamento);
        boolean inseriu = dadosLancamento.adicionarLancamento(lancamento);
        mensagem = dadosLancamento.getMensagem();
        return inseriu;
    }
    
    public String getMensagem() {
        return mensagem;
    }
    
    public ArrayList<Lancamento> consultarLancamentos(){
        ArrayList<Lancamento> lancamento = dadosLancamento.consultarLancamentos();
        mensagem = dadosLancamento.getMensagem();
        return lancamento;
    }
}
