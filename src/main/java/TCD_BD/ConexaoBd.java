/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCD_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ConexaoBd {
 
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    // Retém a conexão estabelecida com o banco de dados durante a operação do sistema.
    private static Connection conexao;

    /**
     * URL de conexão com o banco de dados
     * (protocolo/sgbd/ip/porta/banco/parâmetros).
     */
    public static final String URL;

    // Usuário para acesso ao banco de dados.
    private static final String USUARIO;

    // Senha para acesso ao banco de dados.
    private static final String SENHA;

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Inicialização dos Atributos estaticos">
    // Inicialização de atributos estáticos.
    static {
        // Servidor Local
        URL = "jdbc:mysql://127.0.0.1:3306/bdtcd001" // Drive de conexão
                + "?useUnicode=true"
                + "&useJDBCCompliantTimezoneShift=true"
                + "&serverTimezone=UTC"
                + "&autoReconnect=true";
        USUARIO = "root";
        SENHA = "";
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Construtor privado">
    /*
     * Construtor privado para forçar acesso à conexão pelo membro estático
     * getConexao() sem que seja requerida a  geração de novos objetos 
     * ConexaoBd ConexaoBd.
     */
    private ConexaoBd() {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="METODO getConexao">
    /**
     * Estabelece e gera a retenção da conexão com o banco de dados.
     *
     * @return Conexão com o banco de dados.
     */
    public static Connection getConexao() {

        // Se não há uma conexão estabelecida...
        if (conexao == null) {
            // ... tenta ...
            try {
                System.out.println(">> Nova conexão estabelecida com o banco de dados");
                // ... estabelecer e reter a conexão a partir da URL, 
                // do usuário e da senha fornecidos
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            } catch (SQLException ex) {
                // TODO Rever procedimento e encerrar o programa em caso de falha
                // Registra falha
                Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
                // System.exit(-1);
            }
        }

        // Devolve a conexão estabelecida
        return conexao;

    }

//</editor-fold>

    
    
    
    
}
