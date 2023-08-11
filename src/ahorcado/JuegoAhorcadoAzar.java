package ahorcado;

import ahorcado.JuegoAhorcadoBase;
import ahorcado.Jugar;
import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase {

    Random random = new Random();
    private ArrayList<String> Palabras;
    public String palabraSecretaAzar;
    Datos datos;
    JuegoAhorcadoFijo jaf;

    public JuegoAhorcadoAzar(String palabraSecretaAzar) {
        this.palabraSecretaAzar = palabraSecretaAzar;
        Palabras = new ArrayList<>();
        super.intentos = 6;
        Palabras.add("papel");
        Palabras.add("sapo");
        jaf = new JuegoAhorcadoFijo(palabraSecretaAzar); 
    }

    @Override
    public void actualizarPalabraActual(char letra) {
        char[] nuevaPalabraActual = palabraActual.toCharArray();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                nuevaPalabraActual[i] = letra;
            }
        }
        palabraActual = new String(nuevaPalabraActual);
    }

    @Override
    public boolean verificarLetra(char letra) {
        if (palabraSecreta.contains(String.valueOf(letra))) {
            return true;
        } else {
            intentos -= 1;
            return false;
        }
    }

    @Override
    void hasGanado() {
        if (palabraActual.equals(palabraSecreta)) {
            System.out.println("HAS GANADO, ACERTASTE LA PALABRA COMPLETA!");
        } else if ((intentos == 0) && (!palabraActual.equals(palabraSecreta))) {
            System.out.println("TE QUEDASTE SIN INTENTOS, PERDIISTE");
        }

    }

    @Override
    public void inicializarPalabraSecreta() {

        int randomNumber = random.nextInt(Palabras.size());
        this.palabraSecretaAzar = Palabras.get(randomNumber);

    }

    @Override
    public void jugar() {
        Jugar jugar = new Jugar(this, jaf);
        jugar.setVisible(true);
    }

}
