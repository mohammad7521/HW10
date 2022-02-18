package P7;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataAdder {

        public boolean addData(String text){

            int addDataCheck=0;
        try {
            String insert="INSERT INTO SAMPLE (text) values(?)";
            PreparedStatement preparedStatement=ConnectionProvider.setConnection().prepareStatement(insert);
            preparedStatement.setString(1,text);
            addDataCheck=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addDataCheck>0;
    }


}
