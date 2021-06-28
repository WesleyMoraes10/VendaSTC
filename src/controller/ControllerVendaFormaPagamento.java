/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOVendaFormaPagamento;
import model.ModelCliente;
import model.ModelVendaFormaPagamento;

/**
 *
 * @author Wesley
 */
public class ControllerVendaFormaPagamento {
    
    private DAOVendaFormaPagamento daoVendaFormaPagamento = new DAOVendaFormaPagamento();
    
    public int salvarVendaFormaPagamentoController(ModelVendaFormaPagamento modelVendaFormaPagamento){
        return this.daoVendaFormaPagamento.salvarVendaFormaPagamentoDAO(modelVendaFormaPagamento);
    }
    
}
