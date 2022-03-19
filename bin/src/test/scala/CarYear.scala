import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.mockito.InjectMocks;

import example.model.Car;
import example.service.CarServiceImpl;

class CarYear {
  @InjectMocks
  val service = new CarServiceImpl();

  @Then("Car year should be 0")
  def checkYear(): Unit = {
    val car = service.createCar();
    Assert.assertEquals(car.year, 0);
  }
}
