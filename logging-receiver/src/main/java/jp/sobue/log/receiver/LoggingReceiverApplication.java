package jp.sobue.log.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingReceiverApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(LoggingReceiverApplication.class, args);
  }

  private static final Logger log = LoggerFactory.getLogger(LoggingReceiverApplication.class);

  @Override
  public void run(String... strings) throws Exception {
    while (true) {
      try {
        log.info("Running...");
        Thread.sleep(1000L);
      } catch (InterruptedException e) {
        log.info("Interrupted");
        break;
      }
    }
  }
}
