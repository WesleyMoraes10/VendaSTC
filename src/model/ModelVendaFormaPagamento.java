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
public class ModelVendaFormaPagamento {
    
    private int vfp_cod;
    private int vfp_num_venda;
    private int vfp_cod_formapagamento;
    private String vfp_desc_formapagamento;
    private String vfp_observacao;
    private double vfp_valor_pagamento;

    public int getVfp_cod() {
        return vfp_cod;
    }

    public void setVfp_cod(int vfp_cod) {
        this.vfp_cod = vfp_cod;
    }

    public int getVfp_num_venda() {
        return vfp_num_venda;
    }

    public void setVfp_num_venda(int vfp_num_venda) {
        this.vfp_num_venda = vfp_num_venda;
    }

    public int getVfp_cod_formapagamento() {
        return vfp_cod_formapagamento;
    }

    public void setVfp_cod_formapagamento(int vfp_cod_formapagamento) {
        this.vfp_cod_formapagamento = vfp_cod_formapagamento;
    }

    public String getVfp_desc_formapagamento() {
        return vfp_desc_formapagamento;
    }

    public void setVfp_desc_formapagamento(String vfp_desc_formapagamento) {
        this.vfp_desc_formapagamento = vfp_desc_formapagamento;
    }

    public String getVfp_observacao() {
        return vfp_observacao;
    }

    public void setVfp_observacao(String vfp_observacao) {
        this.vfp_observacao = vfp_observacao;
    }

    public double getVfp_valor_pagamento() {
        return vfp_valor_pagamento;
    }

    public void setVfp_valor_pagamento(double vfp_valor_pagamento) {
        this.vfp_valor_pagamento = vfp_valor_pagamento;
    }
    
    
}
