package tr.gov.usom.elasticSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class ElastichSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElastichSearchApplication.class, args);
	}

}
