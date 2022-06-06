/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCD_BD;

import TCD_CLASSES.Entidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public abstract class Dao<E,K> implements IDao<E,K> {
    
    
    
    //<editor-fold defaultstate="collapsed" desc="Sobrescreve SALVAR">
    
    
    @Override
    
    public K salvar(E e){
    
        Long id = 0L;

        // TODO id==0 não distingue se uma pessoa física é nova ou se deve ser atualizada devido ao CPF sempre ser obrigatório
 //       if (((Entidade) e).getId() == null || ((Entidade) e).getId() == 0) {

        if (((Entidade) e).getId() == null || ((Entidade) e).getId() == 0 ) {

            System.out.println("passou aqui 001");
            // Inserir novo registro

            try ( PreparedStatement preparedStatement
                    = ConexaoBd
                            .getConexao()
                            .prepareStatement(
                                    obterSentencaInsert(),
                                    Statement.RETURN_GENERATED_KEYS)) {

                        // montar a declaração sql com os dados (->?)
                        montarDeclaracao(preparedStatement, e);
                        
                        System.out.println("SQL: " + preparedStatement);
                        preparedStatement.executeUpdate();

                        ResultSet resultSet = preparedStatement.getGeneratedKeys();

                        if (resultSet.next()) {
                            id = resultSet.getLong(1);
                        }

                    } catch (Exception ex) {
                        System.out.println(">> " + ex);
                    }

        } else {
            // Atualizar registro existente
            System.out.println("passou aqui 002");
        }

        return (K) id;
    
    }
    
    
    
//</editor-fold>
    
    
    
    
    /**
     * Método abstrato: precisa ser implementado por toda classe filha de Dao
     * 
     * Retorna a sentença SQL específica para cada objeto a ser persisstido no BD
     * @return 
     */
    
    public abstract String obterSentencaInsert();
    
    
    
    
    
    /**
     * Monta a declaração SQL com os valores contidos no objeto recebido.
     *
     * @param pstmt Consulta a ser preparada.
     * @param e Objeto com valores a serem embutidos na consulta.
     */
    public abstract void montarDeclaracao(PreparedStatement pstmt, E e);
    
    
    
    
    
    
}
