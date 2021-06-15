package controller;

import model.ModelVenda;
import DAO.DAOVenda;
import java.sql.Date;
import java.util.ArrayList;

/**
*
* @author Wesley
*/
public class ControllerVenda {

    private DAOVenda daoVenda = new DAOVenda();

    /**
    * grava Venda
    * @param modelVenda
    * return int
    */
    public int salvarVendaController(ModelVenda modelVenda){
        return this.daoVenda.salvarVendaDAO(modelVenda);
    }

    /**
    * recupera Venda
    * @param ven_cod
    * return ModelVenda
    */
    public ModelVenda retornarVendaController(int ven_cod){
        return this.daoVenda.retornarVendaDAO(ven_cod);
    }
    
        /**
    * recupera Venda
    * @param model
    * return ModelVenda
    */
    public ModelVenda retornarVendaTotalLiquidoController(){
        return this.daoVenda.retornarVendaTotalLiquidoDAO();
    }

    /**
    * recupera uma lista deVenda
    * @param ven_cod
    * return ArrayList
    */
    public ArrayList<ModelVenda> retornartListaVendaController(){
        return this.daoVenda.retornarListaVendaDAO();
    }
    
    /**
    * recupera uma lista deVenda
    * @param ven_cod
    * return ArrayList
    */
    public ArrayList<ModelVenda> retornartListaVendaPorDataController(Date dataInicio, Date datFim){
        return this.daoVenda.retornarListaPorDataVendaDAO(dataInicio, datFim);
    }
    
    /**
    * recupera uma lista deVenda
    * @param ven_cod
    * return ArrayList
    */
    public ArrayList<ModelVenda> retornartListaVendaPedidoController(){
        return this.daoVenda.retornarListaVendaPedidoDAO();
    }

    /**
    * atualiza Venda
    * @param modelVenda
    * return boolean
    */
    public boolean alterarVendaController(ModelVenda modelVenda){
        return this.daoVenda.alterarVendaDAO(modelVenda);
    }
    
    public boolean alterarVendaController2(ModelVenda modelVenda){
        return this.daoVenda.alterarVenda2DAO(modelVenda);
    }

    /**
    * exclui Venda
    * @param ven_cod
    * return boolean
    */
    public boolean excluirVendaController(int ven_cod){
        return this.daoVenda.excluirVendaDAO(ven_cod);
    }
    
    private DAOVenda dAOProdutosVenda = new DAOVenda();
    
    public ArrayList<ModelVenda> retornaListaVendasPorCodigoController(int ven_cod){
        return this.daoVenda.retornarListaVendaPorCodigoDAO(ven_cod);
        
    }
    
    public ArrayList<ModelVenda> retornaListaVendasPorStatusController(String ven_status){
        return this.daoVenda.retornarListaVendaPorStatusDAO(ven_status);
        
    }

    public boolean alterarVendaController(ArrayList<ModelVenda> listaModelVenda) {
        return this.daoVenda.alterarVendaEmListaDAO(listaModelVenda);
    }
    
    public ModelVenda retornarVendaNumeroVendaController(String numMesa){
        return this.daoVenda.retornarVendaNumeroVendaDAO(numMesa);
    }
    
}