DROP DATABASE  IF EXISTS hogarmascotas;
CREATE DATABASE          hogarmascotas;




USE hogarmascotas;
USE vNXTSt9W4T;

DROP TABLE IF EXISTS     gatos;
CREATE TABLE  gatos (
  idGato                    INT(11) NOT NULL AUTO_INCREMENT,
  nombre                    VARCHAR(45) NOT NULL,
  raza                      VARCHAR(45) NOT NULL,
  edad                      INT(11) NOT NULL,
  v_trivalente              ENUM('si', 'no') NOT NULL,
  v_leucemia                ENUM('si', 'no') NOT NULL,
  v_rabia                   ENUM('si', 'no') NOT NULL,
  esterilizado              ENUM('esterilizado', 'no esteri') NOT NULL,
  peso                      DOUBLE NOT NULL,
  genero                    ENUM('hembra', 'macho') NOT NULL,
  f_ingreso                 DATE NOT NULL,
  idVeterinario             INT(11) NOT NULL,
  adopcion                  ENUM('adoptado', 'no adopt') NOT NULL,
  idResponsable             INT(11) NULL DEFAULT NULL,
  f_adopcion                DATE NULL DEFAULT NULL,
  PRIMARY KEY               (idGato));
 





DROP TABLE IF EXISTS     perros;
CREATE TABLE perros (
  idPerro               INT(11) NOT NULL AUTO_INCREMENT,
  nombre                VARCHAR(45) NOT NULL,
  raza                  VARCHAR(45) NOT NULL,
  edad                  INT(11) NOT NULL,
  v_parvovirus          ENUM('si', 'no') NOT NULL,
  v_moquillo            ENUM('si', 'no') NOT NULL,
  v_adenovirus          ENUM('si', 'no') NOT NULL,
  v_hepatitis           ENUM('si', 'no') NOT NULL,
  v_rabia               ENUM('si', 'no') NOT NULL,
  esterilizacion        ENUM('esterilizado', 'no esteri') NOT NULL,
  peso                  DOUBLE NOT NULL,
  genero ENUM           ('hembra', 'macho') NOT NULL,
  fechaIngreso          DATE NOT NULL,
  idVeterinario         INT(11) NOT NULL,
  adopcion ENUM         ('adoptado', 'no adopt') NOT NULL,
  idResponsable         INT(11) NULL DEFAULT NULL,
  fechaAdopcion         DATE NULL DEFAULT NULL,
  PRIMARY KEY           (idPerro));
 
  

DROP TABLE IF EXISTS     responsables;
CREATE TABLE      responsables (
  idResponsable      INT(11) NOT NULL AUTO_INCREMENT,
  nombre             VARCHAR(45) NOT NULL,
  apellido           VARCHAR(45) NOT NULL,
  direccion TEXT     NOT NULL,
  telefono           INT(11) NULL DEFAULT NULL,
  ciudad             VARCHAR(45) NOT NULL,
  email              VARCHAR(45) NULL DEFAULT NULL,
  dni INT(11)        NOT NULL,
  PRIMARY KEY       (idResponsable));


DROP TABLE IF EXISTS     veterinarios;
CREATE TABLE  veterinarios (
  idVeterinario      INT(11) NOT NULL AUTO_INCREMENT,
  nombre             VARCHAR(45) NOT NULL,
  apellido           VARCHAR(45) NOT NULL,
  email              VARCHAR(45) NULL DEFAULT NULL,
  turno              ENUM('mañana', 'tarde') NOT NULL,
  salario            DOUBLE NOT NULL,
  PRIMARY KEY        (idVeterinario));




alter table gatos
    add constraint fk_gatos_veterinarios
    foreign key(idVeterinario)
    references veterinarios(idVeterinario);

alter table gatos
    add constraint fk_gatos_responsables
    foreign key(idResponsable)
    references responsables(idResponsable);



alter table perros
    add constraint fk_perros_veterinarios
    foreign key(idVeterinario)
    references veterinarios(idVeterinario);

 alter table perros
    add constraint fk_perros_responsables
    foreign key(idResponsable)
    references responsables(idResponsable);
