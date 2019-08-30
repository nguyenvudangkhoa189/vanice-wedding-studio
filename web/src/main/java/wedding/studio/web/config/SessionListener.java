package wedding.studio.web.config;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionListener implements HttpSessionListener {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("==== Session is created ====");
        se.getSession().setMaxInactiveInterval(86400);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("==== Session is destroyed ====");
    }
}
