package br.com.cendrethecoffeee.LogService.repository;

import br.com.cendrethecoffeee.LogService.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, UUID> {

}
