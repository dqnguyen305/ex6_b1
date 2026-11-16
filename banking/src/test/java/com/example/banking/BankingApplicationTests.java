package com.example.banking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.datasource.url=jdbc:h2:mem:banking-test",
        "spring.datasource.driver-class-name=org.h2.Driver"
})
class BankingApplicationTests {

    @Test
    void contextLoads() {
    }

}
