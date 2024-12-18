package dao;

import java.sql.*;
import domain.*;

public class ClienteDao {

    public void inserir(Cliente cliente) throws Exception {
        
        String sql = "INSERT INTO TB_CLIENTE(cpf,nome,endereco,telefone,email,dataNascimento,sexo) VALUES(?,?,?,?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, cliente.getCpf());
        stmt.setString(2, cliente.getNome());
        stmt.setString(3, cliente.getEndereco());
        stmt.setString(4, cliente.getTelefone());
        stmt.setString(5, cliente.getEmail());
        stmt.setDate(6, cliente.getDataNascimento());
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
