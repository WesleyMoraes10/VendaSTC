package model;

import java.sql.Date;

/**
*
* @author Wesley
*/
public class ModelVenda {

    private int ven_cod;
    private int ven_cod_cliente;
    private Date ven_data;
    private double ven_valor_liquido;
    private double ven_valor_bruto;
    private double ven_desconto;
    private int ven_comanda;
    private String ven_status;
    private String ven_nome_cliente;

    public String getVen_status() {
        return ven_status;
    }

    public void setVen_status(String ven_status) {
        this.ven_status = ven_status;
    }
    
    

    public int getVen_comanda() {
        return ven_comanda;
    }

    public void setVen_comanda(int ven_comanda) {
        this.ven_comanda = ven_comanda;
    }
    
    

    public int getVen_cod() {
        return ven_cod;
    }

    public void setVen_cod(int ven_cod) {
        this.ven_cod = ven_cod;
    }

    public int getVen_cod_cliente() {
        return ven_cod_cliente;
    }

    public void setVen_cod_cliente(int ven_cod_cliente) {
        this.ven_cod_cliente = ven_cod_cliente;
    }

    public Date getVen_data() {
        return ven_data;
    }

    public void setVen_data(Date ven_data) {
        this.ven_data = ven_data;
    }

    public double getVen_valor_liquido() {
        return ven_valor_liquido;
    }

    public void setVen_valor_liquido(double ven_valor_liquido) {
        this.ven_valor_liquido = ven_valor_liquido;
    }

    public double getVen_valor_bruto() {
        return ven_valor_bruto;
    }

    public void setVen_valor_bruto(double ven_valor_bruto) {
        this.ven_valor_bruto = ven_valor_bruto;
    }

    public double getVen_desconto() {
        return ven_desconto;
    }

    public void setVen_desconto(double ven_desconto) {
        this.ven_desconto = ven_desconto;
    }

    public String getVen_nome_cliente() {
        return ven_nome_cliente;
    }

    public void setVen_nome_cliente(String ven_nomw_cliente) {
        this.ven_nome_cliente = ven_nomw_cliente;
    }

   

    
}