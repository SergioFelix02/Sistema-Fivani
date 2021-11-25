create database bdFivani
go
use bdFivani
go

create table Usuarios (
    idUsuario int primary key identity (1, 1),
    usuario varchar(50) not null,
    contrasena varchar(50) not null,
    estatus bit
)
create table Ventas (
    idVenta int primary key identity (1, 1),
    idUsuario int foreign key references Usuarios (idUsuario),
    fecha datetime,
    total int
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
    idVenta int foreign key references Ventas (idVenta),
    idProducto int foreign key references Productos (idProducto),
    cantidad int not null,
    subtotal int not null
)
go

select * from Ventas
select * from Detalle_Ventas
select * from Productos
select * from Usuarios
go

create procedure agregarVenta
@idUsuario int,
@total int
as
begin
    insert into Ventas (idUsuario, fecha, total)
    values (@idUsuario, getDate(), @total)
end
go

create procedure modificarVenta
@idVenta int,
@total int
as
begin
    update Ventas
    set total = @total
    where idVenta = @idVenta
end
go

create procedure agregarDetalleVenta
@idVenta int,
@idProducto int,
@cantidad int,
@subtotal int
as
begin
    insert into Detalle_Ventas (idVenta, idProducto, cantidad, subtotal)
    values (@idVenta, @idProducto, @cantidad, @subtotal)
end
go

create procedure modificarDetalleVenta
@idDetalleVenta int,
@idProducto int,
@cantidad int,
@subtotal int
as
begin
    update Detalle_Ventas
    set idProducto = @idProducto,
        cantidad = @cantidad,
        subtotal = @subtotal
    where idDetalleVenta = @idDetalleVenta
end
go

create procedure eliminarDetalleVenta
@idDetalleVenta int,
@idProducto int,
@cantidad int,
@subtotal int
as
begin
    delete from Detalle_Ventas
    where idDetalleVenta = @idDetalleVenta
end
go

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

create procedure getSelectUsuarios
as
begin
    select * from Usuarios
end
go

create procedure getSelectProductos
as
begin
    select * from Productos
end
go

create procedure getSelectVenta
@idVenta int
as
begin
    select * from Ventas
    where idVenta = @idVenta
end
go

create procedure getSelectDetalleVentas
@idVenta int
as
begin
    select idDetalleVenta, idProducto, cantidad, subtotal
    from Detalle_Ventas
    where idVenta = @idVenta
end
go

create procedure calcularTotalVenta
@idVenta int
as
begin
    declare @total int
    set @total = (
        select sum(subtotal)
        from Detalle_Ventas
        where idVenta = @idVenta
    )
    update Ventas
    set total = @total
    where idVenta = @idVenta
end
declare @Venta int
set @Venta = (
    select sum(subtotal)
    from Detalle_Ventas
    where idVenta = 1
)
go

use bdFivani
exec agregarUsuario 'magdiel', '1234', 1
exec agregarUsuario 'SA', 'Safp270602', 1
exec agregarProducto 'Mouse', 'Gamer', 349, 5, 1
exec agregarProducto 'Teclado', 'Normal', 149, 2, 1
exec agregarVenta 1, 0
exec agregarDetalleVenta 11, 3, 2 , 698
exec agregarDetalleVenta 11, 4, 2 , 155
exec calcularTotalVenta 1
exec getSelectVenta 1
exec getSelectDetalleVentas 1
exec getSelectProductos
exec getSelectUsuarios
exec calcularTotalVenta 11

select * from Ventas

DBCC CHECKIDENT ('Productos', RESEED, 1)

delete from Productos
delete from Ventas
delete from Detalle_Ventas