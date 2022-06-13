# Chuck Norris Jokes 

Chuck Norris Jokes is a Web Application Development Project designed for City Logistics- as Part of recruitment process, to demonstrate my knowledge, 

Tools and Technology Used:
Backend:
Spring Suite tool 4, and Eclipse IDE used
Java 8, Spring Boot, REST, Maven
It is a Java RESTful Spring Boot application that returns Chuck Norris "facts", i.e. random Chuck Norris jokes.
It provides several REST endpoints, including getting all chuck Norris Jokes Categories, Getting Jokes on First Category on Page Load Up, Getting chuck Norris joke based on clicked category link. I started the project with start.spring.io and customized from there.

Frontend:
Visual Studio Code editor

Angular was used to consume the REST API from our Backend java Spring boot server application and display the results in the web page, on port

 To run this project locally go to - > http://localhost:4200/, make sure the angular project is running and also the server side application java spring boot is running on, which will be running on local http://localhost:8080/

Visual Studio Code editor
Angular CLI: 12.2.17
Node: 14.17.6
AngularJs 12.2.16

## Requirements

Chuck Norris Jokes REST API Web Application requires Java 8.  I believe it can be built from source with the
 Maven wrapper already included, requiring no installation of Maven on your system.

## Installation
Chuck Norris Facts is a standalone application that can be run with Java 8 and Angular once downloaded.  It can be downloaded here,

```bash
Backend: -> https://github.com/sundanianza/BackEndchuckNorrisJokes/archive/refs/heads/master.zip

or 
```bash
git clone https://github.com/sundanianza/BackEndchuckNorrisJokes.git

```
Frontend: -> 
```
Or with this command:

```bash
git clone https://github.com/sundanianza/AngularChuckJokes.git
```
or
```
https://github.com/sundanianza/AngularChuckJokes/archive/refs/heads/master.zip 
```

## Usage

To build from source use
```bash
./mvnw clean package
```


It is a completely self-contained Java Spring Boot application, requiring no other software.

to test the rest API , i used POSTMAN , with below end points

http://localhost:8080/  -> to GET Jokes on first category on page load up
e.g 
 ```json
{ "joke": "   "value": "Chuck Norris can set ants on fire with a magnifying glass. At night.",
    "icon_url": "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
    "updated_at": "2020-01-05 13:42:19.104863"

}



http://localhost:8080/complete  -> to get All Chuck norris Category

e.g. 

[
    "animal",
    "career",
    "celebrity",
    "dev",
    "explicit",
    "fashion",
    "food",
    "history",
    "money",
    "movie",
    "music",
    "political",
    "religion",
    "science",
    "sport",
    "travel"
]
http://localhost:8080/onclick  -> to get a joke based on user clicked category

e.g {
 "value": "Each hair in Chuck Norris's beard contributes to make the world's largest DDOS.",
    "icon_url": "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
    "updated_at": "2020-01-05 13:42:19.324003"
}




## License
[BSD-3-Clause](https://choosealicense.com/licenses/bsd-3-clause/)
