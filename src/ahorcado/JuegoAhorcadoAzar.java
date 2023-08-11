package ahorcado;

import ahorcado.JuegoAhorcadoBase;
import ahorcado.Jugar;
import ahorcado.Jugar;
import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase{
    Random random = new Random();
    private ArrayList<String> Palabras;
    public String palabraSecretaAzar;

    public JuegoAhorcadoAzar() {
        super.palabraActual = "_".repeat(palabraSecreta.length());
        super.intentos = 6;
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
    public void verificarLetra(char letra){
            if(palabraSecreta.contains(String.valueOf(letra))){
                System.out.println("Acertó la letra");
            }else{
                System.out.println("No acertó la letra");
                intentos -=1;
            }
        }

    @Override
    void hasGanado() {
        if (palabraActual.equals(palabraSecreta)){
                System.out.println("HAS GANADO, ACERTASTE LA PALABRA COMPLETA!");
            }else if ((intentos == 0) && (!palabraActual.equals(palabraSecreta))){
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
        Jugar jugar = new Jugar();
        jugar.setVisible(true);
    }
    
    
    
}
