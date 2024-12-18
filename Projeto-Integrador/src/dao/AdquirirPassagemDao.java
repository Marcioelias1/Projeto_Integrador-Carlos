package dao;

import java.sql.*;
import domain.*;

public class AdquirirPassagemDao {

    public void inserir(AdquirePassagem adquirirpassagem) throws Exception {

        String sql = "INSERT INTO TB_ADQUIRIRPASSAGEM(dataAquisicao,valorPago,pesoBagagem,cliente,passagem) VALUES(?,?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setDate(1, adquirirpassagem.getDataAquisicao());
        stmt.setDouble(2, adquirirpassagem.getValorPago());
        stmt.setInt(3, adquirirpassagem.getPesoBagagem());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            adquirirpassagem.setCodAdquirePassagem(rs.getInt(1));
        }
        
        stmt.close();
        conexao.close();
    }
}
