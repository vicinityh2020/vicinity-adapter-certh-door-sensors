package vicinity.adapter.VCNT_CERTHDoor_Adapter;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vicinity.adapter.VCNT_CERTHDoor_Adapter.CallRestfulService_Generic.Variable;



@SpringBootApplication
public class VcntCerthDoorSensorAdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(VcntCerthDoorSensorAdapterApplication.class, args);
		ArrayList<Variable> requestHeaderList = new ArrayList<Variable>();
		String entity = ThingDescription.readTDFile();
		System.out.println(entity);
		String wsUrl=Utils.AGENT_SERVER + "/agent/objects";
		//System.out.println(wsUrl);
		ArrayList<Variable> inputs = new ArrayList<Variable>();
		String result = CallRestfulService_Generic.callService(wsUrl, "POST", inputs, entity, false, "", requestHeaderList,"application/json");
		System.out.println(result);
	}
}
