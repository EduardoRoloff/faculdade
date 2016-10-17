/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;


/**
 *
 * @author Eduardo
 */
public class ContaPoupanca {
    //Atributos
    private String nomeCliente;
    private String numeroConta;
    private String agencia;
    private float saldo = 0;
    
    //Metodos

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }
    public float sacarDinheiro(float valor) throws Exception{
        if (valor > saldo) throw new Exception("Saldo não é sufuciente");
        saldo = saldo - valor;
        return valor;
    }
    public void depositarDinheiro(float valor)throws Exception{
         if (valor < 0) throw new Exception("Valor não pode ser negativo");
         saldo = saldo + valor ;
    }
    
}   
