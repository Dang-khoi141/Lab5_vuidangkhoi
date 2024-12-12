package vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.models.JobSkill;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.ids.JobSkillId;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}