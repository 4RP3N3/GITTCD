
package TCD_CLASSES;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Artur
 */
public class Colaborador extends Pessoa{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
        private String funcaoNoEnsaio;
        private BigDecimal remuneracao;

    
//</editor-fold>
    
     //<editor-fold defaultstate="collapsed" desc="Construtores">

        public Colaborador() {
        }
        
        
        public Colaborador(Pessoa p1) {
        super.setNome(p1.getNome());
        super.setEmail(p1.getEmail());


    }
        
        
        public Colaborador(Pessoa p1, String funcaoNoEnsaio, BigDecimal remuneracao) {
        super.setNome(p1.getNome());
        super.setEmail(p1.getEmail());
        this.funcaoNoEnsaio = funcaoNoEnsaio;
        this.remuneracao= remuneracao;
    }
        
        
        
//</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
        
          public String getFuncaoNoEnsaio() {
        return funcaoNoEnsaio;
    }

    public void setFuncaoNoEnsaio(String funcaoNoEnsaio) {
        this.funcaoNoEnsaio = funcaoNoEnsaio;
    }

    public BigDecimal getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(BigDecimal remuneracao) {
        this.remuneracao = remuneracao;
    }
    
    
    
    
        
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="To_string">
        @Override
    public String toString() {
        return ("Nome do Colaborador: "+super.getNome()+"\n"
                + "Email do colaborador: "+super.getEmail()+"\n"
                + "Função no ensaio: "+ funcaoNoEnsaio+"\n"
                + "REmuneração: "+ remuneracao+"\n");
    }
//</editor-fold>
    

   
  
    
    
}
