create database bdFivani
use bdFivani

create table Ventas (
    idVenta int primary key identity (1, 1),
    idUsuario int foreign key references Usuarios (idUsuario),
    fecha datetime,
    total int
)

create table Detalle_Ventas(
    idDetalleVenta int primary key identity (1, 1),
    idVenta int foreign key references Ventas (idVenta),
    idProducto int foreign key references Productos (idProducto),
    cantidad int not null,
    subtotal int not null
)

create table Productos (
    idProducto int primary key identity (1, 1),
    nombreProducto varchar(50) not null,
    descripcionProducto varchar(50) not null,
    precioProducto int not null,
    cantidadProducto int not null,
    estatus bit
)

create table Usuarios (
    idUsuario int primary key identity (1, 1),
    usuario varchar(50) not null,
    contrasena varchar(50) not null,
    estatus bit
)

select * from Ventas
select * from Detalle_Ventas
select * from Productos
select * from Usuarios

create procedure agregarVenta
@idUsuario int,
@total int
as
begin
    insert into Ventas (idUsuario, fecha, total)
    values (@idUsuario, getDate(), @total)
end

create procedure modificarVenta
@idVenta int,
@total int
as
begin
    update Ventas
    set total = @total
    where idVenta = @idVenta
end

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

create procedure estatusProducto
@idProducto int,
@estatus bit
as
begin
    update Productos
    set estatus = @estatus
    where idProducto = @idProducto
end

create procedure agregarUsuario
@usuario varchar(50),
@contrasena varchar(50),
@estatus bit
as
begin
    insert into Usuarios (usuario, contrasena, estatus)
    values (@usuario, @contrasena, @estatus)
end

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

create procedure estatusUsuario
@idUsuario int,
@estatus bit
as
begin
    update Usuarios
    set estatus = @estatus
    where idUsuario = @idUsuario
end

create procedure getSelectUsuarios
as
begin
    select * from Usuarios
end

create procedure getSelectProductos
as
begin
    select * from Productos
end

create procedure getSelectVenta
@idVenta int
as
begin
    select * from Ventas
    where idVenta = @idVenta
end

create procedure getSelectDetalleVentas
@idVenta int
as
begin
    select idDetalleVenta, idProducto, cantidad, subtotal
    from Detalle_Ventas
    where idVenta = @idVenta
end

create procedure getSelectDetalleVentas
@idVenta int
as
begin
    select idDetalleVenta, idProducto, cantidad, subtotal
    from Detalle_Ventas
    where idVenta = @idVenta
end

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

exec agregarUsuario magdiel, 1234, 1
exec agregarProducto 'Mouse', 'Gamer', 349, 5, 1
exec agregarProducto 'Teclado', 'Normal', 149, 2, 1
exec agregarVenta 1, 0
exec agregarDetalleVenta 1, 1, 2 , 698
exec agregarDetalleVenta 1, 2, 1 , 149
exec getSelectVenta 1
exec getSelectDetalleVentas 1
