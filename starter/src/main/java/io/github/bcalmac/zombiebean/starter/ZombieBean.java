package io.github.bcalmac.zombiebean.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(annotation = EnableSomething.class)
public class ZombieBean {

}
