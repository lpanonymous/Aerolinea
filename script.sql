INSERT INTO `vuelo` (`id`, `aerolinea`, `beneficios_tarifa_amplus`, `beneficios_tarifa_basica`, `beneficios_tarifa_clasica`, `beneficios_tarifa_flexible`, `beneficios_tarifa_premier`, `ciudad_destino`, `ciudad_origen`, `codigo_avion`, `fecha_salida`, `hora_llegada`, `hora_salida`, `num_asientos_tarifa_amplus`, `num_asientos_tarifa_basica`, `num_asientos_tarifa_clasica`, `num_asientos_tarifa_flexible`, `num_asientos_tarifa_premier`, `pais_destino`, `pais_origen`, `precio_tarifa_amplus`, `precio_tarifa_basica`, `precio_tarifa_clasica`, `precio_tarifa_flexible`, `precio_tarifa_premier`) VALUES
(1, 'AEROMEXICO', 'MALETERO', 'BEBIDAS', 'ELECCION ASIENTO', 'COMIDA', 'AIRE ACONDICIONADO', 'MEXICO', 'CIUDAD JUAREZ', 'A2', '2020-06-29', '08:00', '01:00', 100, 100, 100, 100, 100, 'MEXICO', 'MEXICO', 3000, 1000, 2000, 4000, 5000),
(2, 'AEROMEXICO', 'MALETERO', 'BEBIDAS', 'ELECCION ASIENTO', 'COMIDA', 'AIRE ACONDICIONADO', 'GUADALAJARA', 'SINALOA', 'A2', '2020-06-30', '20:00', '02:00', 100, 100, 100, 100, 100, 'MEXICO', 'MEXICO', 3000, 1000, 2000, 4000, 5000),
(3, 'AEROMEXICO', 'MALETERO', 'BEBIDAS', 'ELECCION ASIENTO', 'COMIDA', 'AIRE ACONDICIONADO', 'PUEBLA', 'NUEVO LEON', 'A2', '2020-06-31', '08:00', '05:00', 100, 100, 100, 100, 100, 'MEXICO', 'MEXICO', 3000, 1000, 2000, 4000, 5000),
(4, 'AEROMEXICO', 'MALETERO', 'BEBIDAS', 'ELECCION ASIENTO', 'COMIDA', 'AIRE ACONDICIONADO', 'GUANAJUATO', 'VERACRUZ', 'A2', '2020-06-29', '08:00', '01:00', 100, 100, 100, 100, 100, 'MEXICO', 'MEXICO', 3000, 1000, 2000, 4000, 5000),
(5, 'AEROMEXICO', 'MALETERO', 'BEBIDAS', 'ELECCION ASIENTO', 'COMIDA', 'AIRE ACONDICIONADO', 'BAJA CALIFORNIA', 'MICHOACAN', 'A2', '2020-06-30', '20:00', '02:00', 100, 100, 100, 100, 100, 'MEXICO', 'MEXICO', 3000, 1000, 2000, 4000, 5000);

INSERT INTO `reservacion` (`id`, `cantidad`, `codigo_cvc`, `fecha_vencimiento`, `id_vuelo`, `nombre_cliente`, `numero_tarjeta`) VALUES
(1, 2000, 123, '10/24', 1, 'Angel Ramirez', '3250000000000000'),
(2, 2000, 123, '11/24', 1, 'Beto Cuevas', '3250000000000000');

