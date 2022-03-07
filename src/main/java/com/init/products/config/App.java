//package com.init.products.config;
/*
package com.init.products.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.init.products.rest"))
			.paths(PathSelectors.any())
			.build();
	}
	
}
*/
/*
import java.util.List;

// Sample to query in a table
public class App {
	private static void main(String... args) throws Exception {
		BigQuery bigquery = BigQueryOptions.newBuilder().setProjectId
		("infra-falcon-342421")
			.build().getService();
		
		final String GET_WORD_COUNT = 
				"SELECT word, word_count FROM 'bigquery-public-data.samples.shakespeare' WHERE corpus='juliuscaesar' ORDER BY word_count DESC limit 10;";
		
		QueryJobConfiguration queryConfig = 
				QueryJobConfiguration.newBuilder(GET_WORD_COUNT).build();				
		
		Job queryJob = bigquery.create(JobInfo.newBuilder(queryConfig).build());
		queryJob = queryJob.waitFor();
		
		if (queryJob == null) {
			throw new Exception("Job no longer exists");
		}
		if (queryJob.getStatus().getError() != null) {
			throw new Exception(queryJob.getStatus().getError().toString());
		}
		
		System.out.println("word\tword_count");
		TabletResult result = queryJob.getQueryResults();
		for (FieldValueLists row : result.iterateAll()) {
			String word = row.get("word").getStringValue();
			int wordCount = row.get("word_count").getNumericValue().intValue();
			System.out.printf("%s\t%d\n");
		}
	}
}*/