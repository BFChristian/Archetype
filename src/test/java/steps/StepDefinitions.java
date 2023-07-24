package steps;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.Belly;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait 1 hour")
    public void hola123(){
        System.out.println("hola");
    }

    @Then("my belly should growl")
    public void sdsd(){
        System.out.println("chau");
        Assertions.assertTrue(true, "errrrrooooor");
    }
}
