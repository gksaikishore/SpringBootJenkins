package com.example.mydemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaTest {

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

    @GetMapping("/greet/{name}")
    public String greeting(@PathVariable String name) {
        String msg = "Hello "+ name + " ! Welcome to my docker app !!!!";
        return msg;
    }
}
