La empresa ‘Electricidad Chispas’ desea digitalizar su empresa para ser más competitiva frente a la
competencia y maximizar los ingresos. Contrata nuestros servicios.
Nos reunimos con ellos y nos dan información sobre su empresa:
● Toda la gestión de la empresa está realizada con un libro de cálculo en Excel.
● El libro excel que maneja los clientes, tiene las siguientes hojas:
○ Autónomos: personas que trabajan por su cuenta.
○ Sociedades: empresas con varios trabajadores.
○ Productos: productos físicos que venden, por ejemplo, bombillas, interruptores, cable,
etc.
○ Servicios: servicios que realizan a sus clientes, por ejemplo, reparación de una
lámpara, cambio de un diferencial, etc.
○ Facturas: facturas que hacen a sus clientes.
○ Impresión factura.
● En la hoja de autónomos están las siguientes columnas:
○ Código Cliente: número único que identifica al cliente (Tanto para autónomos como
para sociedades).
○ Nombre: nombre del autónomo.
○ Apellidos: apellidos del autónomo.
○ Dni.
○ Dirección Postal.
○ Población.
○ Provincia.
○ Email.
○ Teléfono.
● En la hoja de sociedades están las siguientes columnas:
○ Código Cliente: número único que identifica al cliente (tanto para autónomos como
para sociedades).
○ Razón Social: nombre de la empresa.
○ CIF: Es como el DNI de las empresas.
○ Dirección Postal.
○ Población.
○ Provincia.
○ Email.
○ Teléfono.
● En la hoja de productos están las siguientes columnas:
○ Código Producto: número único que identifica al producto.
○ Nombre.
○ Marca.
○ Modelo.
○ Precio. (10€)
○ Tipo IVA. (21%)
● En la hoja de servicios están las siguientes columnas:
○ Código Servicio: número único que identifica al producto.
Electricidad Chispas
Entorno de Desarrollo. 2º DAM
○ Nombre.
○ Precio.
○ Tipo IVA.
● En la hoja de Facturas están las siguientes columnas:
○ Código de factura: único por cada factura.
○ Fecha de factura.
○ Cliente (sólo se permite un cliente por factura).
○ Productos (puede contener de 0 a N productos. No pueden estar repetidos).
○ Servicios (puede contener de 0 a N servicios. No pueden estar repetidos).
○ Base Imponible. El total de los productos más el total de servicios SIN IVA.
○ Total. El total de los productos más el IVA. Recuerda que cada producto o servicio
lleva un IVA asociado.
● Tienen otra hoja llamada Impresión Facturas que sirve para crear una plantilla de impresión
de la factura para los clientes. En esta hoja están los siguientes datos:
○ Código de Factura. | Fecha de Factura.
○ Cif/Nif del cliente
○ Nombre del cliente.
○ Dirección del cliente.
○ Población del cliente.
○ Provincia del cliente.
○ Además tiene entre 1 a N líneas de ventas (productos y servicios) con esta información:
■ Código
■ Nombre
■ Precio (10€)
■ Tipo IVA (21%)
■ Total con IVA (precio + IVA) (12,1€)
○ Base Imponible
○ Total Factura