/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;
import model.ModelVendaProduto;

/**
 *
 * @author Wesley
 */
public class ControllerProdutosVendasProdutos {
    
    private DAOProdutosVendasProdutos dAOProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> retornaListaProdutosVendasProdutosController(int vep_cod){
        return this.dAOProdutosVendasProdutos.retornaListaProdutosVendasProdutosDAO(vep_cod);
        
    }
    
    public ArrayList<ModelProdutosVendasProdutos> retornaListaProdutosVendasProdutosQuantidadeController(int vep_cod){
        return this.dAOProdutosVendasProdutos.retornaListaProdutosVendasProdutosQuantidadeDAO(vep_cod);
        
    }
        
    public ArrayList<ModelProdutosVendasProdutos> retornaListaProdutosVendasProdutosController(){
        return this.dAOProdutosVendasProdutos.retornaListaProdutosVendasProdutosDAO();
        
    }

    public ModelVendaProduto retornarProdutoVendasController() {
        return this.dAOProdutosVendasProdutos.retornarProdutoVendasDAO();
    }
    
}
