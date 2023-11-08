
		 CREATE DATABASE Aeroline;
		
			
				CREATE TABLE Aeroline (
							AerolineID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (AerolineID) 
							 
							name    
							
							 
				);		
					
			
				CREATE TABLE Baggage (
							BaggageID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (BaggageID) 
							 
							idClient    
							
							 
							totalWeight    
							
							 
							idBaggage    
							
							 
							baggageWeight1    
							
							 
							baggageWeight2    
							
							 
							baggageDimension1    
							
							 
							baggageDimension2    
							
							 
							airplaneNumber     
							
							 
							AerolineID    
							
							 
							AerolineID    
							
							 
				);		
					
			
				CREATE TABLE ShippingCart (
							ShippingCartID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (ShippingCartID) 
							 
							weight    
							
							 
							idNumber    
							
							 
							airplaneNumber    
							
							 
							AerolineID    
							
							 
							AerolineID    
							
							 
				);		
					
			
				CREATE TABLE Route (
							RouteID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (RouteID) 
							 
							cityOrigin    
							
							 
							destinationCity    
							
							 
							duration    
							
							 
							departureTime     
							
							 
							AerolineID    
							
							 
							AerolineID    
							
							 
				);		
					
			
				CREATE TABLE Ticket (
							travelType    
							
							 
							serviceType    
							
							 
							startDate    
							
							 
							returnDate    
							
							 
							numberPersons    
							
							 
							costPerPerson    
							
							 
							finalPrice    
							
							 
							AerolineID    
							
							 
							ClientID    
							
							 
							RouteID    
							
							 
							AerolineID    
							
							 
							ClientID    
							
							 
							RouteID    
							
							 
				);		
					
			
				CREATE TABLE occupancyChairs (
							TicketID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (TicketID) 
							 
							occupancyChairs    
							
							 
							TicketID    
							
							 
				);		
					
			
				CREATE TABLE Airplane (
							name    
							
							 
							AirplaneID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (AirplaneID) 
							 
							 chargeCapacity    
							
							 
							airplaneIdentificationNumber    
							
							 
							AerolineID    
							
							 
							RouteID    
							
							 
							AerolineID    
							
							 
							RouteID    
							
							 
				);		
					
			
				CREATE TABLE seatingCapacity (
							seatingCapacity    
							
							 
							AirplaneID    
							
							 
				);		
					
			
				CREATE TABLE CrewMember (
							CrewMemberID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (CrewMemberID) 
							 
							studiesPerformed    
							
							 
							crewType    
							
							 
							PersonID    
							
							 
							AerolineID    
							
							 
							AirplaneID    
							
							 
							PersonID    
							
							 
							AerolineID    
							
							 
							AirplaneID    
							
							 
				);		
					
			
				CREATE TABLE Person (
							PersonID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (PersonID) 
							 
							id    
							
							 
							name    
							
							 
							lastname    
							
							 
							address    
							
							 
							email    
							
							 
							birthDate    
							
							 
				);		
					
			
				CREATE TABLE Client (
							ClientID    NOT NULL   AUTO_INCREMENT 
							 PRIMARY KEY (ClientID) 
							 
							residentialAddress    
							
							 
							debitCreditCardNumber    
							
							 
							PersonID    
							
							 
							AerolineID    
							
							 
							PersonID    
							
							 
							AerolineID    
							
							 
				);		
					
			
				ALTER TABLE Aeroline
					
			
				ALTER TABLE Baggage
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
			
				ALTER TABLE ShippingCart
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
			
				ALTER TABLE Route
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
			
				ALTER TABLE Ticket
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (ClientID) REFERENCES Client(ClientID) 
						ADD FOREIGN KEY (RouteID) REFERENCES Route(RouteID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (ClientID) REFERENCES Client(ClientID) 
						ADD FOREIGN KEY (RouteID) REFERENCES Route(RouteID) 
					
			
				ALTER TABLE occupancyChairs
						ADD FOREIGN KEY (TicketID) REFERENCES Ticket(TicketID) 
					
			
				ALTER TABLE Airplane
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (RouteID) REFERENCES Route(RouteID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (RouteID) REFERENCES Route(RouteID) 
					
			
				ALTER TABLE seatingCapacity
						ADD FOREIGN KEY (AirplaneID) REFERENCES Airplane(AirplaneID) 
					
			
				ALTER TABLE CrewMember
						ADD FOREIGN KEY (PersonID) REFERENCES Person(PersonID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (AirplaneID) REFERENCES Airplane(AirplaneID) 
						ADD FOREIGN KEY (PersonID) REFERENCES Person(PersonID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (AirplaneID) REFERENCES Airplane(AirplaneID) 
					
			
				ALTER TABLE Person
					
			
				ALTER TABLE Client
						ADD FOREIGN KEY (PersonID) REFERENCES Person(PersonID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
						ADD FOREIGN KEY (PersonID) REFERENCES Person(PersonID) 
						ADD FOREIGN KEY (AerolineID) REFERENCES Aeroline(AerolineID) 
					
	
