/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.EPagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class PPagamento {

    public void pagamento(EPagamento parametro) throws SQLException {
        String sql = "INSERT INTO pagamento(valorpagamento, codigo_locatario, forma_de_pagamento)"
                + "VALUES(?,?,?)";

        Connection cnn = util.Conexao.getConexao();

        try (PreparedStatement prd = cnn.prepareStatement(sql)) {
            prd.setDouble(1, parametro.getValorpagamento());
            prd.setInt(2, parametro.getCodigolocatario().getCodigo());
            prd.setString(3, parametro.getFormadepagamento());

            prd.execute();
            cnn.close();
        }
    }
}
