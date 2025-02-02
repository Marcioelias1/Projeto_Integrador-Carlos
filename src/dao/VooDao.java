package dao;

import java.sql.*;
import domain.*;

public class VooDao {

    public void inserir(Voo voo) throws Exception {
        String sql = "INSERT INTO voo (prefixo_voo, companhia_aerea, data_hora_embarque, data_hora_desembarque, cidade_embarque, cidade_desembarque, aviao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, voo.getPrefixoVoo());
        stmt.setString(2, voo.getCompanhiaAerea());
        stmt.setTimestamp(3, java.sql.Timestamp.valueOf(voo.getDataHoraEmbarque()));
        stmt.setTimestamp(4, java.sql.Timestamp.valueOf(voo.getDataHoraDesembarque()));
        stmt.setInt(5, voo.getCidadeEmbarque());
        stmt.setInt(6, voo.getCidadeDesembarque());
        stmt.setString(7, voo.getAviao());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            voo.setCodVoo(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}