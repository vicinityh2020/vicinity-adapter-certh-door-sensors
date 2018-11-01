package vicinity.adapter.VCNT_CERTHDoor_Adapter;

import java.util.ArrayList;

import vicinity.adapter.VCNT_CERTHDoor_Adapter.CallRestfulService_Generic.Variable;

public class EventForwarding {

	public static void publishEvent(String entity, String id){
		ArrayList<Variable> requestHeaderList = new ArrayList<Variable>();
        Variable adapter_id = new Variable("adapter-id", Utils.ADAPTER_ID, "");
        Variable infrastructure_id = new Variable("infrastructure-id", id, "");
        requestHeaderList.add(adapter_id);
        requestHeaderList.add(infrastructure_id);
 		Variable header_json = new Variable("Content-Type", "application/json", "");
 		requestHeaderList.add(header_json);
 		ArrayList<Variable> inputs = new ArrayList<Variable>();
// 		String entity = "{\"event_type\":" + event + ",\n" + 
// 				"	\"timestamp\":\"" + timestamp + "\"\n" + 
// 				"}";
		System.out.println(entity);
		String wsUrl=Utils.AGENT_SERVER + "/agent/events/entry" ;
		//System.out.println(wsUrl);
		String result = CallRestfulService_Generic.callService(wsUrl, "PUT", inputs, entity,false, "", requestHeaderList, "application/json");
		System.out.println(result);
	}
}
