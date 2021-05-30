/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProduto;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author wesleym1
 */
public class ControllerProduto {
    
    private DAOProduto DAOproduto = new DAOProduto();
    
    /**
     * Salvar Produto 
     * @param modelProduto
     * @return 
     */
    public int salvarProdutoController(ModelProduto modelProduto){
        return  this.DAOproduto.salvarProdutosDAO(modelProduto);
    }
    
    /**
     * Excluir Produto
     * @param pro_cod
     * @return 
     */
    public boolean excluirProdutoController(int pro_cod){
        return this.DAOproduto.excluirProdutoDAO(pro_cod);
    }
    
    /**
     * Alterar um produto
     * @param modelProduto
     * @return 
     */
    public boolean  alterarProdutoController(ModelProduto modelProduto){
        return this.DAOproduto.alterarProdutoDAO(modelProduto);
    }
    
    /**
     * Retornar um Produto
     * @param pro_cod
     * @return 
     */
    public ModelProduto retornarProdutoController(int pro_cod){
        return  this.DAOproduto.retornarProdutoDAO(pro_cod);
    }
    
    /**
     * Retornar um Produto
     * @param pro_nome
     * @return 
     */
    public ModelProduto retornarProdutoController(String pro_nome){
        return  this.DAOproduto.retornarProdutoDAO(pro_nome);
    }
    
    /**
     * Listar todos os Produtos
     * @return listamodelprodutos
     */
    public ArrayList<ModelProduto> retornaListaProdutoController(){
        return this.DAOproduto.retornaListaProdutosDAO();
    }

    /**
     * Alterar quantidade de estoque dos produtos no banco 
     * @param listaModelProdutos 
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProduto> listaModelProdutos) {
       return this.DAOproduto.alterarEstoqueProdutoDAO(listaModelProdutos);
    }
}
