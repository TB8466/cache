package cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);

        // --TEST--
        /*int userId =1;
        Cache userCache = new Cache();

        userCache.has(userId);

        userCache.set(userId, "super long string");

        userCache.has(userId);

        userCache.get(userId);

        userCache.delete(userId);

        userCache.has(userId); */

    }

}