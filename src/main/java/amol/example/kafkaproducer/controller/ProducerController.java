package amol.example.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import amol.example.kafkaproducer.service.MessageService;

@Controller
public class ProducerController {

	@Autowired
	private MessageService service;
	
	
	@GetMapping("/send")
	public String show(@RequestParam String msg)
	{
		service.sendMessage(msg);
		
		return "message is = "+msg;
		
	}
	
}
