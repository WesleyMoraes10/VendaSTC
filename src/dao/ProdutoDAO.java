/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelProduto;

/**
 *
 * @author wesleym1
 */
public class ProdutoDAO extends ConexaoMySql{
    /**
     * Cadastrar Produto no Banco
     * @param modelProduto
     * @return 
     */
    public int salvarProdutosDAO(ModelProduto modelProduto){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tblProduto ("
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_codigo_cadastral,"
                    + "pro_marca,"
                    + "pro_valor_custo"
                    + ")VALUES ("
                    + "'" + modelProduto.getPro_nome() +"',"
                    + "'" + modelProduto.getPro_valor() +"',"
                    + "'" + modelProduto.getPro_estoque() +"',"
                    + "'" + modelProduto.getPro_codigo_cadastral() +"',"
                    + "'" + modelProduto.getPro_marca() +"',"
                    + "'" + modelProduto.getPro_valor_custo() +"'"
                    + ");"
            
            );
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
    /**
     * Excluir Produto Banco
     * @param pro_cod
     * @return 
     */
    public boolean excluirProdutoDAO(int pro_cod){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM tblProduto WHERE pro_cod = '"+pro_cod+"'"
                    
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    /**
     * Alterar Produto no Banco
     * @param modelProduto
     * @return 
     */
    public boolean  alterarProdutoDAO(ModelProduto modelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tblProduto SET "
                                +"pro_nome = '"+modelProduto.getPro_nome()+"',"
                                +"pro_valor = '"+modelProduto.getPro_valor()+"',"
                                +"pro_estoque = '"+modelProduto.getPro_estoque()+"',"
                                +"pro_codigo_cadastral = '"+modelProduto.getPro_codigo_cadastral()+"',"
                                +"pro_marca = '"+modelProduto.getPro_marca()+"',"
                                +"pro_valor_custo = '"+modelProduto.getPro_valor_custo()+"'"
                                +"WHERE pro_cod = '"+modelProduto.getPro_cod()+"'"
                    
            
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    /**
     * Retornar um produto pelo codigo
     * @param pro_cod
     * @return modelproduto
     */
    
    public ModelProduto retornarProdutoDAO(int pro_cod){
        ModelProduto modelProduto = new ModelProduto();
        
        try {
            this.conectar();            
            this.executarSQL("SELECT * FROM tblProduto WHERE pro_cod = '"+pro_cod+"';");
            
            while(this.getResultSet().next()){
                modelProduto.setPro_cod(this.getResultSet().getInt(1));
                modelProduto.setPro_nome(this.getResultSet().getString(2));
                modelProduto.setPro_valor(this.getResultSet().getDouble(3));
                modelProduto.setPro_estoque(this.getResultSet().getInt(4));
                modelProduto.setPro_codigo_cadastral(this.getResultSet().getString(5));
                modelProduto.setPro_marca(this.getResultSet().getString(6));
                modelProduto.setPro_valor_custo(this.getResultSet().getDouble(7));
                
            }
        } catch (Exception e) {
            e.printStackTrace(); 
           
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }
    /**
     * Retornar uma lista de produtos
     * @return 
     */
    public ArrayList<ModelProduto> retornaListaProdutosDAO(){
        ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();
        ModelProduto modelProduto = new ModelProduto();
        
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblproduto;");
            
            while(this.getResultSet().next()){
                modelProduto =  new ModelProduto();
                modelProduto.setPro_cod(this.getResultSet().getInt(1));
                modelProduto.setPro_nome(this.getResultSet().getString(2));
                modelProduto.setPro_valor(this.getResultSet().getDouble(3));
                modelProduto.setPro_estoque(this.getResultSet().getInt(4));
                modelProduto.setPro_codigo_cadastral(this.getResultSet().getString(5));
                modelProduto.setPro_marca(this.getResultSet().getString(6));
                modelProduto.setPro_valor_custo(this.getResultSet().getDouble(7));
                listaModelProdutos.add(modelProduto);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }finally{
            this.fecharConexao();
        }
        return listaModelProdutos;
    }
}
