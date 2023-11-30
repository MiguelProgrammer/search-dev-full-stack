# Avanade Challenge
## Project search-dev

# <img src="https://devkico.itexto.com.br/wp-content/uploads/2014/08/spring-boot-project-logo-300x270.png" width="25"> Spring Boot | <img src="https://www.alura.com.br/assets/api/cursos/angular-explorando-framework.svg" width="25">  Angular

  Challenge project, the project here aims to practice some of the activities carried out as a back-end developer. The project is a web platform, where you can register an analyst, edit, list and delete, there are basic procedures such as ID already inserted among other business rules created by me, the idea of this platform is to search the database for analysts inserted in the base and be able to search for talent by area or technology, such as Java, Front, DevOps, Angular, SI... You could implement a messaging service to publish as soon as an analyst from that area and technology was added or deleted, the project itself was built using the following technologies; 

<b>Back</b>
* Spring boot
* Banco de dados h2
* Lombok
* Swagger-ui
* Postman

<b>Front</b>
* Angular CLI: 14.0.7
* Node: 16.15.0
* Npm 8.5.5 
* Bootstrap
* Ngx-Bootstrap
* typescript 4.7.4
* Css

<b>API DOCS - OpenAPI</b>
* Doc <br><img src="https://i.imgur.com/1lA9WNY.png" width="800">

  
  As my work is back-end, even though I have never used it yet, I will use a basic crud with Angular, just to list the services available via rest services, the documentation for the rest services were created via springdoc-openapi, with it it is possible to create the documentation automatically, accessible via uri, and also when creating service documentation in this way, our project receives interfaces created automatically by our yaml file, so it is possible to use a concrete class that is responsible for implementing this interface, for me that I had only acted in the opposite way, creating the controls and then the documentation was very different, today I prefer to work with this concept that when thinking about less is more, this one serves much better.

<b>Called Services Rest on Postman</b>
<img src="https://i.imgur.com/cUIglVC.png" width="800">
* Create <br><img src="https://i.imgur.com/QmMhhYf.png" width="800">
* Create Exception <br><img src="https://i.imgur.com/eUXG6GC.png" width="800">
* Get <br><img src="https://i.imgur.com/ErrisSz.png" width="800">
* Get Exception <br><img src="https://i.imgur.com/OQdVh0b.png" width="800">
* Update <br><img src="https://i.imgur.com/hMjy9KQ.png" width="800">
* Get after Update <br><img src="https://i.imgur.com/bY4rWWS.png" width="800">
* Update Exception <br><img src="https://i.imgur.com/rNrV86r.png" width="800">
* Delete <br><img src="https://i.imgur.com/F8YIZLP.png" width="800">
* Delete Exception <br><img src="https://i.imgur.com/iPtqXp6.png" width="800">

<b>BFF Front</b> <br>
  * Home <br><img src="https://i.imgur.com/nKufV25.png" width="800"><br>
  * Create <br> <img src="https://i.imgur.com/IJSx4GW.png" width="800"><br>
  * List <br> <img src="https://i.imgur.com/lLmXJWt.png" width="800"><br>
  * Update and Delete <br><img src="https://i.imgur.com/XuAxllp.png" width="800"><br>

<b>Back</b> The back-end was created following the best pratices as clean code, clean architecture. Exist improvements to be made with messages more clean, Exception handlers for manager all exceptions in a single place, more validations as bean validations, security with jwt and security in api docs <br>
<img src="https://i.imgur.com/DxQQttC.png" width="800">
