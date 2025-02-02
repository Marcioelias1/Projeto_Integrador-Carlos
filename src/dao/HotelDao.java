package dao;

import java.sql.*;
import domain.*;

public class HotelDao {

    public void inserir(Hotel hotel) throws Exception {
        
        String sql = "INSERT INTO hotel (endereco, nome_hotel, classificacao_hotel, check_in, check_out, descricao_geral, cod_cidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, hotel.getEndereco());
        stmt.setString(2, hotel.getNomeHotel());
        stmt.setString(3, hotel.getClassificacaoHotel());
        
        if (hotel.getCheckIn() != null) {
            stmt.setTime(4, hotel.getCheckIn());
        } else {
            stmt.setNull(4, Types.TIME);
        }

        if (hotel.getCheckOut() != null) {
            stmt.setTime(5, hotel.getCheckOut());
        } else {
            stmt.setNull(5, Types.TIME);
        }

        stmt.setString(6, hotel.getDescricaoGeral());
        stmt.setInt(7, hotel.getCidade().getCodCidade());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            hotel.setCodHotel(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}