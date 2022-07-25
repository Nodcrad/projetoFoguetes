/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import interfacedados.IFoguete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Foguete;

/**
 *
 * @author N&N
 */
public class BDFoguete implements IFoguete{
    private String mensagem;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private ConexaoBanco conexaoBanco;
    private Connection connection;
    
    public BDFoguete(){
        conexaoBanco = ConexaoBanco.getInstanceConexaoBanco();
        connection = conexaoBanco.getConexao();
    }
    
    @Override
    public boolean adicionarFoguete(Foguete foguete) {try {
            String strSQL = "insert into foguete (nomeFoguete, inicioConstrucao, terminoConstrucao, missaoFoguete) ";
            strSQL += " values (?, ?, ?, ?);";
            System.out.println(strSQL);
            preparedStatement = conexaoBanco.getConexao().prepareStatement(strSQL);
            preparedStatement.setString(1, foguete.getNomeFoguete());
            preparedStatement.setString(2, foguete.getInicioConstrucao());
            preparedStatement.setString(3, foguete.getTerminoConstrucao());
            preparedStatement.setString(4, foguete.getMissaoFoguete());
            preparedStatement.execute();
            preparedStatement.close();
            mensagem = "Inserção realizada com sucesso.";
            return true;
             
        } catch (SQLException ex) {
            mensagem = ex.getMessage();
            return false;
        } catch (Exception ex) {
            mensagem = ex.getMessage();
            return false;
        }
    }

    @Override
    public ArrayList<Foguete> consultarFoguetes() {
        String strSQL = "select * from foguete;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(strSQL);
            mensagem = "Seleção executada com sucesso.";
            
            
            ArrayList<Foguete> foguetes = new ArrayList<>();
            
            while(resultSet.next()){
                int idFoguete = resultSet.getInt("idFoguete");
                String nomeFoguete = resultSet.getString("nomeFoguete");
                String inicioConstrucao = resultSet.getString("inicioConstrucao");
                String terminoConstrucao = resultSet.getString("terminoConstrucao");
                String missaoFoguete = resultSet.getString("missaoFoguete");
                Foguete fogAtual = new Foguete(
                                                idFoguete,
                                                nomeFoguete,
                                                inicioConstrucao,
                                                terminoConstrucao,
                                                missaoFoguete
                                        );
                foguetes.add(fogAtual);
            }
            return foguetes;
             
        } catch (SQLException ex) {
            mensagem = "Erro ao consultar foguetes.";
            return null;
        }
    }

    @Override
    public String getMensagem() {
        return mensagem;
    }

    @Override
    public ArrayList<Foguete> consultarFoguetes(String strNomeFoguete) {
       String strSQL = "select * from foguete";
       if (!strNomeFoguete.isEmpty()){
           
           strSQL += " where ";
           strSQL += " nomeFoguete like '%" + strNomeFoguete + "%'";
           
       }
       strSQL += ";";
       try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(strSQL);
            mensagem = "Seleção executada com sucesso.";
            
            
            ArrayList<Foguete> foguetes = new ArrayList<>();
            
            while(resultSet.next()){
                int idFoguete = resultSet.getInt("idFoguete");
                String nomeFoguete = resultSet.getString("nomeFoguete");
                String inicioConstrucao = resultSet.getString("inicioConstrucao");
                String terminoConstrucao = resultSet.getString("terminoConstrucao");
                String missaoFoguete = resultSet.getString("missaoFoguete");
                Foguete fogAtual = new Foguete(
                                                idFoguete,
                                                nomeFoguete,
                                                inicioConstrucao,
                                                terminoConstrucao,
                                                missaoFoguete
                                        );
                foguetes.add(fogAtual);
            }
            return foguetes;
             
        } catch (SQLException ex) {
            mensagem = "Erro ao consultar foguetes.";
            return null;
        }
    }
    
}
