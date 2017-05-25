package com.rdemir.assigment.config;


import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {

//    public JobBuilderFactory jobBuilderFactory;
//
//
//    public StepBuilderFactory stepBuilderFactory;
//
//    @Bean
//    public Job job() {
//        return jobBuilderFactory.get("job")
//                .incrementer(new RunIdIncrementer())
//                .flow(step1())
//                .end()
//                .build();
//    }
//
//    @Bean
//    public Step step1() {
//        return stepBuilderFactory.get("step1")
//                .<String, String>chunk(1)
//                .reader(new Reader())
//                .processor(new Processor())
//                .writer(new Writer())
//                .build();
//    }
}
