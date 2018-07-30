package generic;

import com.google.gson.annotations.SerializedName;

public class Book {

	@SerializedName("author")
	private String author;

	@SerializedName("published")
	private int published;

	@SerializedName("title")
	private String title;

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setPublished(int published){
		this.published = published;
	}

	public int getPublished(){
		return published;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
}