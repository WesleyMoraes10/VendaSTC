/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author wesleym1
 */
public class ModelProduto {
    
    private int pro_cod;
    private String pro_nome;
    private Double pro_valor;
    private int pro_estoque;
    private String pro_codigo_cadastral;
    private String pro_marca;
    private Double pro_valor_custo;
    private int pro_cod_fornecedor;

    public int getPro_cod_fornecedor() {
        return pro_cod_fornecedor;
    }

    public void setPro_cod_fornecedor(int pro_cod_fornecedor) {
        this.pro_cod_fornecedor = pro_cod_fornecedor;
    }
    
    

    public String getPro_codigo_cadastral() {
        return pro_codigo_cadastral;
    }

    public void setPro_codigo_cadastral(String pro_codigo_cadastral) {
        this.pro_codigo_cadastral = pro_codigo_cadastral;
    }

    public String getPro_marca() {
        return pro_marca;
    }

    public void setPro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }

    public Double getPro_valor_custo() {
        return pro_valor_custo;
    }

    public void setPro_valor_custo(Double pro_valor_custo) {
        this.pro_valor_custo = pro_valor_custo;
    }
    
    

    public int getPro_cod() {
        return pro_cod;
    }

    public void setPro_cod(int pro_cod) {
        this.pro_cod = pro_cod;
    }

    public String getPro_nome() {
        return pro_nome;
    }

    public void setPro_nome(String pro_nome) {
        this.pro_nome = pro_nome;
    }

    public Double getPro_valor() {
        return pro_valor;
    }

    public void setPro_valor(Double pro_valor) {
        this.pro_valor = pro_valor;
    }

    public int getPro_estoque() {
        return pro_estoque;
    }

    public void setPro_estoque(int pro_estoque) {
        this.pro_estoque = pro_estoque;
    }
    
    
    
}
