package model;
/**
*
* @author Wesley
*/
public class ModelVendaProduto {

    private int vep_cod;
    private int vep_cod_produto;
    private int vep_cod_venda;
    private double vep_pro_valor;
    private int vep_pro_quantidade;
    private String nomeProduto;

    public int getVep_cod() {
        return vep_cod;
    }

    public void setVep_cod(int vep_cod) {
        this.vep_cod = vep_cod;
    }

    public int getVep_cod_produto() {
        return vep_cod_produto;
    }

    public void setVep_cod_produto(int vep_cod_produto) {
        this.vep_cod_produto = vep_cod_produto;
    }

    public int getVep_cod_venda() {
        return vep_cod_venda;
    }

    public void setVep_cod_venda(int vep_cod_venda) {
        this.vep_cod_venda = vep_cod_venda;
    }

    public double getVep_pro_valor() {
        return vep_pro_valor;
    }

    public void setVep_pro_valor(double vep_pro_valor) {
        this.vep_pro_valor = vep_pro_valor;
    }

    public int getVep_pro_quantidade() {
        return vep_pro_quantidade;
    }

    public void setVep_pro_quantidade(int vep_pro_quantidade) {
        this.vep_pro_quantidade = vep_pro_quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    

    
}