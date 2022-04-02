package uy.com.sofka.biblioteca.services;

import java.util.List;

import uy.com.sofka.biblioteca.dtos.RecursoDTO;

public interface IRecursoService {
  RecursoDTO crear(RecursoDTO recursoDTO);
  List<RecursoDTO> obtenerTodos();
  RecursoDTO obtenerPorId(String id);
  List<RecursoDTO> recomendarRecursos(String semejante);
  RecursoDTO modificar(RecursoDTO recursoDTO);
  void prestarRecurso(String id);
  void devolverRecurso(String id);
  void borrar(String id);
}
