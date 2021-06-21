/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOFormaPagamento;
import java.util.ArrayList;
import java.util.List;
import model.ModelFormaPagamento;

/**
 *
 * @author Wesley
 */
public class ControllerFormaPagamento {
    
    private DAOFormaPagamento daoFormaPagamento = new DAOFormaPagamento();
    
    public int salvarFormaPagamentoController(ModelFormaPagamento modelFormaPagamento){
        return this.daoFormaPagamento.salvarFormaPagamentoDAO(modelFormaPagamento);
    }
    
    public ModelFormaPagamento retornaFormaPagamentoController(int fop_cod){
        return this.daoFormaPagamento.retornaFormaPagamentoDAO(fop_cod);
    }
        
    public ArrayList<ModelFormaPagamento> retornaListaFormaPagamentoController(){
        return this.daoFormaPagamento.retornaListaFormaPagamentoDAO();
    }
    
    public boolean alterarFormaPagamentoController(ModelFormaPagamento modelFormaPagamento){
        return this.daoFormaPagamento.alterarUsuarioDAO(modelFormaPagamento);
    }
    
    public boolean excluirFormaPagamentoController(int fop_cod) {
        return this.daoFormaPagamento.excluirFormaDAO(fop_cod);
    }
    
    public ModelFormaPagamento retornarFormaPagamentoPelaDescricaoController(String fop_descricao){
        return  this.daoFormaPagamento.retornarFormaPagamentoPelaDescricaoDAO(fop_descricao);
    }
}
