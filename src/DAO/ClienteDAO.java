package DAO;

import java.sql.*;

public class ClienteDAO {
    public String Inserir_Cliente(Cliente a){
    String sql = "insert into cliente values (0,?,?,?,?,?,?,?,?,?,?)";
        try{
        PreparedStatement ps = getCon( ) .PreparedStatement(sql);
        }catch(SQLException e){
            return e.getMessage();
        
        }
    }
    
}
