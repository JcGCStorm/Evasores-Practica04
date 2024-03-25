/**
 * Fabrica de armas, extiende a {@link AbstractFactory} por lo que sobreescribe
 * su metodo
 * abstracto. Se encarga de crear los diferentes tipos de armas.
 * 
 * @implements AbtractFactory
 */
public class FabricaArmas extends AbstractFactory {

    /**
     * Metodo getComponente que sobreescribe al metodo homonimo de la clase
     * abstracta
     * {@link AbstractFactory}, este nos devuelve el tipo de componente de la nave,
     * en este caso
     * nos devuelve <i>armas</i> según la decisión del cliente. En este metodo
     * hacemos uso del
     * metodo <code>getArma()</code> que nos devuelve el arma de la nave del
     * cliente.
     * 
     * @param tipoComponente el componente del cliente.
     * @return un objeto del tipo del arma que escogio el cliente.
     */
    @Override
    public Object getComponente(String tipoComponente) {
        return getArma(tipoComponente);
    }

    /**
     * Metodo getArma que nos devuelve un arma en especifico según la elección del
     * cliente.
     * Recibe un tipo de arma en una {@link String} y nos devuelve un objeto de tipo
     * {@link Arma}
     * 
     * @param tipoArma
     * @return {@link Armas, el arma deseada por el cliente.
     */
    public Armas getArma(int tipoArma) {
        if (tipoArma == null) {
            return null;
        } else if (tipoArma.equalsIgnoreCase("simple")) {
            return new ArmaLaserSimple();
        } else if (tipoArma.equalsIgnoreCase("misiles")) {
            return new ArmaMisilesPlasma();
        } else if (tipoArma.equalsIgnoreCase("destructor")) {
            return new ArmaLaserDestructor();
        }
        return null;
    }
}
