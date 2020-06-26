//package databases;
//
//import org.apache.poi.ss.usermodel.IgnoredErrorType;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//import static databases.ConnectToSqlDB.connectToSqlDatabase;
////import static databases.User2.searchProduct;
//
//public class SprintConnectToMySql {
//
//
//    public static List<User1> readUser2ProfileFromSqlTable()throws IOException, SQLException, ClassNotFoundException {
//        List<User1> list = new ArrayList<>();
//        User1 user = null;
//        try{
//            Connection conn = connectToSqlDatabase();
//            String query = "SELECT * FROM SprintSearch";
//            // create the java statement
//            Statement st = conn.createStatement();
//            // execute the query, and get a java resultset
//            ResultSet rs = st.executeQuery(query);
//            // iterate through the java resultset
//            while (rs.next())
//            {
//                String product = rs.getString("searchProduct");
//
//                //System.out.format("%s, %s\n", name, id);
//                user = new User1(product);
//                list.add(user);
//
//            }
//            st.close();
//        }catch (Exception e){
//            System.err.println("Got an exception! ");
//            System.err.println(e.getMessage());
//        }
//        return list;
//    }
//
//    public static void main(String[] args)throws IOException, SQLException, ClassNotFoundException {
//        List<User1> list = readUser1ProfileFromSqlTable();
//        for(User1 user:list){
//            System.out.println(user.getSearchProduct());
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
