<h2>Overview</h2>
<p>This is a pet project and a playground for me where i can implement any technologies and try different things</p>

<p>Menu app is a microservice where different domain business is seperated like Cart and Inventory.Those services can communicate through Messaging queue and services are accessible through Proxy service which is Zuul API Gateway. All services such as zuul api gateway, cart and inventory are registered in Eureka Discovery.</p>


<h2>Architecture</h2>

![alt text](https://github.com/eallanjoseph123/menu-app-microservice/blob/master/docs/app2.png?raw=true)

Tech:

1. Java 8.
2. SpringBoot (Netflix OSS Zuul and Discovery).
3. Docker.
4. Postgre.
5. MongoDb (In progress).
6. Redis cache.
7. Rabbit MQ (In Progress)
