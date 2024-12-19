# Service README

This README provides an overview of the functionality of the service that allows users to interact with the database by adding and retrieving data using a unique identifier (ID). The Postman collection provided offers further details on how to utilize the service.

## Overview
The service supports the following primary operations:

1. **Add Data to Database:** Users can add data to the database via a POST request.
2. **Retrieve Data by ID:** Users can fetch data from the database using a GET request with the unique ID as a parameter.

## Features
- **Hibernate Mapping:** Implements a many-to-one relationship for efficient data modeling.
- **Ease of Use:** Simple endpoints for data addition and retrieval.
- **Postman Collection Integration:** A ready-to-use Postman collection is provided for testing and exploration.

## Prerequisites
- Java Development Kit (JDK)
- IntelliJ IDEA or any preferred IDE
- Database connection setup
- Postman installed for testing APIs

## Endpoints

### 1. Add Data to Database
**Method:** `POST`  
**Endpoint:** `http://localhost:8081/department-employee-relation/save_department`  
**Description:** Adds department and employee data to the database.

#### Request Body Example (JSON):
```json
{
    "depId": 2,
    "depName": "Computer Science",
    "employees": [
        {
            "empId": 4,
            "empName": "Huxly Alex"
        },
        {
            "empId": 6,
            "empName": "Alex John"
        }
    ]
}
```

#### Response Example (JSON):
```json
{
    "success": true,
    "message": "Department and employees added successfully",
    "id": 2
}
```

### 2. Retrieve Data by ID
**Method:** `GET`  
**Endpoint:** `http://localhost:8081/department-employee-relation/getData/{id}`  
**Description:** Retrieves department and employee data from the database using the department ID.

#### Path Parameter:
- `id`: Unique identifier for the department (e.g., department ID).

#### Response Example (JSON):
```json
{
    "success": true,
    "data": {
        "depId": 2,
        "depName": "Computer Science",
        "employees": [
            {
                "empId": 4,
                "empName": "Huxly Alex"
            },
            {
                "empId": 6,
                "empName": "Alex John"
            }
        ]
    }
}
```

## Usage Instructions
1. Clone the repository and set up the project in your IDE (IntelliJ recommended).
2. Ensure the database connection details are correctly configured.
3. Use the Postman collection to test the endpoints:
   - Execute the `POST /save_department` request to add data.
   - Execute the `GET /getData/{id}` request to fetch data.
4. Verify responses to ensure the service is functioning as expected.

## Postman Collection
- The Postman collection contains pre-configured requests for the endpoints.
- It includes examples for request bodies and expected responses.
- Import the collection into Postman to quickly interact with the API.

## Contribution
Feel free to fork this repository and submit pull requests with enhancements or bug fixes.


