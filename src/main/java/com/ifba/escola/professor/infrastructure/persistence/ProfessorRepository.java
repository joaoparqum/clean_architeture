package com.ifba.escola.professor.infrastructure.persistence;

import com.ifba.escola.repository.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long>{
    
}
