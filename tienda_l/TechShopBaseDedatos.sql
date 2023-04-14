 /*Las líneas 2 y 3 están en comentarios, para usarse así la primera vez... luego de eso se quitan los comentarios para que todo funcione bien, en las siguientes ejecuciones */
/*drop schema SistemaMTSS ;
drop user usuario_prueb;*/

/*Se crea la base de datos */
CREATE SCHEMA SistemaMTSS ;
/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_prueb'@'%' identified by 'Usuar1o_Clav';
/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on SistemaMTSS.* to 'usuario_prueb'@'%';
flush privileges;

CREATE TABLE SistemaMTSS.factura (
  id_factura INT NOT NULL AUTO_INCREMENT,
  detalles VARCHAR(20) NOT NULL,
  monto double,
  tipo VARCHAR(30) NOT NULL,
  activo bool,
  PRIMARY KEY (`id_factura`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

INSERT INTO SistemaMTSS.factura (id_factura,detalles,monto,tipo,activo) VALUES 
('1','Monitores', 10000,'Monitores',    true)


