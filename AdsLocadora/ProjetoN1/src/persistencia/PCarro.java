/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.ECarro;
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
public class PCarro {

    public void incluir(ECarro parametro) throws SQLException {
        String sql = "INSERT INTO carro (placa, nome_modelo, valoraluguel, direcao, portas, passageiros, motor)"
                + "VALUES(?,?,?,?,?,?,?)";

        Connection cnn = util.Conexao.getConexao();

        try (PreparedStatement prd = cnn.prepareStatement(sql)) {
            prd.setString(1, parametro.getPlaca());
            prd.setString(2, parametro.getNome_modelo());
            prd.setDouble(3, parametro.getValoraluguel());
            prd.setString(4, parametro.getDirecao());
            prd.setString(5, parametro.getPortas());
            prd.setString(6, parametro.getPassageiros());
            prd.setString(7, parametro.getMotor());

            prd.execute();
            cnn.close();
        }
    }

    public void alterar(ECarro parametro) throws SQLException {

        String sql = "UPDATE carro SET valoraluguel = ?, WHERE  codigo_carro = ?";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setDouble(1, parametro.getValoraluguel());
        prd.setInt(2, parametro.getCodigo());

        prd.executeUpdate();
        cnn.close();
    }

    public void alterar(Double valor_carro, int codigo) throws SQLException {
        String sql = "UPDATE carro SET valoraluguel = " + valor_carro + " WHERE  codigo_carro = " + codigo;

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.executeUpdate();
        cnn.close();
    }

    public void excluir(int codigo) throws SQLException {

        String sql = "DELETE FROM carro WHERE codigo_carro = ?";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, codigo);

        prd.execute();
        cnn.close();
    }

    public ECarro consultar(int codigo) throws SQLException {

        String sql = "SELECT * FROM carro WHERE codigo_carro = ?";
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);

        ResultSet rs = prd.executeQuery();

        ECarro eCarro = new ECarro();
        if (rs.next()) {
            eCarro.setCodigo(rs.getInt("codigo_carro"));
            eCarro.setPlaca(rs.getString("placa"));
            eCarro.setNome_modelo(rs.getString("nome_modelo"));
            eCarro.setValoraluguel(rs.getDouble("valoraluguel"));
            eCarro.setDirecao(rs.getString("direcao"));
            eCarro.setPortas(rs.getString("portas"));
            eCarro.setPassageiros(rs.getString("passageiros"));
            eCarro.setMotor(rs.getString("motor"));

        }
        rs.close();
        cnn.close();

        return eCarro;
    }

    public List<ECarro> listar(String nome) throws SQLException {
        List<ECarro> lista = new ArrayList<>(); //<<<<<<<<<<<<<<<<<<<<<<

        Connection cnn = util.Conexao.getConexao();

        String sql = "SELECT * "
                + "FROM carro "
                + "WHERE 1=1 ";

        if (nome != null) {
            if (!nome.isEmpty()) {
                sql += " and nome_modelo like ? ";
            }
        }

        sql += "ORDER BY nome_modelo";

        PreparedStatement prd = cnn.prepareStatement(sql);

        if (nome != null) {
            if (!nome.isEmpty()) {
                prd.setString(1, "%" + nome + "%");
            }
        }

        ResultSet rs = prd.executeQuery();

        while (rs.next()) {
            ECarro carro = new ECarro();
            carro.setCodigo(rs.getInt("codigo_carro"));
            carro.setPlaca(rs.getString("placa"));
            carro.setNome_modelo(rs.getString("nome_modelo"));
            carro.setValoraluguel(rs.getDouble("valoraluguel"));
            carro.setDirecao(rs.getString("direcao"));
            carro.setPassageiros(rs.getString("passageiros"));
            carro.setMotor(rs.getString("motor"));
            lista.add(carro);
        }
        rs.close();
        cnn.close();

        return lista;
    }

    public ArrayList verificar() throws SQLException {
        ArrayList dados = new ArrayList();
        String sql = "SELECT * FROM carro WHERE codigo_carro = ?";
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
