package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBStepDefs {

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database(){

        DBUtils.createConnection();
    }

    @Given("user gets the column {string} from table {string}")
    public void user_gets_the_column_from_table(String column, String table) {
//        String query = "SELECT * FROM tp_customer"; // HARD CODED
//        Writing query
        String query =   "SELECT "+column+" FROM "+table;
//        Executing the query
        DBUtils.executeQuery(query);

    }

    @Given("user reads all of the column {string} data")
    public void user_reads_all_of_the_column_data(String column) throws Exception {
//        next() -> going to the NEXT row
        DBUtils.getResultset().next();
//        I am on the 1st column
//        getObject(column) -> returns the data on that column
        Object column1 = DBUtils.getResultset().getObject(column);
        System.out.println(column1);


//       Going to the next line
        DBUtils.getResultset().next();
        Object column2= DBUtils.getResultset().getObject(column);
        System.out.println(column2);



//        Going to the next row
        DBUtils.getResultset().next();
        String column3=DBUtils.getResultset().getString(column);
        System.out.println(column3);

        int count=3;
//        printing ALL SSN using a loop -> DBUtils.getResultset().next() returns true if there is a next element
        while (DBUtils.getResultset().next()){
            count++;
//            getting the data in the current row
            Object currentRowData = DBUtils.getResultset().getObject(column);
//            printing current row data
            System.out.println(currentRowData);


        }
//        Printing the row count
        System.out.println("There are "+count+" row!");
//      Or we can uer DBUtil method to get the row count
        System.out.println("Row Count "+ DBUtils.getRowCount());

    }
    @Then("user close the connection")
    public void user_close_the_connection() {
        DBUtils.closeConnection();
    }

}
