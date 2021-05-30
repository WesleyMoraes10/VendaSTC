package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
     * grava Cliente
     *
     * @param modelCliente return int
     */
    public int salvarClienteController(ModelCliente modelCliente) {
        return this.daoCliente.salvarClienteDAO(modelCliente);
    }

    /**
     * recupera Cliente
     *
     * @param cli_cod return ModelCliente
     */
    public ModelCliente retornaClienteNomeConsumidorController() {
        return this.daoCliente.retornarClienteNomeConsumidorDAO();
    }

    /**
     * recupera Cliente
     *
     * @param cli_nome return ModelCliente
     */
    public ModelCliente retornaClienteController(String cli_nome) {
        return this.daoCliente.retornarClienteDAO(cli_nome);
    }
    
     public ModelCliente retornaClienteController(int cli_cod) {
        return this.daoCliente.retornarClienteDAO(cli_cod);
    }

    /**
     * recupera uma lista deCliente
     *
     * @param cli_cod return ArrayList
     */
    public ArrayList<ModelCliente> retornaListaClienteController() {
        return this.daoCliente.retornaListaClienteDAO();
    }

    /**
     * atualiza Cliente
     *
     * @param pModelCliente return boolean
     */
    public boolean alterarClienteController(ModelCliente pModelCliente) {
        return this.daoCliente.alterarClienteDAO(pModelCliente);
    }

    /**
     * exclui Cliente
     *
     * @param cli_cod return boolean
     */
    public boolean excluirClienteController(int cli_cod) {
        return this.daoCliente.excluirClienteDAO(cli_cod);
    }
}
