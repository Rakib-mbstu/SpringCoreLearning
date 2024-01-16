package ZooKeeper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("./dbproperty.properties")
public class AppConfiguration {
    @Bean
    public AppDAO appDAOBean()
    {
        return new AppDAO();
    }
}
