package com.example.mydemo.demo;

import com.example.mydemo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/kafka")
public class DemoApplication extends SpringBootServletInitializer {
/*
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	@Autowired
	private KafkaTemplate<String, String> stringKafkaTemplate;

	private static final String TOPIC = "Kafka_Example";
	private static final String TOPIC1 = "Kafka_Sample";

	@GetMapping("/greet/{name}")
	public String greeting(@PathVariable String name) {
		String msg = "Hello "+ name + " ! Welcome to my docker app !!!!";
		kafkaTemplate.send(TOPIC, new User(name, "Tech", 12000L));
		stringKafkaTemplate.send(TOPIC1, "welcome "+name);
		return "publish success";
	}
*/
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder.sources(DemoApplication.class);
}

@GetMapping("/greet/{name}")
public String greeting(@PathVariable String name) {
	String msg = "Hello "+ name + " ! Welcome to my docker app !!!!";
	return msg;
}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
