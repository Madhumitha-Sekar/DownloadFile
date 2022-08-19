package com.ftp.kafka.report.FTPKafkaReport.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerCreator {

	public static void createProducer() {
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
//				kafkaProducer.send(new ProducerRecord<>("devglan-test", Integer.toString(i), "test message - " + i));
				kafkaProducer.send(new ProducerRecord<>("devglan-test", "test message - " + i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			kafkaProducer.close();
		}
	}

}
