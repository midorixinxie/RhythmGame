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
	FOREIGN KEY(PartsID) REFERENCES PartsRecord(ID),

);
CREATE TABLE "VehicleRecords" (
	`CustomerID`	INTEGER, NOT NULL
	 	FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID),
	`WarrantyType`	Boolean,
	`RequiresDiagnosisAndRepair`	Boolean,
	`WarrantyCompanyPays`	INTEGER,
	`CompanyName`	TEXT,
	`CompanyAddress`	TEXT,
	`WarrantyExpiry`	Date,
	`RegistrationNumber`	TEXT PRIMARY KEY
	`Model`	TEXT,
	`Make`	TEXT,
	`EngineSize`	TEXT,
	`FuelType`	TEXT,
	`Colour`	TEXT,
	`MoTRenewalDate`	INTEGER,
	`LastServiceDate`	INTEGER,
	`CurrentMileage`	INTEGER,
	`ListOfPartsUsed`	TEXT,
);
INSERT INTO `VehicleRecords` VALUES (1,'N','Car',NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `VehicleRecords` VALUES (2,'Y','Truck',NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `VehicleRecords` VALUES (3,'Y','Van','Y',NULL,NULL,NULL,3,'a','s','c','f','sfd',32,23,32,'f',23,23,23);
INSERT INTO `VehicleRecords` VALUES (4,'Y','Car',NULL,NULL,NULL,NULL,4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

CREATE TABLE "PartsRecord" (
	`ID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`Name`	TEXT NOT NULL,
	`NumberInStock`	INTEGER NOT NULL,
	`Cost`	INTEGER NOT NULL,
	`DateOfInstallation`	INTEGER,
	`WarrantyExpiryDate`	INTEGER,
	`RegistrationNumber`	TEXT,
	`CustomerID`	TEXT NOT NULL
	FOREIGN KEY(RegistrationNumber) REFERENCES VehicleRecords(RegistrationNumber),
	FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID)

);
CREATE TABLE "Mechanic" (
	`hourlyCostingRate`	INTEGER,
	`hoursSpent`	INTEGER,
	`bookingID` INTEGER,
	FOREIGN KEY(bookingID) REFERENCES Booking(ID)
);

INSERT INTO `Mechanic` VALUES (30,6);
INSERT INTO `Mechanic` VALUES (25,5);
INSERT INTO `Mechanic` VALUES (35,8);
CREATE TABLE "CustomerAccount" (
	`Forename`	TEXT,
	`Surname`	TEXT,
	`Address`	TEXT,
	`Postcode`	TEXT,
	`Phone`	TEXT,
	`Email address`	TEXT,
	`ID`	TEXT PRIMARY KEY
	`CustomerType`	TEXT,
	`NumberOfBookings`	INTEGER,
	`NumberOfBills`	INTEGER,
	`TotalCost`	INTEGER,
	`WarrantyStatus`	BOOLEAN,
);
INSERT INTO `CustomerAccount` VALUES ('Benito','Mussolini','20 Knox Way, Horse Lane, London','E1 4QQ','02074239883','jsmith@gmail.com','1',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Donald ','Trump','1600 Pennsylvania Ave North West, London  ','S1W 7GD','02087654321','dtrump@live.co.uk','2',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Vladmir','Putin','17 Cromarty House, Ben jonson Road, London','TK4 83F','02012345678','vputin@outlook.com','3',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Joseph','Stalin','205 Jamaica Street, London','E1 0PF','02077231281','jstalin@hotmail.co.uk','4',NULL,NULL,NULL,NULL,NULL);
INSERT INTO `CustomerAccount` VALUES ('Mao','Zedong','1 Have No Idea, What 1 Am Doing, London','G65 8HS','02036747865','mao@yahoo.co.uk','5',NULL,NULL,NULL,NULL,NULL);

CREATE TABLE "Booking" (
	`nextBooking`	TEXT,
	`pastBooking`	TEXT,
	`futureBooking`	TEXT,
	`ID`	INTEGER PRIMARY KEY
	`customerID`	INTEGER,
	`DiagnosticAndRepair`	BOOLEAN,
	`ScheduledMaintenance`	BOOLEAN,
	`TotalCostPerBooking`	INTEGER,
	FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID)
);
INSERT INTO `Booking` VALUES ('23rd February','3rd February','13th March',34528,98754,'No','Yes');
INSERT INTO `Booking` VALUES ('',NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `Booking` VALUES ('12th February','2nd February','14th March',54678,98762,'Yes','No');
INSERT INTO `Booking` VALUES ('','','','','','','');
INSERT INTO `Booking` VALUES ('17th February','3rd February','12th March',34529,876598,'No','Yes');
INSERT INTO `Booking` VALUES (NULL,NULL,NULL,NULL,NULL,NULL,NULL);
COMMIT;
