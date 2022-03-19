import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import org.mockito.InjectMocks;

import example.model.Car;
import example.service.CarServiceImpl;

class CarPrice {
  @InjectMocks
  val service = new CarServiceImpl();

  @When("^Car created$")
  def createCar(): Car = {
     return service.createCar();
  }

  @Then("^Car price should be 0$")
  def checkPrice(): Unit = {
    val car = createCar()
     Assert.assertEquals(car.price, 0);
  }
}
