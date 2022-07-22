/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 201912030004
 */
public class Lancamento {
    private int idLancamento; 
    private String nomeFoguete;
    private String missaoTripulada;
    private String tripulantes;
    private String dataLancamento;

    public Lancamento(int idLancamento, String nomeFoguete, String missaoTripulada, String tripulantes, String dataLancamento) {
        this.idLancamento = idLancamento;
        this.nomeFoguete = nomeFoguete;
        this.missaoTripulada = missaoTripulada;
        this.tripulantes = tripulantes;
        this.dataLancamento = dataLancamento;
    }

    public int getIdLancamento() {
        return idLancamento;
    }

    public void setIdLancamento(int idLancamento) {
        this.idLancamento = idLancamento;
    }

    public String getNomeFoguete() {
        return nomeFoguete;
    }

    public void setNomeFoguete(String nomeFoguete) {
        this.nomeFoguete = nomeFoguete;
    }

    public String getMissaoTripulada() {
        return missaoTripulada;
    }

    public void setMissaoTripulada(String missaoTripulada) {
        this.missaoTripulada = missaoTripulada;
    }

    public String getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(String tripulantes) {
        this.tripulantes = tripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
    
}
