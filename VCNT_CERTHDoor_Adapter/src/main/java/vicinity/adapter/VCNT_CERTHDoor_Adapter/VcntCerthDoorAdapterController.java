package vicinity.adapter.VCNT_CERTHDoor_Adapter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class VcntCerthDoorAdapterController {

	@RequestMapping(value = "/occupancy", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Response generateResponseEvent(@RequestBody Measurement request) throws Exception {
		System.out.println("Entered POST method");
		//System.out.println(request.toString());
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonInString = mapper.writeValueAsString(request);
			System.out.println(jsonInString);
			EventForwarding.publishEvent(jsonInString, request.getID());
		} catch (Exception e) {
			Response res = new Response("Failed");
			return res;
		}
		Response res = new Response("Received");
		return res;

	}
}
