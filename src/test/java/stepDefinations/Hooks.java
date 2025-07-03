package stepDefinations;


import com.aventstack.extentreports.service.ExtentService;

import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {

//	@Before("@DeletePlace")
//	public void beforeScenario() throws IOException
//	{		//execute this code only when place id is null
//		//write a code that will give you place id
//		
//		StepDefination m =new StepDefination();
//		if(StepDefination.place_id==null)
//		{
//		
//		m.add_Place_Payload_with("Shetty", "French", "Asia");
//		m.user_calls_with_http_request("AddPlaceAPI", "POST");
//		m.verify_place_Id_created_maps_to_using("Shetty", "getPlaceAPI");
//		}
//	}
	private static boolean isSystemInfoSet = false;

    @Before
    public void setUpSystemInfo() {
        if (!isSystemInfoSet) {
            ExtentService.getInstance().setSystemInfo("OS", System.getProperty("os.name"));
            ExtentService.getInstance().setSystemInfo("Java Version", System.getProperty("java.version"));
            ExtentService.getInstance().setSystemInfo("User", System.getProperty("user.name"));
            ExtentService.getInstance().setSystemInfo("Browser", ConfigReader.getProperty("browser"));
            isSystemInfoSet = true; // So it won't be added again
        }
    }
}
