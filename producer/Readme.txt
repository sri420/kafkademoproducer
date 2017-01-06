cd F:\kafka_2.11-0.10.1.0\bin\windows

zookeeper-server-start.bat ../../config/zookeeper.properties

kafka-server-start.bat ../../config/server.properties

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

kafka-topics.bat --list --zookeeper localhost:2181

kafka-console-producer.bat --broker-list localhost:9092 --topic test

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning