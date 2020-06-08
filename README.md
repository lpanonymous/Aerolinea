# Aerolínea

Servicio web con una api de operaciones básicas para la administración de una aerolínea.

## Comenzando 🚀

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.


### Pre-requisitos 📋

_Que cosas necesitas para instalar el software y como instalarlas_

```
1.-Xamp.
2.-Eclipse IDE for Enterprise Java Developers.
3.-Extensiones de Chrome Boomerang - SOAP & REST Client 3.5.8 o Wizdler.
```

### Instalación 🔧

```
1.- Tener Xampp instalado.
2.- Iniciar Xampp.
3.- Abrir los puertos de apache(80) y  mysql(3306).
4.- Entrar a php myadmin o a mysql server para crear la base de datos 'aerolinea'. 
5.- Ejecutar el script.sql que esta dentro del proyecto soap.
6.-Para instalar el proyecto se necesita tener Eclipse IDE for Enterprise Java Developers.
7.-Importar el proyecto y cuando se importe ejecutar el archivo SoapApplication.
8.-Instalar las extensiones Boomerang - SOAP & REST Client 3.5.8 o Wizdler.
9.-Añadir la siguiente dirección http://localhost:8080/ws/aerolinea.wsdl en alguna de las extensiones para desplegar la api de aerolinea.
10.-Para visualizar mejor la información almacenada utilizar phpMyAdmin y posteriormente hacer las consultas con la api.
```

## Ejecutando las pruebas ⚙️

Metodo: BuscarVueloIdaVuelta.
        <nos:BuscarVueloIdaVueltaRequest>
            <nos:numAdultos>10</nos:numAdultos>
            <nos:numNinos>5</nos:numNinos>
            <nos:numInfantes>4</nos:numInfantes>
            <nos:paisOrigen>MEXICO</nos:paisOrigen>
            <nos:paisDestino>MEXICO</nos:paisDestino>
            <nos:ciudadOrigen>VERACRUZ</nos:ciudadOrigen>
            <nos:ciudadDestino>SINALOA</nos:ciudadDestino>
            <nos:fechaIda>10/05/2020</nos:fechaIda>
            <nos:fechaVuelta>20/05/2020</nos:fechaVuelta>

Respuesta esperada: 
<ns2:BuscarVueloIdaVueltaResponse
xmlns:ns2="http://www.example.org/nose">
<ns2:datos>Si existe el vuelo y si hay lugares disponibles para la tarifa basica con los siguientes datos VuelosIV [idviv=1, paisOrigen=MEXICO, paisDestino=MEXICO, ciudadOrigen=VERACRUZ, ciudadDestino=SINALOA, fechaSalida=10/05/2020, fechaVuelta=20/05/2020, horaSalida=08:00, horaLlegada=22:00, aerolinea=aeromexico, codigoAvion=A1, lugaresDisponiblesTarifaBasica=20, lugaresDisponiblesTarifaClasica=15, lugaresDisponiblesTarifaAMPlus=0, lugaresDisponiblesTarifaPremier=10, idpaisOrigen=MEX, idpaisDestino=MEX, idciudadorigen=VER, idciudaddestino=SIN]</ns2:datos>

 </ns2:BuscarVueloIdaVueltaResponse>
   

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [Eclipse IDE for Enterprise Java Developers.](https://www.eclipse.org/downloads/packages/release/2018-12/r/eclipse-ide-enterprise-java-developers) - El framework web usado.
* [Maven](https://maven.apache.org/) - Manejador de dependencias.
* [Spring.io](https://start.spring.io/) - Usado para generar el proyecto.
* [AWS Educate](https://aws.amazon.com/education/awseducate/) - Usado para alojar el proyecto.

## Versionado 📌

Usamos [GitHub](https://github.com/lpanonymous/Aerolinea.git) para el versionado.

## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **LUIS PABLO REYES FERNANDEZ**- *Trabajo Inicial* - [lpanonymous](https://github.com/lpanonymous/Aerolinea.git)
* **ROJANO CACERES JOSE RAFAEL**[tareasR](https://github.com/tareasR)

## Casos de uso

![alt text](https://github.com/lpanonymous/Aerolinea/blob/master/Cliente.JPG)

![alt text](https://github.com/lpanonymous/Aerolinea/blob/master/administrador.JPG)
