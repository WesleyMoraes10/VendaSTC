/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVenda;
import model.ModelVendasCliente;

/**
 *
 * @author Wesley
 */
public class DAOVendasCliente extends ConexaoMySql{
    
    
    public ArrayList<ModelVendasCliente> retornarListaVendaClienteDAO(){
        ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblvenda INNER JOIN tblcliente ON tblcliente.cli_cod = tblvenda.ven_cod_cliente;");

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();                
                
                //Vendas
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                
                //Cliente
                modelCliente.setCli_cod(this.getResultSet().getInt(7));
                modelCliente.setCli_nome(this.getResultSet().getString (8));
                modelCliente.setCli_endereco(this.getResultSet().getString (9));
                modelCliente.setCli_bairro(this.getResultSet().getString (10));
                modelCliente.setCli_cidade(this.getResultSet().getString (11));
                modelCliente.setCli_uf(this.getResultSet().getString (12));
                modelCliente.setCli_cep(this.getResultSet().getString(13));
                modelCliente.setCli_telefone(this.getResultSet().getString(14));
                modelCliente.setCli_numero(this.getResultSet().getInt(15));
                
                modelVendasCliente.setModelVenda(modelVenda);
                modelVendasCliente.setModelCliente(modelCliente);
                
                listaModelVendasCliente.add(modelVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }
    
}
