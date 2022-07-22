/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 201912030004
 */
public class Foguete {
    private int idFoguete;
    private String nomeFoguete;
    private String inicioConstrucao;
    private String terminoConstrucao;
    private String missaoFoguete;

    public Foguete(int idFoguete, String nomeFoguete, String inicioConstrucao, String terminoConstrucao, String missaoFoguete) {
        this.idFoguete = idFoguete;
        this.nomeFoguete = nomeFoguete;
        this.inicioConstrucao = inicioConstrucao;
        this.terminoConstrucao = terminoConstrucao;
        this.missaoFoguete = missaoFoguete;
    }

    public int getIdFoguete() {
        return idFoguete;
    }

    public void setIdFoguete(int idFoguete) {
        this.idFoguete = idFoguete;
    }

    public String getNomeFoguete() {
        return nomeFoguete;
    }

    public void setNomeFoguete(String nomeFoguete) {
        this.nomeFoguete = nomeFoguete;
    }

    public String getInicioConstrucao() {
        return inicioConstrucao;
    }

    public void setInicioConstrucao(String inicioConstrucao) {
        this.inicioConstrucao = inicioConstrucao;
    }

    public String getTerminoConstrucao() {
        return terminoConstrucao;
    }

    public void setTerminoConstrucao(String terminoConstrucao) {
        this.terminoConstrucao = terminoConstrucao;
    }

    public String getMissaoFoguete() {
        return missaoFoguete;
    }

    public void setMissaoFoguete(String missaoFoguete) {
        this.missaoFoguete = missaoFoguete;
    }
    
    
}
