
package ec.edu.espoch.examplemvc.controller;

import ec.edu.espoch.examplemvc.model.Calculadora;
import ec.edu.espoch.examplemvc.view.View;


public class ControllerCalculadora {
    
    private Calculadora calculadora;
    private View view;
    
    
    public ControllerCalculadora(){
        
        calculadora = new Calculadora();
    }
    
    private Calculadora cal = new Calculadora();
    
    
    public void controller(){
        
        try {
            double numberOne = 0.0;
            double numberTwo = 0.0;
            
            calculadora.setNumUno(numberOne);
            calculadora.setNumDos(numberTwo);
            calculadora.sumar();
            
        } catch (Exception e) {
        }
        
    }
    
}
