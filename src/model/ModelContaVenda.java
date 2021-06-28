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
public class ModelContaVenda {

    private int ven_cod ;
    private int ven_comanda ;
    private String ven_nome_cliente;
    private String vfp_desc_formapagamento;
    private String vfp_observacao;
    private double vfp_valor_pagamento;        

    public int getVen_cod() {
        return ven_cod;
    }

    public void setVen_cod(int ven_cod) {
        this.ven_cod = ven_cod;
    }

    public int getVen_comanda() {
        return ven_comanda;
    }

    public void setVen_comanda(int ven_comanda) {
        this.ven_comanda = ven_comanda;
    }

    public String getVen_nome_cliente() {
        return ven_nome_cliente;
    }

    public void setVen_nome_cliente(String ven_nome_cliente) {
        this.ven_nome_cliente = ven_nome_cliente;    }

    
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
