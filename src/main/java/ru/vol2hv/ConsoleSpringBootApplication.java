package ru.vol2hv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleSpringBootApplication {
	@Autowired
	CityRepository cityRepository;
	private City city = new City();

	public static void main(String[] args) {

		SpringApplication.run(ConsoleSpringBootApplication.class, args);
		System.out.println("Консольное Spring Boot приложение");


	}
	private void test(){
		city.setName("ggg");
		city.setRegion("rrr");
		cityRepository.save(city);
		System.out.println("Данные записаны");
	}
}
