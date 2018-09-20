package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleCamelRouter extends RouteBuilder {



    @Override

    public void configure() throws Exception {

        from("file:test")
        .log("body is ${body}")
        .transform()
        .simple("${body} processed")
        .to("file:test2");
        
        
        from("file:test2")
        .log("final message:${body}");
        
        
              
        
        
        

    }



}