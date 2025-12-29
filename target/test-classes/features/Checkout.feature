Feature: place the order for products

@PlaceOrder

Scenario Outline: Search experience for product search in both home and offer page

Given User is on Greencart Landing page
When user searched with Shortname <Name> extract actual name of product
And  Added "3" items of the selected product to cart
Then user proceeds to Checkout and validate the <Name> item in checkout page
And  Verify user ability to enter promo code and place the order

Examples:
| Name |
| Tom |










