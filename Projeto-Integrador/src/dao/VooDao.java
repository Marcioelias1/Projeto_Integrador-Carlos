package dao;

import java.sql.*;
import domain.*;

public class VooDao {

    public void inserir(Voo voo) throws Exception {

        String sql = "INSERT INTO TB_Voo(numeroVoo,numeroAssento,dataHoraEmbarque,dataHoraDesembarque,localEmbarque,localDesembarque) VALUES(?,?,?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, voo.getNumeroVoo());
        stmt.setInt(2, voo.getNumeroAssento());
        stmt.setTimestamp(3, Timestamp.valueOf(voo.getDataHoraEmbarque()));
        stmt.setTimestamp(4, Timestamp.valueOf(voo.getDataHoraDesembarque()));
        stmt.setString(5, voo.getLocalEmbarque());
        stmt.setString(6, voo.getLocalDesembarque());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            voo.setCodVoo(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}
