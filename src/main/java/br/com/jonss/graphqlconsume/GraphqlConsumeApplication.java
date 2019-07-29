package br.com.jonss.graphqlconsume;

import br.com.jonss.graphqlconsume.domain.FindAuthor;
import br.com.jonss.graphqlconsume.domain.GraphqlData;
import br.com.jonss.graphqlconsume.feign.Swapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GraphqlConsumeApplication implements CommandLineRunner {

	@Autowired
	private Swapi swapi;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlConsumeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		GraphqlData data = swapi.getData("query {\n" +
				"  findAuthor(email: \"douglas.adams@hitchhiker.co.uk\") {\n" +
				"    email\n" +
				"    fullname\n" +
				"    books {\n" +
				"      title\n" +
				"      isbn\n" +
				"    }\n" +
				"  }\n" +
				"}");

		FindAuthor author = data.getData().getFindAuthor();

		System.out.println("Author: " + author.getFullname());

		author.getBooks().forEach(s -> System.out.println("Title: " + s.getTitle() + "- Isbn: " + s.getIsbn()));
	}
}
