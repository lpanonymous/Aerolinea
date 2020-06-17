package mx.uv.servicio.soap.Repositorio;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.uv.servicio.soap.DTO.Vuelo;

public interface IVuelo extends CrudRepository<Vuelo, Integer>
{
	@Query(value = "select * from vuelo v where v.ciudad_origen = :ciudadOrigen and v.ciudad_destino = :ciudadDestino and v.fecha_salida = :fechaSalida", nativeQuery = true)
	Collection<Vuelo> findSelectedFlight(
			@Param("ciudadOrigen") String ciudadOrigen,
			@Param("ciudadDestino") String ciudadDestino,
			@Param("fechaSalida") String fechaSalida);
	
	@Query(value = "select * from vuelo v where v.id = :id", nativeQuery = true)
	Vuelo findFlight(@Param("id") int id);
	
	
	/*//Ver si existe el vuelo de ida y vuelta
		@Query(value="select idvs from vuelo_sencillo v where v.ciudad_origen = :ciudadOrigen and v.ciudad_destino = :ciudadDestino and v.pais_origen = :paisOrigen and v.pais_destino = :paisDestino and v.fecha_salida = :fechaSalida", nativeQuery= true)
		String devolverID(
		  @Param("ciudadOrigen") String ciudadOrigen, 
		  @Param("ciudadDestino") String ciudadDestino,
		  @Param("paisOrigen") String paisOrigen,
		  @Param("paisDestino") String paisDestino,
	      @Param("fechaSalida") String fechaSalida);
		
		//Ver si hay lugares disponibles en la tarifa basica
		@Query(value="select idvs from vuelo_sencillo v where v.idvs = :idvs and v.lugares_disponibles_tarifa_basica >= :numPasajeros", nativeQuery= true)
		String buscarldtb(@Param("idvs") String idvs,
		  @Param("numPasajeros") int numPasajeros
		);
		
		//Actualizar lugares disponibles en la tarifa basica
		@Modifying
		@Transactional
		@Query(value="UPDATE vuelo_sencillo v set  lugares_disponibles_tarifa_basica= :numPasajeros where v.idvs = :idvs", nativeQuery= true)
		void updateLugares(@Param("idvs") String idvs,
		@Param("numPasajeros") int numPasajeros
		);
		
		//Obtener los lugares disponibles de la tarifa basica
		@Query(value="select lugares_disponibles_tarifa_basica from vuelo_sencillo v where v.idvs = :idvs", nativeQuery= true)
		int buscarludtb(@Param("idvs") String idvs
		);*/
}
