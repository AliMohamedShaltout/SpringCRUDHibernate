This is a RESTful spring web application that uses postgressql.
Just open the folder with your preferred IDE and then run the MainApp.
I have injected the db with 3 initial employees'values.

There are 4 services/paths that can be used with POSTMAN or Insomnia(which I have been testing on):

1-http://localhost:8090/showEmployees to get all the employees in the db.

2-http://localhost:8090/addEmployee to add an Employee with json or xml format as the body into the DB, just sepcify the name and the position like that: {"position":"Clerk","empName":"Nw Employee"}.

3-http://localhost:8090/updateEmployee to update an employee using its id
as shown : {"position":"Clerk","empName":"Nw Employee","empNo":3}.

4-http://localhost:8090/deleteEmployee/{empNo} to delete an employe using its id in the request URI.