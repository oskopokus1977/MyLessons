package classWork.H2dataBases;

import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseFill {
    public static void main(String[] args) {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:~/test");
        dataSource.setUser("sa");
        dataSource.setPassword("");

        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            Statement statement1 = connection.createStatement();

            statement.execute("CREATE TABLE STUDENTS(id int primary key auto_increment, firstname VARCHAR(30) not null, lastname VARCHAR(30) not null, age INT not null)");
            statement.executeUpdate("INSERT INTO STUDENTS (firstname, lastname, age) VALUES ('Yurii', 'Kozlov', 40)");
            statement.executeUpdate("INSERT INTO STUDENTS (firstname, lastname, age) VALUES ('Iiya', 'Nagaychuk', 29)");
            statement.executeUpdate("INSERT INTO STUDENTS (firstname, lastname, age) VALUES ('Nikolay', 'Vtoroy', 35)");
            statement.executeUpdate("INSERT INTO STUDENTS (firstname, lastname, age) VALUES ('Ioan', 'Pavel', 27)");
            statement.executeUpdate("INSERT INTO STUDENTS (firstname, lastname, age) VALUES ('Nektor', 'Nekto', 87)");
            statement.execute("DROP TABLE studentS");
            statement.close();

            statement1.execute("create table subjects (student_id int, physics int, math int, programming int)");
            statement1.executeUpdate("alter table subjects add foreign key (student_id) references students (id)");
            statement1.executeUpdate("insert into subjects (student_id, physics, math, programming) values (1, 4, 4, 5)");
            statement1.executeUpdate("insert into subjects (student_id, physics, math, programming) values (2, 3, 4, 3)");
            statement1.executeUpdate("insert into subjects (student_id, physics, math, programming) values (3, 5, 2, 5)");
            statement1.executeUpdate("insert into subjects (student_id, physics, math, programming) values (4, 2, 1, 5)");
            statement1.executeUpdate("insert into subjects (student_id, physics, math, programming) values (5, 5, 3, 2)");
            statement1.close();

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
