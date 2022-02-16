package tr.gov.usom.elasticSearch.Api;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tr.gov.usom.elasticSearch.entity.Kisi;
import tr.gov.usom.elasticSearch.repository.KisiRepository;

@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class ElasticApi {

	private final KisiRepository  kisiRepository;


	
 @PostConstruct
 public void init() {
	 
	 Kisi kisi = new Kisi();
	kisi.setAd("Haydi ");
	kisi.setSoyad("Kodlayalim");
	kisi.setAdres("test");
	kisi.setId("K0001");
  kisi.setDogumTarihi(Calendar.getInstance().getTime());
	kisiRepository.save(kisi);
	 
 }
	
	@GetMapping("/{search}")
	public ResponseEntity<List<Kisi>> getKisi(@PathVariable String search){
		List<Kisi> kisiler =kisiRepository.getByCustomQuery(search);
		return ResponseEntity.ok(kisiler);
		
	}
	
	
	
}
