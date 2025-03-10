package edu.charles.metodo;
public class SmartTv {
    Boolean ligada = false;
    int volume = 25;        
    int canal = 1;

    public void ligar() {
        ligada = true;
    }   

    public void desligar() {
        ligada = false;
    }   

    public void aumentarVolume() {
        volume++;
    }   

    public void diminuirVolume() {
        volume--;
    }   

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }

    

}
