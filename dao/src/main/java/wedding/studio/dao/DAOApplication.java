package wedding.studio.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@ComponentScan(basePackages = "wedding.studio.dao")
public class DAOApplication {

    private static Logger logger = LoggerFactory.getLogger(DAOApplication.class);

    public static void main(String[] args) {
        logger.info("Start DAO program");
        SpringApplication.run(DAOApplication.class, args);
        logger.info("Start DAO program END");
    }
}
