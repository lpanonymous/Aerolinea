package mx.uv.servicio.soap;
import java.util.Optional;

import org.example.nose.ShowSelectedFlightRequest;
import org.example.nose.ShowSelectedFlightResponse;
import org.example.nose.DeleteFlightRequest;
import org.example.nose.DeleteFlightResponse;
import org.example.nose.DisplayAllFlightRequest;
import org.example.nose.DisplayAllFlightResponse;
import org.example.nose.CreateFlightRequest;
import org.example.nose.CreateFlightReservationRequest;
import org.example.nose.CreateFlightReservationResponse;
import org.example.nose.CreateFlightResponse;
import org.example.nose.ReadFlightRequest;
import org.example.nose.ReadFlightResponse;
import org.example.nose.UpdateFlightRequest;
import org.example.nose.UpdateFlightResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.servicio.soap.DTO.Reservacion;
import mx.uv.servicio.soap.DTO.Vuelo;
import mx.uv.servicio.soap.Repositorio.IReservacion;
import mx.uv.servicio.soap.Repositorio.IVuelo;

@Endpoint
public class EndPoint 
{	
	///////////////////Inicio CRUD Vuelos////////////////////////
	@Autowired
	private IVuelo ivuelos;
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "CreateFlightRequest")
	@ResponsePayload
	public CreateFlightResponse cfr(@RequestPayload CreateFlightRequest peticion)
	{
		Vuelo vuelo = new Vuelo();
		vuelo.setAerolinea(peticion.getAerolinea());
		vuelo.setBeneficios_tarifa_amplus(peticion.getBeneficiosTarifaAmplus());
		vuelo.setBeneficios_tarifa_basica(peticion.getBeneficiosTarifaBasica());
		vuelo.setBeneficios_tarifa_clasica(peticion.getBeneficiosTarifaClasica());
		vuelo.setBeneficios_tarifa_flexible(peticion.getBeneficiosTarifaFlexible());
		vuelo.setBeneficios_tarifa_premier(peticion.getBeneficiosTarifaPremier());
		vuelo.setCiudad_destino(peticion.getCiudadDestino());
		vuelo.setCiudad_origen(peticion.getCiudadOrigen());
		vuelo.setCodigo_avion(peticion.getCodigoAvion());
		vuelo.setFecha_salida(peticion.getFechaSalida());
		vuelo.setHora_llegada(peticion.getHoraLlegada());
		vuelo.setHora_salida(peticion.getHoraSalida());
		vuelo.setId(peticion.getId());
		vuelo.setNum_asientos_tarifa_amplus(peticion.getNumAsientosTarifaAmplus());
		vuelo.setNum_asientos_tarifa_basica(peticion.getNumAsientosTarifaBasica());
		vuelo.setNum_asientos_tarifa_clasica(peticion.getNumAsientosTarifaClasica());
		vuelo.setNum_asientos_tarifa_flexible(peticion.getNumAsientosTarifaFlexible());
		vuelo.setNum_asientos_tarifa_premier(peticion.getNumAsientosTarifaPremier());
		vuelo.setPais_destino(peticion.getPaisDestino());
		vuelo.setPais_origen(peticion.getPaisOrigen());
		vuelo.setPrecio_tarifa_amplus(peticion.getPrecioTarifaAmplus());
		vuelo.setPrecio_tarifa_basica(peticion.getPrecioTarifaBasica());
		vuelo.setPrecio_tarifa_clasica(peticion.getPrecioTarifaClasica());
		vuelo.setPrecio_tarifa_flexible(peticion.getPrecioTarifaFlexible());
		vuelo.setPrecio_tarifa_premier(peticion.getPrecioTarifaPremier());
		ivuelos.save(vuelo);
		CreateFlightResponse datos = new CreateFlightResponse();
		datos.setDatos(vuelo.toString());
		return datos;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "ReadFlightRequest")
	@ResponsePayload
	public ReadFlightResponse rfr(@RequestPayload ReadFlightRequest peticion)
	{
	ReadFlightResponse respuesta = new ReadFlightResponse();
	Optional<Vuelo> vuelo; 	
	vuelo = ivuelos.findById(peticion.getId());
	
	if(vuelo.isPresent()) 
	{
	respuesta.setDatos(vuelo.get().toString());
	}
	else 
	{
	respuesta.setDatos("No existe referencia al vuelo de ida y vuelta");				
	}		
	return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "DisplayAllFlightRequest")
	@ResponsePayload
	public DisplayAllFlightResponse dafr(@RequestPayload DisplayAllFlightRequest peticion)
	{	
		DisplayAllFlightResponse respuesta = new DisplayAllFlightResponse();
		
		Iterable<Vuelo> listaVuelos = ivuelos.findAll();
		for(Vuelo lv: listaVuelos)
		{
			DisplayAllFlightResponse.Datos datos = new DisplayAllFlightResponse.Datos();
			datos.setAerolinea(lv.getAerolinea());
			datos.setBeneficiosTarifaAmplus(lv.getBeneficios_tarifa_amplus());
			datos.setBeneficiosTarifaBasica(lv.getBeneficios_tarifa_basica());
			datos.setBeneficiosTarifaBasica(lv.getBeneficios_tarifa_clasica());
			datos.setBeneficiosTarifaFlexible(lv.getBeneficios_tarifa_flexible());
			datos.setBeneficiosTarifaPremier(lv.getBeneficios_tarifa_premier());
			datos.setCiudadDestino(lv.getCiudad_destino());
			datos.setCiudadOrigen(lv.getCiudad_origen());
			datos.setCodigoAvion(lv.getCodigo_avion());
			datos.setFechaSalida(lv.getFecha_salida());
			datos.setHoraLlegada(lv.getHora_llegada());
			datos.setHoraSalida(lv.getHora_salida());
			datos.setId(lv.getId());
			datos.setNumAsientosTarifaAmplus(lv.getNum_asientos_tarifa_amplus());
			datos.setNumAsientosTarifaBasica(lv.getNum_asientos_tarifa_basica());
			datos.setNumAsientosTarifaClasica(lv.getNum_asientos_tarifa_clasica());
			datos.setNumAsientosTarifaFlexible(lv.getNum_asientos_tarifa_flexible());
			datos.setNumAsientosTarifaPremier(lv.getNum_asientos_tarifa_premier());
			datos.setCiudadDestino(lv.getPais_destino());
			datos.setPaisOrigen(lv.getPais_origen());
			datos.setPrecioTarifaAmplus(lv.getPrecio_tarifa_amplus());
			datos.setPrecioTarifaBasica(lv.getPrecio_tarifa_basica());
			datos.setPrecioTarifaClasica(lv.getPrecio_tarifa_clasica());
			datos.setPrecioTarifaFlexible(lv.getPrecio_tarifa_flexible());
			datos.setPrecioTarifaPremier(lv.getPrecio_tarifa_premier());
			respuesta.getDatos().add(datos);
		}
		return respuesta;
		}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "ShowSelectedFlightRequest")
	@ResponsePayload
	public ShowSelectedFlightResponse ssfr(@RequestPayload ShowSelectedFlightRequest peticion)
	{	
		ShowSelectedFlightResponse respuesta = new ShowSelectedFlightResponse();
		int numPasajeros = peticion.getNumInfantes()+peticion.getNumNinos()+peticion.getNumAdultos();
		Iterable<Vuelo> listaVuelos = ivuelos.findSelectedFlight(peticion.getCiudadOrigen(), peticion.getCiudadDestino(), peticion.getFechaSalida());
		for(Vuelo lv: listaVuelos)
		{
			ShowSelectedFlightResponse.Datos datos = new ShowSelectedFlightResponse.Datos();
			datos.setAerolinea(lv.getAerolinea());
			
			datos.setBeneficiosTarifaAmplus(lv.getBeneficios_tarifa_amplus());
			datos.setBeneficiosTarifaBasica(lv.getBeneficios_tarifa_basica());
			datos.setBeneficiosTarifaClasica(lv.getBeneficios_tarifa_clasica());
			datos.setBeneficiosTarifaFlexible(lv.getBeneficios_tarifa_flexible());
			datos.setBeneficiosTarifaPremier(lv.getBeneficios_tarifa_premier());
			datos.setCiudadDestino(lv.getCiudad_destino());
			datos.setCiudadOrigen(lv.getCiudad_origen());
			datos.setCodigoAvion(lv.getCodigo_avion());
			datos.setFechaSalida(lv.getFecha_salida());
			datos.setHoraLlegada(lv.getHora_llegada());
			datos.setHoraSalida(lv.getHora_salida());
			datos.setId(lv.getId());
			datos.setNumAsientosTarifaAmplus(lv.getNum_asientos_tarifa_amplus());
			datos.setNumAsientosTarifaBasica(lv.getNum_asientos_tarifa_basica());
			datos.setNumAsientosTarifaClasica(lv.getNum_asientos_tarifa_clasica());
			datos.setNumAsientosTarifaFlexible(lv.getNum_asientos_tarifa_flexible());
			datos.setNumAsientosTarifaPremier(lv.getNum_asientos_tarifa_premier());
			datos.setPaisOrigen(lv.getPais_origen());
			datos.setPaisDestino(lv.getPais_destino());
			datos.setPrecioTarifaAmplus(lv.getPrecio_tarifa_amplus());
			datos.setPrecioTarifaBasica(lv.getPrecio_tarifa_basica());
			datos.setPrecioTarifaClasica(lv.getPrecio_tarifa_clasica());
			datos.setPrecioTarifaFlexible(lv.getPrecio_tarifa_flexible());
			datos.setPrecioTarifaPremier(lv.getPrecio_tarifa_premier());
			respuesta.getDatos().add(datos);
		}
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "UpdateFlightRequest")
	@ResponsePayload
	public UpdateFlightResponse ufr(@RequestPayload UpdateFlightRequest peticion)
	{
		UpdateFlightResponse respuesta = new UpdateFlightResponse();
		Optional<Vuelo> vuelos; 	
		vuelos = ivuelos.findById(peticion.getId());
		Vuelo vuelo = new Vuelo();
		
		if(vuelos.isPresent()) 
		{
			vuelo.setAerolinea(peticion.getAerolinea());
			vuelo.setBeneficios_tarifa_amplus(peticion.getBeneficiosTarifaAmplus());
			vuelo.setBeneficios_tarifa_basica(peticion.getBeneficiosTarifaBasica());
			vuelo.setBeneficios_tarifa_clasica(peticion.getBeneficiosTarifaClasica());
			vuelo.setBeneficios_tarifa_flexible(peticion.getBeneficiosTarifaFlexible());
			vuelo.setBeneficios_tarifa_premier(peticion.getBeneficiosTarifaPremier());
			vuelo.setCiudad_destino(peticion.getCiudadDestino());
			vuelo.setCiudad_origen(peticion.getCiudadOrigen());
			vuelo.setCodigo_avion(peticion.getCodigoAvion());
			vuelo.setFecha_salida(peticion.getFechaSalida());
			vuelo.setHora_llegada(peticion.getHoraLlegada());
			vuelo.setHora_salida(peticion.getHoraSalida());
			vuelo.setId(peticion.getId());
			vuelo.setNum_asientos_tarifa_amplus(peticion.getNumAsientosTarifaAmplus());
			vuelo.setNum_asientos_tarifa_basica(peticion.getNumAsientosTarifaBasica());
			vuelo.setNum_asientos_tarifa_clasica(peticion.getNumAsientosTarifaClasica());
			vuelo.setNum_asientos_tarifa_flexible(peticion.getNumAsientosTarifaFlexible());
			vuelo.setNum_asientos_tarifa_premier(peticion.getNumAsientosTarifaPremier());
			vuelo.setPais_destino(peticion.getPaisDestino());
			vuelo.setPais_origen(peticion.getPaisOrigen());
			vuelo.setPrecio_tarifa_amplus(peticion.getPrecioTarifaAmplus());
			vuelo.setPrecio_tarifa_basica(peticion.getPrecioTarifaBasica());
			vuelo.setPrecio_tarifa_clasica(peticion.getPrecioTarifaClasica());
			vuelo.setPrecio_tarifa_flexible(peticion.getPrecioTarifaFlexible());
			vuelo.setPrecio_tarifa_premier(peticion.getPrecioTarifaPremier());
			ivuelos.save(vuelo);
		}
		else 
		{
			respuesta.setDatos("No existe referencia a un pasajero con esos datos");				
		}
		
		ivuelos.deleteById(peticion.getId());
		
		ivuelos.save(vuelo);			
		
		respuesta.setDatos("Vuelo de ida y vuelta actualizado correctamente");
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "DeleteFlightRequest")
	@ResponsePayload
	public DeleteFlightResponse edvivr(@RequestPayload DeleteFlightRequest peticion)
	{
		DeleteFlightResponse respuesta = new DeleteFlightResponse();
		Optional<Vuelo> vuelos; 	
		vuelos = ivuelos.findById(peticion.getId());
	
		if(vuelos.isPresent()) 
		{
			ivuelos.deleteById(peticion.getId());
		}
		else 
		{
			respuesta.setDatos("No existe referencia a un vuelo de ida y vuelta");				
		}		
		respuesta.setDatos("Vuelo de ida y vuelta eliminado correctamente");
		return respuesta;
	}
	
		///////////////////Fin CRUD Vuelos////////////////////////
	///////////////////Inicio CRUD Vuelos////////////////////////
	@Autowired
	private IReservacion ireservaciones;
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "CreateFlightReservationRequest")
	@ResponsePayload
	public CreateFlightReservationResponse cfrr(@RequestPayload CreateFlightReservationRequest peticion)
	{
		Reservacion reservacion = new Reservacion();
		CreateFlightReservationResponse datos = new CreateFlightReservationResponse();
		reservacion.setId_vuelo(peticion.getIdVuelo());
		reservacion.setNombre_cliente(peticion.getNombreCliente());
		reservacion.setNumero_tarjeta(peticion.getNumTarjeta());
		reservacion.setCodigo_cvc(peticion.getCodigoCvc());
		reservacion.setFecha_vencimiento(peticion.getFechaVencimiento());
		reservacion.setCantidad(peticion.getCantidad());
		ireservaciones.save(reservacion);
		datos.setDatos(reservacion.toString());
		return datos;
	}
}	