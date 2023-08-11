
package ahorcado;

public abstract class JuegoAhorcadoBase implements JuegoAhorcado {

    Datos datos;
    protected String palabraSecreta;
    protected String palabraActual;
    protected int intentos;

    abstract void actualizarPalabraActual(char letra);

    abstract boolean verificarLetra(char letra);

    abstract void hasGanado();
}
