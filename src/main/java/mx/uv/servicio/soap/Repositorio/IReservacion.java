package mx.uv.servicio.soap.Repositorio;

import org.springframework.data.repository.CrudRepository;

import mx.uv.servicio.soap.DTO.Reservacion;

public interface IReservacion extends CrudRepository<Reservacion, Integer>
{

}
