package p.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import p.B2Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { B2Application.class })
public class CucumberSpingConfiguration {}
