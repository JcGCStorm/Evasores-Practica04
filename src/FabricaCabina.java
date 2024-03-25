/**
 * Fabrica de cabinas, extiende a {@link AbstractFactory} por lo que
 * sobreescribe su metodo
 * abstracto. Se encarga de crear los diferentes tipos de cabinas.
 * 
 * @implements AbtractFactory
 */
public class FabricaCabina extends AbstractFactory {

  /**
   * Metodo getComponente que sobreescribe al metodo homonimo de la clase
   * abstracta
   * {@link AbstractFactory}, este nos devuelve el tipo de componente de la nave,
   * en este caso
   * nos devuelve <i>cabinas</i> según la decisión del cliente. En este metodo
   * hacemos uso del
   * metodo <code>getCabina()</code> que nos devuelve la cabina de la nave del
   * cliente.
   * 
   * @param tipoComponente el componente del cliente.
   * @return un objeto del tipo de la cabina que escogio el cliente.
   */
  @Override
  public Object getComponente(String tipoComponente) {
    return getCabina(tipoComponente);
  }

  /**
   * Metodo getCabina que nos devuelve una cabina en especifico según la elección
   * del cliente.
   * Recibe un tipo de <b>cabina</b> en una {@link String} y nos devuelve un
   * objeto de tipo
   * {@link Cabina}
   * 
   * @param tipoCabina
   * @return {@link Cabina}, la cabina deseada por el cliente.
   */
  public Cabina getCabina(String tipoCabina) {
    if (tipoCabina == null) {
      return null;
    } else if (tipoCabina.equalsIgnoreCase("1")) {
      return new CabinaEjercito();
    } else if (tipoCabina.equalsIgnoreCase("2")) {
      return new CabinaIndividual();
    } else if (tipoCabina.equalsIgnoreCase("3")) {
      return new CabinaTripulacion();
    }
    return null;
  }
}
