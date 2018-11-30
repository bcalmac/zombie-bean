package io.github.bcalmac.zombiebean.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(ZombieBean.class)
public class AlternateBean {

}
