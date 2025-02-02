package dao;

import java.sql.*;
import domain.*;

public class ClienteDao {

    public void inserir(Cliente cliente) throws Exception {

        String sql = "INSERT INTO cliente (CPF, nome, endereco, telefone, email, data_nasc, sexo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, cliente.getCpf());
        stmt.setString(2, cliente.getNome());
        stmt.setString(3, cliente.getEndereco());
        stmt.setString(4, cliente.getTelefone());
        stmt.setString(5, cliente.getEmail());
        stmt.setDate(6, new java.sql.Date(cliente.getDataNasc().getTime()));
        stmt.setString(7, cliente.getSexo());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            cliente.setCodCliente(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}