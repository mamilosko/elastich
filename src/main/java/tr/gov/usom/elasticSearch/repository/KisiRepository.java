package tr.gov.usom.elasticSearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import tr.gov.usom.elasticSearch.entity.Kisi;


public interface KisiRepository extends ElasticsearchRepository<Kisi,String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"ad\": \"?0\"}}]}}")
    List<Kisi> getByCustomQuery(String search);
	
}
