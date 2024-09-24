
-- tabla direccion
DELIMITER //

SELECT * FROM lab4.direccion;


CREATE PROCEDURE INSERTAR_DIRECCION(
	IN _idDireccion INT,
    IN _fidCliente VARCHAR(100),
    IN _calle VARCHAR(100), 
    IN _numero VARCHAR(100),
    IN _distrito VARCHAR(100),
    IN _provincia VARCHAR(100),
    IN _departamento VARCHAR(100),
    IN _codigoPostal VARCHAR(100),
    IN _referencia TEXT    
)
BEGIN 
	INSERT INTO direccion(idDireccion,fidCliente,calle,numero,distrito,provincia,departamento,codigoPostal,referencia) 
    VALUES (_idDireccion, _fidCliente, _calle, _numero, _distrito, _provincia, _departamento, _codigoPostal, _referencia);
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
    IN _referencia TEXT    
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
		referencia = _referencia 
    WHERE idDireccion = _idDireccion;
END //


CREATE PROCEDURE ELIMINAR_CLINETE





DELIMITER ;
