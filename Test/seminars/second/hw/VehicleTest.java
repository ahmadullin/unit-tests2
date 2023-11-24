import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testIsVehicle() {
// Проверяем, что Car и Motorcycle являются экземплярами класса Vehicle
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Fat Bob", 2019);

        Assertions.assertTrue(car instanceof Vehicle);
        Assertions.assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    public void testNumWheels() {
// Проверяем, что у Car и Motorcycle количество колес соответствует ожидаемому значению
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Fat Bob", 2019);

        Assertions.assertEquals(4, car.getNumWheels());
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testSpeed() {
// Проверяем, что у Car и Motorcycle скорость соответствует ожидаемому значению
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Fat Bob", 2019);

        Assertions.assertEquals(0, car.getSpeed(), 0);
        Assertions.assertEquals(0, motorcycle.getSpeed(), 0);
    }

    @Test
    public void testTestDrive() {
// Проверяем, что после тестового вождения скорость меняется
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Fat Bob", 2019);

        car.testDrive();
        motorcycle.testDrive();

        Assertions.assertNotEquals(0, car.getSpeed());
        Assertions.assertNotEquals(0, motorcycle.getSpeed());
    }

    @Test
    public void testPark() {
// Проверяем, что после парковки скорость меняется на 0
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Fat Bob", 2019);

        car.park();
        motorcycle.park();

        Assertions.assertEquals(0, car.getSpeed());
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}