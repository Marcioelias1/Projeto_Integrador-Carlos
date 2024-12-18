package dao;

import java.sql.*;
import domain.*;

public class TipoHospedagemDao {

    public void inserir(TipoHospedagem tipoHospedagem) throws Exception {

        String sql = "INSERT INTO TB_PONTOSTURISTICOS(quantCamas, nivelQualidade) VALUES(?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, tipoHospedagem.getQuantCamas());
        stmt.setString(2, tipoHospedagem.getNivelQualidade());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            tipoHospedagem.setNumTipoHospedagem(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }

}
