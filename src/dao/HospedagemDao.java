package dao;

import java.sql.*;
import domain.*;

public class HospedagemDao {

    public void inserir(Hospedagem hospedagem) throws Exception {

        String sql = "INSERT INTO hospedagem (num_quarto, preco_quarto, num_tipo, cod_hotel) VALUES (?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, hospedagem.getNumQuarto());
        stmt.setDouble(2, hospedagem.getPrecoQuarto());
        stmt.setInt(3, hospedagem.getTipoHosp().getNumTipoHospedagem());
        stmt.setInt(4, hospedagem.getHotel().getCodHotel());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            hospedagem.setCodHospedagem(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}