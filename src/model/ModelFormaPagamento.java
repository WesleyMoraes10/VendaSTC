/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wesley
 */
public class ModelFormaPagamento {
    
    private int fop_cod;
    private String fop_descricao;
    private int fop_num_venda;

    public int getFop_cod() {
        return fop_cod;
    }

    public void setFop_id(int fop_id) {
        this.fop_cod = fop_id;
    }

    public String getFop_descricao() {
        return fop_descricao;
    }

    public void setFop_descricao(String fop_descricao) {
        this.fop_descricao = fop_descricao;
    }

    public int getFop_num_venda() {
        return fop_num_venda;
    }

    public void setFop_num_venda(int fop_num_venda) {
        this.fop_num_venda = fop_num_venda;
    }

    
    
    
}
