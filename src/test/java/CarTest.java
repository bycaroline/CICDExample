import org.carolineeklund.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    //test prop

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car(0, "red");

    }

    @Test
    void bilstopp() {
        Assertions.assertEquals(car.getVelocity(), 0);
    }

    @Test
    void bilaccelerarar() {
        car.accelerate(10);
        Assertions.assertEquals(car.getVelocity(), 10);

        car.accelerate(20);
        Assertions.assertEquals(car.getVelocity(), 30);
    }

    @Test
    void bilsaktarner() {
        car.accelerate(-20);
        Assertions.assertEquals(car.getVelocity(), -20);
    }
}
