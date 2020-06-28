package mx.uv.servicio.soap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.example.nose.ShowSelectedFlightRequest;
import org.example.nose.ShowSelectedFlightResponse;
import org.example.nose.DeleteFlightRequest;
import org.example.nose.DeleteFlightResponse;
import org.example.nose.DeleteReservationRequest;
import org.example.nose.DeleteReservationResponse;
import org.example.nose.DisplayAllFlightRequest;
import org.example.nose.DisplayAllFlightResponse;
import org.example.nose.DisplayAllReservationRequest;
import org.example.nose.DisplayAllReservationResponse;
import org.example.nose.CreateFlightRequest;
import org.example.nose.CreateFlightReservationRequest;
import org.example.nose.CreateFlightReservationResponse;
import org.example.nose.CreateFlightResponse;
import org.example.nose.ReadFlightRequest;
import org.example.nose.ReadFlightResponse;
import org.example.nose.ReadReservationRequest;
import org.example.nose.ReadReservationResponse;
import org.example.nose.UpdateFlightRequest;
import org.example.nose.UpdateFlightResponse;
import org.example.nose.UpdateReservationRequest;
import org.example.nose.UpdateReservationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import mx.uv.servicio.soap.DTO.Reservacion;
import mx.uv.servicio.soap.DTO.Vuelo;
import mx.uv.servicio.soap.Repositorio.IReservacion;
import mx.uv.servicio.soap.Repositorio.IVuelo;

