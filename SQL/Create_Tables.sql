CREATE TABLE Student_T
(
	StudentID		INTEGER			NOT NULL,
	StudentName     VARCHAR2(25)  	NOT NULL,
	CONSTRAINT Student_PK PRIMARY KEY (StudentID)
);

CREATE TABLE Faculty_T
(
	FacultyID		INTEGER			NOT NULL,
	FacultyName     VARCHAR2(25)  	NOT NULL,
	CONSTRAINT Faculty_PK PRIMARY KEY (FacultyID)
);

CREATE TABLE Course_T
(
	CourseID		CHAR(8)			NOT NULL,
	CourseName     	VARCHAR2(15)  	NOT NULL,
	CONSTRAINT Course_PK PRIMARY KEY (CourseID)
);

CREATE TABLE Section_T
(
	SectionNo		INTEGER			NOT NULL,
	Semester        VARCHAR2(7)  	NOT NULL,
	CourseID		CHAR(8)			NOT NULL,
	CONSTRAINT Section_PK PRIMARY KEY (SectionNo),
	CONSTRAINT Section_FK FOREIGN KEY (CourseID) REFERENCES Course_T (CourseID)
);

CREATE TABLE Qualified_T
(
	SectionNo		INTEGER			NOT NULL,
	CourseID		CHAR(8)			NOT NULL,
	DateQualified 	VARCHAR2(7)           NOT NULL,
	CONSTRAINT Qualified_PK PRIMARY KEY (SectionNo,CourseID),
	CONSTRAINT Qualified_FK1 FOREIGN KEY (SectionNo) REFERENCES Section_T (SectionNo),
	CONSTRAINT Qualified_FK2 FOREIGN KEY (CourseID) REFERENCES Course_T (CourseID)
);

CREATE TABLE Registration_T
(
	StudentID		INTEGER			NOT NULL,
	SectionNo		INTEGER			NOT NULL,
	CONSTRAINT Registration_PK PRIMARY KEY (StudentID,SectionNo),
	CONSTRAINT Registration_FK1 FOREIGN KEY (StudentID) REFERENCES Student_T (StudentID),
	CONSTRAINT Registration_FK2 FOREIGN KEY (SectionNo) REFERENCES Section_T (SectionNo)
);

INSERT INTO Student_T VALUES
();