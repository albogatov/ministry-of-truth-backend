package itmo.abogatov.ministryoftruthbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

import java.io.IOException;

@Configuration
class WebMVCCustomConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:static").resourceChain(true)
                .addResolver( new PathResourceResolver() {
                    @Override
                    protected Resource getResource(String resourcePath, Resource location) throws IOException{
                        String path = "static/";
                        path += (resourcePath.contains(".") && !resourcePath.equals("index.html")) ? resourcePath : "index.html";

                        Resource resource = new ClassPathResource(path);
                        return resource.exists() ? resource : null;
                    }
                });
    }
}
