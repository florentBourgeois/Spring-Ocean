package fr.CCI.Java.Oceanfront.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.CCI.Java.Oceanback.model.Poisson;
import fr.CCI.Java.Oceanfront.bean.EspeceBean;
import fr.CCI.Java.Oceanfront.bean.PoissonBean;

@FeignClient(name = "Ocean-back", url="localhost:9900")
public interface MicroserviceOceanProxy {

	
	// especes
	@GetMapping(value= "/especes")
	public List<EspeceBean> listEsepeces();
	
	@GetMapping(value= "/especes/{id}")
	public EspeceBean especeByID(@PathVariable int id);

	@DeleteMapping(value= "/especes/{id}")
	public List<EspeceBean> delEspece(@PathVariable Integer id);

	
	//poissons
	@GetMapping(value= "/poissons")
	public List<PoissonBean> listPoisson();
	
	@GetMapping("/especes/{especeID}/poissons")
    public List<PoissonBean> getAllPoissonsByEspeceId(@PathVariable (value = "especeID") Integer especeID);
	
	@GetMapping(value= "poissons/{poissonID}/espece")
	public EspeceBean getPoissonEspece(@PathVariable (value = "poissonID") int poissonID);
	
	
	@PostMapping(value = "/poissons")
	public PoissonBean createPoisson(@RequestBody PoissonBean poisson);
	
	
	
}
