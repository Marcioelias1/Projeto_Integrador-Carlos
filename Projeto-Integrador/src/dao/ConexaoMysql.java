package dao;

import java.sql.*;

public class ConexaoMysql {

    public static Connection getConexao() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql//localhost:3306/Projeto_Integrador",
            "root",
            "Carrinho1.");
    }
}
