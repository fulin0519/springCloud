package com.springcloud.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.hutool.core.lang.UUID;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
public class PaymentController {
	
	
	
	@Value("${server.port}")
	private String serverPort;
	

	@RequestMapping(value = "/payment/consul")
	public String paymentConsul() {
		return "springCloud with consul:"+ serverPort+"\t"+UUID.randomUUID().toString();
	}
	
	


    

	
	
}
