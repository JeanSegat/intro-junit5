package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all.....");
    }
    @BeforeEach
    void setUp() {
        System.out.println("In before each.... ");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Jean"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each.... ");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all....");
    }
}