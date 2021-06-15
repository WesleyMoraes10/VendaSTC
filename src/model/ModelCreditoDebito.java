/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Wesley
 */
public class ModelCreditoDebito {
    
    private int cre_cod;
    private String cre_descricao;
    private double cre_valor;
    private String cre_tipo;
    private Date cre_data;
    private String cre_forma_paga;
    private int cre_cod_dispesa;
    private String cre_tipo_despesa;

  
    
    public String getCre_tipo_despesa() {
        return cre_tipo_despesa;
    }

    public void setCre_tipo_despesa(String cre_tipo_despesa) {
        this.cre_tipo_despesa = cre_tipo_despesa;
    }
    
    

    public int getCre_cod() {
        return cre_cod;
    }

    public void setCre_cod(int cre_cod) {
        this.cre_cod = cre_cod;
    }

    public String getCre_descricao() {
        return cre_descricao;
    }

    public void setCre_descricao(String cre_descricao) {
        this.cre_descricao = cre_descricao;
    }

    public double getCre_valor() {
        return cre_valor;
    }

    public void setCre_valor(double cre_valor) {
        this.cre_valor = cre_valor;
    }

    public String getCre_tipo() {
        return cre_tipo;
    }

    public void setCre_tipo(String cre_tipo) {
        this.cre_tipo = cre_tipo;
    }

    public Date getCre_data() {
        return cre_data;
    }

    public void setCre_data(Date cre_data) {
        this.cre_data = cre_data;
    }

    public String getCre_forma_paga() {
        return cre_forma_paga;
    }

    public void setCre_forma_paga(String cre_forma_paga) {
        this.cre_forma_paga = cre_forma_paga;
    }

    public int getCre_cod_dispesa() {
        return cre_cod_dispesa;
    }

    public void setCre_cod_dispesa(int cre_cod_dispesa) {
        this.cre_cod_dispesa = cre_cod_dispesa;
    }
    
    
    
}
