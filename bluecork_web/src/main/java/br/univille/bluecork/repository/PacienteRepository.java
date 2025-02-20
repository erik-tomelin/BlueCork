package br.univille.bluecork.repository;

import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.bluecork.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    List<Paciente> findAllByDataNascimento(Date dataNascimento);
    List<Paciente> findAllByNomeContainsIgnoreCase(String nome);
}