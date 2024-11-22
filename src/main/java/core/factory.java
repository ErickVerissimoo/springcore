package core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class factory {
    @Bean(name = "corola")
    public corola getCorola() {
        return new corola();
    }
}
