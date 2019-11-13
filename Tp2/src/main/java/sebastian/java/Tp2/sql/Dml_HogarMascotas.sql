use  hogarmascotas;
--use vNXTSt9W4T;



insert into veterinarios (nombre,apellido,email,turno,salario) 
values			
	('andrea','rodriguez','anro@hotmail.com','mañana',20000),
        ('andres','mendez','anme@gmail.com','tarde',20000),
        ('juan','reyes','jure@yahoo.es','mañana',20000),
        ('ana','dearco','ande@hotmail.com','tarde',25000),
	('jesus','clavel','jecla@gmail.com','mañana',25000);
select * from veterinarios;
  

insert into  	responsables(nombre,apellido,direccion,telefono,ciudad,email,dni) 
values
        ('humberto','riffo','yrigoyen 2578 dpto 30',311345678,'caba','huri@gmail.com',12345678),
	('julia','caressi','peron 2314 piso 5',989786765,'caba','juca@gmail.com',87654321),
	('elena','caressi','peron 2314 piso 5',342516234,'caba','eleca@gmail.com',77766554),
	('sebastian','bautista','iglesias 123 piso 2',223344556,'santafe','seba@hotmail.com',11221213),
	('gabriel','muñoz','mosquera 5000 casa 11f',876545678,'mendoza','gamu@hotmail.com',01928338),
	('alberto','fernandez','mendoza 5678',123214235,'bariloche','alfe@hotmail.com',09080797),
	('juan pablo','pineda','moreno 345 dpto 4',012345678 ,'caba','jupa@hotmail.com',34565432),
	('cinthia','ramirez','iriarte 2345',767564656,'caba','cinra@gmail.com',09897656),
	('mariano','pastrana','del valle 234',456545678,'mendoza','mapa@gmail.com',98787676),
	('sofia','soledad','rioja 456',112212134,'mendoza','sofisol@hotmail.com',01234563),
	('carmen','del castillo','bogota 7458',997765678,'mendoza','cardel@yahoo.com',91234321);
select * from responsables;



