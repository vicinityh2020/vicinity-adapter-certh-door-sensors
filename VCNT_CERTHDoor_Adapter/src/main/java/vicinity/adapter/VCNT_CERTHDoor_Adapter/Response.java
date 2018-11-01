package vicinity.adapter.VCNT_CERTHDoor_Adapter;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("message")
	private String message;

	public Response() {
	}

	public Response(String message) {
		this.message = message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	@XmlElement
	public String getmessage() {
		return message;
	}
}
