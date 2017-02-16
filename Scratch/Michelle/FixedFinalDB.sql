BEGIN TRANSACTION;
CREATE TABLE `specilistRepairCenter` (
	`Name`	TEXT,
	`address`	TEXT,
	`phone`	INTEGER PRIMARY KEY,
	`emailAddress`	TEXT,
	`expectedDeliveryDate`	TEXT,
	`individualCostsForVehicleAndParts`	NUMERIC,
	`expectedReturnDate`	TEXT,
	`RegistrationNumber`	TEXT,
	`PartsID`	INTEGER,
	FOREIGN KEY(RegistrationNumber) REFERENCES VehicleRecords(RegistrationNumber),
	FOREIGN KEY(PartsID) REFERENCES PartsRecord(ID)
);
CREATE TABLE "CustomerAccount" (
	`Forename`	TEXT,
	`Surname`	TEXT,
	`Address`	TEXT,
	`Postcode`	TEXT,
	`Phone`	TEXT,
	`Email address`	TEXT,
	`ID`	TEXT PRIMARY KEY,
	`CustomerType`	TEXT,
	`NumberOfBookings`	INTEGER,
	`NumberOfBills`	INTEGER,
	`TotalCost`	INTEGER,
	`WarrantyStatus`	BOOLEAN
);

INSERT INTO `CustomerAccount` VALUES ('Benito','Mussolini','20 Knox Way, Horse Lane, London','E1 4QQ','02074239883','jsmith@gmail.com','1',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Donald ','Trump','1600 Pennsylvania Ave North West, London  ','S1W 7GD','02087654321','dtrump@live.co.uk','2',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Vladmir','Putin','17 Cromarty House, Ben jonson Road, London','TK4 83F','02012345678','vputin@outlook.com','3',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Joseph','Stalin','205 Jamaica Street, London','E1 0PF','02077231281','jstalin@hotmail.co.uk','4',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Mao','Zedong','1 Have No Idea, What 1 Am Doing, London','G65 8HS','02036747865','mao@yahoo.co.uk','5',NULL,NULL,NULL,NULL,NULL);

CREATE TABLE "VehicleRecords" (
	`CustomerID`	INTEGER NOT NULL,
	`WarrantyType`	BOOLEAN,
	`RequiresDiagnosisAndRepair`	BOOLEAN,
	`WarrantyCompanyPays`	INTEGER,
	`CompanyName`	TEXT,
	`CompanyAddress`	TEXT,
	`WarrantyExpiry`	DATE,
	`RegistrationNumber`	TEXT PRIMARY KEY,
	`Model`	TEXT,
	`Make`	TEXT,
	`EngineSize`	TEXT,
	`FuelType`	TEXT,
	`Colour`	TEXT,
	`MoTRenewalDate`	INTEGER,
	`LastServiceDate`	INTEGER,
	`CurrentMileage`	INTEGER,
	`ListOfPartsUsed`	TEXT,
		 FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID)
);
INSERT INTO `VehicleRecords` VALUES (1,'N',NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `VehicleRecords` VALUES (2,'Y',NULL,NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);


CREATE TABLE "PartsRecord" (
	`ID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`Name`	TEXT NOT NULL,
	`NumberInStock`	INTEGER NOT NULL,
	`Cost`	INTEGER NOT NULL,
	`DateOfInstallation`	INTEGER,
	`WarrantyExpiryDate`	INTEGER,
	`RegistrationNumber`	TEXT,
	`CustomerID`	TEXT NOT NULL,
	FOREIGN KEY(RegistrationNumber) REFERENCES VehicleRecords(RegistrationNumber),
	FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID)
);

CREATE TABLE "Users"(
    `Username`	TEXT PRIMARY KEY,
	`Password`	TEXT
);

INSERT INTO `Users` VALUES ('emp1','emp123');
INSERT INTO `Users` VALUES ('emp2','emp234');
INSERT INTO `Users` VALUES ('emp3','emp345');

CREATE TABLE "Booking" (
    `ID`  INTEGER PRIMARY KEY,
	`nextBooking`	TEXT,
	`pastBooking`	TEXT,
	`futureBooking`	TEXT,
	`DiagnosticAndRepair`	BOOLEAN,
	`ScheduledMaintenance`	BOOLEAN,
	`TotalCostPerBooking`	INTEGER,
	`customerID`	INTEGER,
	FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID)
);
INSERT INTO `Booking` VALUES (34528,'23rd February','3rd February','13th March','No','Yes',315,98754);

INSERT INTO `Booking` VALUES (54678,'12th February','2nd February','14th March','Yes','No',5145,98762);
INSERT INTO `Booking` VALUES (34529,'17th February','3rd February','12th March','No','Yes',134,876598);

CREATE TABLE "Mechanic" (
    `bookingID` INTEGER,
	`hourlyCostingRate`	INTEGER,
	`hoursSpent`	INTEGER,
	
	FOREIGN KEY(bookingID) REFERENCES Booking(ID)
);

INSERT INTO `Mechanic` VALUES (1,30,6);
INSERT INTO `Mechanic` VALUES (2,25,5);
INSERT INTO `Mechanic` VALUES (3,35,8);

COMMIT;
