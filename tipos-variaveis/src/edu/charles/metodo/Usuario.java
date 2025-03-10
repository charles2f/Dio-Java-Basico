package edu.charles.metodo;

public class Usuario {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Instanciando um objeto
        SmartTv tv = new SmartTv();

        System.out.println(tv.ligada);
        System.out.println(tv.volume);
        System.out.println(tv.canal);


        tv.ligar(); // Ligar a TV
        System.out.println("TV Ligada " + tv.ligada);

        tv.aumentarVolume(); // Aumentar o volume
        System.out.println("Volume " + tv.volume);


        tv.diminuirVolume(); // Diminuir o volume
        System.out.println("Volume " + tv.volume);

        tv.trocarCanal(5); // Trocar o canal
        System.out.println("Canal " + tv.canal);    

        tv.desligar(); // Desligar a TV
        System.out.println("TV Ligada " + tv.ligada);



    }
}
