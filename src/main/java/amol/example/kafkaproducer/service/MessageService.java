package amol.example.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;



@Component
public class MessageService {

	@Autowired
	private KafkaTemplate<String, String> kt;
	
	@Value("${my-topic-name}")
	private String topic;					// taking topic name from properties file
	
	public void sendMessage(String msg)
	{
		kt.send(topic, msg);
		
		System.out.println("message send from producer");
	}
	
}
