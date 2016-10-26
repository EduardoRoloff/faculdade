/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.ECarro;
import java.sql.SQLException;
import java.util.List;
import persistencia.PCarro;


/**
 *
 * @author Eduardo
 */
public class NCarro {
    
    PCarro persistencia;
    
    public NCarro() {
        persistencia = new PCarro();
    }

    public void salvar(ECarro parametro) throws SQLException {
        if (parametro.getCodigo() == 0) {
            persistencia.incluir(parametro);
        }
    }

    public void excluir(int parametro) throws SQLException {
        persistencia.excluir(parametro);
    }

    public ECarro consultar(int parametro) throws SQLException {
        return persistencia.consultar(parametro);
    }

    public List<ECarro> listar(String nome) throws SQLException {
        return persistencia.listar(nome);
    }
    
    public void alterar(ECarro parametro) throws SQLException{
        persistencia.alterar(parametro);
    }
    public void alterar(Double valor,int codigo) throws SQLException{
        persistencia.alterar(valor, codigo);
    }
    
}
