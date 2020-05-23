# Covid19 News
> Covid19 news in a university project that creates a web application which provides news for Covid19.


## Setup
#### Prerequisites
1. Java 8 installed
1. Maven installed

#### Run
1. Clone the repository
1. run `mvn spring-boot:run`
1. Call `localhost:8081/news` &rarr; you will see welcome screen
> keep in mind that the application's DB saved in test.db (in this repository), if you want to use in memory DB change the value of `spring.datasource.url` in application.properties to `jdbc:h2:mem:testdb`)

## Operations
#### Endpoints
You can see all available endpoint by going to `localhost:8081/swagger-ui.html`
The main endpoint is `localhost:8081/news`

![asd](/docs/NewEndpoint.PNG)
####
You can start the application on different port than 8081, just add `-Dserver.port=<port>` when you run with maven

#### How to fill db
you can execute `curl` queries to add new entities, for example:

`curl -X POST "http://localhost:8081/news" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"author\": \"test\", \"keywords\": [ \"asd\" ], \"paragraphs\": [ \"test\" ], \"title\": \"test\"}"` 

#### Used technologies
- Spring Boot 2.1.1.RELEASE
- H2 database