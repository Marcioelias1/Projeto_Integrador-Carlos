

package dao;


 import java.sql.*;
 import domain.*;


 public class PassagemDao {


    public void inserir(Passagem passagem) throws Exception {
        String sql= "INSERT INTO TB_PASSAGEM(preco,dataIda,dataVolta,localIda,localVolta) VALUES(?,?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setDouble(2, passagem.getPreco());
        stmt.setDate(4, passagem.getDataIda());
        stmt.setDate(5, passagem.getDataVolta());
        stmt.setString(6, passagem.getLocalIda());
        stmt.setString(7, passagem.getLocalVolta());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if(rs.next()){
            passagem.setNumBilhete(rs.getInt(1));
        }
        stmt.close();
        conexao.close();
  }
}
