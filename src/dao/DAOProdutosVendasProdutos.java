/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelProduto;
import model.ModelProdutosVendasProdutos;
import model.ModelVendaProduto;

/**
 *
 * @author Wesley
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasProdutos> retornaListaProdutosVendasProdutosQuantidadeDAO(int vep_cod_venda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProduto modelProduto = new ModelProduto();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        int quanti = 0;

        try {
            this.conectar();
            this.executarSQL("SELECT SUM(tblvenda_produto.vep_pro_quantidade)QUANTI,\n"
                    + "tblproduto.pro_cod,\n"
                    + "tblproduto.pro_nome,\n"
                    + "tblproduto.pro_valor,\n"
                    + "tblvenda_produto.vep_cod_produto,\n"
                    + "tblvenda_produto.vep_cod_venda,\n"
                    + "tblvenda_produto.vep_cod,\n"
                    + "tblvenda_produto.vep_pro_quantidade,\n"
                    + "tblvenda_produto.vep_pro_valor\n"
                    + "FROM tblvenda_produto\n"
                    + "INNER JOIN tblproduto ON tblproduto.pro_cod = tblvenda_produto.vep_cod_produto\n"
                    + "WHERE tblvenda_produto.vep_cod_venda = '" + vep_cod_venda + "'"
                    + "GROUP BY tblproduto.pro_cod;");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelVendaProduto = new ModelVendaProduto();
                modelProduto = new ModelProduto();

                modelProduto.setPro_cod(this.getResultSet().getInt(1));
                modelProduto.setPro_estoque(this.getResultSet().getInt(2));
                modelProduto.setPro_nome(this.getResultSet().getString(3));
                modelProduto.setPro_valor(this.getResultSet().getDouble(4));

                modelVendaProduto.setVep_cod_produto(this.getResultSet().getInt(5));
                modelVendaProduto.setVep_cod_venda(this.getResultSet().getInt(6));
                modelVendaProduto.setVep_cod(this.getResultSet().getInt(7));
                modelVendaProduto.setVep_pro_quantidade(this.getResultSet().getInt(8));
                modelVendaProduto.setVep_pro_valor(this.getResultSet().getDouble(9));
                modelVendaProduto.setVep_pro_quantidade(quanti = this.getResultSet().getInt("QUANTI"));

                modelProdutosVendasProdutos.setModelProduto(modelProduto);
                modelProdutosVendasProdutos.setModelVendaProduto(modelVendaProduto);

                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;

    }

    public ArrayList<ModelProdutosVendasProdutos> retornaListaProdutosVendasProdutosDAO(int vep_cod_venda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProduto modelProduto = new ModelProduto();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "          tblproduto.pro_cod, \n"
                    + "		 tblproduto.pro_estoque, \n"
                    + "		 tblproduto.pro_nome, \n"
                    + "		 tblproduto.pro_valor,\n"
                    + "		 tblvenda_produto.vep_cod_produto,\n"
                    + "		 tblvenda_produto.vep_cod_venda,\n"
                    + "		 tblvenda_produto.vep_cod,\n"
                    + "		 tblvenda_produto.vep_pro_quantidade,\n"
                    + "		 tblvenda_produto.vep_pro_valor\n"
                    + "		 FROM tblvenda_produto\n"
                    + "		 	INNER JOIN tblproduto ON tblproduto.pro_cod = tblvenda_produto.vep_cod_produto\n"
                    + "		 		WHERE tblvenda_produto.vep_cod_venda = '" + vep_cod_venda + "';");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelVendaProduto = new ModelVendaProduto();
                modelProduto = new ModelProduto();

                modelProduto.setPro_cod(this.getResultSet().getInt(1));
                modelProduto.setPro_estoque(this.getResultSet().getInt(2));
                modelProduto.setPro_nome(this.getResultSet().getString(3));
                modelProduto.setPro_valor(this.getResultSet().getDouble(4));

                modelVendaProduto.setVep_cod_produto(this.getResultSet().getInt(5));
                modelVendaProduto.setVep_cod_venda(this.getResultSet().getInt(6));
                modelVendaProduto.setVep_cod(this.getResultSet().getInt(7));
                modelVendaProduto.setVep_pro_quantidade(this.getResultSet().getInt(8));
                modelVendaProduto.setVep_pro_valor(this.getResultSet().getDouble(9));

                modelProdutosVendasProdutos.setModelProduto(modelProduto);
                modelProdutosVendasProdutos.setModelVendaProduto(modelVendaProduto);

                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;

    }

    public ArrayList<ModelProdutosVendasProdutos> retornaListaProdutosVendasProdutosDAO() {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProduto modelProduto = new ModelProduto();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "                    tblproduto.pro_cod, \n"
                    + "		 tblproduto.pro_estoque, \n"
                    + "		 tblproduto.pro_nome, \n"
                    + "		 tblproduto.pro_valor,\n"
                    + "		 tblvenda_produto.vep_cod_produto,\n"
                    + "		 tblvenda_produto.vep_cod_venda,\n"
                    + "		 tblvenda_produto.vep_cod,\n"
                    + "		 tblvenda_produto.vep_pro_quantidade,\n"
                    + "		 tblvenda_produto.vep_pro_valor\n"
                    + "		 FROM tblvenda_produto\n"
                    + "		 	INNER JOIN tblproduto ON tblproduto.pro_cod = tblvenda_produto.vep_cod_produto;");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelVendaProduto = new ModelVendaProduto();
                modelProduto = new ModelProduto();

                modelProduto.setPro_cod(this.getResultSet().getInt(1));
                modelProduto.setPro_estoque(this.getResultSet().getInt(2));
                modelProduto.setPro_nome(this.getResultSet().getString(3));
                modelProduto.setPro_valor(this.getResultSet().getDouble(4));

                modelVendaProduto.setVep_cod_produto(this.getResultSet().getInt(5));
                modelVendaProduto.setVep_cod_venda(this.getResultSet().getInt(6));
                modelVendaProduto.setVep_cod(this.getResultSet().getInt(7));
                modelVendaProduto.setVep_pro_quantidade(this.getResultSet().getInt(8));
                modelVendaProduto.setVep_pro_valor(this.getResultSet().getDouble(9));

                modelProdutosVendasProdutos.setModelProduto(modelProduto);
                modelProdutosVendasProdutos.setModelVendaProduto(modelVendaProduto);

                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;
    }

    public ModelVendaProduto retornarProdutoVendasDAO() {
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL("select \n"
                    + "MAX(v.vep_cod)\n"
                    + "from tblvenda_produto v ;");

            while (this.getResultSet().next()) {
                modelVendaProduto = new ModelVendaProduto();
                modelVendaProduto.setVep_cod_produto(this.getResultSet().getInt(1));
                modelVendaProduto.setVep_cod_venda(this.getResultSet().getInt(2));
                modelVendaProduto.setVep_cod(this.getResultSet().getInt(3));
                modelVendaProduto.setVep_pro_quantidade(this.getResultSet().getInt(4));
                modelVendaProduto.setVep_pro_valor(this.getResultSet().getDouble(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendaProduto;
    }
}
