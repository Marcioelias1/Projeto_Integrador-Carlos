package dao;

import java.sql.*;
import domain.*;

public class TipoHospDao {

    public void inserir(TipoHosp tipoHosp) throws Exception {

        String sql = "INSERT INTO tipo_hosp (quant_camas, nivel_qualidade) VALUES (?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, tipoHosp.getQuantCamas());
        stmt.setString(2, tipoHosp.getNivelQualidade());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            tipoHosp.setNumTipoHospedagem(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}