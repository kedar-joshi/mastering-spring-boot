package config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application
{
	private static final Logger logger = LogManager.getLogger(Application.class);

	/**
	 * Application starting point.
	 *
	 * TODO Parent context and child context ?
	 *
	 * @param args program arguments
	 */
	public static void main(String[] args)
	{
		// Creating spring application
		final SpringApplication application = new SpringApplication(Application.class);
		application.setAddCommandLineProperties(true); // Enable command line properties

		// Creating application context and starting the application
		final ConfigurableApplicationContext applicationContext = application.run(args);
	}
}
