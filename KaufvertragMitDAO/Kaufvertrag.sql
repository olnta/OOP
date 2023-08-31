CREATE TABLE Vertragspartner(
AusweisNr TEXT NOT NULL PRIMARY KEY,
Vorname TEXT NOT NULL,
Nachname Text NOT NULL,
Strasse TEXT,
HausNR TEXT,
Plz TEXT,
Ort	TEXT
);



INSERT INTO Vertragspartner
VALUES 
	   ("9876543210", "Joachim" ,"Bredull" ,"Auch zu Hause" ,"7","28195","Bremen"),
	   ("0123456789","Klaus","Brandt","Zu hause","3a","28199","Bremen");
	   
CREATE TABLE Waren(
WarenNr INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
Bezeichnung TEXT Not NULL,
Beschreibung TEXT,
Preis NUMERIC not NULL,
Besonderheiten TEXT,
Maengel TEXT
);
INSERT INTO Waren (Bezeichnung,Beschreibung,Preis,Besonderheiten,Maengel)
VALUES("Laptop","Super krasses Gaming-Laptop",250.00,"Tasche; Gaming-Maus","ladekabel fehlt; Touchpad defekt");