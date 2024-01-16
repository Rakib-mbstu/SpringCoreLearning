package ZooKeeper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        AppDAO obj = context.getBean("appDAOBean",AppDAO.class);
        obj.viewAll();
       // obj.update();
        obj.insertEntry();
    }
}
