/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCD_BD;

import TCD_CLASSES.Colaborador;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class ColaboradorDao extends Dao<Colaborador,Integer>{

    @Override
    public String obterSentencaInsert() {
       return "insert into colaborador(id, nome, email, funcaonoensaio,remuneracao, ativo, lixo) values (?,?,?,?,?,?,?);"; 
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Colaborador e) {
       
         try {
            if (e.getId() == null || e.getId() == 0) {
                
                pstmt.setString(1, e.getNome());
                pstmt.setString(2, e.getEmail());
                pstmt.setString(3, e.getFuncaoNoEnsaio());
                pstmt.setBigDecimal(4, e.getRemuneracao());
                pstmt.setBoolean(5, e.getAtivo());
                pstmt.setBoolean(6, e.getLixo());
            } else {

            }
        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
