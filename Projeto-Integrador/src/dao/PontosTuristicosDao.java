package dao;

import java.sql.*;
import domain.*;

public class PontosTuristicosDao {

    public void inserir(PontosTuristicos pontosturisticos) throws Exception {

        String sql = "INSERT INTO TB_PONTOSTURISTICOS(endereco,nomePontoTuristico,classificacaoPontoTuristico,horarioFuncionamento) VALUES(?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, pontosturisticos.getEndereco());
        stmt.setString(2, pontosturisticos.getNomePontoTuristico());
        stmt.setInt(3, pontosturisticos.getClassificacaoPontoTuristico());
        stmt.setString(4, pontosturisticos.getHorarioFuncionamento());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            pontosturisticos.setCodPontoTuristico(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}
