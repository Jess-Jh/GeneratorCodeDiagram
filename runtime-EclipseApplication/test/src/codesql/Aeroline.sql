
		 CREATE DATABASE Aeroline;
		
			
				CREATE TABLE Aeroline (
							AerolineID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (AerolineID) ,
							, 
							name VARCHAR  (255)   ,
							,
							, 
				);		
					
			
				CREATE TABLE Baggage (
							BaggageID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (BaggageID) ,
							, 
							idClient VARCHAR  (255)   ,
							,
							, 
							totalWeight DOUBLE   ,
							,
							, 
							idBaggage VARCHAR  (255)   ,
							,
							, 
							baggageWeight1 DOUBLE   ,
							,
							, 
							baggageWeight2 DOUBLE   ,
							,
							, 
							baggageDimension1 VARCHAR  (255)   ,
							,
							, 
							baggageDimension2 VARCHAR  (255)   ,
							,
							, 
							airplaneNumber  VARCHAR  (255)   ,
							,
							, 
							AerolineID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE ShippingCart (
							ShippingCartID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (ShippingCartID) ,
							, 
							weight DOUBLE   ,
							,
							, 
							idNumber VARCHAR  (255)   ,
							,
							, 
							airplaneNumber VARCHAR  (255)   ,
							,
							, 
							AerolineID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE Route (
							RouteID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (RouteID) ,
							, 
							cityOrigin VARCHAR  (255)   ,
							,
							, 
							destinationCity VARCHAR  (255)   ,
							,
							, 
							duration VARCHAR  (255)   ,
							,
							, 
							departureTime  VARCHAR  (255)   ,
							,
							, 
							AerolineID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE Ticket (
							travelType VARCHAR  (255)   ,
							,
							, 
							serviceType VARCHAR  (255)   ,
							,
							, 
							startDate DATE   ,
							,
							, 
							returnDate DATE   ,
							,
							, 
							numberPersons INT   ,
							,
							, 
							costPerPerson DOUBLE   ,
							,
							, 
							finalPrice DOUBLE   ,
							,
							, 
							AerolineID INT   ,
							,
							, 
							ClientID INT   ,
							,
							, 
							RouteID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE occupancyChairs (
							TicketID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (TicketID) ,
							, 
							occupancyChairs VARCHAR  (255)   ,
							,
							, 
							TicketID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE Airplane (
							name VARCHAR  (255)   ,
							,
							, 
							AirplaneID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (AirplaneID) ,
							, 
							 chargeCapacity DOUBLE   ,
							,
							, 
							airplaneIdentificationNumber VARCHAR  (255)   ,
							,
							, 
							AerolineID INT   ,
							,
							, 
							RouteID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE seatingCapacity (
							seatingCapacity VARCHAR  (255)   ,
							,
							, 
							AirplaneID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE CrewMember (
							CrewMemberID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (CrewMemberID) ,
							, 
							studiesPerformed VARCHAR  (255)   ,
							,
							, 
							crewType VARCHAR  (255)   ,
							,
							, 
							PersonID INT   ,
							,
							, 
							AerolineID INT   ,
							,
							, 
							AirplaneID INT   ,
							,
							, 
				);		
					
			
				CREATE TABLE Person (
							PersonID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (PersonID) ,
							, 
							id VARCHAR  (255)   ,
							,
							, 
							name VARCHAR  (255)   ,
							,
							, 
							lastname VARCHAR  (255)   ,
							,
							, 
							address VARCHAR  (255)   ,
							,
							, 
							email VARCHAR  (255)   ,
							,
							, 
							birthDate DATE   ,
							,
							, 
				);		
					
			
				CREATE TABLE Client (
							ClientID INT   NOT NULL   AUTO_INCREMENT ,
							 PRIMARY KEY (ClientID) ,
							, 
							residentialAddress VARCHAR  (255)   ,
							,
							, 
							debitCreditCardNumber VARCHAR  (255)   ,
							,
							, 
							PersonID INT   ,
							,
							, 
							AerolineID INT   ,
							,
							, 
				);		
					
			
				ALTER TABLE Aeroline
					
			
				ALTER TABLE Baggage
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
			
				ALTER TABLE ShippingCart
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
			
				ALTER TABLE Route
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
			
				ALTER TABLE Ticket
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (ClientID) REFERENCES Client(ClientID) 
						ADD FOREIGN KEY (RouteID) REFERENCES Route(RouteID) 
					
			
				ALTER TABLE occupancyChairs
						ADD FOREIGN KEY (TicketID) REFERENCES Ticket(TicketID) 
					
			
				ALTER TABLE Airplane
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (RouteID) REFERENCES Route(RouteID) 
					
			
				ALTER TABLE seatingCapacity
						ADD FOREIGN KEY (AirplaneID) REFERENCES Airplane(AirplaneID) 
					
			
				ALTER TABLE CrewMember
						ADD FOREIGN KEY (PersonID) REFERENCES Person(PersonID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (AirplaneID) REFERENCES Airplane(AirplaneID) 
					
			
				ALTER TABLE Person
					
			
				ALTER TABLE Client
						ADD FOREIGN KEY (PersonID) REFERENCES Person(PersonID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
	
