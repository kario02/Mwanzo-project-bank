import java.sql.*;


public class Connector {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost:3306/BarakaMwanzo";

        static final String USER = "root";
        static final String PASS = "brayookk7";

        public static Connection getConnection()  {
            Connection conn = null;
            Statement stmt = null;
            try {


                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);


            } catch (Exception e) {
                e.printStackTrace();
            }
            return conn;
        }
    }



