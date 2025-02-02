package dao;

import java.sql.*;
import domain.*;

public class EscalaVooDao {

    public void inserir(EscalaVoo escalaVoo) throws Exception {
        String sql = "INSERT INTO escala_voo (cod_voo, num_bilhete, numero_assento) VALUES (?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, escalaVoo.getCodVoo().getCodVoo());
        stmt.setInt(2, escalaVoo.getNumBilhete().getNumBilhete());
        stmt.setString(3, escalaVoo.getNumeroAssento());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
    
        if (rs.next()) {
            escalaVoo.setCodEscala(rs.getInt(1));
        }
    
        stmt.close();
        conexao.close();
    }
}