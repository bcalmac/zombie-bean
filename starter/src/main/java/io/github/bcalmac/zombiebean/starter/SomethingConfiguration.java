package io.github.bcalmac.zombiebean.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(annotation = EnableSomething.class)
public class SomethingConfiguration {

    @Bean
    ZombieBean zombieBean() {
        return new ZombieBean();
    }
}
