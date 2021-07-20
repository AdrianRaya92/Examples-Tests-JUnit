/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Raya Hernandez 50888999G
 */
public class ImpresoraTest {
    
    static Impresora impresora1;
    static Impresora impresora2;
    
    public ImpresoraTest() {
    }
    
    @BeforeClass
    public static void inicio() {
        
        //Iniciamos la impresora con una cantidad positiva y otra negativa
        impresora1 = new Impresora(250);
        impresora2 = new Impresora(-10);
        
    }
    
     /**
     * Test of Impresora of class Impresora.
     */
    @Test
    public void testImpresora() {

        //Comprobamos que es cierto que la capacidad de la impresora siempre 
        //es positiva aunque se inicie con un parametro negativo
        assertTrue(impresora1.getCapacidad()>=0);
        assertTrue(impresora2.getCapacidad()>=0);
        
        //Mostramos que realmente la capacidad es la correcta
        System.out.println("Test Capacidad de Toner Positiva Impresora 1= "+impresora1.getCapacidad());
        System.out.println("Test Capacidad de Toner Negativa Impresora 2= "+impresora2.getCapacidad());
        
    }
    
    
    /**
     * Test of Imprimir method, of class Impresora.
     */
    @Test
    public void testImprimir() {
  
        //Llamamos al método Imprimir para que realice en las impresoras 
        //la modificación de la cantidad de páginas según el parámetro de 
        //cantidad de páginas que se han impreso
        impresora1.Imprimir(45);
        impresora2.Imprimir(68);
        
        //Comprobamos que el parametro realmente ha cambiado con los datos que 
        //tienen al principio la cantidad de páginas
        assertFalse(impresora1.getCantidad()==250);
        assertFalse(impresora1.getCantidad()==100);
        
        //Mostramos que la cantidad de cada impresora ha cambiado
        System.out.println("Test Cantidad total tras imprimir con la Impresora 1= "+impresora1.getCantidad());
        System.out.println("Test Cantidad total tras imprimir con la Impresora 2= "+impresora2.getCantidad());
        
    }

    /**
     * Test of EstadoToner method, of class Impresora.
     */
    @Test
    public void testEstadoToner() {
        
        //Creamos el resultado de tipo double de cada impresora
        double resultado1 = impresora1.EstadoToner();
        double resultado2 = impresora2.EstadoToner();
        
        //Comprobamos que el resultado está entre 0 y 1
        assertTrue(resultado1>=0 && resultado1<=1);
        assertTrue(resultado2>=0 && resultado2<=1);
        
        //Mostramos el porcentaje por pantalla para ver que es correcto
        System.out.println("Test porcentaje del toner de la Impresora 1=" + resultado1);
        System.out.println("Test porcentaje del toner de la Impresora 2=" + resultado2);
    }

}
