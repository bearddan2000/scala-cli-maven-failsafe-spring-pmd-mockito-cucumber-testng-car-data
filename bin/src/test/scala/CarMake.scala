import io.cucumber.java.en.Then;

import org.testng.Assert;
import org.mockito.InjectMocks;

import example.model.Car;
import example.service.CarServiceImpl;

class CarMake {
  @InjectMocks
  val service = new CarServiceImpl();

  @Then("Car make should be test")
  def checkMake(): Unit  = {
    val car = service.createCar();
    Assert.assertEquals(car.make, "test");
  }
}
