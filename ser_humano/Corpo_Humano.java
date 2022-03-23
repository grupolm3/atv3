/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser_humano;

/**
 *
 * @author alunocmc
 */
public class Corpo_Humano {
    public double massa;
    private double densidade;
    private double volume;
    private double altura;
    
    public Corpo_Humano(){
    }
    
    public Corpo_Humano (float massa, float volume){
        this.massa = massa;
        this.volume = volume;
        densidade = massa/volume;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
        densidade = massa/volume;
    }

    public double getDensidade() {
        return densidade;
    }

    public double getVolume() {
        return volume;
    }

    private void setVolume(float volume) {
        this.volume = volume;
        densidade = massa/volume;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcIMC() {
        return getMassa() / (getAltura()*2);
    }
}
