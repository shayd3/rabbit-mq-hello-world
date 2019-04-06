# RabbitMQ hello-world Example
Research example of RabbitMQ and how message brokers work. Will expand as research continues!

# TODO
* Work Queues
* Publish/Subscribe
* Routing
* Topics
* RPC

### How to run
Build application

`./mvnw clean package`

Run Consumer
```
# consumer
 java -jar target/rabbit-mq-hello-world*.jar --spring.profiles.active=hello-world,receiver
```
Run Sender
```
# sender
java -jar target/rabbit-mq-hello-world*.jar --spring.profiles.active=hello-world,sender
```