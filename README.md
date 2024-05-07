# Student Service

### Student are the main customer of a student management system.

![img_6.png](img_6.png)


### 1. Create a Fee and Assign those fee to all students by grade.
![img_5.png](img_5.png)



### 2. Purchase Student fee
#### After the assigning of the fees to students, they will get started seeing their fees. And students can purchase multiple available fees.
![img_7.png](img_7.png)

### 3. Purchase Payment
![img_8.png](img_8.png)

### 4. Payment Gateway Callback to Payment service
####   Since this service is idempotent, even though if the payment service or its downstream application failed, We can call the payment service again manually or from another retry batch service which call exponentially
![img_9.png](img_9.png)


### 5. Purchase status api logic in Fee service

![img_10.png](img_10.png)

