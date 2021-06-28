/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMySql;
import model.ModelVendaFormaPagamento;

/**
 *
 * @author Wesley
 */
public class DAOVendaFormaPagamento extends ConexaoMySql{
    
    public int salvarVendaFormaPagamentoDAO(ModelVendaFormaPagamento modelVendaFormaPagamento){
        
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tblvendaformapagamento ("
                    + "vfp_num_venda,"
                    + "vfp_cod_formapagamento,"
                    + "vfp_desc_formapagamento,"
                    + "vfp_observacao,"
                    + "vfp_valor_pagamento"
                    + ") VALUES ("
                    + "'" + modelVendaFormaPagamento.getVfp_num_venda() + "',"
                    + "'" + modelVendaFormaPagamento.getVfp_cod_formapagamento() + "',"
                    + "'" + modelVendaFormaPagamento.getVfp_desc_formapagamento() + "',"
                    + "'" + modelVendaFormaPagamento.getVfp_observacao() + "',"
                    + "'" + modelVendaFormaPagamento.getVfp_valor_pagamento() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
        
        
    }
    
    
}
