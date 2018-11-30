package io.github.bcalmac.zombiebean.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SomethingConfiguration.class)
public class MyStarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(ZombieBean.class)
    AlternateBean alternateBean() {
        return new AlternateBean();
    }
}
