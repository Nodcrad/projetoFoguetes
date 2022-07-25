/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import interfacedados.ILancamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Lancamento;

/**
 *
 * @author 201912030004
 */
public class BDLancamento implements ILancamento{
    private String mensagem;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private Connection connection;
    private ConexaoBanco conexaoBanco;
    private ResultSet resultSet;

    public BDLancamento() {
        conexaoBanco = ConexaoBanco.getInstanceConexaoBanco();
        connection = conexaoBanco.getConexao();
    }
    
    

    @Override
    public boolean adicionarLancamento(Lancamento lancamento) {
        String strSQL = "insert into lancamento (nomeFoguete, missaoTripulada, tripulantes, dataLancamento) ";
            strSQL += " values (?, ?, ?, ?);";
            System.out.println(strSQL);
            try {
            preparedStatement = connection.prepareStatement(strSQL);
            preparedStatement.setString(1, lancamento.getNomeFoguete());
            preparedStatement.setString(2, lancamento.getMissaoTripulada());
            preparedStatement.setString(3, lancamento.getTripulantes());
            preparedStatement.setString(4, lancamento.getDataLancamento());
            preparedStatement.execute();
            preparedStatement.close();
            mensagem = "Inserção realizada com sucesso.";
            return true;
             
        } catch (SQLException ex) {
            mensagem = ex.getMessage();
            return false;
        }
    }

    @Override
    public ArrayList<Lancamento> consultarLancamentos() {
        ArrayList<Lancamento> lancamentos = new ArrayList<>();
        String strSQL = "select * from lancamento order by nomeFoguete;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(strSQL);
            mensagem = "Consulta realizada com sucesso.";
            while (resultSet.next()){
                int idLancamento = resultSet.getInt("idLancamento");
                String nomeFoguete = resultSet.getString("nomeFoguete");
                String missaoTripulada = resultSet.getString("missaoTripulada");
                String tripulantes = resultSet.getString("tripulantes");
                String dataLancamento = resultSet.getString("dataLancamento");
                Lancamento lancamento = new Lancamento(idLancamento, nomeFoguete, missaoTripulada, tripulantes, dataLancamento);
                lancamentos.add(lancamento);
            }
            return lancamentos;
        } catch (SQLException ex) {
            mensagem = "Erro ao tentar realizar consulta de cursos.";
            return null;
        }
    }

    @Override
    public String getMensagem() {
        return mensagem;
    }
    
}
