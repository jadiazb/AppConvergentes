package co.sg_sst.jpa.exception;

public class SignInResponse {

	public enum statusCode {ERROR,OK};

	private String message;
	private statusCode code;

	public SignInResponse() {
	}

	public SignInResponse(String message, statusCode code) {
		this.message = message;
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public statusCode getCode() {
		return code;
	}
	public void setCode(statusCode code) {
		this.code = code;
	}
	
	

}
