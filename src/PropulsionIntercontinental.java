/**
 * Clase que representa a un tipo de <i>propulsion</i>, en este caso
 * <b>Intercontinentak</b>.
 * Implementa a la interfaz {@link Propulsion}, nos ayuda a crear una nave con
 * una <b>velocidad
 * intercontinental</b>.
 * 
 * @implements Propulsion
 */
public class PropulsionIntercontinental implements Propulsion {
    String tipo = "   1. Propulsion para distancias intercontinentales";
    int precio = 5000;
    int ataque = 0;
    int defensa = 0;
    int velocidad = 300;
    int peso = 100;

    /**
     * Método crearPropulsion, que sobreescribe al metodo homonimo de la interfaz
     * {@link Propulsion},
     * nos ayuda a crear una <i>propulsion</i> con una <b>velocidad</b> especifica
     * para la nave
     * del cliente.
     */
    @Override
    public void crearPropulsion() {
        tipo = "   - Propulsion para distancias planetarias";
    }

    /**
     * Método getTipo, que sobreescribe al metodo homonimo de la interfaz
     * {@link Propulsion} y que
     * obtiene la <i>propulsion</i> de tipo <b>Intergalactico</b> de nuestra nave.
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }

    @Override
    public void getEstadisticas() {
        System.out.println(tipo + "\n  Precio: " + precio +
                "\n  Ataque: " + ataque + "\n  Defensa:" + defensa + "\n  Velocidad: " + velocidad +
                "\n  Peso: " + peso);
    }

    /**
     * Metodos get para obtener las estadisticas y el precio
     */
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
