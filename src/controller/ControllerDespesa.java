package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import DAO.DAODespesa;
import java.util.ArrayList;
import model.ModelDespesa;

/**
 *
 * @author Wesley
 */
public class ControllerDespesa {

    private DAODespesa daoDispesa = new DAODespesa();

    /**
     * grava Cliente
     *
     * @param modelDespesa return int
     */
    public int salvarDespesaController(ModelDespesa modelDespesa) {
        return this.daoDispesa.salvarDespesaDAO(modelDespesa);
    }

   
    public ModelDespesa retornaDespesaController(String dis_descricao) {
        return this.daoDispesa.retornarDespesaDAO(dis_descricao);
    }
    
     public ModelDespesa retornaDespesaController(int dis_cli) {
        return this.daoDispesa.retornarDespesaDAO(dis_cli);
    }

    public ArrayList<ModelDespesa> retornaListaDespesaController() {
        return this.daoDispesa.retornaListaDespesaDAO();
    }
    
    public boolean alterarDespesaController(ModelDespesa modelDespesa) {
        return this.daoDispesa.alterarDespesaDAO(modelDespesa);
    }

    public boolean excluirDespesaController(int dis_cod) {
        return this.daoDispesa.excluirDespesaDAO(dis_cod);
    }
}
