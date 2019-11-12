use hogarmascotas;
use vNXTSt9W4T;
select * from perros;
select * from gatos;
select * from responsables;
select * from veterinarios;

-- 1 listar  el nombre de los animales  que adopto el responsable 4


 select    perros.nombre  from perros
 where              perros.idResponsable = 4;

 select   nombre    from gatos
 where              gatos.idResponsable = 4;



-- 2 listar los perros  adoptados en el 2016 
 select      *     from perros 
 where             perros.fechaAdopcion  
 between       '2016-01-01' and '2016-12-31'
 and            perros.adopcion='adoptado';


-- 3 perro  de mayor  edad
 select     concat( edad,'    ',nombre )as 'nombre y edad del perro'
 from       perros 
 order by   perros.edad desc limit 1;

-- 4 listar los perros que tengan  solo  vacuna del parvovirus 
 select *       from     perros
 where          perros.v_rabia='no'
 and            perros.v_hepatitis='no'
 and            perros.v_adenovirus='no' 
 and            perros.v_moquillo='no'
 and            perros.v_parvovirus='si';


--  5 fecha  del perro que  ingreso al  hogar  mas recientemente
 select     *    from  perros
 order by        perros.fechaIngreso desc limit 1 ;



--  6 cantidad de perros que atendió el veterinario con id 5   en el año 2016
 select     *    from  perros 
 where      perros.idVeterinario = 5    
 and        perros.fechaIngreso    
 between   '2016-01-01' and '2016-12-31';


-- 7 listar  los nomnbres de los  perros que son  adoptados junto con el nombre de su responsable 
 select         perros.nombre as 'perro', responsables.nombre as 'responsable'   from  perros
 inner join     responsables 
 on             responsables.idResponsable = perros.idResponsable
 where          perros.adopcion = 'adoptado';
 
 -- 8 mostrar perros que comiencen con la letra m
 select   perros.nombre as 'nombre de perros con M ' from   perros
 where    nombre         like   'm%';
 

 -- 9  mostrar perros que comiencen con la letra n y el nombre del responsable por h
 select       perros.nombre as 'perro con letra n', responsables.nombre as 'responsable con letra H'  
 from perros
 inner join   responsables 
 on           responsables.idResponsable = perros.idResponsable
 where        responsables.nombre like 'h%' and  perros.nombre like 'n%';
  
-- 10  listar  el nombre y la raza de todos perros que  hay con su responsable
-- si lo tiene  si no lo tiene muestrelo  tambn 
 
 select      perros.nombre, perros.raza,responsables.nombre   from    perros
 left join   responsables  on responsables.idResponsable=perros.idResponsable
 order by    perros.nombre,perros.raza, responsables.nombre;   
