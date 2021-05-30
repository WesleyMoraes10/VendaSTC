/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelFornecedor;

/**
 *
 * @author Wesley
 */
public class DAOFornecedor extends ConexaoMySql{
    
    /**
    * grava Fornecedor
    * @param ModelFornecedor
    * return int
    */
    public int salvarFornecedorDAO(ModelFornecedor modelFornecedor){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tblfornecedor ("
                    + "for_nome,"
                    + "for_telefone,"
                    + "for_celular,"
                    + "for_endereco,"
                    + "for_bairro,"
                    + "for_cidade,"
                    + "for_uf,"
                    + "for_cep,"
                    + "for_observacao,"
                    + "for_numero"
                    + ")VALUES ("
                    + "'" + modelFornecedor.getFor_nome() +"',"
                    + "'" + modelFornecedor.getFor_telefone() +"',"
                    + "'" + modelFornecedor.getFor_celular() +"',"
                    + "'" + modelFornecedor.getFor_endereco() +"',"
                    + "'" + modelFornecedor.getFor_bairro() +"',"
                    + "'" + modelFornecedor.getFor_cidade() +"',"
                    + "'" + modelFornecedor.getFor_uf() +"',"
                    + "'" + modelFornecedor.getFor_cep() +"',"
                    + "'" + modelFornecedor.getFor_observacao() +"',"
                    + "'" + modelFornecedor.getFor_numero() +"'"
                    + ");"
            
            );
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    public ArrayList<ModelFornecedor> retornaListaFornecedorDAO() {
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblfornecedor;");

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();                
                modelFornecedor.setFor_cod(this.getResultSet().getInt(1));
                modelFornecedor.setFor_nome(this.getResultSet().getString (2));
                modelFornecedor.setFor_telefone(this.getResultSet().getString (3));
                modelFornecedor.setFor_celular(this.getResultSet().getString (4));
                modelFornecedor.setFor_endereco(this.getResultSet().getString (5));
                modelFornecedor.setFor_bairro(this.getResultSet().getString (6));
                modelFornecedor.setFor_cidade(this.getResultSet().getString (7));
                modelFornecedor.setFor_uf(this.getResultSet().getString (8));
                modelFornecedor.setFor_cep(this.getResultSet().getString (9));
                modelFornecedor.setFor_observacao(this.getResultSet().getString(10));                
                modelFornecedor.setFor_numero(this.getResultSet().getInt (11));
                
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    public ModelFornecedor retornarFornecedor(int for_cod) {
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblfornecedor WHERE for_cod = '"+for_cod+"';");
            
            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();                
                modelFornecedor.setFor_cod(this.getResultSet().getInt(1));
                modelFornecedor.setFor_nome(this.getResultSet().getString (2));
                modelFornecedor.setFor_telefone(this.getResultSet().getString (3));
                modelFornecedor.setFor_celular(this.getResultSet().getString (4));
                modelFornecedor.setFor_endereco(this.getResultSet().getString (5));
                modelFornecedor.setFor_bairro(this.getResultSet().getString (6));
                modelFornecedor.setFor_cidade(this.getResultSet().getString (7));
                modelFornecedor.setFor_uf(this.getResultSet().getString (8));
                modelFornecedor.setFor_cep(this.getResultSet().getString (9));
                modelFornecedor.setFor_observacao(this.getResultSet().getString(10));                
                modelFornecedor.setFor_numero(this.getResultSet().getInt (11));
                
            }
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }
    
    
    /**
    * atualiza Fornecedor
    * @param modelFornecedor
    * return boolean
    */
    public boolean alterarFornecedorDAO(ModelFornecedor modelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tblfornecedor SET "
                    + "for_nome = '" + modelFornecedor.getFor_nome() + "',"
                    + "for_telefone = '" + modelFornecedor.getFor_telefone() + "',"
                    + "for_celular = '" + modelFornecedor.getFor_celular() + "',"
                    + "for_endereco = '" + modelFornecedor.getFor_endereco() + "',"
                    + "for_bairro = '" + modelFornecedor.getFor_bairro() + "',"
                    + "for_cidade = '" + modelFornecedor.getFor_cidade() + "',"
                    + "for_uf = '" + modelFornecedor.getFor_uf() + "',"
                    + "for_cep = '" + modelFornecedor.getFor_cep() + "',"
                    + "for_observacao = '" + modelFornecedor.getFor_observacao()+ "',"
                    + "for_numero = '" + modelFornecedor.getFor_numero()+ "'"
                + " WHERE "
                    + "for_cod = '" + modelFornecedor.getFor_cod() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!", "ERRO DAO ", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Fornecedor
    * @param for_cod
    * return boolean
    */
    public boolean excluirFornecedorDAO(int for_cod){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblfornecedor "
                + " WHERE "
                    + "for_cod = '" + for_cod + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

}
