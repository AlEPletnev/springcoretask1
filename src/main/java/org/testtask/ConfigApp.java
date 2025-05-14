package org.testtask;

import org.springframework.context.annotation.*;
import org.testtask.commands.Command;
import org.testtask.commands.TodayCommand;

import java.util.Locale;

@Configuration
@ComponentScan("org.testtask")
@PropertySource("classpath:app.properties")
public class ConfigApp {

    @Bean
    @Profile("ru")
    public Command toDayCommandBeanRu(){
        return new TodayCommand(Locale.getDefault());
    }

    @Bean
    @Profile("eng")
    public Command toDayCommandBeanEng(){
        return new TodayCommand(Locale.US);
    }
}
