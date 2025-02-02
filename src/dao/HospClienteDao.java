package dao;

import java.sql.*;
import domain.*;

public class HospClienteDao {

    public void inserir(HospCliente hospCliente) throws Exception {
        String sql = "INSERT INTO hosp_cliente (valor_pago, data_inicio, data_termino, qted_dependentes, cod_cliente, cod_hospedagem) VALUES (?, ?, ?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setDouble(1, hospCliente.getValorPago());
        stmt.setDate(2, new java.sql.Date(hospCliente.getDataInicio().getTime()));
        stmt.setDate(3, new java.sql.Date(hospCliente.getDataTermino().getTime()));
        stmt.setInt(4, hospCliente.getQtedDependentes());
        stmt.setInt(5, hospCliente.getCliente().getCodCliente());
        stmt.setInt(6, hospCliente.getHospedagem().getCodHospedagem());
        
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            hospCliente.setCodClienteHospedagem(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}