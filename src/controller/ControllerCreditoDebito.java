/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOCreditoDebito;
import java.sql.Date;
import java.util.ArrayList;
import model.ModelCreditoDebito;
import model.ModelVenda;

/**
 *
 * @author Wesley
 */
public class ControllerCreditoDebito {
    
    private DAOCreditoDebito daoCreditoDebito = new DAOCreditoDebito();
    
    public int salvarCreditoDebitoController(ModelCreditoDebito modelCreditoDebito) {
        return this.daoCreditoDebito.salvarCreditoDebitoDAO(modelCreditoDebito);
    }

    public ModelCreditoDebito retornaCreditoDebitoController(int cre_cod) {
        return this.daoCreditoDebito.retornarCreditoDebitoDAO(cre_cod);
    }

    
    public ModelCreditoDebito retornaCreditoDebitoController(String cre_descricao, String tipo) {
        return this.daoCreditoDebito.retornarCreditoDebitoDAO(cre_descricao);
    }

    public ArrayList<ModelCreditoDebito> retornaListaCreditoDebitoController() {
        return this.daoCreditoDebito.retornaListaCreditoDebitoDAO();
    }

    public boolean alterarCreditoDebitoController(ModelCreditoDebito modelCreditoDebito) {
        return this.daoCreditoDebito.alterarCreditoDebitoDAO(modelCreditoDebito);
    }

   
    public boolean excluirCreditoDebitoController(int cre_cod) {
        return this.daoCreditoDebito.excluirCreditoDebitoDAO(cre_cod);
    }
    
    public ArrayList<ModelCreditoDebito> retornartListaCredDebPorDataController(Date dataInicio, Date datFim, String tipoDespesa, String tipo){
        return this.daoCreditoDebito.retornarListaPorDataCredDebDAO(dataInicio, datFim, tipoDespesa, tipo);
    }

    public ArrayList<ModelCreditoDebito> retornartListaCredDebPorDataFechamentoController(Date dataInicio, Date dataFim, String tipo) {
        return this.daoCreditoDebito.retornarListaPorDataFechamentoDAO(dataInicio, dataFim, tipo);
    }
    
     public ArrayList<ModelCreditoDebito> retornartListaCredDebPorDataController(Date dataInicio, Date datFim){
        return this.daoCreditoDebito.retornarListaPorDataCredDebDAO(dataInicio, datFim);
    }
    
}
