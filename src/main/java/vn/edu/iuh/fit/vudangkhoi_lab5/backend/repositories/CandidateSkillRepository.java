package vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.models.CandidateSkill;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.ids.CandidateSkillId;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {
}