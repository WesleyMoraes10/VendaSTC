package DAO;

import model.ModelVendaProduto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class DAOVendaProduto extends ConexaoMySql {

    /**
     * grava VendaProduto
     *
     * @param modelVendaProduto return int
     */
    public int salvarVendaProdutoDAO(ModelVendaProduto modelVendaProduto) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tblvenda_produto ("
                    + "vep_cod_produto,"
                    + "vep_cod_venda,"
                    + "vep_pro_valor,"
                    + "vep_pro_quantidade"
                    + ") VALUES ("
                    + "'" + modelVendaProduto.getVep_cod_produto() + "',"
                    + "'" + modelVendaProduto.getVep_cod_venda() + "',"
                    + "'" + modelVendaProduto.getVep_pro_valor() + "',"
                    + "'" + modelVendaProduto.getVep_pro_quantidade() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera VendaProduto
     *
     * @param vep_cod return ModelVendaProduto
     */
    public ModelVendaProduto retornarVendaProdutoDAO(int vep_cod) {
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcliente WHERE vep_cod = '" + vep_cod + "';");

            while (this.getResultSet().next()) {
                modelVendaProduto.setVep_cod(this.getResultSet().getInt(1));
                modelVendaProduto.setVep_cod_produto(this.getResultSet().getInt(2));
                modelVendaProduto.setVep_cod_venda(this.getResultSet().getInt(3));
                modelVendaProduto.setVep_pro_valor(this.getResultSet().getDouble(4));
                modelVendaProduto.setVep_pro_quantidade(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendaProduto;
    }

    /**
     * recupera uma lista de VendaProduto return ArrayList
     */
    public ArrayList<ModelVendaProduto> retornaListaVendaProdutoDAO() {
        ArrayList<ModelVendaProduto> listamodelVendaProduto = new ArrayList();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblvendaproduto ;");

            while (this.getResultSet().next()) {
                modelVendaProduto = new ModelVendaProduto();
                modelVendaProduto.setVep_cod(this.getResultSet().getInt(1));
                modelVendaProduto.setVep_cod_produto(this.getResultSet().getInt(2));
                modelVendaProduto.setVep_cod_venda(this.getResultSet().getInt(3));
                modelVendaProduto.setVep_pro_valor(this.getResultSet().getDouble(4));
                modelVendaProduto.setVep_pro_quantidade(this.getResultSet().getInt(5));
                listamodelVendaProduto.add(modelVendaProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendaProduto;
    }

    /**
     * atualiza VendaProduto
     *
     * @param modelVendaProduto return boolean
     */
    public boolean alterarVendaProdutoDAO(ModelVendaProduto modelVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tblvendaproduto SET "
                    + "vep_cod_produto = '" + modelVendaProduto.getVep_cod_produto() + "',"
                    + "vep_cod_venda = '" + modelVendaProduto.getVep_cod_venda() + "',"
                    + "vep_pro_valor = '" + modelVendaProduto.getVep_pro_valor() + "',"
                    + "vep_pro_quantidade = '" + modelVendaProduto.getVep_pro_quantidade() + "'"
                    + " WHERE "
                    + "vep_cod = '" + modelVendaProduto.getVep_cod() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendaProduto
     *
     * @param vep_cod return boolean
     */
    public boolean excluirVendaProdutoDAO(int vep_cod_venda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tblvenda_produto "
                    + " WHERE "
                    + "vep_cod_venda = '" + vep_cod_venda + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Salva Lista de produtos da venda
     *
     * @param listaModelVendaProdutos
     * @return
     */
    public boolean salvarVendaProdutoDAO(ArrayList<ModelVendaProduto> listaModelVendaProdutos) {
        try {
            this.conectar();
            int cont = listaModelVendaProdutos.size();

            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "INSERT INTO tblvenda_produto ("
                        + "vep_cod_produto,"
                        + "vep_cod_venda,"
                        + "vep_pro_valor,"
                        + "vep_pro_quantidade"
                        + ") VALUES ("
                        + "'" + listaModelVendaProdutos.get(i).getVep_cod_produto() + "',"
                        + "'" + listaModelVendaProdutos.get(i).getVep_cod_venda() + "',"
                        + "'" + listaModelVendaProdutos.get(i).getVep_pro_valor() + "',"
                        + "'" + listaModelVendaProdutos.get(i).getVep_pro_quantidade() + "'"
                        + ");"
                );
            }
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
