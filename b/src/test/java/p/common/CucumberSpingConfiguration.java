package p.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import p.BApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { BApplication.class })
public class CucumberSpingConfiguration {}
