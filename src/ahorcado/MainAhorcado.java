/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

public class MainAhorcado {

    public static void main(String[] args) {
        String palabra = "placeholder";
        JuegoAhorcadoFijo jaf = new JuegoAhorcadoFijo(palabra);
        jaf.inicializarPalabraSecreta();
        JuegoAhorcadoAzar jaa = new JuegoAhorcadoAzar(palabra);
        jaa.inicializarPalabraSecreta();
        AhorcadoVisual av = new AhorcadoVisual(jaa, jaf);
        
        av.setVisible(true);
    }
}
