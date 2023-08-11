package ahorcado;

import java.util.ArrayList;

public class Datos {
    
    public String modoJuego;
    
    public String palabraPorAdivinar;

    public boolean[] letraAdivinada;

    public Datos() {
        this.letraAdivinada = new boolean[50];
    }

    public boolean getLetraAdivinada(int indice) {
        return letraAdivinada[indice];
    }

    public void setLetrasAdivinadas(int indice, boolean adivinada) {
        letraAdivinada[indice] = adivinada;
    }

}
