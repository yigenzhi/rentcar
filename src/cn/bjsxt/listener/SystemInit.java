package cn.bjsxt.listener;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextCleanupListener;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author yanggd
 * @version V1.0
 * @Description: (用一句话描述该文件做什么)
 * @date
 */
public class SystemInit extends ContextLoader implements ServletContextListener {
    static Logger logger = Logger.getLogger(SystemInit.class);

    public SystemInit() {
    }

    public SystemInit(WebApplicationContext context) {
        super(context);
    }

    public void contextInitialized(ServletContextEvent event) {
        this.initWebApplicationContext(event.getServletContext());
    }

    public void contextDestroyed(ServletContextEvent event) {
        this.closeWebApplicationContext(event.getServletContext());
    }
}
