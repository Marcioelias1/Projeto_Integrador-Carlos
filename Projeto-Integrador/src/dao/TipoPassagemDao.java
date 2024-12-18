package dao;

import java.sql.*;
import domain.*;

public class TipoPassagemDao {

    public void inserir(TipoPassagem tipoPassagem) throws Exception {

        String sql = "INSERT INTO TB_TIPOPASSAGEM(nomeTipoPassagem) VALUES(?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, tipoPassagem.getnomeTipoPassagem());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            tipoPassagem.setcodTipoPassagem(rs.getInt(1));
        }
        stmt.close();
        conexao.close();
    }
}
