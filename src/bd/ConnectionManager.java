package bd;

import java.sql.*;

public class ConnectionManager {
    
    /*private static String STR_CON;
    private static String USER;
    private static String PASSWORD;
    private static String STR_DRIVER;
    */
   
    private static String STR_DRIVER = "org.postgresql.Driver";
    private static String DATABASE = "carro";
    private static String IP = "localhost";


    public static Connection getConexao() throws Exception {
        
        Connection conn = null;

        try {
	    Class.forName("org.postgresql.Driver");
	    conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/sistema","postgres","j147f963x");
            //System.out.println("[ConnectionManager]: Obtendo conexao");
            return conn;
        }

        catch (ClassNotFoundException e) {
            String errorMsg = "Driver nao encontrado";
            throw new Exception(errorMsg, e);
        } catch (SQLException e) {
            String errorMsg = "Erro ao obter a conexao";
            throw new Exception(errorMsg, e);
          }
    }

    public static void closeAll(Connection conn) {
        try {
		  if(conn!=null){
			conn.close();
		  }
             

        } catch (Exception e) {
            String errorMsg = "Nao foi possivel fechar a conexao com o banco";
            //System.out.println(errorMsg);
          }
    }
    
        public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
        try {
		  if(conn!=null || stmt!=null){
			closeAll(conn,stmt);
		  }
		  if(rs!=null){
			rs.close();
		  }

        } catch (Exception e) {
            String errorMsg = "Nao foi possivel fechar a conexao com o banco";
            //System.out.println(errorMsg);
        }
    }
         public static void closeAll(Connection conn, Statement stmt) {
               try {
    		      if(conn!=null){
    			    closeAll(conn);
    		      }
    		   if(stmt!=null){
    			stmt.close();
    		   }

                 } catch (Exception e) {
                    String errorMsg = "Nao foi possível fechar a conexao com o banco";
                    //System.out.println(errorMsg);
               }
           }
}

