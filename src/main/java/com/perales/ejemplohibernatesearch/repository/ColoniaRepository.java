package com.perales.ejemplohibernatesearch.repository;

import com.perales.ejemplohibernatesearch.entity.Colonia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ColoniaRepository extends JpaRepository<Colonia, Long> {}
