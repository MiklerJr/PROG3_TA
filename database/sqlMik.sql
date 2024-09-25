
-- tabla direccion
DELIMITER //

SELECT * FROM TA.direccion;

-- PROCEDIMIENTOS PARA DIRECCION

CREATE PROCEDURE INSERTAR_DIRECCION(
    IN _fidCliente VARCHAR(100),
    IN _calle VARCHAR(100), 
    IN _numero VARCHAR(100),
    IN _distrito VARCHAR(100),
    IN _provincia VARCHAR(100),
    IN _departamento VARCHAR(100),
    IN _codigoPostal VARCHAR(100),
    IN _referencia TEXT,
    IN _activo tinyint(1)
)
BEGIN 
	INSERT INTO direccion(fidCliente,calle,numero,distrito,provincia,departamento,codigoPostal,referencia,activo) 
    VALUES (_fidCliente, _calle, _numero, _distrito, _provincia, _departamento, _codigoPostal, _referencia,_activo);
END //

CREATE PROCEDURE MODIFICAR_DIRECCION(
	IN _idDireccion INT,
    IN _fidCliente VARCHAR(100),
    IN _calle VARCHAR(100), 
    IN _numero VARCHAR(100),
    IN _distrito VARCHAR(100),
    IN _provincia VARCHAR(100),
    IN _departamento VARCHAR(100),
    IN _codigoPostal VARCHAR(100),
    IN _referencia TEXT,
    IN _activo tinyint(1)
)
BEGIN 
	UPDATE direccion SET 
		fidCliente = _fidCliente,
		calle = _calle,
		numero = _numero,
		distrito = _distrito,
		provincia = _provincia,
		departamento = _departamento,
		codigoPostal = _codigoPostal,
		referencia = _referencia ,
        activo = _activo
    WHERE idDireccion = _idDireccion;
END //



DELIMITER //

CREATE PROCEDURE ELIMINAR_DIRECCION (
	IN _idDireccion INT
)
BEGIN 
	UPDATE direccion 
    SET activo = 0 
    WHERE idDireccion = _idDireccion;
END//

CREATE PROCEDURE LISTAR_DIRECCION_TODOS()
BEGIN 
	SELECT idDireccion, calle, numero, distrito, provincia, departamento, codigoPostal, referencia, activo 
    FROM direccion;
END//


CREATE PROCEDURE LISTAR_DIRECCION_X_ID(
	IN _idDireccion INT
)
BEGIN 
	SELECT idDireccion,calle,numero,distrito,provincia,departamento,codigoPostal,referencia,activo 
    FROM direccion 
    WHERE idDireccion = _idDireccion;
END//


-- PROCEDIMIENTOS PARA CLIENTE


CREATE PROCEDURE INSERTAR_CLIENTE(
	OUT _idCliente INT,
    IN _dni VARCHAR(100),
    IN _nombres VARCHAR(100),
    IN _apellidos VARCHAR(100),
    IN _correo VARCHAR(100),
    IN _contrasenha VARCHAR(100),
    IN _activo TINYINT,
    IN _fidCarrito INT
)
BEGIN 
	INSERT INTO usuario(dni,nombres,apellidos,correo,contrasenha,activo) 
    VALUES (_dni,_nombres,_apellidos,_correo,_contrasenha,_activo);
    
    SET _idCliente = @@last_insert_id;
    INSERT INTO cliente(idCliente,fidCarrito) VALUES (_idCliente,_fidCarrito);
END//


CREATE PROCEDURE MODIFICAR_CLIENTE(
	IN _idCliente INT,
    IN _dni VARCHAR(100),
    IN _nombres VARCHAR(100),
    IN _apellidos VARCHAR(100),
    IN _correo VARCHAR(100),
    IN _contrasenha VARCHAR(100),
    IN _activo TINYINT
)
BEGIN 
	UPDATE usuario SET 

		dni = _dni,
		nombres = _nombres,
		apellidos = _apellidos,
		correo = _correo,
		contrasenha = _contrasenha,
		activo = _activo
    WHERE  idUsuario = _idCliente; -- ya que estamos modificando a la clase padre desde la hija
