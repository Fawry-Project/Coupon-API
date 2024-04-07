# Coupon-API

## Overview
This RESTful API for managing coupons and their consumption history. It facilitates operations such as creating, retrieving, updating, and deleting coupons, as well as recording and managing coupon consumption.

## Technologies Used
- Java
- Spring Boot
- RESTful API

## CouponController
- **Get All Coupons**: GET request to retrieve all coupons.
- **Get Coupon by Code**: GET request to retrieve a coupon by its code.
- **Create Coupon**: POST request to create a new coupon.
- **Delete Coupon**: DELETE request to delete a coupon.
- **Update Coupon**: PUT request to update a coupon.
- **Consume Coupon**: POST request to consume a coupon.
- **Cancel Coupon Consumption**: DELETE request to cancel a coupon consumption.

## ConsumptionHistoryController
- **Get All Consumption History**: GET request to retrieve all coupon consumption history.
- **Get Coupon History**: GET request to retrieve coupon consumption history by coupon code.

## How to Use
1. Ensure you have Java and Spring Boot installed on your system.
2. Clone the repository.
3. Build and run the Spring Boot application.
4. Use tools like Postman or cURL to interact with the APIs as described above.
