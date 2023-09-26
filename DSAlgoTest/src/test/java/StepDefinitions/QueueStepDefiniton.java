package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.QueuePage;
import Utilities.Loggerload;

public class QueueStepDefiniton {
	QueuePage queue = new QueuePage();
	
	@Given("User click on Get started button in Queue module")
	public void user_click_on_get_started_button_in_queue_module() {
		Loggerload.info("User clicks on getstarted button on Linked List module");
		queue.click_getstartedqueue();
	}

	@When("User click on Implementation of Queue in Python")
	public void user_click_on_implementation_of_queue_in_python() {
		Loggerload.info("User click on Implementation of Queue in Python");
		queue.click_ImplemenationofQue();
	    
	}
	//tag3
	@Given("User click on Implementation using collections text")
	public void user_click_on_implementation_using_collections_text() {
		Loggerload.info("User click on Implementation using collections text");
		queue.click_ImpleUSingCollections();
	}
	//tag5
	@Given("User click on Implementation using array text")
	public void user_click_on_implementation_using_array_text() {
		Loggerload.info("User click on Implementation using array text"); 
		queue.click_ImplementationUsingArray();
	}
	//tag7
	@Given("User click on Queue Operations text")
	public void user_click_on_queue_operations_text() {
	    
		Loggerload.info("User click on Queue Operations text"); 
		queue.click_QueueOpeations();
	}
	//tag9
	@Given("The user is in Queue operations page")
	public void the_user_is_in_queue_operations_page() {
		Loggerload.info("User click on Queue Operations text"); 
		queue.click_QueueOpeations();
	}

	@When("User click on practice questons in Queue operations page")
	public void user_click_on_practice_questons_in_queue_operations_page() {
		Loggerload.info("User click on Queue Operations text"); 
		queue.click_practiceQuesInque();
	}

	@Then("Navigate back to Queue operations page")
	public void navigate_back_to_queue_operations_page() {
		Loggerload.info("Navigate back to Queue operations page");
		queue.navigateBackqueue();
	}

}