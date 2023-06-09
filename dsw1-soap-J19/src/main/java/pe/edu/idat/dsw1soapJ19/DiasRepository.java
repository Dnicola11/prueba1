package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dias;
import io.spring.guides.gs_producing_web_service.Traductor;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository{
    
    private static final Map<String, Dias> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dias lunes = new Dias();
		lunes.setName("Lunes");
		lunes.setCurrency(Traductor.Monday);

		dias.put(lunes.getName(), lunes);

		Dias martes = new Dias();
		martes.setName("Martes");
		martes.setCurrency(Traductor.Tuesday);

		dias.put(martes.getName(), martes);

		Dias miercoles = new Dias();
		miercoles.setName("Miercoles");
		miercoles.setCurrency(Traductor.Wednesday);

		dias.put(miercoles.getName(), martes);
	}

	public Dias findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return dias.get(name);
	}


}
