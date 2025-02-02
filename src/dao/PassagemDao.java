package dao;

import java.sql.*;
import domain.*;

public class PassagemDao {

    public void inserir(Passagem passagem) throws Exception {

        String sql = "INSERT INTO passagem (preco, data_compra, data_ida, data_volta, cod_cliente, cidade_embarque, cidade_desembarque, peso_da_bagagem) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setDouble(1, passagem.getPreco());
        stmt.setDate(2, java.sql.Date.valueOf(passagem.getDataCompra()));
        stmt.setDate(3, java.sql.Date.valueOf(passagem.getDataIda()));
        stmt.setDate(4, java.sql.Date.valueOf(passagem.getDataVolta()));
        stmt.setInt(5, passagem.getCliente().getCodCliente());
        stmt.setInt(6, passagem.getCidadeEmbarque().getCodCidade());
        stmt.setInt(7, passagem.getCidadeDesembarque().getCodCidade());
        stmt.setInt(8, passagem.getPesoBagagem());
        
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            passagem.setNumBilhete(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}
