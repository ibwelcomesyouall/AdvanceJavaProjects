-- Command to create a database
create database OurExpense;
-- Command to drop a database
drop database OurExpense;

--Command to use database
use OurExpense;

--Command to create a table
create table Roommates 
(RoommateID int NOT NULL,
FirstName varchar(50),
MiddleName varchar(50),
LastName varchar(50),
Sex char,
Password varchar(10));

-- The below alter is for creating a PRIMARY KEY CONSTRAINT
Alter table Roommates add constraint Roommates_primary PRIMARY KEY (RoommateID);

--Command to drop a table
drop table Roommates;

--command to select a table
select * from Roommates;

--command to insert values
insert into Roommates values(1,'Indranil','','Banerjee','M','abc'); 


-- create table using all contraints
create table ExpenseLog ( RoommateID int NOT NULL PRIMARY KEY,
ExpenseLogDetail char UNIQUE,
Price int,
Valid char DEFAULT('N'));

alter table ExpenseLog add constraint fk_to_roommates FOREIGN KEY (RoommateID) references Roommates(RoommateID);

drop table ExpenseLog;

create table TotalExpense(RoommateID int NOT NULL PRIMARY KEY,
TotalExpenseCost int);

alter table TotalExpense add constraint fk_to_roommates1 FOREIGN KEY (RoommateID) references Roommates(RoommateID);

drop table TotalExpense;

Create Procedure Log_the_Expense
@cust_ID int,
@Description varchar (100),
@Amt float (10)
as
begin
print 'Expense Logging Started';
INSERT into ExpenseLog(RoommateID,ExpenseLogDetail,Price) values(@cust_ID,@Description,@Amt);
print 'Expense Logging Complete';
end

CREATE Procedure TotalExpense_update
@cust_ID int,
@ExpenseLog_ID int,
@Amt float(10)
as
Declare
@TotalExp float(10)
BEGIN
print 'Calculation Started';
UPDATE ExpenseLog SET Valid='Y' WHERE RoommateID=@cust_ID and ExpenseLog_ID=@ExpenseLog_ID;
select @TotalExp= sum(TotalExpenseCost)from TotalExpense

print 'Calculation Completed';
END;

DROP TRIGGER TotalExpense_update;


---------------------------
use OurExpense;

create table Roommates
(RoommateID int NOT NULL IDENTITY(1,1),
FirstName varchar(50),
MiddleName varchar(50),
LastName varchar(50),
Sex char,
Password varchar(10));

Alter table Roommates add constraint Roommates_primary PRIMARY KEY (RoommateID);

drop table Roommates;

insert into Roommates values('Indranil','','Banerjee','M','abc'); 

select * from Roommates;