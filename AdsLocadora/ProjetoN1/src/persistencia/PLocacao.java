/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.ECarro;
import entidade.ELocacao;
import entidade.ELocatario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class PLocacao {
    public void incluir(ELocacao parametro) throws SQLException {
        String sql = "INSERT INTO movimentacao (local_retirada, codigo_carro,  codigo_locatario, data_retirada, data_devolucao)"
                + "VALUES(?,?,?,?,?)";

        Connection cnn = util.Conexao.getConexao();

        try (PreparedStatement prd = cnn.prepareStatement(sql)) {
            prd.setString(1, parametro.getLocalderetirada());
            prd.setInt(2, parametro.getCarro().getCodigo());
            prd.setInt(3, parametro.getLocatario().getCodigo());
            prd.setString(4, parametro.getDataretirada());
            prd.setString(5, parametro.getDatadedevolucao());
            

            prd.execute();
            cnn.close();
        }
    }
    
    public ELocacao consultar(int codigo) throws SQLException {

        String sql = "SELECT * FROM movimentacao WHERE codigo_locatario = ?";
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);

        ResultSet rs = prd.executeQuery();

        ELocacao eLocacao = new ELocacao();
        if (rs.next()) {
            eLocacao.setLocatario( new PLocatario().consultar(rs.getInt("codigo_locatario")));
            //eLocacao.setNome(rs.getString("nome"));
            

        }
        rs.close();
        cnn.close();

        return eLocacao;
    }
}
