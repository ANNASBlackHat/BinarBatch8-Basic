package generic;

import com.google.gson.Gson;

public class APIManager {
    String bookJson = "{\n" +
            "\t\"status\": true,\n" +
            "\t\"status_code\": 1,\n" +
            "\t\"message\": \"success\",\n" +
            "\t\"data\": {\n" +
            "\t\t\"title\": \"Pemrograman Java\",\n" +
            "\t\t\"author\": \"Andy\",\n" +
            "\t\t\"published\": 2016\n" +
            "\t}\n" +
            "}";

    String authorJson = "{\n" +
            "\t\"status\": true,\n" +
            "\t\"status_code\": 1,\n" +
            "\t\"message\": \"success\",\n" +
            "\t\"data\":  {\n" +
            "\t\t\"name\": \"Andy\",\n" +
            "\t\t\"email\": \"Andy@gmail.com\",\n" +
            "\t\t\"address\": \"Yogyakarta\"\n" +
            "\t}\n" +
            "}";

    public Book getBook(){
        ResponseData<Book> responseBook = new Gson().fromJson(bookJson, ResponseData.class);
        Book data = responseBook.getData();
        System.out.println("Title : "+data.getTitle());
        return data;
    }

    public Author getAuthor(){
        ResponseData<Author> responseBook = new Gson().fromJson(bookJson, ResponseData.class);
        Author data = responseBook.getData();
        System.out.println("Name : "+data.getName());
        return data;
    }
}
