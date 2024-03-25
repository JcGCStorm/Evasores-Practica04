/**
 * Fabrica de Blindajes, extiende a {@link AbstractFactory} por lo que
 * sobreescribe su metodo
 * abstracto. Se encarga de crear los diferentes tipos de <b>blindaje</b>.
 * 
 * @implements AbtractFactory
 */
public class FabricaBlindaje extends AbstractFactory {

    /**
     * Metodo getComponente que sobreescribe al metodo homonimo de la clase
     * abstracta
     * {@link AbstractFactory}, este nos devuelve el tipo de componente de la nave,
     * en este caso
     * nos devuelve el <i>blindaje</i> según la decisión del cliente. En este metodo
     * hacemos uso del
     * metodo <code>getBlindaje()</code> que nos devuelve el <>b>blindaje</b> de la
     * nave del cliente.
     * 
     * @param tipoComponente el componente del cliente
     * @return un objeto del tipo del blindaje que escogio el cliente.
     */
    @Override
    Object getComponente(String tipoComponente) {
        return getBlindaje(tipoComponente);
    }

    /**
     * Metodo getBlindaje que nos devuelve un blindaje en especifico según la
     * elección del cliente.
     * Recibe un tipo de <b>blindaje</b> en una {@link String} y nos devuelve un
     * objeto de tipo
     * {@link Blindaje}
     * 
     * @param tipoBlindaje
     * @return {@link Blindaje}, el blindaje deseado por el cliente.
     */
    public Blindaje getBlindaje(String tipoBlindaje) {
        if (tipoBlindaje == null) {
            return null;
        } else if (tipoBlindaje.equalsIgnoreCase("1")) {
            return new BlindajeSimple();
        } else if (tipoBlindaje.equalsIgnoreCase("2")) {
            return new BlindajeReforzado();
        } else if (tipoBlindaje.equalsIgnoreCase("3")) {
            return new BlindajeFortaleza();
        }
        return null;
    }

}
