/**
 * Clase que proporciona un método estático para obtener una fábrica concreta
 * basada en
 * el tipo de componente especificado. Los tipos de componentes soportados
 * incluyen
 * "PROPULSION", "BLINDAJE", "CABINA" y "ARMAS".
 * 
 * Esta clase actúa como un "selector" de fábricas, eligiendo la fábrica
 * adecuada
 * según el tipo de componente que se desea crear.
 * </p>
 * 
 * Los componentes creados por las fábricas obtenidas mediante este método
 * deben ser compatibles entre sí y cumplir con los requisitos de las naves
 * espaciales.
 * </p>
 * 
 */
public class DisenoNaves {
    public static AbstractFactory getFactory(String opcion) {
        if (opcion.equalsIgnoreCase("PROPULSION")) {
            return new FabricaPropulsion();
        } else if (opcion.equalsIgnoreCase("BLINDAJE")) {
            return new FabricaBlindaje();
        } else if (opcion.equalsIgnoreCase("CABINA")) {
            return new FabricaCabina();
        } else if (opcion.equalsIgnoreCase("ARMAS")) {
            return new FabricaArmas();
        }
        return null;
    }
}
