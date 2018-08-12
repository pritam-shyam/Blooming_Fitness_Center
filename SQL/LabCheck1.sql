CREATE TABLE Employee_T
(
	EmployeeID 			INTEGER	GENERATED ALWAYS AS IDENTITY
						(START WITH 35
						 INCREMENT BY 2
						 MINVALUE 35
					     MAXVALUE 100
						 NO CYCLE ),
	EmployeeName		VARCHAR2(30),
	EmployeeBirthDate	DATE,
	CONSTRAINT Employee_PK PRIMARY KEY (EmployeeID) ON UPDATE SET NULL
);

CREATE TABLE Course_T
(
	CourseID		INTEGER 	NOT NULL,
	CourseTitle		VARCHAR2(35),
	CONSTRAINT Course_PK PRIMARY KEY (CourseID) ON UPDATE CASCADE
);

CREATE TABLE Certificate_T
(
	EmployeeID 		INTEGER		NOT NULL,
	CourseID		INTEGER		NOT NULL,
	DateCompleted	DATE DEFAULT SYSDATE,
	CONSTRAINT Certificate_PK PRIMARY KEY (EmployeeID,CourseID),
	CONSTRAINT Certificate_FK1 FOREIGN KEY (EmployeeID) REFERENCES Employee_T (EmployeeID),
	CONSTRAINT Certificate_FK2 FOREIGN KEY (CourseID) REFERENCES Course_T (CourseID)
);





INSERT INTO Employee_T VALUES
('159','Pritam Shyam',TO_DATE('1996/03/06','YYYY/MM/DD'));





INSERT ALL
	INTO Employee_T VALUES ('161','Jacob Mikkola',TO_DATE('1995/04/05','YYYY/MM/DD'))
	INTO Employee_T VALUES ('163','Jordan Bailey',TO_DATE('1994/05/04','YYYY/MM/DD'))
	INTO Employee_T VALUES ('165','Katherine Ollearis',TO_DATE('1993/06/03','YYYY/MM/DD'))
	INTO Employee_T VALUES ('167','Kevin Ratsavong',TO_DATE('1992/07/02','YYYY/MM/DD'))
	INTO Course_T VALUES ('MIS 320','Database Management Systems');





ALTER TABLE Employee_T
ADD COLUMN DepartmentID		INTEGER		DEFAULT '002';





CREATE TABLE Department_T
(
	DepartmentID	INTEGER			DEFAULT '002',
	DepartmentName 	VARCHAR2(25),
	Branch			VARCHAR2(20)	DEAFULT 'Des Moines'
					CHECK (Branch IN('Des Moines','Ames','Iowa City')),
	CONSTRAINT Department_PK PRIMARY KEY (DepartmentID) 
);	





ALTER TABLE Employee_T
ADD CONSTRAINT Employee_FK FOREIGN KEY (DepartmentID) REFERENCES Department_T (DepartmentID);