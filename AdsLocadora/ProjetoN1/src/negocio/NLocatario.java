/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.ELocatario;
import java.sql.SQLException;
import java.util.List;
import persistencia.PLocatario;

/**
 *
 * @author Eduardo
 */
public class NLocatario {

    PLocatario persistencia;

    public NLocatario() {
        persistencia = new PLocatario();
    }

    public void salvar(ELocatario parametro) throws SQLException {
        if (parametro.getCodigo() == 0) {
            persistencia.incluir(parametro);
        } else {
            persistencia.alterar(parametro);
        }
    }

    public void excluir(int parametro) throws SQLException {
        persistencia.excluir(parametro);
    }

    public ELocatario consultar(int parametro) throws SQLException {
        return persistencia.consultar(parametro);
    }

    public List<ELocatario> listar(String nome) throws SQLException {
        return persistencia.listar(nome);
    }
}
