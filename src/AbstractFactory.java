/**
 * Clase abstracta que sirve como base para las fábricas concretas que crearán
 * diferentes
 * componentes para las naves espaciales, como la propulsión, el blindaje, la
 * cabina y las armas.
 * 
 * Las fábricas concretas heredarán de esta clase y proporcionarán
 * implementaciones
 * específicas del método {@code getComponente} para crear componentes de tipos
 * diferentes.
 * 
 * Los componentes creados por las fábricas concretas deben ser compatibles
 * entre sí y
 * cumplir con los requisitos de las naves espaciales.
 */
public abstract class AbstractFactory {

    /**
     * Método abstracto que debe ser implementado por las fábricas concretas para
     * crear un
     * componente específico basado en el tipo proporcionado.
     * 
     * @param tipoComponente el tipo de componente que se desea crear.
     * @return un objeto del tipo de componente solicitado.
     */
    abstract Object getComponente(String tipoComponente);
}