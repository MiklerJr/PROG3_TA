-- USUARIOS
CREATE TABLE usuario(
	idUsuario INT AUTO_INCREMENT,
    dni VARCHAR(100),
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    correo VARCHAR(100),
    contrasenha VARCHAR(100),
    activo BOOLEAN,
    PRIMARY KEY(idUsuario)
)ENGINE = innodb;

CREATE TABLE administrador(
	idAdministrador INT,
    PRIMARY KEY(idAdministrador),
    FOREIGN KEY(idAdministrador) REFERENCES usuario(idUsuario)
)ENGINE = innodb;

CREATE TABLE trabajador(
	idTrabajador INT,
    fidPromocion INT,
    fidCupon INT,
    fechaContrato DATE,
    horario DATETIME,
    PRIMARY KEY(idTrabajador),
    FOREIGN KEY(idTrabajador) REFERENCES usuario(idUsuario)
)ENGINE = innodb;

CREATE TABLE cliente(
	idCliente INT,
    fidDireccion INT,
    fidCarrito INT,
    fidOrden INT,
    PRIMARY KEY(idCliente),
    FOREIGN KEY(idCliente) REFERENCES usuario(idUsuario)
)ENGINE = innodb;

CREATE TABLE direccion(
	idDireccion INT AUTO_INCREMENT,
    calle VARCHAR(100),
    numero VARCHAR(100),
    distrito VARCHAR(100),
    provincia VARCHAR(100),
    departamento VARCHAR(100),
    codigoPostal VARCHAR(100),
    referencia TEXT,
    activo BOOLEAN,
    PRIMARY KEY(idDireccion)
)ENGINE = innodb;

ALTER TABLE cliente ADD CONSTRAINT fkClienteDireccion FOREIGN KEY(fidDireccion) REFERENCES direccion(idDireccion);

CREATE TABLE moneda(
	idMoneda INT AUTO_INCREMENT,
    nombre VARCHAR(100),
	tipoCambio DECIMAL(10, 2),
    simbolo VARCHAR(255),
    activo BOOLEAN,
    PRIMARY KEY(idMoneda)
)ENGINE = innodb;

CREATE TABLE tarjeta(
	idTarjeta INT AUTO_INCREMENT,
    fidMoneda INT,
    numero VARCHAR(100),
    cvv VARCHAR(100),
    fechaCaducidad DATE,
    tipo ENUM('Credito', 'Debito'),
    activo BOOLEAN,
    PRIMARY KEY(idTarjeta),
    FOREIGN KEY(fidMoneda) REFERENCES moneda(idMoneda)
)ENGINE = innodb;

CREATE TABLE clientextarjeta(
	idCliente INT,
    idTarjeta INT,
    PRIMARY KEY(idCliente, idTarjeta),
    FOREIGN KEY(idCliente) REFERENCES cliente(idCliente),
    FOREIGN KEY(idTarjeta) REFERENCES tarjeta(idTarjeta)
)ENGINE = innodb;

CREATE TABLE cupon(
	idCupon INT AUTO_INCREMENT,
    fidTrabajador INT,
    fidOrden INT,
    codigo VARCHAR(100),
    descripcion TEXT,
    fechaInicio DATE,
    fechaFin DATE,
    usado BOOLEAN,
    activo BOOLEAN,
    PRIMARY KEY(idCupon),
    FOREIGN KEY(fidTrabajador) REFERENCES trabajador(idTrabajador)
)ENGINE = innodb;

ALTER TABLE trabajador ADD CONSTRAINT fkTrabajadorCupon FOREIGN KEY(fidCupon) REFERENCES cupon(idCupon);

CREATE TABLE clientexcupon(
	idCliente INT,
    idCupon INT,
    PRIMARY KEY(idCliente, idCupon),
    FOREIGN KEY(idCliente) REFERENCES cliente(idCliente),
    FOREIGN KEY(idCupon) REFERENCES cupon(idCupon)
)ENGINE = innodb;

-- --------------------------------------------------------------------------------

-- COMPRAS
CREATE TABLE comprobante(
	idComprobante INT AUTO_INCREMENT,
    fidOrden INT,
    totalPagar DECIMAL(10, 2),
    PRIMARY KEY(idComprobante)
)ENGINE = innodb;

CREATE TABLE boleta(
	idBoleta INT,
    dni VARCHAR(100),
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    PRIMARY KEY(idBoleta),
    FOREIGN KEY(idBoleta) REFERENCES comprobante(idComprobante)
)ENGINE = innodb;

