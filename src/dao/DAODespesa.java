package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelDespesa;

/**
 *
 * @author Wesley
 */
public class DAODespesa extends ConexaoMySql {

    /**
     * grava Cliente
     *
     * @param ModelDespesa return int
     */
    public int salvarDespesaDAO(ModelDespesa modelDespesa) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbldespesa ("
                    + "dis_descricao"                    
                    + ")VALUES ("
                    + "'" + modelDespesa.getDis_descricao() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

       
    public ModelDespesa retornarDespesaDAO(int dis_cod) {
        ModelDespesa modelDespesa = new ModelDespesa();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbldespesa c where c.dis_cod = '"+dis_cod+"';");

            while (this.getResultSet().next()) {
                modelDespesa.setDis_cod(this.getResultSet().getInt(1));
                modelDespesa.setDis_descricao(this.getResultSet().getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelDespesa;
    }

    /**
     * recupera uma lista de Cliente return ArrayList
     */
    public ArrayList<ModelDespesa> retornaListaDespesaDAO() {
        ArrayList<ModelDespesa> listamodelDespesa = new ArrayList();
        ModelDespesa modelDespesa = new ModelDespesa();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbldespesa;");

            while (this.getResultSet().next()) {
                modelDespesa = new ModelDespesa();
                modelDespesa.setDis_cod(this.getResultSet().getInt(1));
                modelDespesa.setDis_descricao(this.getResultSet().getString(2));
                listamodelDespesa.add(modelDespesa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelDespesa;
    }

    /**
     * atualiza Cliente
     *
     * @param modelDespesa return boolean
     */
    public boolean alterarDespesaDAO(ModelDespesa modelDespesa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tbldespesa SET "
                    + "dis_descricao = '" + modelDespesa.getDis_descricao() + "'"
                    + " WHERE "
                    + "dis_cod = '" + modelDespesa.getDis_cod() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!", "ERRO DAO ", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Cliente
     *
     * @param cli_cod return boolean
     */
    public boolean excluirDespesaDAO(int dis_cod) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbldespesa "
                    + " WHERE "
                    + "dis_cod = '" + dis_cod + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelDespesa retornarDespesaDAO(String dis_descricao) {
        ModelDespesa modelDescricao = new ModelDespesa();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbldespesa WHERE dis_descricao = '" + dis_descricao + "';");

            while (this.getResultSet().next()) {
                modelDescricao.setDis_cod(this.getResultSet().getInt(1));
                modelDescricao.setDis_descricao(this.getResultSet().getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelDescricao;
    }
}
