/**
 * Clase que representa a una <i>cabina</i> de tipo <b>Ejercito</b>, implementa
 * a la
 * interfaz {@link Cabina}, nos ayuda a crear una nave con una <i>cabina</i>
 * para un
 * <b>ejercito</b>.
 * 
 * @implements Cabina
 */
public class CabinaEjercito implements Cabina {
    String tipo = "   - Cabina para un Ejercito";
    int precio = 400;
    int ataque = 0;
    int defensa = 300;
    int velocidad = 0;
    int peso = 300;

    /**
     * Método crearCabina, que sobreescribe al metodo homonimo de la interfaz
     * {@link Cabina}.
     * Nos ayuda a crear una <i>cabina</i> con un <b>peso</b> especifico para la
     * nave
     * del cliente. Además de decirnos que la cabina de la nave es para un ejercito.
     */
    @Override
    public void crearCabina() {
        tipo = "Cabina para un Ejercito";

    }

    /**
     * Método getTipo, que sobreescribe al metodo homonimo de la interfaz
     * {@link Cabina} y que
     * obtiene la <i>cabina</i> de tipo <b>ejercito</b> de nuestra nave.
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }

    /**
     * Método getEstadisticas, que obtiene las estadisticas del componente
     */
    @Override
    public void getEstadisticas() {
        System.out.println("1. Cabina para un Ejercito:" + "\n  Precio: " + precio +
                "\n  Ataque: " + ataque + "\n  Defensa:" + defensa + "\n  Velocidad: " + velocidad +
                "\n  Peso: " + peso);
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public int getPeso() {
        return peso;
    }
}
