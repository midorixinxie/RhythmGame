BEGIN TRANSACTION;
CREATE TABLE `Mechanic` (
	`hourlyCostingRate`	NUMERIC,
	`hoursSpent`	NUMERIC
);
INSERT INTO `Mechanic` VALUES (30,6);
INSERT INTO `Mechanic` VALUES (25,5);
INSERT INTO `Mechanic` VALUES (35,8);
CREATE TABLE "Booking" (
	`nextBooking`	TEXT,
	`pastBooking`	TEXT,
	`futureBooking`	TEXT,
	`bookingID`	INTEGER,
	`customerID`	INTEGER,
	`DiagnosticAndRepair`	BLOB,
	`ScheduledMaintenance`	BLOB
);
INSERT INTO `Booking` VALUES ('23rd February','3rd February','13th March',34528,98754,'No','Yes');
INSERT INTO `Booking` VALUES ('',NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `Booking` VALUES ('12th February','2nd February','14th March',54678,98762,'Yes','No');
INSERT INTO `Booking` VALUES ('','','','','','','');
INSERT INTO `Booking` VALUES ('17th February','3rd February','12th March',34529,876598,'No','Yes');
INSERT INTO `Booking` VALUES (NULL,NULL,NULL,NULL,NULL,NULL,NULL);
COMMIT;
