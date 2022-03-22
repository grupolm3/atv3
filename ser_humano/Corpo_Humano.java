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
    public float massa;
    private float densidade;
    private float volume;
    
    public Corpo_Humano(){
    }
    
    public Corpo_Humano (float massa, float volume){
        this.massa = massa;
        this.volume = volume;
        densidade = massa/volume;
    }

    public float getMassa() {
        return massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
        densidade = massa/volume;
    }

    public float getDensidade() {
        return densidade;
    }

    public float getVolume() {
        return volume;
    }

    private void setVolume(float volume) {
        this.volume = volume;
        densidade = massa/volume;
    }
}
