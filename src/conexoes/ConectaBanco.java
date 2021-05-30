/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Wesley Fernando
 */
public class ConectaBanco {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://127.0.0.1/vendastc";
    private String usuario = "root";
    private String senha = "fernando120";
    public Connection conn;
    
    public void conexao(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            System.err.println("Banco Conectado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!"+"\n Erro: " +ex.getMessage());
        }
        
        
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
        }
    }
        
    
    public void desconecta() throws SQLException{
        conn.close();
    }
    
    
}
