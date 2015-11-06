package facilita;

import java.sql.*;



public class ConexaoBancoDeDados {
    
    private static String url = "jdbc:mysql://localhost/facilita";
    private static String login = "root";
    private static String senha = "";
    private static Connection conexao;
    
    private ConexaoBancoDeDados(){
        
    }
    
    private static void conectarBanco(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("\nDriver carregado com sucesso!\n");
            conexao = DriverManager.getConnection(url, login, senha);
        }catch (Exception ex) {
            System.out.println("\n Driver nao pode ser carregado! "+ ex.getMessage());
        }
     }
     
     public static Connection getConexao(){
         if (conexao == null){
             conectarBanco();
         }
         
         return conexao;
     }
}
