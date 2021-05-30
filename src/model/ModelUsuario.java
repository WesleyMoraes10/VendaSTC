package model;
/**
*
* @author Wesley
*/
public class ModelUsuario {

    private int usu_cod;
    private String usu_nome;
    private String  usu_login;
    private String  usu_senha;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    public int getUsu_cod() {
        return usu_cod;
    }

    public void setUsu_cod(int usu_cod) {
        this.usu_cod = usu_cod;
    }

    public String getUsu_nome() {
        return usu_nome;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getUsu_login() {
        return usu_login;
    }

    public void setUsu_login(String usu_login) {
        this.usu_login = usu_login;
    }

    public String getUsu_senha() {
        return usu_senha;
    }

    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    
}