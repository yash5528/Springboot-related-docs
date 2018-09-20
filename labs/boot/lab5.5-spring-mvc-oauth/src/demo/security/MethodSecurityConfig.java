package demo.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {
  
	private final Logger LOG = LoggerFactory.getLogger(MethodSecurityConfig.class);
    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
    	LOG.info("Inside MethodSecurityConfig>>>> ");
    	return new OAuth2MethodSecurityExpressionHandler();
    }
}
