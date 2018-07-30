package generic;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

public class Author{

	@SerializedName("address")
	private String address;

	@SerializedName("name")
	private String name;

	@SerializedName("email")
	private String email;

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
}