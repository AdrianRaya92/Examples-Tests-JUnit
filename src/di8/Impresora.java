package di8;


/**
 *
 * @author Adrian Raya Hernandez
 */
public class Impresora {

    //Atributos
    
    //Propiedad que indica la capacidad del toner en páginas
    private int capacidad;
    
    //Propiedad que indica la cantidad de paginas que quedan por utilizar en 
    //el toner, por lo que empezara igual que la capacidad, pero se irá 
    //actualizando el número de páginas
    private int cantidad;
    
    /**
     * Devuelve la capacidad de páginas
     * @return Capacidad
     */
    public int getCapacidad(){
        return capacidad;
    }
    
    /**
     * Devuelve la cantidad de páginas que le quedan al toner
     * @return Cantidad
     */
    public int getCantidad(){
        return cantidad;
    }
    
    /**
     * Constructor con el pa´rametro Cantidad
     * @param cantidad Es el encargado de ver cual es la cántidad 
     * de páginas de la impresora
     */
    public Impresora(int cantidad){
        if(cantidad>=0){
            capacidad=cantidad;
            this.cantidad=capacidad;
        }
        else if(cantidad<0){
            capacidad=100;
            this.cantidad=capacidad;
        }
    }
    
    /**
     * Método Imprimir que pide por parámetro la cantidad 
     * de páginas que se desea imprimir
     * @param cantidadImprimir es el número de páginas que se desea imprimir
     */
    public void Imprimir(int cantidadImprimir){
        this.cantidad = cantidad - cantidadImprimir; 
    }
    
    /**
     * Método Estado del Toner
     * @return valor double del estado del toner como porcentaje
     */
    public double EstadoToner(){
        
        return (double)cantidad/(double)capacidad;
    }
    
}
