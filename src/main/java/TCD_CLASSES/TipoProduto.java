/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCD_CLASSES;

import java.math.BigDecimal;
import java.time.Duration;

/**
 *
 * @author Artur
 */
public class TipoProduto {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer index; // identificador do produto
    private String nome = new String();
    private Duration duracao;
    private BigDecimal valor;

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
   
        public TipoProduto() {
    }
    
    public TipoProduto(Integer index) {
        
        this.index = index;

        if (null != index) {
            switch (index) {
                case 1:
                    this.nome = "Cobertura de Casamento";
                    this.duracao = Duration.ofHours(4);
                    this.valor = new BigDecimal("1000");
                    break;
                case 2:
                    this.nome = "Ensaio em Estudio";
                    this.duracao = Duration.ofMinutes(90);
                    this.valor = new BigDecimal("800");

                    break;
                case 3:
                    this.nome = "Ensaio Externo";
                    this.duracao = Duration.ofMinutes(60);
                    this.valor = new BigDecimal("600");
                    break;
                default:
                    break;
            }
        }

    }

//</editor-fold>        

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To_Strind">
    
        @Override
    public String toString() {
        return("Nome do Produto: "+ nome+"\n"
                + "Duração: "+duracao+"\n"
                + "Valor: "+valor+"\n");
    }
    
    
//</editor-fold>


    
    
    
    
}
