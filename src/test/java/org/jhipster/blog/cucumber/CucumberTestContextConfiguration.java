package org.jhipster.blog.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.jhipster.blog.BlogApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BlogApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
