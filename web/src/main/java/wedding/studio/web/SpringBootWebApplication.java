package wedding.studio.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import wedding.studio.web.config.SessionListener;

@SpringBootApplication
@ComponentScan(basePackages = "wedding.studio.web")
public class SpringBootWebApplication extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(SpringBootWebApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        servletContext.addListener(new SessionListener());
    }

    public static void main(String[] args) {
        logger.info("Start SpringBoot Web program");
        SpringApplication.run(SpringBootWebApplication.class, args);
        logger.info("END SpringBoot Web program");
    }
}
