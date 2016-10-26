/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.ECarro;
import entidade.ELocacao;
import entidade.ELocatario;
import java.sql.SQLException;
import java.util.List;
import persistencia.PCarro;
import persistencia.PLocacao;

/**
 *
 * @author Eduardo
 */
public class NLocacao {
    
    PLocacao persistencia;
    
    public NLocacao() {
        persistencia = new PLocacao();
    }

    public void locar(ELocacao parametro) throws SQLException {
        //if (parametro.getCodigo() == 0) {
            persistencia.incluir(parametro);
        //}
    }
    
    public ELocacao consultar(int parametro) throws SQLException {
        return persistencia.consultar(parametro);
    }
}
