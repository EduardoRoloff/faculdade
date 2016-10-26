/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

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
public class PLocatario {

    public void incluir(ELocatario parametro) throws SQLException {
        String sql = "INSERT INTO locatario (nome, endereco, telefone, tipocnh, tipo_pessoa, email)" + "VALUES(?,?,?,?,?,?)";

        Connection cnn = util.Conexao.getConexao();

        try (PreparedStatement prd = cnn.prepareStatement(sql)) {
            prd.setString(1, parametro.getNome());
            prd.setString(2, parametro.getEndereco());
            prd.setString(3, parametro.getTelefone());
            prd.setString(4, parametro.getTipoCNH());
            prd.setString(5, parametro.getTipo_pessoa());
            prd.setString(6, parametro.getEmail());

            prd.execute();
            cnn.close();
        }
    }

    public void alterar(ELocatario parametro) throws SQLException {

        String sql = "UPDATE locatario SET nome = ?, "
                + "endereco = ?, "
                + "telefone = ?, "
                + "tipoCNH = ?, "
                + "tipo_pessoa = ? "
                + "email = ? "
                + "WHERE codigo = ?";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setString(1, parametro.getNome());
        prd.setString(2, parametro.getEndereco());
        prd.setString(3, parametro.getTelefone());
        prd.setString(4, parametro.getTipoCNH());
        prd.setString(5, parametro.getTipo_pessoa());
        prd.setString(6, parametro.getEmail());
        prd.setInt(7, parametro.getCodigo());

        prd.execute();
        cnn.close();
    }

    public void excluir(int codigo) throws SQLException {

        String sql = "DELETE FROM locatario WHERE codigo_locatario = ?";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, codigo);

        prd.execute();
        cnn.close();
    }

    public ELocatario consultar(int codigo) throws SQLException {

        String sql = "SELECT * FROM locatario WHERE codigo_locatario = ?";
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);

        ResultSet rs = prd.executeQuery();

        ELocatario eLocatario = new ELocatario();
        if (rs.next()) {
            eLocatario.setCodigo(rs.getInt("codigo_locatario"));
            eLocatario.setNome(rs.getString("nome"));
            eLocatario.setEndereco(rs.getString("endereco"));
            eLocatario.setTelefone(rs.getString("telefone"));
            eLocatario.setTipoCNH(rs.getString("tipocnh"));
            eLocatario.setTipo_pessoa(rs.getString("tipo_pessoa"));
            eLocatario.setEmail(rs.getString("email"));

        }
        rs.close();
        cnn.close();

        return eLocatario;
    }

    public List<ELocatario> listar(String nome) throws SQLException {
        List<ELocatario> lista = new ArrayList<>(); //<<<<<<<<<<<<<<<<<<<<<<

        Connection cnn = util.Conexao.getConexao();

        String sql = "SELECT * "
                + "FROM locatario "
                + "WHERE 1=1 ";

        if (nome != null) {
            if (!nome.isEmpty()) {
                sql += " and nome like ? ";
            }
        }

        sql += "ORDER BY nome";

        PreparedStatement prd = cnn.prepareStatement(sql);

        if (nome != null) {
            if (!nome.isEmpty()) {
                prd.setString(1, "%" + nome + "%");
            }
        }

        ResultSet rs = prd.executeQuery();

        while (rs.next()) {
            ELocatario locatario = new ELocatario();
            locatario.setCodigo(rs.getInt("codigo_locatario"));
            locatario.setNome(rs.getString("nome"));
            locatario.setEndereco(rs.getString("endereco"));
            locatario.setTelefone(rs.getString("telefone"));
            locatario.setTipoCNH(rs.getString("tipocnh"));
            locatario.setTipo_pessoa(rs.getString("tipo_pessoa"));
            locatario.setEmail(rs.getString("email"));
            lista.add(locatario);
        }
        rs.close();
        cnn.close();

        return lista;
    }

    public ArrayList verificar() throws SQLException {
        ArrayList dados = new ArrayList();
        String sql = "SELECT * FROM locatario WHERE codigo_locatario = ?";
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        ResultSet rs = prd.executeQuery();

        while (rs.next()) {
            ELocatario verificar = new ELocatario();
            verificar.setCodigo(rs.getInt("codigo"));
            dados.add(verificar);
        }
        return dados;
    }
}
