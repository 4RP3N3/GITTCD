/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCD_CLASSES;

/**
 *
 * @author User
 */
public class Entidade {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
// Representação da chave primária padrão para a entidade.
    private Long id;

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Entidade() {
    }

    public Entidade(Long id) {
        this.id = id;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters&Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //</editor-fold>

    
 
}
