package mx.uv.servicio.soap.Repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.uv.servicio.soap.DTO.Reservacion;

public interface IReservacion extends CrudRepository<Reservacion, Integer>
{
	@Query(value = "select * from reservacion v where v.id = :id", nativeQuery = true)
	Reservacion findReservation(@Param("id") int id);
}
