package StockItemRequest.StockItemRequestJSC;


import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
@EnableDiscoveryClient

public class StockItemRequestJscApplication {

	@Autowired
	private RabbitTemplate rabbitTemplate;


	public static void main(String[] args) {


		SpringApplication.run(StockItemRequestJscApplication.class, args);
	}








}
