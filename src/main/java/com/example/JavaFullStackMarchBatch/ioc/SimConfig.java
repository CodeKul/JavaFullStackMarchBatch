package com.example.JavaFullStackMarchBatch.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    @Bean
    public Vodafone getVodafone(){
        return new Vodafone();
    }

    @Bean
    public Airtel getAirtel(){
        return new Airtel();
    }
    @Bean
    public JIO getJio(){
        return new JIO();
    }

}
//
//
//<Beans>
//<Bean id = "addhadds",class ="Vodafone.class"
//
//</Beans>