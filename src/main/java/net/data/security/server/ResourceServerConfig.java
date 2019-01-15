package net.data.security.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    private static final String RESOURCE_ID = "data-rest-api";
    private static final String RESOURCE_READ_SCOPE = "#oauth2.hasScope('read')";
    private static final String RESOURCE_PATTERN = "/api/**";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(RESOURCE_ID);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
            .antMatchers(RESOURCE_PATTERN)
            .and()
            .authorizeRequests().anyRequest().access(RESOURCE_READ_SCOPE);
    }
}
