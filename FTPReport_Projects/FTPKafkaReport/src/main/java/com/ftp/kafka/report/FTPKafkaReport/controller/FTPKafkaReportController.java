package com.ftp.kafka.report.FTPKafkaReport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftp.kafka.report.FTPKafkaReport.consumer.ConsumerCreator;
import com.ftp.kafka.report.FTPKafkaReport.producer.ProducerCreator;

@RestController
@RequestMapping(value="/ftp/report")
public class FTPKafkaReportController {
	
	@GetMapping(value="/producer")
	public void callFTPProducer() {
		ProducerCreator.createProducer();
	}
	
	@GetMapping(value="/consumer")
	public void callFTPConsumer() {
		ConsumerCreator.createConsumer();
	}
	
}
