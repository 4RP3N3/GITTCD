/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCD_BD;

/**
 *
 * @author User
 */
public interface IDao <E, K> {
    
    //<editor-fold defaultstate="collapsed" desc="Metodos OBRIGATORIOS a quem implementar esta interface">
    
    
        public K salvar (E e);
    
    
//</editor-fold>
    
}
