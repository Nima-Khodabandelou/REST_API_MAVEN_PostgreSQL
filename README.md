# REST_API_MAVEN_PostgreSQL
##
Developing API for student management system using Java Spring framework along with Maven and PostgreSQL. 
REST architecture is used for API development.
Hibernate is utilized as ORM and data is persisted in PostgreSQL database.
Also, Maven is chosen for building the project. Steps are as follows:
##
A repository is created on GitHub containing Licence, Readme, and gitignore (for Java) files.
##
The repo is cloned to hard-drive on a specific folder.
##
The Spring JAR file is generated on https://start.spring.io website considering relevant
  dependencies, i.e. Spring Boot Devtools, Spring Web, PostgreSQL Driver, and Spring Data JPA (
  One may add H2 in-memory database dependency instead of external RDMS in order to be
  completely focused on the backend (and frontend if any) section(s) of the project; however,
  this is not the case with current development approach).
##  
The generated JAR file is extracted in the project folder on hard-drive. The project is
pre-configured by Spring Boot under the hood and several files and folders are available 
to start the software development process.
##
Using an appropriate IDE (Intellij Idea in the current approach), the project folder is opened
and the newly added files are committed and pushed to the GitHub repo.
##
Postgres commands:
###
CREATE USER manager WITH LOGIN PASSWORD 'abc123';
###
CREATE DATABASE students;  
###
ALTER DATABASE students OWNER TO manager;
###
INSERT INTO students (first_name, last_name, email) VALUES ('sample first name', 'sample last name', 'sample email');
###
SELECT * FROM students;     





