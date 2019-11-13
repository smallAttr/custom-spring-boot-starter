package com.github.smallAttr.properties;

import lombok.Data;
import org.springframework.boot.context.properties.*;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-11-13 15:58
 */
@Data
@ConfigurationProperties(prefix = "spring.greeting")
public class GreetingProperties {

    /**
     * GreetingProperties 开关
     */
    private boolean enable = false;

    /**
     * 需要打招呼的成员列表
     */
    private List<String> members = new ArrayList<>();
}
