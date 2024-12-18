package dao;

import java.sql.*;
import domain.*;

public class HospedagemDao {

    public void inserir(Hospedagem hospedagem) throws Exception {

        String sql = "INSERT INTO TB_HOSPEDAGEM(estadia,numQuarto,precoQuarto) VALUES(?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, hospedagem.getEstadia());
        stmt.setInt(2, hospedagem.getNumQuarto());
        stmt.setDouble(3, hospedagem.getPrecoQuarto());
        stmt.executeUpdate();

        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            hospedagem.setCodHospedagem(rs.getInt(1));
        }
        stmt.close();
        conexao.close();
    }
}
