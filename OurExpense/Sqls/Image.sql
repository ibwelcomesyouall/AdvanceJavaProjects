
create table FEMALE (
ID int,
Image varbinary(max)
);


Insert Into FEMALE(ID, Image)
Select 1, BulkColumn 
from Openrowset (Bulk 'F:\Adhar.jpg', Single_Blob) as Image

select * from FEMALE
