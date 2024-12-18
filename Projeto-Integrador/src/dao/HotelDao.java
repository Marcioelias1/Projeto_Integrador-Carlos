package dao;

import java.sql.*;
import domain.*;

public class HotelDao {

    public void inserir(Hotel hotel) throws Exception {

        String sql = "INSERT INTO TB_HOTEL(endereco,nomeHotel,classificacaoHotel,checkIn,checkOut,descricaoGeral) VALUES(?,?,?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, hotel.getEndereco());
        stmt.setString(2, hotel.getNomeHotel());
        stmt.setString(3, hotel.getClassificacaoHotel());
        stmt.setTime(4, hotel.getCheckIn());
        stmt.setTime(5, hotel.getCheckOut());
        stmt.setString(6, hotel.getDescricaoGeral());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            hotel.setCodHotel(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}
