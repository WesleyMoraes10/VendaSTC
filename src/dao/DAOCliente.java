package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley
 */
public class DAOCliente extends ConexaoMySql {

    /**
     * grava Cliente
     *
     * @param ModelCliente return int
     */
    public int salvarClienteDAO(ModelCliente modelCliente) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tblcliente ("
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone,"
                    + "cli_numero"
                    + ")VALUES ("
                    + "'" + modelCliente.getCli_nome() + "',"
                    + "'" + modelCliente.getCli_endereco() + "',"
                    + "'" + modelCliente.getCli_bairro() + "',"
                    + "'" + modelCliente.getCli_cidade() + "',"
                    + "'" + modelCliente.getCli_uf() + "',"
                    + "'" + modelCliente.getCli_cep() + "',"
                    + "'" + modelCliente.getCli_telefone() + "',"
                    + "'" + modelCliente.getCli_numero() + "'"
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
     * recupera Cliente
     *
     * @param cli_cod return ModelCliente
     */
    public ModelCliente retornarClienteNomeConsumidorDAO() {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcliente c\n"
                                + "where c.cli_nome like 'CONSUMIDOR%'");

            while (this.getResultSet().next()) {
                modelCliente.setCli_cod(this.getResultSet().getInt(1));
                modelCliente.setCli_nome(this.getResultSet().getString(2));
                modelCliente.setCli_endereco(this.getResultSet().getString(3));
                modelCliente.setCli_bairro(this.getResultSet().getString(4));
                modelCliente.setCli_cidade(this.getResultSet().getString(5));
                modelCliente.setCli_uf(this.getResultSet().getString(6));
                modelCliente.setCli_cep(this.getResultSet().getString(7));
                modelCliente.setCli_telefone(this.getResultSet().getString(8));
                modelCliente.setCli_numero(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }
    
    public ModelCliente retornarClienteDAO(int cli_cod) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcliente c where c.cli_cod = '"+cli_cod+"';");

            while (this.getResultSet().next()) {
                modelCliente.setCli_cod(this.getResultSet().getInt(1));
                modelCliente.setCli_nome(this.getResultSet().getString(2));
                modelCliente.setCli_endereco(this.getResultSet().getString(3));
                modelCliente.setCli_bairro(this.getResultSet().getString(4));
                modelCliente.setCli_cidade(this.getResultSet().getString(5));
                modelCliente.setCli_uf(this.getResultSet().getString(6));
                modelCliente.setCli_cep(this.getResultSet().getString(7));
                modelCliente.setCli_telefone(this.getResultSet().getString(8));
                modelCliente.setCli_numero(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera uma lista de Cliente return ArrayList
     */
    public ArrayList<ModelCliente> retornaListaClienteDAO() {
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcliente;");

            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setCli_cod(this.getResultSet().getInt(1));
                modelCliente.setCli_nome(this.getResultSet().getString(2));
                modelCliente.setCli_endereco(this.getResultSet().getString(3));
                modelCliente.setCli_bairro(this.getResultSet().getString(4));
                modelCliente.setCli_cidade(this.getResultSet().getString(5));
                modelCliente.setCli_uf(this.getResultSet().getString(6));
                modelCliente.setCli_cep(this.getResultSet().getString(7));
                modelCliente.setCli_telefone(this.getResultSet().getString(8));
                modelCliente.setCli_numero(this.getResultSet().getInt(9));
                listamodelCliente.add(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
     * atualiza Cliente
     *
     * @param modelCliente return boolean
     */
    public boolean alterarClienteDAO(ModelCliente modelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tblcliente SET "
                    + "cli_nome = '" + modelCliente.getCli_nome() + "',"
                    + "cli_endereco = '" + modelCliente.getCli_endereco() + "',"
                    + "cli_bairro = '" + modelCliente.getCli_bairro() + "',"
                    + "cli_cidade = '" + modelCliente.getCli_cidade() + "',"
                    + "cli_uf = '" + modelCliente.getCli_uf() + "',"
                    + "cli_cep = '" + modelCliente.getCli_cep() + "',"
                    + "cli_telefone = '" + modelCliente.getCli_telefone() + "',"
                    + "cli_numero = '" + modelCliente.getCli_numero() + "'"
                    + " WHERE "
                    + "cli_cod = '" + modelCliente.getCli_cod() + "'"
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
    public boolean excluirClienteDAO(int cli_cod) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tblcliente "
                    + " WHERE "
                    + "cli_cod = '" + cli_cod + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelCliente retornarClienteDAO(String cli_nome) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblcliente WHERE cli_nome = '" + cli_nome + "';");

            while (this.getResultSet().next()) {
                modelCliente.setCli_cod(this.getResultSet().getInt(1));
                modelCliente.setCli_nome(this.getResultSet().getString(2));
                modelCliente.setCli_endereco(this.getResultSet().getString(3));
                modelCliente.setCli_bairro(this.getResultSet().getString(4));
                modelCliente.setCli_cidade(this.getResultSet().getString(5));
                modelCliente.setCli_uf(this.getResultSet().getString(6));
                modelCliente.setCli_cep(this.getResultSet().getString(7));
                modelCliente.setCli_telefone(this.getResultSet().getString(8));
                modelCliente.setCli_numero(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }
}
