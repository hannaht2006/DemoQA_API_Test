#DemoQA Application Project Test

##Goal of The Project

1. Create a framework that can be run through terminal and create a nice HTML report
2. Practice core components and Response in API Testing

### pom.xml file

*Which dependency need?
- RestAssured
- Cucumber-java
- Cucumber-Junit
- Object Mapper(Jacson, Gson)
- Selenium, Boni-Garcia(No need for API testing; only for UI testing)
* Which plugin for to be able to run from terminal our code?
### API Tests:
* Two important topic to comprehend this type testing
- How to send out Request?
BaseUrl + endPoint (Path parameters and/or query parameters)
 Headers info, content type, Authorizations
request type: GET, POST, PUT, PATCH, DELETE
Might has a Request body
- How to read and verify Response?
Status code
Depending on the requirements, we will verify headers and body
Body Verification: Path, jsonPath, POJO, Java Classes, HamcrestMatcher

De-Serialization : JSON --> Java codes (Custom Classes or collections)

as() -->method: Object Mappers

##how to Run the Project

1. Install Maven locally
2. Java JDK Installed
3. Git.exe Installed
4. Open the folder of project and start terminal inside the folder
5. run command "mvn clean verify"