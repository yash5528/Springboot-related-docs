# spring-boot-axon
Event Sourcing with Spring Boot and Axon



Calling the API
------------------

1. With the database configured we are now able to call our REST API to verify that the application works as expected. First, let’s create a new account:

curl --data {\"name\":\"Paul\"} -H "Content-Type: application/json" localhost:8080/accounts

The response is the account id, e.g. 725a33ec-6e37-4dff-8fa2-7c79a004263e


2. With the new account you can deposit money:
curl -X PUT --data 10 -H "Content-Type: application/json" localhost:8080/accounts/725a33ec-6e37-4dff-8fa2-7c79a004263e/balance

and withdraw money:

curl -X PUT --data -10 -H "Content-Type: application/json" localhost:8080/accounts/725a33ec-6e37-4dff-8fa2-7c79a004263e/balance

Both requests will only return HTTP Status 202 and no body. At the moment there is no way to request the current balance of an account.

3. It is also possible to verify that you cannot overdraw the account:

curl -X PUT --data -1000 -H "Content-Type: application/json" localhost:8080/accounts/725a33ec-6e37-4dff-8fa2-7c79a004263e/balance

This will result in error with the message: Insufficient balance.

4. And finally you can close the bank account:
 	
curl -X DELETE localhost:8080/accounts/725a33ec-6e37-4dff-8fa2-7c79a004263e


