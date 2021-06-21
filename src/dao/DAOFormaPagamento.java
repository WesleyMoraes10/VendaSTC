/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelFormaPagamento;

/**
 *
 * @author Wesley
 */
public class DAOFormaPagamento extends ConexaoMySql {

    public int salvarFormaPagamentoDAO(ModelFormaPagamento modelFormaPagamento) {

        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tblformapagamento ("
                    + "fop_descricao"
                    + ") VALUES ("
                    + "'" + modelFormaPagamento.getFop_descricao() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    public ModelFormaPagamento retornaFormaPagamentoDAO(int fop_id) {
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tblFormaPagamento WHERE fop_cod = '" + fop_id + "' ;"
            );

            while (this.getResultSet().next()) {
                modelFormaPagamento.setFop_id(this.getResultSet().getInt(1));
                modelFormaPagamento.setFop_descricao(this.getResultSet().getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }

    public ArrayList<ModelFormaPagamento> retornaListaFormaPagamentoDAO() {
        ArrayList<ModelFormaPagamento> listaModelFormaPagamento = new ArrayList<>();
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tblFormaPagamento;"
            );

            while (this.getResultSet().next()) {
                modelFormaPagamento = new ModelFormaPagamento();
                modelFormaPagamento.setFop_id(this.getResultSet().getInt(1));
                modelFormaPagamento.setFop_descricao(this.getResultSet().getString(2));
                listaModelFormaPagamento.add(modelFormaPagamento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelFormaPagamento;
    }

    public boolean alterarUsuarioDAO(ModelFormaPagamento modelFormaPagamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tblformapagamento SET "
                    + "fop_descricao = '" + modelFormaPagamento.getFop_descricao() + "'"
                    + " WHERE "
                    + "fop_cod = '" + modelFormaPagamento.getFop_cod() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirFormaDAO(int fop_cod) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tblformapagamento "
                    + " WHERE "
                    + "fop_cod = '" + fop_cod + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    public ModelFormaPagamento retornarFormaPagamentoPelaDescricaoDAO(String fop_descricao) {
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();

        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblformapagamento WHERE fop_descricao = '" + fop_descricao + "';");

            while (this.getResultSet().next()) {
                modelFormaPagamento.setFop_id(this.getResultSet().getInt(1));
                modelFormaPagamento.setFop_descricao(this.getResultSet().getString(2));

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }
}