insert into perros(nombre,raza,edad,v_parvovirus,v_moquillo,v_adenovirus,v_hepatitis,v_rabia,esterilizacion,peso,genero,f_Ingreso,idVeterinario,adopcion,idResponsable,f_adopcion)
values 		
         ('nakao','grifon',2,'si','no','no','no','no','esterilizado',15,'macho','2017-06-11',1,'adoptado',1,'2018-10-19'),
         ('chavela','gran danes',3,'si','si','no','no','no','esterilizado',12,'hembra','2017-4-9',1,'adoptado',2,'2018-10-31'),
	 ('sam','chiwawa',7,'si','si','si','si','si','no_esteri',23,'macho','2015-01-03',2,'adoptado',3,'2016-01-19'),
	 ('frodo','pastor aleman',8,'si','no','si','si','no','no_esteri',25,'macho','2014-01-03',3,'adoptado',4,'2015-05-11'),
         ('aragorn','shar pei',4,'si','no','no','no','si','esterilizado',11,'macho','2018-03-19',5,'adoptado',5,'2018-10-19'),
         ('vaya de oro','bull dog',1,'si','si','no','si','si','no_esteri',12,'hembra','2018-05-14',4,'adoptado',6,'2018-05-09'),
         ('guachin','pastor blanco zuizo',12,'si','si','si','si','si','esterilizado',16,'macho','2011-12-05',3,'adoptado',7,'2016-02-02'),
         ('ficus','chow choyw panda',7,'si','no','no','no','si','no_esteri',12,'macho','2016-06-06',5,'adoptado',8,'2016-07-19'),
         ('superdog','labrador',5,'si','no','si','si','no','esterilizado',17,'macho','2015-01-01',5,'no_adopt',null,null),
         ('legolas','doberman',9,'si','no','si','si','si','no_esteri',26,'macho','2012-04-17',4,'adoptado',9,'2014-9-18'),
         ('fito','mestizo',3,'no','no','no','no','no','no_esteri',1,'macho','2018-12-03',5,'no_adopt',null,null),
         ('luna','bull terrier',3,'no','no','no','no','no','no_esteri',6,'hembra','2016-04-06',1,'adoptado',10,'2018-12-31'),
	 ('nube','grifon',7,'si','si','si','si','si','esterilizado',10,'hembra','2014-07-15',1,'adoptado',11,'2014-11-20'),
         ('hierba','pitbull',5,'no','si','si','si','si','esterilizado',14,'hembra','2014-11-18',2,'adoptado',11,'2016-9-28'),
         ('piel roja','mestizo',16,'si','si','si','si','si','esterilizado',17,'macho','2009-09-11',3,'no_adopt',null,null),
         ('pulgas','jack russell',8,'no','no','no','no','no','no_esteri',12,'macho','2013-01-05',4,'adoptado',10,'2014-08-04'),
         ('morcilla','bernes',3,'si','no','no','si','no','no_esteri',12,'hembra','2018-09-24',5,'no_adopt',null,null),
  	 ('tinto','pastor blanco suizo',6,'si','no','si','si','si','esterilizado',16,'macho','2016-02-27',3,'adoptado',3,'2017-04-30'),
         ('malbec','yorkshire terrier',4,'si','si','si','si','si','esterilizado',15,'hembra','2017-01-19',2,'adoptado',4,'2018-11-22'),
         ('mordor','dalmata',6,'no','no','no','no','no','no_esteri',16,'macho','2015-08-04',2,'no_adopt',null,null),
         ('saruman','pinsher miniatura',7,'si','si','si','si','no','no_esteri',4,'macho','2015-11-11',4,'no_adopt',null,null),
         ('gollum','mastin',7,'no','no','no','no','no','no_esteri',20,'macho','2014-12-02',5,'adoptado',8,'2016-10-21'),
         ('marley','podenco andaluz',3,'si','no','no','no','no','no_esteri',3,'hembra','2018-01-15',5,'adoptado',9,'2018-10-25'),
         ('nesta','mastin tibetano',9,'si','si','si','si','si','esterilizado',24,'hembra','2014-09-14',3,'adoptado',6,'2017-12-29'),
         ('suños','doberman',6,'si','no','si','si','no','esterilizado',16,'hembra','2018-02-17',2,'adoptado',3,'2018-03-21'),
         ('agua','sabueso del tirol ',3,'no','no','no','no','no','no_esteri',5,'hembra','2017-08-01',2,'no_adopt',null,null),
         ('wally','mestizo',1,'no','no','no','no','no','no_esteri',4,'macho','2019-04-01',4,'no_adopt',null,null);
 select * from perros;
                  
 
 
 insert into gatos   (nombre,raza,edad,v_trivalente,v_leucemia,v_rabia,esterilizacion,peso,genero,f_ingreso,idVeterinario,adopcion,idResponsable,f_adopcion)
 values
	('michico','mestizo',4,'no','no','no','no_esteri',4.2,'macho','2016-09-08',1,'no_adopt',null,null),
	('micky','mestizo',4,'no','no','no','no_esteri',4.9,'macho','2016-09-08',1,'adoptado',1,'2018-06-11'),
        ('romina','siames',7,'si','si','si','esterilizado',4.7,'hembra','2015-10-02',2,'adoptado',2,'2019-03-11'),
        ('gufy','siberiano',5,'no','no','no','esterilizado',5.2,'hembra','2015-05-18',1,'adoptado',3,'2018-05-11'),
	('cortna','metizo',6,'no','si','no','no_esteri',4.6,'macho','2014-12-09',4,'no_adopt',null,null),
        ('chavo','egipcio',2,'no','no','no','no_esteri',2.2,'macho','208-09-07',2,'adoptado',5,'2019-06-15'),
	('dino','bengala',7,'si','si','si','esterilizado',5.1,'macho','2016-02-04',3,'adoptado',6,'2018-09-17'),
        ('saurio','bengala',5,'si','si','si','esterilizado',5.3,'macho','2016-02-04',5,'adoptado',6,'2018-09-17'),
        ('buho','maine coon',3,'no','si','si','no_esteri',4.0,'macho','2018-12-23',3,'no_adopt',null,null),
        ('tom','ragdoll',2,'no','no','no','no_esteri',3.2,'macho','2017-11-18',2,'adoptado',7,'2018-07-19'),
        ('jerry','sphynx',5,'si','no','no','esterilizado',4.3,'macho','2017-01-02',3,'adoptado',8,'2017-06-15'),
        ('thor','siames',7,'si','si','si','esterilizado',5.3,'macho','2013-03-05',4,'no_adopt',null,null),
        ('garfiels','maine coon',10,'si','si','si','esterilizado',7.0,'macho','2009-10-11',5,'adoptado',9,'2010-12-06'),
        ('jerry','sphynx',5,'si','no','no','esterilizado',4.3,'macho','2017-01-02',3,'adoptado',8,'2017-06-15'),
        ('cocó','carey',3,'si','si','si','esterilizado',3.0,'hembra','2018-09-17',5,'adoptado',9,'2019-12-21'),
        ('bombon','himalayo',4,'si','no','no','no_esteri',4.2,'hembra','2015-01-02',3,'adoptado',10,'2016-07-04'),
        ('jerry','sphynx',5,'si','no','no','esterilizado',4.3,'macho','2018-03-03',1,'adoptado',11,'2019-05-14'),
        ('neo','bombay',2,'si','si','si','no_esteri',4.9,'macho','2018-11-12',2,'no_adopt',null,null),
        ('roca','sphynx',1,'no','no','no','no_esteri',1,'macho','2019-01-01',3,'no_adopt',null,null),
        ('cofee','manx',3,'si','si','no','esterilizado',3.2,'hembra','2018-03-02',4,'adoptado',1,'2018-09-16'),
        ('rry','ocycat',6,'si','no','si','esterilizado',4.3,'hembra','2018-09-02',5,'adoptado',2,'2016-03-18'),
        ('je','sphynx',2,'si','si','no','no_esteri',3.1,'macho','2018-04-03',1,'adoptado',3,'2019-05-11'),
        ('ajo','peterbald',4,'si','si','si','no_esteri',3.3,'hembra','2019-05-04',2,'adoptado',4,'2019-07-31');
  select * from gatos;      