END//

CREATE PROCEDURE ELIMINAR_CLIENTE (
	IN _idCliente INT
)
BEGIN 
	UPDATE usuario 
    SET activo = 0 
    WHERE idUsuario = _idCliente;
END//

CREATE PROCEDURE LISTAR_CLIENTE_TODOS()
BEGIN 
	SELECT idUsuario,dni,nombres,apellidos,correo,contrasenha,activo,c.fidCarrito
    FROM usuario,cliente;
END//


CREATE PROCEDURE LISTAR_CLIENTE_X_ID(
	IN _idCliente INT
)
BEGIN 
	SELECT idUsuario,dni,nombres,apellidos,correo,contrasenha,activo,c.fidCarrito
    FROM usuario,cliente c
    WHERE idUsuario = _idCliente;
END//

-- PROCEDIMIENTOS PARA TRABAJADOR

select * from trabajador;

CREATE PROCEDURE INSERTAR_TRABAJADOR(
	OUT _idTrabajador INT,
    IN _dni VARCHAR(100),
    IN _nombres VARCHAR(100),
    IN _apellidos VARCHAR(100),
    IN _correo VARCHAR(100),
    IN _contrasenha VARCHAR(100),
    IN _activo TINYINT,
    
    IN  _fechaContrato DATE,
    IN  _horario 	DATETIME
)
BEGIN 
	
	INSERT INTO usuario(dni,nombres,apellidos,correo,contrasenha,activo) 
    VALUES (_dni,_nombres,_apellidos,_correo,_contrasenha,_activo);
    
     SET _idTrabajador = @@last_insert_id;
     
     INSERT INTO trabajador(idTrabajador,fechaContrato,horario) 
     VALUES (_idTrabajador,_fechaContrato,_horario);
    
END//

CREATE PROCEDURE MODIFICAR_TRABAJADOR(
	IN _idTrabajador INT,
    IN _dni VARCHAR(100),
    IN _nombres VARCHAR(100),
    IN _apellidos VARCHAR(100),
    IN _correo VARCHAR(100),
    IN _contrasenha VARCHAR(100),
    IN _activo TINYINT,
    IN  _fechaContrato DATE
)
BEGIN 
	UPDATE usuario SET 
		dni = _dni,
		nombres = _nombres,
		apellidos = _apellidos,
		correo = _correo,
		contrasenha = _contrasenha,
		activo = _activo
    WHERE  idUsuario = _idTrabajador; -- ya que estamos modificando a la clase padre desde la hija
    
    UPDATE trabajador SET
    fechaContrato = _fechaContrato
    WHERE idTrabajador = _idTrabajador;
    
END//


CREATE PROCEDURE ELIMINAR_TRABAJADOR(IN _idTrabajador INT)
BEGIN 
	UPDATE usuario SET activo = 0 WHERE idUsuario = _idTrabajador; 
END//

CREATE PROCEDURE LISTAR_TRABAJADOR_X_ID(IN _idTrabajador INT)
BEGIN 

	SELECT t.idTrabajador,u.dni,u.nombres,u.apellidos,u.correo,u.contrasenha,u.activo,t.fechaContrato,t.horario FROM trabajador t, usuario u WHERE idUsuario = _idTrabajador and idTrabajador = _idTrabajador;  

END//

CREATE PROCEDURE LISTAR_TRABAJADOR_TODOS()
BEGIN 
	SELECT t.idTrabajador,u.dni,u.nombres,u.apellidos,u.correo,u.contrasenha,u.activo,t.fechaContrato,t.horario FROM trabajador t, usuario u WHERE  t.idTrabajador = u.idUsuario;  
END//

-- PROCEDIMIENTOS PARA ADMINISTRADOR

