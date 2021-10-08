package com.waytous.cloud.gateway.cucumber;

import com.waytous.cloud.gateway.CloudGatewayApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = CloudGatewayApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
