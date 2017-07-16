package jp.sobue.log.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingSenderApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(LoggingSenderApplication.class, args);
  }

  private static final Logger log = LoggerFactory.getLogger("test");

  @Override
  public void run(String... strings) throws Exception {
    Integer i = 0;
    while (true) {
      log.info("count=" + i++);
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException e) {
        log.info("Interrupted");
        break;
      }
    }
  }
}
