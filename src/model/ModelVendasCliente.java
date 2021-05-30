/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class ModelVendasCliente {
    
    private ModelVenda modelVenda;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasCliente> listaModelVendasCliente;

    public ModelVenda getModelVenda() {
        return modelVenda;
    }

    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelVendasCliente> getListaModelVendasCliente() {
        return listaModelVendasCliente;
    }

    public void setListaModelVendasCliente(ArrayList<ModelVendasCliente> listaModelVendasCliente) {
        this.listaModelVendasCliente = listaModelVendasCliente;
    }
    
    
}
