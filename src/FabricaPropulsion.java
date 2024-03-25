/**
 * Fabrica de sistemas de Propulsion extiende a {@link AbstractFactory} por lo
 * que sobreescribe su metodo
 * abstracto. Se encarga de crear los diferentes tipos de sistemas de
 * propulsion.
 * 
 * @implements AbtractFactory
 */
public class FabricaPropulsion extends AbstractFactory {

    /**
     * Metodo getComponente que sobreescribe al metodo homonimo de la clase
     * abstracta
     * {@link AbstractFactory}, este nos devuelve el tipo de componente de la nave,
     * en este caso
     * nos devuelve <i>propulsion</i> según la decisión del cliente. En este metodo
     * hacemos uso del
     * metodo <code>getPropulsion()</code> que nos devuelve el sistema de propulsion
     * de la nave del cliente.
     * 
     * @return un objeto del tipo del sstema de propulsion que escogio el cliente.
     */
    @Override
    public Object getComponente(int tipoComponente) {
        return getPropulsion(tipoComponente);
    }

    /**
     * Metodo getPropulsion que nos devuelve un sistema de populsion en especifico
     * según la elección del cliente.
     * Recibe un tipo de propulsion en una {@link String} y nos devuelve un objeto
     * de tipo {@link Propulsion}
     * 
     * @param tipoPropulsion
     * @return {@link Propulsion}, la propulsion deseada por el cliente.
     */
    public Propulsion getPropulsion(int tipoPropulsion) {
        if (tipoPropulsion == 0) {
            return null;
        } else if (tipoPropulsion == 1) {
            return new PropulsionIntercontinental();
        } else if (tipoPropulsion == 2) {
            return new PropulsionInterplanetario();
        } else if (tipoPropulsion == 3) {
            return new PropulsionIntergalactico();
        }
        return null;
    }
}
