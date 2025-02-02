package dao;

import java.sql.*;
import domain.*;

public class PontosTuristicosDao {

    public void inserir(PontosTuristicos pontosTuristicos) throws Exception {

        String sql = "INSERT INTO pontos_turisticos (endereco, nome_turistico, classificacao_turistico, horario_funcionamento, cod_cidade) VALUES (?, ?, ?, ?, ?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, pontosTuristicos.getEndereco());
        stmt.setString(2, pontosTuristicos.getNomePontoTuristico());
        stmt.setInt(3, pontosTuristicos.getClassificacaoPontoTuristico());
        stmt.setString(4, pontosTuristicos.getHorarioFuncinamento());
        stmt.setInt(5, pontosTuristicos.getCodCidade().getCodCidade());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            pontosTuristicos.setCodPontoTuristico(rs.getInt(1));
        }

        stmt.close();
        conexao.close();
    }
}
