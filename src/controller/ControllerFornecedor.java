/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOFornecedor;
import java.util.ArrayList;
import model.ModelFornecedor;

/**
 *
 * @author Wesley
 */
public class ControllerFornecedor {
    
    private DAOFornecedor daoFornecedor = new DAOFornecedor();
    
    /**
     * grava fornecedor
     */
    public int salvarFornecedorController(ModelFornecedor modelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(modelFornecedor);
    }

    public ArrayList<ModelFornecedor> retornarListaFornecedorController() {
        return this.daoFornecedor.retornaListaFornecedorDAO();
    }

    public boolean alterarForcedorController(ModelFornecedor modelFornecedor) {
        return this.daoFornecedor.alterarFornecedorDAO(modelFornecedor);
    }

    public ModelFornecedor retornaFornecedorController(int for_cod) {
        return  this.daoFornecedor.retornarFornecedor(for_cod);
    }

    public boolean excluirFornecedorController(int for_cod) {
        return this.daoFornecedor.excluirFornecedorDAO(for_cod);
    }
    
    
}
