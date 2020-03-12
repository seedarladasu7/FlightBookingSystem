CREATE TABLE employee (
    id int NOT NULL AUTO_INCREMENT,
    empname varchar(255),
    currdate DATE,
    PRIMARY KEY (id)
);

CREATE TABLE employeetimetracking (
    id int NOT NULL AUTO_INCREMENT,
    swipein DATETIME,
    swipeout DATETIME,
	locationname varchar(255),
	swipingtype varchar(10),
    empid int NOT NULL,
	PRIMARY KEY (id),
    FOREIGN KEY (empid) REFERENCES employee(id)
);


CREATE TABLE flight (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE location (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE user (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
    password varchar(50),
    PRIMARY KEY (id)
);

CREATE TABLE passenger (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
	sex varchar(10),
	mealpref varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE flight_availability (
    id int NOT NULL AUTO_INCREMENT,
    journey_date DATETIME,
	flight_id int NOT NULL,
	source_loc_id int NOT NULL,
	destination_loc_id int NOT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (flight_id) REFERENCES flight(id)
);


CREATE TABLE booking_passenger (
    id int NOT NULL AUTO_INCREMENT,
    booking_id int NOT NULL,
	passenger_id int NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE flight_booking_info (
    id int NOT NULL AUTO_INCREMENT,
    booking_date DATETIME,
	user_id int NOT NULL,
	flight_avail_id int NOT NULL,
    PRIMARY KEY (id)
);