CREATE PROCEDURE INSERTAR_ADMINISTRADOR(
	OUT _idAdministrador INT,
    IN _dni VARCHAR(100),
    IN _nombres VARCHAR(100),
    IN _apellidos VARCHAR(100),
    IN _correo VARCHAR(100),
    IN _contrasenha VARCHAR(100),
    IN _activo TINYINT
)
BEGIN 
	
	INSERT INTO usuario(dni,nombres,apellidos,correo,contrasenha,activo) 
    VALUES (_dni,_nombres,_apellidos,_correo,_contrasenha,_activo);
    
     SET _idAdministrador = @@last_insert_id;
     
     INSERT INTO administrador (idAdministrador) 
     VALUES (_idAdministrador);
    
END//

CREATE PROCEDURE MODIFICAR_ADMINISTRADOR(
	IN _idAdministrador INT,
    IN _dni VARCHAR(100),
    IN _nombres VARCHAR(100),
    IN _apellidos VARCHAR(100),
    IN _correo VARCHAR(100),
    IN _contrasenha VARCHAR(100),
    IN _activo TINYINT
)
BEGIN 
	UPDATE usuario SET 
		
		dni = _dni,
		nombres = _nombres,
		apellidos = _apellidos,
		correo = _correo,
		contrasenha = _contrasenha,
		activo = _activo
    WHERE  idUsuario = _idAdministrador; -- ya que estamos modificando a la clase padre desde la hija
END//


CREATE PROCEDURE ELIMINAR_ADMINISTRADOR(IN _idAdministrador INT)
BEGIN 
	UPDATE usuario SET activo = 0 WHERE idUsuario = _idAdministrador; 
END//

CREATE PROCEDURE LISTAR_ADMINISTRADOR_TODOS()
BEGIN 
	SELECT dni,nombres,apellidos,correo,contrasenha,activo FROM usuario;
END//

CREATE PROCEDURE LISTAR_ADMINISTRADOR_X_ID(IN _idAdministrador INT)
BEGIN 

	SELECT dni,nombres,apellidos,correo,contrasenha,activo FROM usuario WHERE idUsuario = _idAdministrador;  

END//



-- PROCEDIMIENTOS PARA CUPON

CREATE PROCEDURE INSERTAR_CUPON(
    IN _fidTrabajador INT,
    IN _codigo VARCHAR(100),
    IN _descripcion TEXT,
    IN _fechaInicio DATE,
    IN _fechaFin DATE,
    IN _usado TINYINT(1),
    IN _activo TINYINT(1)
)
BEGIN 
	INSERT INTO cupon(fidTrabajador,codigo,descripcion,fechaInicio,fechaFin,usado,activo) 
    VALUES (_fidTrabajador,_codigo,_descripcion,_fechaInicio,_fechaFin,_usado,_activo);
END//

CREATE PROCEDURE MODIFICAR_CUPON(
	IN _idCupon INT,
    IN _fidTrabajador INT,
    IN _codigo VARCHAR(100),
    IN _descripcion TEXT,
    IN _fechaInicio DATE,
    IN _fechaFin DATE,
    IN _usado TINYINT(1),
    IN _activo TINYINT(1)
)
BEGIN 
	UPDATE cupon SET 
		fidTrabajador = _fidTrabajador,
		codigo = _codigo,
		descripcion = _descripcion,
		fechaInicio = _fechaInicio,
		fechaFin = _fechaFin,
        usado = _usado,
        activo = _activo
    WHERE  idCupon = _idCupon;
END//

CREATE PROCEDURE ELIMINAR_CUPON (
	IN _idCupon INT
)
BEGIN 
	UPDATE cupon 
    SET activo = 0 
    WHERE idCupon = _idCupon;
END//

CREATE PROCEDURE LISTAR_CUPON_TODOS()
BEGIN 
	SELECT idCupon,fidTrabajador,codigo,descripcion,fechaInicio,fechaFin,usado,activo 
    FROM cupon;
END//


CREATE PROCEDURE LISTAR_CUPON_X_ID(
	IN idCupon INT
)
BEGIN 
	SELECT idCupon,fidTrabajador,codigo,descripcion,fechaInicio,fechaFin,usado,activo 
    FROM cupon
    WHERE idCupon = _idCupon;
END//
