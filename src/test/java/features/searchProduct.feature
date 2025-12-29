Feature: Search and place the order for products
@OfferPage
Scenario Outline: Search experience for product search in both home and offer page

Given User is on Greencart Landing page
When user searched with Shortname <Name> extract actual name of product
Then user searched for <Name> shortname in offer page
And validated product name in offer page matches with Landing page

Examples:
| Name |
| Tom |
| Beet |









