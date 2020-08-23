select * from cliente;

INSERT INTO cliente VALUES ('C.C', 2, 'Juan', 'Diego', 'León', 'Moreno', 'uno', 23, 'Bogotá', 'Villas');
	
delete from cliente where k_numero_documento = 2;

select * from jornada;
INSERT INTO jornada VALUES ('Lunes','C.C',2, '10:08', '23:06');

select * from servicio;
INSERT INTO SERVICIO VALUES (123,5,'pequeño','SI','24/10/20','20:18',20,200,5,12345,'C.C',2,'C.C',2);

select * from ciudad;
INSERT INTO CIUDAD VALUES(12345,'Bogota','522');
select * from mensajero;
INSERT INTO mensajero VALUES ('C.C',2, 'Juan', 'Diego', 'León', 'Moreno',5,'M','col','24/5/03', 'SI','Moto', 23, 'Moto', 'SI');

select * from estado;
insert into estado values (123,'iniciado','20/12/02','POR QUE SSHI :3');

select * from trayecto;
INSERT INTO trayecto VALUES (123,1, 'HOLAPOS', 'CLL', 215, 'Villas');

select * from correo_mensajero;
