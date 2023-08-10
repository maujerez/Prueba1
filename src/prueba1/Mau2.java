/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author BELEN
 */
public class Mau2 {
     int num;
    String palabra;

    public Mau2(int num, String palabra) {
        this.num = num;
        this.palabra = palabra;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String frase(){
        return palabra="hola gentes!!";
    }
    
    public int numero(){
       return num=245584;
    }
}
