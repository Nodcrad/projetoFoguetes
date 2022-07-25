/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacedados;

import java.util.ArrayList;
import modelo.Foguete;

/**
 *
 * @author N&N
 */
public interface IFoguete {
    public abstract boolean adicionarFoguete(Foguete foguete);
    
    public abstract ArrayList<Foguete> consultarFoguetes();
    //Esse aqui é usado para o filtro na hora da consulta
   public abstract ArrayList<Foguete> consultarFoguetes(String strNomeFoguete);
    
    public String getMensagem();
}
