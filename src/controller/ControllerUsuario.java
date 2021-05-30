package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Wesley
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param usu_cod
    * return ModelUsuario
    */
    public ModelUsuario retornaUsuarioController(int usu_cod){
        return this.daoUsuario.retornaUsuarioDAO(usu_cod);
    }

    /**
    * recupera uma lista deUsuario
    * @param usu_cod
    * return ArrayList
    */
    public ArrayList<ModelUsuario> retornaListaUsuarioController(){
        return this.daoUsuario.retornaListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param modelUsuario
    * return boolean
    */
    public boolean alterarUsuarioController(ModelUsuario modelUsuario){
        return this.daoUsuario.alterarUsuarioDAO(modelUsuario);
    }

    /**
    * exclui Usuario
    * @param usu_cod
    * return boolean
    */
    public boolean excluirUsuarioController(int usu_cod){
        return this.daoUsuario.excluirUsuarioDAO(usu_cod);
    }

    /**
     * Validar login e senha
     * @param modelUsuario
     * @return 
     */
    public boolean validarUsuarioController(ModelUsuario modelUsuario) {
        return this.daoUsuario.retornaUsuarioDAO(modelUsuario);
    }
}