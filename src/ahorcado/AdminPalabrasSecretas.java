package ahorcado;

import java.util.ArrayList;
import java.util.Random;

public class AdminPalabrasSecretas {
    public ArrayList<String> palabrasSecretas;
    public Random random;
    
    public AdminPalabrasSecretas(){
        palabrasSecretas = new ArrayList<String>();
        random = new Random();
    }
    
    public void agregarPalabra(String nuevaPalabra){
        palabrasSecretas.add(nuevaPalabra);
    }
    
    public void seleccionarPalabraAlAzar(){
        palabrasSecretas.get(random.nextInt(palabrasSecretas.size()));
    }
}
