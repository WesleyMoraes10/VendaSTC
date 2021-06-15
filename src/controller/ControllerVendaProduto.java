package controller;

import model.ModelVendaProduto;
import DAO.DAOVendaProduto;
import java.util.ArrayList;

/**
*
* @author Wesley
*/
public class ControllerVendaProduto {

    private DAOVendaProduto daoVendaProduto = new DAOVendaProduto();

    /**
    * grava VendaProduto
    * @param modelVendaProduto
    * return int
    */
    public int salvarVendaProdutoController(ModelVendaProduto modelVendaProduto){
        return this.daoVendaProduto.salvarVendaProdutoDAO(modelVendaProduto);
    }

    /**
    * recupera VendaProduto
    * @param vep_cod
    * return ModelVendaProduto
    */
    public ModelVendaProduto retornaVendaProdutoController(int vep_cod){
        return this.daoVendaProduto.retornarVendaProdutoDAO(vep_cod);
    }

    /**
    * recupera uma lista deVendaProduto
    * @param vep_cod
    * return ArrayList
    */
    public ArrayList<ModelVendaProduto> retornaListaVendaProdutoController(){
        return this.daoVendaProduto.retornaListaVendaProdutoDAO();
    }

    /**
    * atualiza VendaProduto
    * @param modelVendaProduto
    * return boolean
    */
    public boolean atualizarVendaProdutoController(ModelVendaProduto modelVendaProduto){
        return this.daoVendaProduto.alterarVendaProdutoDAO(modelVendaProduto);
    }

    /**
    * exclui VendaProduto
    * @param vep_cod
    * return boolean
    */
    public boolean excluirVendaProdutoController(int vep_cod){
        return this.daoVendaProduto.excluirVendaProdutoDAO(vep_cod);
    }

    /**
     * Salva Lista de produtos da venda
     * @param listaModelVendaProdutos
     * @return 
     */
    public boolean salvarVendaProdutoController(ArrayList<ModelVendaProduto> listaModelVendaProdutos) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(listaModelVendaProdutos);
    }

    
}