package demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import demo.filter.CORSFilter;

import javax.servlet.Filter;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	private final Logger LOG = LoggerFactory.getLogger(ServletInitializer.class);
    @Override
    protected Class<?>[] getServletConfigClasses() {
    	LOG.info("ServletInitializer...getServletConfigClasses>>>");
        return new Class[] { MyWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
    	LOG.info("ServletInitializer...getServletMappings>>>" );
        return new String[] { "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
    	LOG.info("ServletInitializer...getRootConfigClasses>>>");
        return null;
    }

    @Override
    protected Filter[] getServletFilters() {
    	LOG.info("ServletInitializer..getServletFilters>>>");
        return new Filter[]{ new CORSFilter()};
    }

}
