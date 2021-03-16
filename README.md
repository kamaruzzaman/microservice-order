This is a demo project to demonstrate the Microservice Architecture development using Java and Spring Boot project.
It also demonstrates packaging the jar file into OCI container image, tagging and publishing the container image into
the Azure Container Registry (ACR), and finally deploy the container image into the Azure Kubernetes Service (AKS) using
the tool eksctl.

The application is a headless Backend application developed using the Spring Boot framework. As a data store, MongoDB Atlas
for AWS is used. Also Amazon is used as the public cloud provider.

It is a simple CRUD application to model Order handling of an E-commerce shop. To run this application, first the Customer 
Microservice from: https://github.com/kamaruzzaman/microservice-customer should also run. 

Together with the Customer Microservice, it demonstrates the Microservice communication using REST API. 

* Run the application locally:
  ./gradlew bootRun

The Swagger UI is available at:
http://localhost:8080/order/swagger-ui/

The Swagger JSON file is available at:
http://localhost:8080/order/v2/api-docs

The backend is available at:
http://localhost:8080/order/

* Create the OCI compliant Docker Image:
  sudo ./gradlew bootBuildImage

* Run the Docker Image:
  docker run -p8080:8080 docker.io/library/microservice-order:1.0.0-SNAPSHOT
