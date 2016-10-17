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
public class Calculadora {
    //Atributos
    private float num1 = 0;
    private float num2 = 0;
   
    //Metodos

    /**
     * @return the num1
     */
    public float getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public float getNum2() {
        return num2;
    }
    

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    public float adiconar(){
        return (float)(num1 + num2);
    }
    public float subtrair(){
        return (float)(num1 - num2);
    }
    public float multiplicar(){
        return (float)(num1 * num2);
    }
    public float dividir() throws Exception{
        if(num1 == 0) throw new Exception("Não há divisão por 0");
        return (float)(num1 / num2);
    }
    
    public float calcularRaiz(){
        return (float)(Math.pow(num1,(1/num2)));
    }
    public float calcularPotencia1(){
        return (float)(Math.pow(num1, num2));
    }
    
               
}
