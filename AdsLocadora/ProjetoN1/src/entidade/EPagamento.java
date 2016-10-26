/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.swing.JTextField;

/**
 *
 * @author Eduardo
 */
public class EPagamento {
    //Atributos
    private double valorpagamento;
    private String formadepagamento;
    private ELocatario codigolocatario;
    
    public EPagamento(){
        codigolocatario = new ELocatario();
    }
    
    //Metodos

    public double getValorpagamento() {
        return valorpagamento;
    }

    public void setValorpagamento(double valorpagamento) {
        this.valorpagamento = valorpagamento;
    }

    public String getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }

    public ELocatario getCodigolocatario() {
        return codigolocatario;
    }

    public void setCodigolocatario(ELocatario codigolocatario) {
        this.codigolocatario = codigolocatario;
    }
    
            
}
