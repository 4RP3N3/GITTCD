/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCD_CLASSES;

/**
 *
 * @author Artur
 */
public class Pessoa extends Entidade {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String nome;
    private String email;
    private Boolean ativo;
    private Boolean lixo;
    
    
    
    
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
      
    public Pessoa() {
    }

    public Pessoa(String nome, String email, Boolean ativo, Boolean lixo) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.lixo = lixo;
    }

 

    
    
    
//</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getLixo() {
        return lixo;
    }

    public void setLixo(Boolean lixo) {
        this.lixo = lixo;
    }
    
    
    
    
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="To_String">
    
        @Override
    public String toString() {
        return ("Nome: " +nome+"\n"
                + "Email: "+email+"\n"
                + "Status: "+ativo+"\n");
    }
    
//</editor-fold>

    
    

    

    
    
    
    
    
    
}
