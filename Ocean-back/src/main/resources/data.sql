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


INSERT INTO POISSON (ID, NOM, ESPECE_ID, PHOTO)
			 VALUES(1, 'Orque', 1, 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Killerwhales_jumping.jpg/1280px-Killerwhales_jumping.jpg');

INSERT INTO POISSON (ID, NOM, ESPECE_ID, PHOTO)
			 VALUES(2, 'Narval', 3, 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Pod_Monodon_monoceros.jpg/1280px-Pod_Monodon_monoceros.jpg');

INSERT INTO POISSON (ID, NOM, ESPECE_ID, PHOTO)
			 VALUES(3, 'Dauphin', 1, 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Tursiops_truncatus_01.jpg/1280px-Tursiops_truncatus_01.jpg');

