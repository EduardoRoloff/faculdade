/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.ELocatario;
import entidade.EPagamento;
import java.sql.SQLException;
import persistencia.PLocatario;
import persistencia.PPagamento;

/**
 *
 * @author Eduardo
 */
public class NPagamento {

    PPagamento persistencia;

    public NPagamento() {
        persistencia = new PPagamento();
    }

    public void pagamento(EPagamento parametro) throws SQLException {
        //if (parametro.getCodigolocatario().getCodigo() == 0) {
            persistencia.pagamento(parametro);
        //}
    }
}
