

### 2. Search for Suppliers
Endpoint: GET /api/supplier/search

#### Parameters:

- 'location' : The Location of the supplier.
- 'natureOfBusiness': The nature Of Business of the supplier.
- 'manufacturingProcesses': A list of manufacturing processes.

## Features

- Create Supplier: Add a new supplier to the system.

- Search Suppliers: Retrieve a list of suppliers based on location, nature of business, and manufacturing processes.

- Security: The API is secured with Basic Authentication.

- Pagination: Supports pagination for search results.

- Input Validation: Ensures valid data is submitted to the API.



## Prerequistes

- Java 17 

- Maven 3.9.9

- Spring Boot 3.3.2


## Getting Started

Clone Repository

git clone https://github.com/your-username/marksharks-assignment.git
cd marksharks-assignment


## Build Project

 mvn clean install

## Run the Application

mvn spring-boot:run

When You Started the Application 

## Accessing the Api 

Authentication 

 The Api is Secured With Basic Authentication. Use the following credentials to access the API: 

- username: 'admin' 
- password: 'MakerSharks@123

## Endpoints

### 1 Create a Supplier 

Endpoint: 'POST /api/supplier/add' 

#### Request Body:
 
{
  "companyName": "ABC Corp",
  "website": "https://www.abccorp.com",
  "location": "New York",
  "natureOfBusiness": "Manufacturing",
  "manufacturingProcesses": ["Process1", "Process2"]
}

#### CURL Command:
curl -u admin:<MakerSharks@123> -X POST http://localhost:8080/api/supplier/add \
-H "Content-Type: application/json" \
-d '{
  "companyName": "ABC Corp",
  "website": "https://www.abccorp.com",
  "location": "New York",
  "natureOfBusiness": "Manufacturing",
  "manufacturingProcesses": ["Process1", "Process2"]
}'

### 2. Search for Suppliers
Endpoint: GET /api/supplier/search

#### Parameters:
- 'location': The location of the supplier.
- 'natureOfBusiness': The nature of business of the supplier.
- 'manufacturingProcesses': A list of manufacturing processes.

#### Example Request:

curl -u admin:<MakerSharks@123> -X GET "http://localhost:8080/api/supplier/search?location=New%20York&natureOfBusiness=Manufacturing&manufacturingProcesses=Process1,Process2"


### Pagination

#### To handle pagination, include the page and size parameters in your search request:

curl -u admin:<MakerSharks@123> -X GET "http://localhost:8080/api/supplier/search?location=New%20York&natureOfBusiness=Manufacturing&manufacturingProcesses=Process1,Process2&page=0&size=10"


### Postman Configuration

#### 1 Open Postman and create a new request.

#### 2 Set the request method to GET or POST as needed.

#### 3 Set the URL to http://localhost:8080/api/supplier/add or http://localhost:8080/api/supplier/search.

#### 4 Go to the Authorization tab.

#### 5 Select Basic Auth.

#### 6 Enter the username as user and the generated password from your console.

#### 7 For POST requests, go to the Body tab, select raw, and choose JSON from the dropdown.

#### 8 Add the JSON body for the request.

#### 9 Send the request.

### TODOs and Future Enhancements
- #### Advanced Security :  Implement OAuth2 or JWT for more secure authentication.
- #### Role-Based Access Control: Add roles and permissions for different user types.
- #### API Documentation: Integrate Swagger for API documentation.
- #### Unit Tests: Implement comprehensive unit tests for the service and controller layers.


### Contact
For questions or feedback, please reach out to sushantsonawane2151@example.com.

