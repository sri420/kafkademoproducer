cd F:\kafka_2.11-0.10.1.0\bin\windows

zookeeper-server-start.bat ../../config/zookeeper.properties

kafka-server-start.bat ../../config/server.properties

kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092

kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092
kafka-console-producer.bat -topic quickstart-events --bootstrap-server localhost:9092
kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
