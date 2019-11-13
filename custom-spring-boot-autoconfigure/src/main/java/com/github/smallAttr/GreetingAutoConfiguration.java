package com.github.smallAttr;

import com.github.smallAttr.properties.GreetingProperties;
import com.github.smallAttr.service.GreetingService;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.*;
import org.springframework.core.*;

/**
 * @author smallAttr
 * @since 2019-11-13 16:10
 */
@Configuration
@ConditionalOnProperty(value = "spring.greeting.enable", havingValue = "true")
@AutoConfigureOrder(value = Ordered.HIGHEST_PRECEDENCE)
public class GreetingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(search = SearchStrategy.CURRENT)
    public GreetingProperties greetingProperties() {
        return new GreetingProperties();
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greetingProperties().getMembers());
    }
}
