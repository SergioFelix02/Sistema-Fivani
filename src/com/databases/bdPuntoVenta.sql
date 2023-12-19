create database bdPuntoVenta
go
use bdPuntoVenta
go

create table Usuarios (
    idUsuario int primary key identity (1, 1),
    usuario varchar(50) not null,
    contrasena varchar(50) not null,
    estatus bit
)

create table Sucursales (
    idSucursal int primary key identity (1, 1),
    nombre varchar(50) not null,
    domicilio varchar(50) not null,
    estatus bit
)
create table Ventas (
    folio int primary key identity (1, 1),
    idSucursal int foreign key references Sucursales (idSucursal),
	idUsuario int foreign key references Usuarios (idUsuario),
	subtotal int,
	iva float,
	total int,
    fecha date
)

create table Productos (
    idProducto int primary key identity (1, 1),
    nombreProducto varchar(50) not null,
    descripcionProducto varchar(50) not null,
    precioProducto int not null,
    cantidadProducto int not null,
    estatus bit
)

create table Detalle_Ventas(
    idDetalleVenta int primary key identity (1, 1),
    folioVenta int foreign key references Ventas (folio),
    idProducto int foreign key references Productos (idProducto),
	precio int,
    cantidad int not null,
    subtotal int not null,
	importe int
)
go

select * from Ventas
select * from Detalle_Ventas
select * from Productos
select * from Sucursales

go

------------Ventas------------
create procedure agregarVenta
@idSucursal int,
@subtotal int,
@iva int,
@total int
as
begin
    insert into Ventas (idSucursal, subtotal, iva, total, fecha)
    values (@idSucursal, @subtotal, @iva, @total, getDate())
end
go

create procedure modificarVenta
@folio int,
@subtotal int,
@iva int,
@total int
as
begin
    update Ventas
    set subtotal = @subtotal,
		iva = @iva,
		total = @total
    where folio = @folio
end
go

create procedure eliminarVenta
@folio int
as
begin
    delete from Ventas
    where folio = @folio
end
go

------------Detalle Ventas------------
create procedure agregarDetalleVenta
@folioVenta int,
@idProducto int,
@precio int,
@cantidad int,
@subtotal int,
@importe int
as
begin
    insert into Detalle_Ventas (folioVenta, idProducto, precio, cantidad, subtotal, importe)
    values (@folioVenta, @idProducto, @precio, @cantidad, @subtotal, @importe)
end
go

create procedure eliminarDetallesDeVenta
@folioVenta int
as
begin
    delete from Detalle_Ventas
    where folioVenta = @folioVenta
end
go

------------Productos------------
create procedure agregarProducto
@nombreProducto varchar(50),
@descripcionProducto varchar(50),
@precioProducto int,
@cantidadProducto int,
@estatus bit
as
begin
    insert into Productos (nombreProducto, descripcionProducto, precioProducto, cantidadProducto, estatus)
    values (@nombreProducto, @descripcionProducto, @precioProducto, @cantidadProducto, @estatus)
end
go

create procedure modificarProducto
@idProducto int,
@nombreProducto varchar(50),
@descripcionProducto varchar(50),
@precioProducto int,
@cantidadProducto int
as
begin
    update Productos
    set nombreProducto = @nombreProducto,
        descripcionProducto = @descripcionProducto,
        precioProducto = @precioProducto,
        cantidadProducto = @cantidadProducto
    where idProducto = @idProducto
end
go

create procedure venderProducto
@idProducto int,
@cantidadProducto int
as
begin
    update Productos
    set cantidadProducto = cantidadProducto - @cantidadProducto
    where idProducto = @idProducto
end
go

create procedure estatusProducto
@idProducto int,
@estatus bit
as
begin
    update Productos
    set estatus = @estatus
    where idProducto = @idProducto
end
go

------------Sucursales------------
create procedure agregarSucursal
@nombre varchar(50),
@domicilio varchar(50),
@estatus bit
as
begin
    insert into Sucursales(nombre, domicilio, estatus)
    values (@nombre, @domicilio, @estatus)
