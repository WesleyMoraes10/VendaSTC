/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.Date;
import java.util.ArrayList;
import model.ModelCreditoDebito;
import model.ModelVenda;

/**
 *
 * @author Wesley
 */
public class DAOCreditoDebito extends ConexaoMySql{
    
    public int salvarCreditoDebitoDAO(ModelCreditoDebito modelCreditoDebito){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tblcreditodebito ("
                    + "cre_descricao,"
                    + "cre_valor,"
                    + "cre_tipo,"
                    + "cre_data,"
                    + "cre_forma_paga"
                    + ")VALUES ("
                    + "'" + modelCreditoDebito.getCre_descricao() +"',"
                    + "'" + modelCreditoDebito.getCre_valor() +"',"
                    + "'" + modelCreditoDebito.getCre_tipo() +"',"
                    + "'" + modelCreditoDebito.getCre_data() +"',"
                    + "'" + modelCreditoDebito.getCre_forma_paga() +"'"
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
    * recupera Cliente
    * @param cli_cod
    * return ModelCliente
    */
    public ModelCreditoDebito retornarCreditoDebitoDAO(int cre_cod){
        ModelCreditoDebito modelCreditoDebito = new ModelCreditoDebito();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcreditodebito WHERE cre_cod = '"+cre_cod+"';");

            while(this.getResultSet().next()){
                modelCreditoDebito.setCre_cod(this.getResultSet().getInt(1));
                modelCreditoDebito.setCre_descricao(this.getResultSet().getString(2));
                modelCreditoDebito.setCre_valor(this.getResultSet().getDouble(3));
                modelCreditoDebito.setCre_tipo(this.getResultSet().getString(4));
                modelCreditoDebito.setCre_data(this.getResultSet().getDate(5));
                modelCreditoDebito.setCre_forma_paga(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCreditoDebito;
    }

    public ArrayList<ModelCreditoDebito> retornaListaCreditoDebitoDAO(){
        ArrayList<ModelCreditoDebito> listamodelCreditoDebito = new ArrayList();
        ModelCreditoDebito modelCreditoDebito = new ModelCreditoDebito();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcreditodebito;");

            while(this.getResultSet().next()){
                modelCreditoDebito = new ModelCreditoDebito();
                modelCreditoDebito.setCre_cod(this.getResultSet().getInt(1));
                modelCreditoDebito.setCre_descricao(this.getResultSet().getString(2));
                modelCreditoDebito.setCre_valor(this.getResultSet().getDouble(3));
                modelCreditoDebito.setCre_tipo(this.getResultSet().getString(4));
                modelCreditoDebito.setCre_data(this.getResultSet().getDate(5));
                modelCreditoDebito.setCre_forma_paga(this.getResultSet().getString(6));
                listamodelCreditoDebito.add(modelCreditoDebito);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCreditoDebito;
    }

    /**
    * atualiza Cliente
    * @param modelCliente
    * return boolean
    */
    public boolean alterarCreditoDebitoDAO(ModelCreditoDebito modelCreditoDebito){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tblcreditodebito SET "
                    + "cre_descricao = '" + modelCreditoDebito.getCre_descricao() + "',"
                    + "cre_valor = '" + modelCreditoDebito.getCre_valor() + "',"
                    + "cre_tipo = '" + modelCreditoDebito.getCre_tipo() + "',"
                    + "cre_data = '" + modelCreditoDebito.getCre_data() + "',"
                    + "cre_forma_paga = '" + modelCreditoDebito.getCre_forma_paga() + "'"
                + " WHERE "
                    + "cre_cod = '" + modelCreditoDebito.getCre_cod() + "'"
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
    * exclui Cliente
    * @param cli_cod
    * return boolean
    */
    public boolean excluirCreditoDebitoDAO(int cre_cod){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblcreditodebito "
                + " WHERE "
                    + "cre_cod = '" + cre_cod + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelCreditoDebito retornarCreditoDebitoDAO(String cre_descricao) {
        ModelCreditoDebito modelCreditoDebito = new ModelCreditoDebito();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcreditodebito WHERE cre_descricao = '"+cre_descricao+"';");

            while(this.getResultSet().next()){
                 modelCreditoDebito.setCre_cod(this.getResultSet().getInt(1));
                modelCreditoDebito.setCre_descricao(this.getResultSet().getString(2));
                modelCreditoDebito.setCre_valor(this.getResultSet().getDouble(3));
                modelCreditoDebito.setCre_tipo(this.getResultSet().getString(4));
                modelCreditoDebito.setCre_data(this.getResultSet().getDate(5));
                modelCreditoDebito.setCre_forma_paga(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCreditoDebito;
    }
    
    public ArrayList<ModelCreditoDebito> retornarListaPorDataCredDebDAO(Date dataInicio, Date dataFim) {
        ArrayList<ModelCreditoDebito> listamodelCreditoDebito = new ArrayList();
        ModelCreditoDebito modelCreditoDebito = new ModelCreditoDebito();
        try {
            this.conectar();
            this.executarSQL("SELECT *\n"
                    + "FROM tblcreditodebito c \n"
                    + "WHERE c.cre_data BETWEEN '"+dataInicio+"' AND '"+dataFim+"';");

            while (this.getResultSet().next()) {
                modelCreditoDebito = new ModelCreditoDebito();
                modelCreditoDebito.setCre_cod(this.getResultSet().getInt(1));
                modelCreditoDebito.setCre_descricao(this.getResultSet().getString(2));
                modelCreditoDebito.setCre_valor(this.getResultSet().getDouble(3));
                modelCreditoDebito.setCre_tipo(this.getResultSet().getString(4));
                modelCreditoDebito.setCre_data(this.getResultSet().getDate(5));
                modelCreditoDebito.setCre_forma_paga(this.getResultSet().getString(6));
                listamodelCreditoDebito.add(modelCreditoDebito);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCreditoDebito;
    }
    
}
