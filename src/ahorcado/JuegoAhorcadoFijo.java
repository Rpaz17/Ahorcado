package ahorcado;

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public String palabraSecretaFija;

    public JuegoAhorcadoFijo(String palabraSecretaFija) {
        this.palabraSecretaFija = palabraSecretaFija;
        super.palabraActual = "_".repeat(palabraSecretaFija.length());
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
    public void verificarLetra(char letra) {
        if (palabraSecreta.contains(String.valueOf(letra))) {
            System.out.println("Acertó la letra");
        } else {
            System.out.println("No acertó la letra");
            intentos -= 1;
        }
    }

    @Override
    public void hasGanado() {
        if (palabraActual.equals(palabraSecreta)) {
            System.out.println("HAS GANADO, ACERTASTE LA PALABRA COMPLETA!");
        } else if ((intentos == 0) && (!palabraActual.equals(palabraSecreta))) {
            System.out.println("TE QUEDASTE SIN INTENTOS, PERDIISTE");
        }
    }

    @Override
    public void inicializarPalabraSecreta() {
       AdminPalabrasSecretas admin = new AdminPalabrasSecretas();
        for(int i=0; i<admin.palabrasSecretas.size();i++){
            System.out.println(i+1+"_."+admin.palabrasSecretas.get(i));
        }
    }

    @Override
    public void jugar() {
         Jugar jugar = new Jugar();
        jugar.setVisible(true);
    }
}
