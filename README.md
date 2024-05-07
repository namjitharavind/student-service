# Student Service
# Student Management System
### Student management system is a collection of microservice applications to full fill the school fee collection of multiple schools. All the microservice are easily scalable , fault tolerant and fault resilient. 
## Microservices
- Student Service : https://github.com/namjitharavind/student-service.git
- Fee Service : https://github.com/namjitharavind/fee-service.git
- Purchase Service : https://github.com/namjitharavind/purchase-service.git
- Payment Service : https://github.com/namjitharavind/payment-service.git
- Payment Gateway Service : https://github.com/namjitharavind/payment-gateway-service.git

### Design Patterns 
- Resilience Patterns
  - Timeout
  - Retry
  - Circuit Breaker
- Observability Patterns :
  - Tracing
  - Logging
  - Metrics
## Architecture
![img_6.png](img_6.png)




### 1. Create a Fee and Assign those fee to all students by grade.
![img_5.png](img_5.png)



### 2. Purchase Student fee
#### After the assigning of the fees to students, they will get started seeing their fees. And students can purchase multiple available fees.
![img_7.png](img_7.png)

### 3. Purchase Payment
![img_8.png](img_8.png)

### 4. Payment Gateway Callback to Payment service
####   Since this service is idempotent, even though if the payment service or its downstream application failed, We can call the payment service again manually or from another retry batch service which call exponentially. In this case even if the payment-service is not yet received any callback from payment-gateway-service, payment service will call the gateway service with the transactionId to get the transaction status. Based on this payment service can call its downstream application which purchase service here.
![img_9.png](img_9.png)


### 5. Purchase status api logic in Fee service

![img_10.png](img_10.png)


## Sample API Flow with proper request  and response.


<table>
<tr>
><td> Order </td><td> Name </td <td> HTTP Method </td><td> Request </td><td> Status </td> <td> Response </td>
</tr>
<tr>
<td> 1 </td>
<td> Get all students </td>
<td> GET </td>
<td>  </td>
<td> 200 </td>
<td>

```json
[
  {
    "id": 1,
    "name": "Mahendra Singh Dhoni",
    "grade": "UKG",
    "mobile": "+971 509834777",
    "school": "Gems Legacy"
  },
  {
    "id": 2,
    "name": "Sourav Ganguly",
    "grade": "UKG",
    "mobile": "+971 509834888",
    "school": "Gems Legacy"
  },
  {
    "id": 3,
    "name": "Sachin Tendulkar",
    "grade": "UKG",
    "mobile": "+971 509834999",
    "school": "Gems Legacy"
  },
  {
    "id": 4,
    "name": "Sanju Samson",
    "grade": "UKG",
    "mobile": "+971 509834111",
    "school": "Gems Legacy"
  }
]
```

</td>
</tr>

</table>



