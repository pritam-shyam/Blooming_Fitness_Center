SELECT DISTINCT Employees.EmployeeID, Employees.Last, Employees.First
FROM Employees, Transaction_Details, Transactions, Members
WHERE Employees.EmployeeID = Transactions.SoldOrPackagedBy 
AND Transaction_Details.TransactionID = Transactions.TransactionID 
AND Transactions.MemberID = Members.MemberID
AND Members.Last = 'Jones'
AND Members.First = 'Benjamin'
ORDER By Employees.EmployeeID;


SELECT Employees.EmployeeID, MIN (Transactions.TransactionDate) AS FirstTransaction
FROM Employees
INNER JOIN Transactions ON Employees.EmployeeID = Transactions.SoldOrPackagedBy
GROUP BY Employees.EmployeeID;


SELECT Employees.Department, COUNT(Transactions.TransactionID) AS TotalTransactions
FROM Employees
INNER JOIN Transactions ON Employees.EmployeeID = Transactions.SoldOrPackagedBy
GROUP BY Employees.Department
ORDER BY Employees.Department DESC;


SELECT Employees.Last, Employees.First
FROM Employees, Transactions, Transaction_Details
WHERE Employees.EmployeeID = Transactions.SoldOrPackagedBy
AND Transactions.TransactionID = Transaction_Details.TransactionID
AND ItemCode = '000078'
GROUP BY Employees.Last, Employees.First;


SELECT Transaction_Details.ItemCode, Members.Last, Members.First, Members.Address, Members.State, Members.ZipCode
FROM Transaction_Details, Transactions, Members
WHERE Transaction_Details.TransactionID = Transactions.TransactionID
AND Transactions.MemberID = Members.MemberID;


SELECT Members.State, COUNT(Transaction_Details.ItemCode) AS TotaliTemsSold
FROM Transaction_Details, Members, Transactions
WHERE Members.MemberID = Transactions.MemberID
AND Transactions.TransactionID = Transaction_Details.TransactionID
AND Members.State IN ('IN','IL','KY')
GROUP BY Members.State;

