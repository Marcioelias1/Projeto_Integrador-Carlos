package dao;

import java.sql.*;
import domain.*;

public class EscalaVooDao {

    public void inserir(EscalaVoo adquireVoo) throws Exception {

        String sql = "INSERT INTO TB_ADQUIRIRPASSAGEM(voo, adquireVoo) VALUES(?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, adquireVoo.getVoo().getCodVoo());
        stmt.setInt(2, adquireVoo.getAdquireVoo().getCodAdquire());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            adquireVoo.setCodAdquire(rs.getInt(1));
        }
        
        stmt.close();
        conexao.close();
    }
}
