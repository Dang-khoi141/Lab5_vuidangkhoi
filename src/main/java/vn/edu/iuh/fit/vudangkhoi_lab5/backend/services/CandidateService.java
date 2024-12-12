package vn.edu.iuh.fit.vudangkhoi_lab5.backend.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.models.Candidate;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories.CandidateRepository;

public class CandidateService {
    private CandidateRepository candidateRepository;
    public Page<Candidate> findAll(int pageNo, int pageSize, String sortBy, String sortDirection){
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);
    }

}
