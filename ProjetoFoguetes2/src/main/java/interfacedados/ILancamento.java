/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacedados;

import java.util.ArrayList;
import modelo.Lancamento;

/**
 *
 * @author N&N
 */
public interface ILancamento {
    public abstract boolean adicionarLancamento(Lancamento lancamento);
    
    public abstract ArrayList<Lancamento> consultarLancamentos();
    
    public String getMensagem();
}
