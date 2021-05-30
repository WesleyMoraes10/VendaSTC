package DAO;

import model.ModelVenda;
import conexoes.ConexaoMySql;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class DAOVenda extends ConexaoMySql {

    /**
     * grava Venda
     *
     * @param modelVenda return int
     */
    public int salvarVendaDAO(ModelVenda modelVenda) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tblvenda ("
                    + "ven_cod_cliente,"
                    + "ven_data,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_comanda,"
                    + "ven_status,"
                    + "ven_nome_cliente"        
                    + ") VALUES ("
                    + "'" + modelVenda.getVen_cod_cliente() + "',"
                    + "'" + modelVenda.getVen_data() + "',"
                    + "'" + modelVenda.getVen_valor_liquido() + "',"
                    + "'" + modelVenda.getVen_valor_bruto() + "',"
                    + "'" + modelVenda.getVen_desconto() + "',"
                    + "'" + modelVenda.getVen_comanda() + "',"
                    + "'" + modelVenda.getVen_status() + "',"
                    + "'" + modelVenda.getVen_nome_cliente() + "'"        
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
     * recupera Venda
     *
     * @param ven_cod return ModelVenda
     */
    public ModelVenda retornarVendaDAO(int ven_cod) {
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblvenda WHERE ven_cod = '" + ven_cod + "';");

            while (this.getResultSet().next()) {
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                modelVenda.setVen_comanda(this.getResultSet().getInt(7));
                modelVenda.setVen_status(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
     * recupera Venda
     *
     * @param return ModelVenda total
     */
    public ModelVenda retornarVendaTotalLiquidoDAO() {
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("select sum(v.ven_valor_liquido) \n"
                    + "from tblvenda v");

            while (this.getResultSet().next()) {
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                modelVenda.setVen_comanda(this.getResultSet().getInt(7));
                modelVenda.setVen_status(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
     * recupera uma lista de Venda return ArrayList
     */
    public ArrayList<ModelVenda> retornarListaVendaDAO() {
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblvenda WHERE tblvenda.ven_status = 'venda';");

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                modelVenda.setVen_comanda(this.getResultSet().getInt(7));
                modelVenda.setVen_status(this.getResultSet().getString(8));
                modelVenda.setVen_nome_cliente(this.getResultSet().getString(9));
                listamodelVenda.add(modelVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
     * recupera uma lista de Venda return ArrayList
     */
    public ArrayList<ModelVenda> retornarListaPorDataVendaDAO(Date dataInicio, Date dataFim) {
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT *\n"
                    + "FROM tblvenda V \n"
                    + "WHERE V.ven_status = 'venda'\n"
                    + "and V.ven_data BETWEEN '"+dataInicio+"' AND '"+dataFim+"';");

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                modelVenda.setVen_comanda(this.getResultSet().getInt(7));
                modelVenda.setVen_status(this.getResultSet().getString(8));
                modelVenda.setVen_nome_cliente(this.getResultSet().getString(9));
                listamodelVenda.add(modelVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
     * recupera uma lista de Venda return ArrayList
     */
    public ArrayList<ModelVenda> retornarListaVendaPedidoDAO() {
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblvenda WHERE tblvenda.ven_status = 'pedido';");

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                modelVenda.setVen_comanda(this.getResultSet().getInt(7));
                modelVenda.setVen_status(this.getResultSet().getString(8));
                modelVenda.setVen_nome_cliente(this.getResultSet().getString(9));
                listamodelVenda.add(modelVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
     * recupera uma lista de Venda return ArrayList
     */
    public ArrayList<ModelVenda> retornarListaVendaPorCodigoDAO(int ven_cod) {
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblvenda WHERE tblvenda.ven_cod = '" + ven_cod + "';");

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                modelVenda.setVen_comanda(this.getResultSet().getInt(7));
                modelVenda.setVen_status(this.getResultSet().getString(8));
                modelVenda.setVen_nome_cliente(this.getResultSet().getString(9));
                listamodelVenda.add(modelVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
     * recupera uma lista de Venda return ArrayList
     */
    public ArrayList<ModelVenda> retornarListaVendaPorStatusDAO(String ven_status) {
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblvenda WHERE tblvenda.ven_cod = '" + ven_status + "';");

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setVen_cod(this.getResultSet().getInt(1));
                modelVenda.setVen_cod_cliente(this.getResultSet().getInt(2));
                modelVenda.setVen_data(this.getResultSet().getDate(3));
                modelVenda.setVen_valor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setVen_valor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setVen_desconto(this.getResultSet().getDouble(6));
                modelVenda.setVen_comanda(this.getResultSet().getInt(7));
                modelVenda.setVen_status(this.getResultSet().getString(8));
                listamodelVenda.add(modelVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
     * atualiza Venda
     *
     * @param modelVenda return boolean
     */
    public boolean alterarVendaDAO(ModelVenda modelVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tblvenda SET "
                    + "ven_cod = '" + modelVenda.getVen_cod() + "',"
                    + "ven_cod_cliente = '" + modelVenda.getVen_cod_cliente() + "',"
                    + "ven_data = '" + modelVenda.getVen_data() + "',"
                    + "ven_valor_liquido = '" + modelVenda.getVen_valor_liquido() + "',"
                    + "ven_valor_bruto = '" + modelVenda.getVen_valor_bruto() + "',"
                    + "ven_desconto = '" + modelVenda.getVen_desconto() + "',"
                    + "ven_comanda = '" + modelVenda.getVen_comanda() + "',"
                    + "ven_status = '" + modelVenda.getVen_status() + "',"
                    + "ven_nome_cliente = '" + modelVenda.getVen_nome_cliente()+ "'"
                    + " WHERE "
                    + "ven_cod = '" + modelVenda.getVen_cod() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarVenda2DAO(ModelVenda modelVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tblvenda SET "
                    + "ven_status = '" + modelVenda.getVen_status() + "'"
                    + " WHERE "
                    + "ven_cod = '" + modelVenda.getVen_cod() + "'"
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
     * exclui Venda
     *
     * @param ven_cod return boolean
     */
    public boolean excluirVendaDAO(int ven_cod) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tblvenda "
                    + " WHERE "
                    + "ven_cod = '" + ven_cod + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarVendaEmListaDAO(ArrayList<ModelVenda> listaModelVenda) {
        try {
            this.conectar();
            for (int i = 0; i < listaModelVenda.size(); i++) {

                this.executarUpdateDeleteSQL(
                        "UPDATE tblvenda SET "
                        + "ven_status = '" + listaModelVenda.get(i).getVen_status() + "'"
                        + "WHERE ven_status = '" + listaModelVenda.get(i).getVen_status() + "';"
                );

            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
