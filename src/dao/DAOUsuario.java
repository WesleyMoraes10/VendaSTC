package DAO;

import model.ModelUsuario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class DAOUsuario extends ConexaoMySql {

    /**
     * grava Usuario
     *
     * @param modelUsuario return int
     */
    public int salvarUsuarioDAO(ModelUsuario modelUsuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tblUsuario ("
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                    + ") VALUES ("
                    + "'" + modelUsuario.getUsu_nome() + "',"
                    + "'" + modelUsuario.getUsu_login() + "',"
                    + "'" + modelUsuario.getUsu_senha() + "'"
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
     * recupera Usuario
     *
     * @param usu_cod return ModelUsuario
     */
    public ModelUsuario retornaUsuarioDAO(int usu_cod) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblUsuario WHERE usu_cod = '" + usu_cod + "';");

            while (this.getResultSet().next()) {
                modelUsuario.setUsu_cod(this.getResultSet().getInt(1));
                modelUsuario.setUsu_nome(this.getResultSet().getString(2));
                modelUsuario.setUsu_login(this.getResultSet().getString(3));
                modelUsuario.setUsu_senha(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * recupera uma lista de Usuario return ArrayList
     */
    public ArrayList<ModelUsuario> retornaListaUsuarioDAO() {
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblUsuario;");

            while (this.getResultSet().next()) {
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsu_cod(this.getResultSet().getInt(1));
                modelUsuario.setUsu_nome(this.getResultSet().getString(2));
                modelUsuario.setUsu_login(this.getResultSet().getString(3));
                modelUsuario.setUsu_senha(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
     * atualiza Usuario
     *
     * @param modelUsuario return boolean
     */
    public boolean alterarUsuarioDAO(ModelUsuario modelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tblUsuario SET "
                    + "usu_cod = '" + modelUsuario.getUsu_cod() + "',"
                    + "usu_nome = '" + modelUsuario.getUsu_nome() + "',"
                    + "usu_login = '" + modelUsuario.getUsu_login() + "',"
                    + "usu_senha = '" + modelUsuario.getUsu_senha() + "'"
                    + " WHERE "
                    + "usu_cod = '" + modelUsuario.getUsu_cod() + "'"
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
     * exclui Usuario
     *
     * @param usu_cod return boolean
     */
    public boolean excluirUsuarioDAO(int usu_cod) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tblUsuario "
                    + " WHERE "
                    + "usu_cod = '" + usu_cod + "'"
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
     * Validar login e senha 
     * @param modelUsuario
     * @return 
     */
    public boolean retornaUsuarioDAO(ModelUsuario modelUsuario) {
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tblUsuario WHERE usu_login = '" + modelUsuario.getUsu_login() + "' AND usu_senha = '" + modelUsuario.getUsu_senha() + "';");

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }
}
