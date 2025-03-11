# Kafka Producer 
A Kafka producer is a client application or service that sends records (messages) to Kafka topics. It writes data to Kafka by publishing messages to specified topic partitions, which can then be consumed by Kafka consumers.  
This project has kafka producer implementation in Java.

## Prerequisite
- Java 17
- Spring Web dependency
- Spring Kafka dependency
- Zookeeper
- Kafka 

## Installation and Usage
 Make sure that kafka is running locally. Follow the steps mentioned in [Github](https://github.com/VrushaliJalgaonkar/kafka-cli-practice)  

### 1. Clone the Repository

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/VrushaliJalgaonkar/kafka-producer.git
```

### 2. Navigate to the Project Directory

Move into the project directory:

```bash
cd kafka-producer
```

### 3. Run application using,
```bash
./mvnw spring-boot:run
```
### 4. Open Postman and select Get request type
### 5. Postman curl 
```bash
http://localhost:9191/producer-app/publish/user
```
**Expected output**
```bash
Message published successfully...
```