@Endpoint
@RestController
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
	Vuelo vuelo = new Vuelo(); 	
	vuelo = ivuelos.findFlight(peticion.getId());
	if(vuelo != null) 
	{
		respuesta.setAerolinea(vuelo.getAerolinea());
		respuesta.setBeneficiosTarifaAmplus(vuelo.getBeneficios_tarifa_amplus());
		respuesta.setBeneficiosTarifaBasica(vuelo.getBeneficios_tarifa_basica());
		respuesta.setBeneficiosTarifaClasica(vuelo.getBeneficios_tarifa_clasica());
		respuesta.setBeneficiosTarifaFlexible(vuelo.getBeneficios_tarifa_flexible());
		respuesta.setBeneficiosTarifaPremier(vuelo.getBeneficios_tarifa_premier());
		respuesta.setCiudadDestino(vuelo.getCiudad_destino());
		respuesta.setCiudadOrigen(vuelo.getCiudad_origen());
		respuesta.setCodigoAvion(vuelo.getCodigo_avion());
		respuesta.setFechaSalida(vuelo.getFecha_salida());
		respuesta.setHoraLlegada(vuelo.getHora_llegada());
		respuesta.setHoraSalida(vuelo.getHora_salida());
		respuesta.setId(vuelo.getId());
		respuesta.setNumAsientosTarifaAmplus(vuelo.getNum_asientos_tarifa_amplus());
		respuesta.setNumAsientosTarifaBasica(vuelo.getNum_asientos_tarifa_basica());
		respuesta.setNumAsientosTarifaClasica(vuelo.getNum_asientos_tarifa_clasica());
		respuesta.setNumAsientosTarifaFlexible(vuelo.getNum_asientos_tarifa_flexible());
		respuesta.setNumAsientosTarifaPremier(vuelo.getNum_asientos_tarifa_premier());
		respuesta.setPaisOrigen(vuelo.getPais_origen());
		respuesta.setPaisDestino(vuelo.getPais_destino());
		respuesta.setPrecioTarifaAmplus(vuelo.getPrecio_tarifa_amplus());
		respuesta.setPrecioTarifaBasica(vuelo.getPrecio_tarifa_basica());
		respuesta.setPrecioTarifaClasica(vuelo.getPrecio_tarifa_clasica());
		respuesta.setPrecioTarifaFlexible(vuelo.getPrecio_tarifa_flexible());
		respuesta.setPrecioTarifaPremier(vuelo.getPrecio_tarifa_premier());
		return respuesta;
	}
	else 
	{
		return null;				
	}		
	
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
			respuesta.setDatos("Vuelo actualizado correctamente");
		}
		else 
		{
			respuesta.setDatos("No existe referencia a un vuelo con esos datos");				
		}		
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "DeleteFlightRequest")
	@ResponsePayload
	public DeleteFlightResponse dfr(@RequestPayload DeleteFlightRequest peticion)
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
			respuesta.setDatos("No existe referencia a un vuelo");				
		}		
		respuesta.setDatos("Vuelo eliminado correctamente");
		return respuesta;
	}
	
	///////////////////Fin CRUD Vuelos//////////////////////////////////
	
	///////////////////Inicio CRUD Reservaciones////////////////////////
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
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "ReadReservationRequest")
	@ResponsePayload
	public ReadReservationResponse rrr(@RequestPayload ReadReservationRequest peticion)
	{
		ReadReservationResponse respuesta = new ReadReservationResponse();
		Reservacion reservacion = new Reservacion(); 	
		reservacion = ireservaciones.findReservation(peticion.getId());
		
		if(reservacion!=null) 
		{
			respuesta.setId(reservacion.getId());
			respuesta.setNombreCliente(reservacion.getNombre_cliente());
			respuesta.setNumeroTarjeta(reservacion.getNumero_tarjeta());
			respuesta.setFechaVencimiento(reservacion.getFecha_vencimiento());
			respuesta.setCodigoCvc(reservacion.getCodigo_cvc());
			respuesta.setIdVuelo(reservacion.getId_vuelo());
			respuesta.setCantidad(reservacion.getCantidad());
		}
		else 
		{
			return null;		
		}		
			return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "DisplayAllReservationRequest")
	@ResponsePayload
	public DisplayAllReservationResponse darr(@RequestPayload DisplayAllReservationRequest peticion)
	{	
		DisplayAllReservationResponse respuesta = new DisplayAllReservationResponse();
		
		Iterable<Reservacion> listaReservaciones = ireservaciones.findAll();
		for(Reservacion lr: listaReservaciones)
		{
			DisplayAllReservationResponse.Datos datos = new DisplayAllReservationResponse.Datos();
			datos.setId(lr.getId());
			datos.setIdVuelo(lr.getId_vuelo());
			datos.setNombreCliente(lr.getNombre_cliente());
			datos.setNumeroTarjeta(lr.getNumero_tarjeta());
			datos.setCodigoCvc(lr.getCodigo_cvc());
			datos.setFechaVencimiento(lr.getFecha_vencimiento());
			datos.setCantidad(lr.getCantidad());
			respuesta.getDatos().add(datos);
		}
		return respuesta;
		}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "UpdateReservationRequest")
	@ResponsePayload
	public UpdateReservationResponse urr(@RequestPayload UpdateReservationRequest peticion)
	{
		UpdateReservationResponse respuesta = new UpdateReservationResponse();
		Optional<Reservacion> reservaciones; 	
		reservaciones = ireservaciones.findById(peticion.getId());
		Reservacion reservacion = new Reservacion();
		
		if(reservaciones.isPresent()) 
		{
			reservacion.setId(peticion.getId());
			reservacion.setId_vuelo(peticion.getIdVuelo());
			reservacion.setNombre_cliente(peticion.getNombreCliente());
			reservacion.setNumero_tarjeta(peticion.getNumeroTarjeta());
			reservacion.setCodigo_cvc(peticion.getCodigoCvc());
			reservacion.setFecha_vencimiento(peticion.getFechaVencimiento());
			reservacion.setCantidad(peticion.getCantidad());
			ireservaciones.save(reservacion);
			respuesta.setDatos("Reservacion actualizada correctamente");
		}
		else 
		{
			respuesta.setDatos("No existe referencia a una reservacion con esos datos");				
		}	
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/nose", localPart = "DeleteReservationRequest")
	@ResponsePayload
	public DeleteReservationResponse drr(@RequestPayload DeleteReservationRequest peticion)
	{
		DeleteReservationResponse respuesta = new DeleteReservationResponse();
		Optional<Reservacion> reservacion; 	
		reservacion = ireservaciones.findById(peticion.getId());
	
		if(reservacion.isPresent()) 
		{
			ireservaciones.deleteById(peticion.getId());
		}
		else 
		{
			respuesta.setDatos("No existe referencia a una reservacion");				
		}		
		respuesta.setDatos("Reservacion eliminada correctamente");
		return respuesta;
	}
	
	/////////////////////////////////////////////REST///////////////////////////////////////////////
	
	/////////////////////////////////////////////Vuelos///////////////////////////////////////////////
	@PostMapping("/crear-vuelo")
	public String crear_vuelo(@RequestParam Map<String, String> variosParametros)
	{
		List <String> list = new ArrayList<String>();
		for (String value : variosParametros.values()) 
		{
			list.add(value);
		}
		Vuelo vuelo = new Vuelo();
		vuelo.setAerolinea(list.get(0));
		vuelo.setCodigo_avion(list.get(1));
		vuelo.setFecha_salida(list.get(2));
		vuelo.setHora_salida(list.get(3));
		vuelo.setHora_llegada(list.get(4));
		vuelo.setPais_origen(list.get(5));
		vuelo.setPais_destino(list.get(6));
		vuelo.setCiudad_origen(list.get(7));
		vuelo.setCiudad_destino(list.get(8));
		vuelo.setPrecio_tarifa_basica(Integer.parseInt(list.get(9)));
		vuelo.setPrecio_tarifa_clasica(Integer.parseInt(list.get(10)));
		vuelo.setPrecio_tarifa_amplus(Integer.parseInt(list.get(11)));
		vuelo.setPrecio_tarifa_flexible(Integer.parseInt(list.get(12)));
		vuelo.setPrecio_tarifa_premier(Integer.parseInt(list.get(13)));
		vuelo.setBeneficios_tarifa_basica(list.get(14));
		vuelo.setBeneficios_tarifa_clasica(list.get(15));
		vuelo.setBeneficios_tarifa_amplus(list.get(16));
		vuelo.setBeneficios_tarifa_flexible(list.get(17));
		vuelo.setBeneficios_tarifa_premier(list.get(18));
		vuelo.setNum_asientos_tarifa_basica(Integer.parseInt(list.get(19)));
		vuelo.setNum_asientos_tarifa_clasica(Integer.parseInt(list.get(20)));
		vuelo.setNum_asientos_tarifa_amplus(Integer.parseInt(list.get(21)));
		vuelo.setNum_asientos_tarifa_flexible(Integer.parseInt(list.get(22)));
		vuelo.setNum_asientos_tarifa_premier(Integer.parseInt(list.get(23)));
		ivuelos.save(vuelo);
		return "Las variables son: " + variosParametros;
	}
	
	@GetMapping("/buscar-vuelo")
	public Vuelo buscar_vuelo(@RequestParam(defaultValue = "",value = "id")int id)
	{	
		Vuelo vuelo = new Vuelo();
		vuelo =ivuelos.findFlight(id);
		return vuelo;
	}
	
	@PostMapping("/actualizar-vuelo")
	public String actualizar_vuelo(@RequestParam Map<String, String> variosParametros)
	{
		List <String> list = new ArrayList<String>();
		for (String value : variosParametros.values()) 
		{
			list.add(value);
		}
		
		Optional<Vuelo> vuelos; 	
		vuelos = ivuelos.findById(Integer.parseInt(list.get(0)));
		Vuelo vuelo = new Vuelo();
		
		if(vuelos.isPresent())
		{
			vuelo.setId(Integer.parseInt(list.get(0)));
			vuelo.setAerolinea(list.get(1));
			vuelo.setCodigo_avion(list.get(2));
			vuelo.setFecha_salida(list.get(3));
			vuelo.setHora_salida(list.get(4));
			vuelo.setHora_llegada(list.get(5));
			vuelo.setPais_origen(list.get(6));
			vuelo.setPais_destino(list.get(7));
			vuelo.setCiudad_origen(list.get(8));
			vuelo.setCiudad_destino(list.get(9));
			vuelo.setPrecio_tarifa_basica(Integer.parseInt(list.get(10)));
			vuelo.setPrecio_tarifa_clasica(Integer.parseInt(list.get(11)));
			vuelo.setPrecio_tarifa_amplus(Integer.parseInt(list.get(12)));
			vuelo.setPrecio_tarifa_flexible(Integer.parseInt(list.get(13)));
			vuelo.setPrecio_tarifa_premier(Integer.parseInt(list.get(14)));
			vuelo.setBeneficios_tarifa_basica(list.get(15));
			vuelo.setBeneficios_tarifa_clasica(list.get(16));
			vuelo.setBeneficios_tarifa_amplus(list.get(17));
			vuelo.setBeneficios_tarifa_flexible(list.get(18));
			vuelo.setBeneficios_tarifa_premier(list.get(19));
			vuelo.setNum_asientos_tarifa_basica(Integer.parseInt(list.get(20)));
			vuelo.setNum_asientos_tarifa_clasica(Integer.parseInt(list.get(21)));
			vuelo.setNum_asientos_tarifa_amplus(Integer.parseInt(list.get(22)));
			vuelo.setNum_asientos_tarifa_flexible(Integer.parseInt(list.get(23)));
			vuelo.setNum_asientos_tarifa_premier(Integer.parseInt(list.get(24)));
			ivuelos.save(vuelo);
			return "Vuelo actualizado correctamente";
		}
		else 
		{	
			return "No existe el vuelo a actualizar";			
		}		
	}
	
	@GetMapping("/eliminar-vuelo")
	public String eliminar_vuelo(@RequestParam(defaultValue = "Id de vuelo a eliminar",value = "id_vuelo")int id_vuelo)
	{
		Optional<Vuelo> vuelos; 	
		vuelos = ivuelos.findById(id_vuelo);
	
		if(vuelos.isPresent()) 
		{
			ivuelos.deleteById(id_vuelo);
			return "Vuelo eliminado correctamente";
		}
		else 
		{
			return "No existe referencia al vuelo";			
		}			
	}
	
	@GetMapping("/mostrar-vuelos")
	public List<Vuelo> mostrar_vuelos()
	{
		Iterable<Vuelo> lista_vuelos = ivuelos.findAll();
		List <Vuelo> respuesta = new ArrayList<Vuelo>();
		for(Vuelo lv : lista_vuelos)
		{
			respuesta.add(lv);
		}
		return respuesta;
	}
	
	/////////////////////////////////////////////Reservaciones///////////////////////////////////////////////
	
	@PostMapping("/crear-reservacion")
	public String crear_reservacion(@RequestParam Map<String, String> variosParametros)
	{	
		List <String> list = new ArrayList<String>();
		for (String value : variosParametros.values()) 
		{
			list.add(value);
		}
		Reservacion reservacion = new Reservacion();
		reservacion.setId_vuelo(Integer.parseInt(list.get(0)));
		reservacion.setNombre_cliente(list.get(1));
		reservacion.setNumero_tarjeta(list.get(2));
		reservacion.setFecha_vencimiento(list.get(3));
		reservacion.setCodigo_cvc(Integer.parseInt(list.get(4)));
		reservacion.setCantidad(Integer.parseInt(list.get(5)));
		ireservaciones.save(reservacion);
		
		return "Las variables son: " + variosParametros.entrySet();
	}
	
	@GetMapping("/buscar-reservacion")
	public Reservacion buscar_reservacion(@RequestParam(defaultValue = "",value = "id")int id)
	{	
		Reservacion reservacion = new Reservacion();
		reservacion = ireservaciones.findReservation(id);
		return reservacion;
	}
	
	@PostMapping("/actualizar-reservacion")
	public String actualizar_reservacion(@RequestParam Map<String, String> variosParametros)
	{
		List <String> list = new ArrayList<String>();
		for (String value : variosParametros.values()) 
		{
			list.add(value);
		}
		Optional<Reservacion> reservaciones; 	
		reservaciones = ireservaciones.findById(Integer.parseInt(list.get(0)));
		Reservacion reservacion = new Reservacion();
		
		if(reservaciones.isPresent()) 
		{
			reservacion.setId(Integer.parseInt(list.get(0)));
			reservacion.setId_vuelo(Integer.parseInt(list.get(1)));
			reservacion.setNombre_cliente(list.get(2));
			reservacion.setNumero_tarjeta(list.get(3));
			reservacion.setCodigo_cvc(Integer.parseInt(list.get(4)));
			reservacion.setFecha_vencimiento(list.get(5));
			reservacion.setCantidad(Integer.parseInt(list.get(6)));
			ireservaciones.save(reservacion);
			return "Reservación actualizada correctamente";
		}
		else 
		{
			return "No existe la reservación a actualizar";			
		}	
	}
	
	@GetMapping("/eliminar-reservacion")
	public String eliminar_reservacion(@RequestParam(defaultValue = "",value = "id_reservacion")int id_reservacion)
	{
		Optional<Reservacion> reservaciones; 	
		reservaciones = ireservaciones.findById(id_reservacion);
	
		if(reservaciones.isPresent()) 
		{
			ireservaciones.deleteById(id_reservacion);
			return "Reservación eliminada correctamente";
		}
		else 
		{
			return "No existe referencia a la reservación";			
		}			
	}
	
	@GetMapping("/mostrar-reservaciones")
	public List<Reservacion> mostrar_reservaciones()
	{
		Iterable<Reservacion> lista_reservaciones = ireservaciones.findAll();
		List <Reservacion> respuesta = new ArrayList<Reservacion>();
		for(Reservacion lr : lista_reservaciones)
		{
			respuesta.add(lr);
		}
		return respuesta;
	}
}	