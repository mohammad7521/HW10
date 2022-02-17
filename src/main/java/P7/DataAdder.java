package P7;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataAdder {
    public DataAdder(String text) {

        try {
            String insert="INSERT INTO SAMPLE (text) values(?)";

            PreparedStatement preparedStatement=ConnectionProvider.setConnection().prepareStatement(insert);
            preparedStatement.setString(1,text);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        DataAdder dataAdder=new DataAdder("3");
    }
}
