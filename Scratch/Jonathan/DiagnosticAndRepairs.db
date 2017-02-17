BEGIN TRANSACTION;
CREATE TABLE "Mechanic" (
	'bookingID' INTEGER
	`hourlyCostingRate`	INTEGER,
	`hoursSpent`	INTEGER,
	FOREIGN KEY(bookingID) REFERENCES Booking(ID)
);

INSERT INTO `Mechanic` VALUES (1,30,6);
INSERT INTO `Mechanic` VALUES (2,25,5);
INSERT INTO `Mechanic` VALUES (3,35,8);

CREATE TABLE "Booking" (
 'ID' INTEGER PRIMARY KEY,
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
COMMIT;
