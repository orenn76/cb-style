package com.cbstyle.item.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class ValidatorConfig {

    /**
     * Define a custom messageSource for using a custom validation messages properties file.
     *
     * @return ResourceBundleMessageSource
     */
    @Bean(name = "messageSource")
    public ResourceBundleMessageSource messageSource() {
        final ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("ValidationMessages");
        return messageSource;
    }

    /**
     * Define a custom validator for using owr custom messageSource.
     *
     * @return LocalValidatorFactoryBean
     */
    @Bean(name = "validator")
    public LocalValidatorFactoryBean validator() {
        final LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
        factoryBean.setValidationMessageSource(messageSource());
        return factoryBean;
    }

    /**
     * Define a custom messageAccessor for accessing owr custom messageSource.
     *
     * @return MessageSourceAccessor
     */
    @Bean(name = "messageAccessor")
    public MessageSourceAccessor messageSourceAccessor() {
        return new MessageSourceAccessor(messageSource());
    }


    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
