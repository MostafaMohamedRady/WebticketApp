/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.config;

import com.webticket.revamp.util.WebTicketCodes;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 *
 * @author Mostafa Rady
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.webticket.revamp")
public class AppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    /*@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }*/
    //welcom page
    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("Login");
        registry.addViewController("/LiveChat").setViewName(WebTicketCodes.PAGE_LiveChat);
        registry.addViewController("/AdminHome").setViewName(WebTicketCodes.PAGE_ADMIN_HOME);
        registry.addViewController("/TechnicalIndex").setViewName(WebTicketCodes.PAGE_TechnicalIndex);
        registry.addViewController("/MerchantIndex").setViewName(WebTicketCodes.PAGE_MerchantIndex);
        registry.addViewController("/StoreIndex").setViewName(WebTicketCodes.PAGE_StoreIndex);
        registry.addViewController("/TerminalIndex").setViewName(WebTicketCodes.PAGE_TerminalIndex);
        registry.addViewController("/DeploymentIndex").setViewName(WebTicketCodes.PAGE_DeploymentIndex);
        registry.addViewController("/TerminalUpdate").setViewName(WebTicketCodes.PAGE_TerminalUpdate);
        registry.addViewController("/SimIndex").setViewName(WebTicketCodes.PAGE_SimIndex);
        registry.addViewController("/MerchantRP").setViewName(WebTicketCodes.PAGE_MerchantRP);
        registry.addViewController("/RpReport").setViewName(WebTicketCodes.PAGE_RpReport);
        registry.addViewController("/TerminalReport").setViewName(WebTicketCodes.PAGE_TerminalReport);
        registry.addViewController("/SimReport").setViewName(WebTicketCodes.PAGE_SimReport);
        registry.addViewController("/WithdrawReport").setViewName(WebTicketCodes.PAGE_WithdrawReport);
        registry.addViewController("/WdReport").setViewName(WebTicketCodes.PAGE_WdReport);
        registry.addViewController("/TicketReport").setViewName(WebTicketCodes.PAGE_TicketReport);
        registry.addViewController("/MnReport").setViewName(WebTicketCodes.PAGE_MnReport);
        registry.addViewController("/MerchantReport").setViewName(WebTicketCodes.PAGE_MerchantReport);
        registry.addViewController("/TechnicalReport").setViewName(WebTicketCodes.PAGE_TechnicalReport);
        registry.addViewController("/WithDraw").setViewName(WebTicketCodes.PAGE_WithDraw);
        registry.addViewController("/WithDrawLogs").setViewName(WebTicketCodes.PAGE_WithDrawLogs);
        registry.addViewController("/InboxTickets").setViewName(WebTicketCodes.PAGE_InboxTickets);
        registry.addViewController("/AssignTicket").setViewName(WebTicketCodes.PAGE_AssignTicket);
        registry.addViewController("/TicketsHistory").setViewName(WebTicketCodes.PAGE_TicketsHistory);
        registry.addViewController("/TicketsMaintenance").setViewName(WebTicketCodes.PAGE_TicketsMaintenance);

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/web-tk?zeroDateTimeBehavior=convertToNull");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }

    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }

    /*

        @Bean("messageSource")
        public MessageSource messageSource() {
            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
            messageSource.setBasenames("languages/messages");
            messageSource.setDefaultEncoding("UTF-8");
            return messageSource;
        }
    
     @Bean
    public LocaleResolver localeResolver() {
        return new CookieLocaleResolver();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        registry.addInterceptor(localeChangeInterceptor);
    }
     */
}