end
go

create procedure modificarSucursal
@idSucursal int,
@nombre varchar(50),
@domicilio varchar(50)
as
begin
    update Sucursales
    set nombre = @nombre,
        domicilio = @domicilio
    where idSucursal = @idSucursal
end
go

create procedure estatusSucursal
@idSucursal int,
@estatus bit
as
begin
    update Sucursales
    set estatus = @estatus
    where idSucursal = @idSucursal
end
go

-----------Usuarios-----------

create procedure agregarUsuario
@usuario varchar(50),
@contrasena varchar(50),
@estatus bit
as
begin
    insert into Usuarios (usuario, contrasena, estatus)
    values (@usuario, @contrasena, @estatus)
end
go

create procedure modificarUsuario
@idUsuario int,
@usuario varchar(50),
@contrasena varchar(50)
as
begin
    update Usuarios
    set usuario = @usuario,
        contrasena = @contrasena
    where idUsuario = @idUsuario
end
go

create procedure estatusUsuario
@idUsuario int,
@estatus bit
as
begin
    update Usuarios
    set estatus = @estatus
    where idUsuario = @idUsuario
end
go

------------Extras------------
create procedure calcularTotalVenta
@folio int
as
begin
    declare @subtotal int
    set @subtotal = (
        select sum(subtotal)
        from Detalle_Ventas
        where folioVenta = @folio
    )
	declare @total int
	set @total = @subtotal + (@subtotal * (
		select iva / 100
		from Ventas
		where folio = @folio
	))
	update Ventas
    set subtotal = @subtotal,
		total = @total
	where folio = @folio
end
go

------------Reportes------------
create procedure VentasSucursal
@idSucursal int,
@fechaInicial datetime,
@fechaFinal datetime
as
begin
	select *
    from Ventas
    where idSucursal = @idSucursal
    and fecha between @fechaInicial and @fechaFinal
end
go

create procedure VentasGeneral
@fecha datetime
as
begin
	select *
    from Ventas
    where fecha = @fecha
end
go

create procedure ProductosMasVendidos
as
begin
    select top 3 P.idProducto, P.nombreProducto, sum(V.cantidad) vendidos
    from Detalle_Ventas V
    inner join Productos P
    on V.idProducto = P.idProducto
    group by P.idProducto, P.nombreProducto
    order by sum(V.cantidad) desc
end
go

create procedure ProductosVenta
@folio int
as
begin
	select P.idProducto, P.nombreProducto, V.precio, V.cantidad, V.subtotal
	from Detalle_Ventas V
	inner join Productos P
	on V.idProducto = P.idProducto
	where folioVenta = @folio
end
go

------------Id jumping to 1000 fix------------
ALTER DATABASE SCOPED CONFIGURATION SET IDENTITY_CACHE = OFF

------------Pruebas------------

use bdPuntoVenta
select * from Ventas
select * from Detalle_Ventas
select * from Productos
select * from Sucursales

/*
exec agregarVenta 1, 0, 12, 0
exec eliminarVenta 2

exec agregarDetalleVenta 3, 1, 499, 2, 998, 1000
exec eliminarDetallesDeVenta 1

exec calcularTotalVenta 3

exec agregarProducto 'Movil', 'Gamer', 5999, 2, 1
exec modificarProducto 3, 'Movil', 'Samsung', 6999, 3
exec estatusProducto 3, 1

exec agregarSucursal 'Aguaruto', 'a', 1
exec modificarSucursal 3, 'Las torres', 'Col. Las torres'
exec estatusSucursal 3, 1


exec calcularTotalVentaD 3
select * from Ventas

select * from Detalle_Ventas

exec agregarDetalleVenta 

delete from Ventas
where folio > 3

exec agregarVenta 1, 0, 12, 0

exec calcularTotalVenta 3

exec modificarVenta 

exec VentasSucursal 1, '2021-12-08', '2021-12-10'
exec VentasGeneral '2021-12-08'
exec ProductosMasVendidos
exec ProductosVenta 11
*/
