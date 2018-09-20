package demo.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

	private final Logger LOG = LoggerFactory.getLogger(OAuth2ResourceServerConfig.class);
	
	private static final String RESOURCE_ID = "SPRING_REST_API";
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		LOG.info("inside OAuth2ResourceServerConfig...ResourceServerSecurityConfigurer>>>");
		resources.resourceId(RESOURCE_ID).stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		LOG.info("inside OAuth2ResourceServerConfig... HttpSecurity>>>");
		http.
		anonymous().disable()
		.requestMatchers().antMatchers("/fruits/**")
		.and().authorizeRequests()
		.antMatchers("/fruits/**").access("hasRole('ADMIN')")
		.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}

}