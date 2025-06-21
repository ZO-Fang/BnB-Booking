package com.example.BnBBooking.config;

//import lombok.AccessLevel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//ModelMapperConfig的作用是：把 ModelMapper 注册成 Spring 容器的 Bean，
//方便项目中其他地方自动注入并使用它来进行对象属性的自动映射（DTO ↔ Entity）。
@Configuration
public class ModelMapperConfig {

    //@Bean 表示这个方法的返回值会被注入到 Spring 容器中，成为一个全局可用的组件。
    @Bean   //ModelMapper就是一个“对象转对象”的自动复制机
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STANDARD);

        return modelMapper;
    }

    //这段代码的作用是：在 Spring 项目中配置并全局注册一个定制的 ModelMapper 实例，
    // 以后就能在 controller、service、甚至测试里随意用它来简化 DTO ↔ Entity 之间的字段映射，
    // 不用手动写 setter/getter。
}
