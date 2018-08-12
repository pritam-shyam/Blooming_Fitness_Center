SELECT Brand, Count(ItemCode) AS Products
FROM Products
GROUP BY Brand
ORDER BY Brand ASC;

SELECT ItemCode, WholesaleCost, CatalogPrice
FROM Products
WHERE Description LIKE "Aloe Vera*";

SELECT ItemCode, Category, Brand, Description, (CatalogPrice-WholesaleCost) AS SalesMargin
FROM Products;

SELECT ItemCode
FROM Products
WHERE Units="32 oz" OR CatalogPrice BETWEEN 2 AND 10;

SELECT Category, Brand
FROM PRODUCTS
WHERE Category LIKE "???";

SELECT COUNT(Quantity) AS TotalQuantity
FROM TRANSACTION_DETAILS;

SELECT COUNT(DiscountPercentage) AS TotalDiscount
FROM TRANSACTION_DETAILS;

SELECT State, MIN(MemberSince) AS EnrollmentDate
FROM MEMBERS
GROUP BY State;

SELECT State, SUM(IIF([Gender] = 'M',1, 0)) as [Males],SUM(IIF([Gender] = 'F',1, 0)) as [Females]
FROM MEMBERS
WHERE State ="IN" OR State="IL" OR State="IA"
GROUP BY State;

SELECT First, Last, Address, City, State, ZipCode, EmailAddress
FROM Members
WHERE EmailAddress IS NULL;

SELECT State, SUM(CreditLimit) AS TotalCreditLimit
FROM Members
WHERE First LIKE "D*"
GROUP BY State
HAVING COUNT(MemberID) > 20

SELECT ClassID, ClassName, MaxEnrollment
FROM Classes
ORDER BY ClassName DESC;

SELECT ClassID, ClassName, MaxEnrollment
FROM Classes
WHERE StartTime > #8:0:0# AND Location="IN Office";

SELECT ClassID, Date, StartTime, EndTime
FROM Classes
WHERE ClassName LIKE "*Management*";

SELECT MAX(ShippingAndHandling) AS Highest, MIN(ShippingAndHandling) AS Lowest,ROUND(AVG(ShippingAndHandling), 2) AS Average
FROM TAXES_AND_SHIPPING_FEES;