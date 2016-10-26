/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;
import java.text.SimpleDateFormat;
import javafx.scene.chart.PieChart.Data;
/**
 *
 * @author Eduardo
 */
public class ELocacao {
    //Atributos
    private String localderetirada;
    private ECarro carro;
    private String dataretirada;
    private String datadedevolucao;
    private ELocatario locatario;
    
    public ELocacao(){
        
        carro = new ECarro();
        locatario = new ELocatario();
    }
    

    //Metodos
    public String getLocalderetirada() {
        return localderetirada;
    }

    public void setLocalderetirada(String localderetirada) {
        this.localderetirada = localderetirada;
    }

    public ECarro getCarro() {
        return carro;
    }

    public void setCarro(ECarro carro) {
        this.carro = carro;
    }

    public String getDataretirada() {
        return dataretirada;
    }

    public void setDataretirada(String dataretirada) {
        this.dataretirada = dataretirada;
    }

    public String getDatadedevolucao() {
        return datadedevolucao;
    }

    public void setDatadedevolucao(String datadedevolucao) {
        this.datadedevolucao = datadedevolucao;
    }

    public ELocatario getLocatario() {
        return locatario;
    }

    public void setLocatario(ELocatario locatario) {
        this.locatario = locatario;
    }
    
    
    
}
