/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tcd_gamma;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Pagamento {

//<editor-fold defaultstate="collapsed" desc="Atributos">
    private BigDecimal valor;
    private LocalDate dataDoPagamento;

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Pagamento() {
    }
    
    
    
      public Pagamento(BigDecimal valor, LocalDate dataDoPagamento) {
        this.valor = valor;
        this.dataDoPagamento = dataDoPagamento;
    }
    
    
//</editor-fold>

      //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
      
      
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataDoPagamento() {
        return dataDoPagamento;
    }

    public void setDataDoPagamento(LocalDate dataDoPagamento) {
        this.dataDoPagamento = dataDoPagamento;
    }
      
      
//</editor-fold>

    
    
}
