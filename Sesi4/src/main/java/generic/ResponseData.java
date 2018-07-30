package generic;

import com.google.gson.annotations.SerializedName;

public class ResponseData<T> {

	@SerializedName("status_code")
	private int statusCode;

	@SerializedName("data")
	private T data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	public int getStatusCode(){
		return statusCode;
	}

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return data;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}
}