CREATE TABLE factura(
	idFactura INT,
    ruc VARCHAR(100),
    razonSocial VARCHAR(100),
    repreLegal VARCHAR(100),
    PRIMARY KEY(idFactura),
    FOREIGN KEY(idFactura) REFERENCES comprobante(idComprobante)
)ENGINE = innodb;

CREATE TABLE ordencompra(
	idOrden INT AUTO_INCREMENT,
    fidComprobante INT,
    fidCarrito INT,
    fechaPedida DATE,
    fechaPago DATE,
    estado ENUM('Registrado', 'Procesado', 'Anulado', 'Entregado'),
    dni VARCHAR(100),
    correo VARCHAR(100),
    PRIMARY KEY(idOrden),
    FOREIGN KEY(fidComprobante) REFERENCES comprobante(idComprobante)
)ENGINE = innodb;

ALTER TABLE cupon ADD CONSTRAINT fkCuponOrden FOREIGN KEY(fidOrden) REFERENCES ordencompra(idOrden);
ALTER TABLE comprobante ADD CONSTRAINT fkComprobanteOrden FOREIGN KEY(fidOrden) REFERENCES ordencompra(idOrden);
ALTER TABLE cliente ADD CONSTRAINT fkClienteOrden FOREIGN KEY(fidOrden) REFERENCES ordencompra(idOrden);

CREATE TABLE carrito(
	idCarrito INT AUTO_INCREMENT,
    fidOrden INT,
    fidPrendaSeleccionada INT,
    cantidadTotal INT,
    precioTotal DECIMAL(10, 2),
    PRIMARY KEY(idCarrito),
    FOREIGN KEY(fidOrden) REFERENCES ordencompra(idOrden)
)ENGINE = innodb;

ALTER TABLE cliente ADD CONSTRAINT fkClienteCarrito FOREIGN KEY(fidCarrito) REFERENCES carrito(idCarrito);
ALTER TABLE ordencompra ADD CONSTRAINT fkOrdenCarrito FOREIGN KEY(fidCarrito) REFERENCES carrito(idCarrito);

CREATE TABLE prendaseleccionada(
	idPrendaSeleccionada INT,
    fidCarrito INT,
	cantidad INT,
    precio DECIMAL(10, 2),
    PRIMARY KEY(idPrendaSeleccionada),
    FOREIGN KEY(fidCarrito) REFERENCES carrito(idCarrito)
)ENGINE = innodb;

ALTER TABLE carrito ADD CONSTRAINT fkCarritoPrendaSeleccionada FOREIGN KEY(fidPrendaSeleccionada) REFERENCES prendaseleccionada(idPrendaSeleccionada);

-- --------------------------------------------------------------------------------

-- PRENDAS
CREATE TABLE prenda(
	idPrenda INT AUTO_INCREMENT,
	nombre VARCHAR(100),
	descripcion TEXT,
	tipo ENUM('Polo', 'Pantalon', 'Polera', 'Camisa', 'Casaca'),
	imagen VARCHAR(255),
	talla ENUM('XS', 'S', 'M', 'L', 'XL', 'XXL'),
	genero ENUM('Hombre', 'Mujer', 'Unisex'),
	color VARCHAR(100),
	precio DECIMAL(10, 2),
	stock INT,
	cantVendida INT,
	activo BOOLEAN,
	PRIMARY KEY(idPrenda)
)ENGINE = innodb;

ALTER TABLE prendaseleccionada ADD CONSTRAINT fkPrendaSeleccionadaID FOREIGN KEY(idPrendaSeleccionada) REFERENCES prenda(idPrenda);

CREATE TABLE prendaseleccionadaxorden(
	idPrenda INT,
    idOrden INT,
    PRIMARY KEY(idPrenda, idOrden),
    FOREIGN KEY(idPrenda) REFERENCES prenda(idPrenda),
    FOREIGN KEY(idOrden) REFERENCES ordencompra(idOrden)
)ENGINE = innodb;

CREATE TABLE promocion(
	idPromocion INT AUTO_INCREMENT,
	nombre VARCHAR(100),
	descripcion TEXT,
	fechaInicio DATE,
	fechaFin DATE,
	activo BOOLEAN,
	PRIMARY KEY(idPromocion)
)ENGINE = innodb;

ALTER TABLE trabajador ADD CONSTRAINT fkTrabajadorPromocion FOREIGN KEY(fidPromocion) REFERENCES promocion(idPromocion);

CREATE TABLE prendaxpromocion(
	idPrenda INT,
    idPromocion INT,
    PRIMARY KEY(idPrenda, idPromocion),
    FOREIGN KEY(idPrenda) REFERENCES prenda(idPrenda),
    FOREIGN KEY(idPromocion) REFERENCES promocion(idPromocion)
)ENGINE = innodb;
