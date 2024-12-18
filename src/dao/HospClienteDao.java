package dao;

import java.sql.*;
import domain.*;

public class HospClienteDao {

    public void inserir(HospedagemCliente hospcliente) throws Exception {
        String sql = "INSERT INTO TB_HOSPCLIENTE(valorPago, dataInicio, dataTermino, qtedDependentes) VALUES(?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setDouble(1, hospcliente.getValorPago());  
        stmt.setDate(2, hospcliente.getDataInicio());  
        stmt.setDate(3, hospcliente.getDataTermino()); 
        stmt.setInt(4, hospcliente.getQtedDependentes()); 
        stmt.executeUpdate();

        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            hospcliente.setCodHospedagemCliente(rs.getInt(1));
        }
        rs.close();
        stmt.close();
        conexao.close();
    }
}
