package com.demo.kafka.producer.producerconfiguration;

import java.util.Date;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

import com.demo.kafka.producer.model.TimeInfo;

@Configuration
@EnableBinding(Source.class)
public class Producer {

	@Bean
	@InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "10000", maxMessagesPerPoll = "1"))
	public MessageSource<TimeInfo> timerMessageSource() {
		return () -> MessageBuilder.withPayload(new TimeInfo(new Date().getTime()+"","Label")).build();
	}
}
