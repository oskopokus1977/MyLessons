package homework.MySqlDataBase;


import java.sql.*;

public class MySqlRead {
    public static void main(String[] args) throws ClassNotFoundException {
      Class.forName("com.mysql.jdbc.Driver");


        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hillel","root", "root")) {
            Statement statement = connection.createStatement();
            System.out.println("5 for programming have:");
            ResultSet resultSet = statement.executeQuery("select concat (lastname, ' ',left(firstname, 1),'.') as fullname from students where id in (select student_id from subjects where programming = 5)");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("fullname"));
            }
            System.out.println();
            Statement statement1 = connection.createStatement();
            System.out.println("the score in physics is higher than in mathematics have:");
            ResultSet resultSet1 = statement1.executeQuery("select concat(lastname, ' ',left(firstname, 1),'.') as fullname from students where id in (select student_id from subjects where physics > math)");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString("fullname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
