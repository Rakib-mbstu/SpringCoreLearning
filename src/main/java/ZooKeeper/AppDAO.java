package ZooKeeper;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;

import java.sql.*;
import java.util.Scanner;

public class AppDAO {
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("Dsi")
    private String userName;
    @Value("${password}")
    private String password;

    Connection connection;
    @PostConstruct
    public void createDBconnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, userName, password);
    }

    public void viewAll() throws ClassNotFoundException, SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * from zookeeper");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
        statement.close();
    }

    public void update() throws ClassNotFoundException, SQLException {
        Scanner in = new Scanner(System.in);
        PreparedStatement statement = connection.prepareStatement("UPDATE zookeeper set number=? where sName=?");
        System.out.print("Enter the Scientific name of the animal: ");
        String name = in.nextLine();
        statement.setString(2, name);
        System.out.print("Number of animals in the zoo: ");
        int number = in.nextInt();
        statement.setInt(1, number);
        statement.executeUpdate();
    }

    public void insertEntry() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT into zookeeper values (?,?,?)");
        statement.setString(1,"Cervus elaphus");
        statement.setString(2,"Peru");
        statement.setInt(3,10);
        statement.execute();
    }
    @PreDestroy
    protected void destroy() throws SQLException {
        connection.close();
    }
}
