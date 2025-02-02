package dao;

import java.sql.*;
import domain.*;

public class CidadeDao {

    public void inserir(Cidade cidade) throws Exception{
        
        String sql = "INSERT INTO cidade (nome_cidade, coordenadas) VALUES (?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        stmt.setString(1, cidade.getNomeCidade());
        stmt.setString(2, cidade.getCoordenadas());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            cidade.setCodCidade(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}