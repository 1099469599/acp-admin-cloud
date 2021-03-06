package pers.acp.admin.oauth.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pers.acp.admin.common.base.BaseSwaggerConfiguration;
import pers.acp.springboot.core.conf.SwaggerConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhang by 27/12/2018
 * @since JDK 11
 */
@Configuration
@EnableSwagger2
@Component
public class CustomerSwaggerConfiguration extends BaseSwaggerConfiguration {

    @Autowired
    public CustomerSwaggerConfiguration(SwaggerConfiguration swaggerConfiguration) {
        super(swaggerConfiguration);
    }

    @Bean
    public Docket createRestApi() {
        return buildDocket("pers.acp.admin.oauth.controller", "Oauth Server RESTful API");
    }

}
