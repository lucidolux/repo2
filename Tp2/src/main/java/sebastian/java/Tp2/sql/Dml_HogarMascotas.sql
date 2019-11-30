use  hogarmascotas;

insert into veterinarios (nombre,apellido,email,turno) 
values			
	('andrea','rodriguez','anro@hotmail.com','mañana'),
        ('andres','mendez','anme@gmail.com','tarde'),
        ('juan','reyes','jure@yahoo.es','mañana'),
        ('ana','dearco','ande@hotmail.com','tarde'),
	('jesus','clavel','jecla@gmail.com','mañana');
select * from veterinarios;
  
insert into  responsables(nombre,apellido,direccion,telefono,dni) 
values
        ('humberto','riffo','yrigoyen 2578 dpto 30',3113456,123456),
	('julia','caressi','peron 2314 piso 5',9897867,876543),
	('elena','caressi','peron 2314 piso 5',342516234,77766554),
	('sebastian','bautista','iglesias 123 piso 2',223344556,11221213),
	('gabriel','muñoz','mosquera 5000 ',876545678,01928338),
	('alberto','fernandez','mendoza 5678',123214235,09080797),
	('juan pablo','pineda','moreno 345 dpto 4',012345678,34565432),
	('cinthia','ramirez','iriarte 2345',767564656,09897656),
	('mariano','pastrana','del valle 234',456545678,98787676),
	('sofia','soledad','rioja 456',112212134,01234563),
	('carmen','del castillo','bogota 7458',997765678,91234321);
select * from responsables;


insert into perros(nombre,raza,edad,genero,idVeterinario,adopcion,idResponsable,f_adopcion)
values 		
         ('nakao','grifon',2,'macho',1,'adoptado',1,'2018-10-19'),
         ('chavela','gran danes',3,'hembra',1,'adoptado',2,'2018-10-04'),
	 ('sam','chiwawa',7,'macho',2,'adoptado',3,'2016-01-19'),
	 ('frodo','pastor aleman',8,'macho',3,'adoptado',4,'2015-05-11'),
         ('aragorn','shar pei',4,'macho',5,'adoptado',5,'2018-10-19'),
         ('vaya de oro','bull dog',1,'hembra',4,'adoptado',6,'2018-05-09'),
         ('guachin','pastor blanco zuizo',12,'macho',3,'adoptado',7,'2016-02-02'),
         ('ficus','chow choyw panda',7,'macho',5,'adoptado',8,'2016-07-19'),
         ('superdog','labrador',5,'macho',5,'no_adopt',null,null),
         ('legolas','doberman',9,'macho',4,'adoptado',9,'2014-9-18'),
         ('fito','mestizo',3,'macho',5,'no_adopt',null,null),
         ('luna','bull terrier',3,'hembra',1,'adoptado',10,'2018-12-31'),
	 ('nube','grifon',7,'hembra',1,'adoptado',11,'2014-11-20'),
         ('hierba','pitbull',5,'hembra',2,'adoptado',11,'2016-9-28'),
         ('piel roja','mestizo',16,'macho',3,'no_adopt',null,null),
         ('pulgas','jack russell',8,'macho',4,'adoptado',10,'2014-08-04'),
         ('morcilla','bernes',3,'hembra',5,'no_adopt',null,null),
  	 ('tinto','pastor blanco suizo',6,'macho',3,'adoptado',3,'2017-04-30'),
         ('malbec','yorkshire terrier',4,'hembra',2,'adoptado',4,'2018-11-22'),
         ('mordor','dalmata',6,'macho',2,'no_adopt',null,null),
         ('saruman','pinsher miniatura',7,'macho',4,'no_adopt',null,null),
         ('gollum','mastin',7,'macho',5,'adoptado',8,'2016-10-21'),
         ('marley','podenco andaluz',3,'hembra',5,'adoptado',9,'2018-10-25'),
         ('nesta','mastin tibetano',9,'hembra',3,'adoptado',6,'2017-12-29'),
         ('suños','doberman',6,'hembra',2,'adoptado',3,'2018-03-21'),
         ('agua','sabueso del tirol ',3,'hembra',2,'no_adopt',null,null),
         ('wally','mestizo',1,'macho',4,'no_adopt',null,null);
 select * from perros;
                  
 insert into gatos(nombre,raza,edad,genero,idVeterinario,adopcion,idResponsable,f_adopcion)
 values
	('michico','mestizo',4,'macho',1,'no_adopt',null,null),
	('micky','mestizo',4,'macho',1,'adoptado',1,'2018-06-11'),
        ('romina','siames',7,'hembra',2,'adoptado',2,'2019-03-11'),
        ('gufy','siberiano',5,'hembra',1,'adoptado',3,'2018-05-11'),
	('cortna','metizo',6,'macho',4,'no_adopt',null,null),
        ('chavo','egipcio',2,'macho',2,'adoptado',5,'2019-06-15'),
	('dino','bengala',7,'macho',3,'adoptado',6,'2018-09-17'),
        ('saurio','bengala',5,'macho',5,'adoptado',6,'2018-09-17'),
        ('buho','maine coon',3,'macho',3,'no_adopt',null,null),
        ('tom','ragdoll',2,'macho',2,'adoptado',7,'2018-07-19'),
        ('jerry','sphynx',5,'macho',3,'adoptado',8,'2017-06-15'),
        ('thor','siames',7,'macho',4,'no_adopt',null,null),
        ('garfiels','maine coon',10,'macho',5,'adoptado',9,'2010-12-06'),
        ('jerry','sphynx',5,'macho',3,'adoptado',8,'2017-06-15'),
        ('cocó','carey',3,'hembra',5,'adoptado',9,'2019-12-21'),
        ('bombon','himalayo',4,'hembra',3,'adoptado',10,'2016-07-04'),
        ('jerry','sphynx',5,'macho',1,'adoptado',11,'2019-05-14'),
        ('neo','bombay',2,'macho',2,'no_adopt',null,null),
        ('roca','sphynx',1,'macho',3,'no_adopt',null,null),
        ('cofee','manx',3,'hembra',4,'adoptado',1,'2018-09-16'),
        ('rry','ocycat',6,'hembra',5,'adoptado',2,'2016-03-18'),
        ('je','sphynx',2,'macho',1,'adoptado',3,'2019-05-11'),
        ('ajo','peterbald',4,'hembra',2,'adoptado',4,'2019-07-31');
  select * from gatos;      