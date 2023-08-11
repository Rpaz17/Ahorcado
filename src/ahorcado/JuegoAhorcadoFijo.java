package ahorcado;

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public String palabraSecretaFija;
    Datos datos;
    JuegoAhorcadoAzar jaa;
    Jugar jugar = new Jugar(jaa, this);
    public JuegoAhorcadoFijo(String palabraSecretaFija) {
        System.out.println("si entra al fijo");
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
    public boolean verificarLetra(char letra) {
        if (palabraSecreta.contains(String.valueOf(letra))) {
            return true;
        } else {
            intentos -= 1;
            return false;
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
        jugar.setVisible(true);
    }
}
