package bdd.config;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberTestRunner.class)
public class CucumberSpringContextConfiguration {
  /**
   * Logger for logging messages in this configuration class.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CucumberSpringContextConfiguration.class);

  /**
   * Setup method executed before running Cucumber tests.
   */
  @Before
  public void setUp() {
    LOG.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
  }
}
