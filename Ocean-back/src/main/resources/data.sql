-- generate some shapes to test the jpa implementation.

-- pixel tests : enable to test the inheritance with sshape
INSERT INTO ESPECE (ID, NOM, DESCRIPTION) 
			 VALUES(1, 'cétacé', 'Regroupe tous les mamifères aquatiques');
INSERT INTO ESPECE (ID, NOM, DESCRIPTION) 
			 VALUES(2, 'requin', 'Conqueriront le monde avec des tornades');
INSERT INTO ESPECE (ID, NOM, DESCRIPTION) 
			 VALUES(3, 'cephalopode', 'mollusques dont la tete est munie de tentacules');
INSERT INTO ESPECE (ID, NOM, DESCRIPTION) 
			 VALUES(4, 'crustacé', 'corp revetu par un exosquelette chitinoprotéique imprégné de carbonate de calcium');

