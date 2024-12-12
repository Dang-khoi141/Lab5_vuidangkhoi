package vn.edu.iuh.fit.vudangkhoi_lab5.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.services.CandidateService;

@Controller
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;
//    @Autowired
//    private AddressRepository addressRepository;
//    @Autowired
//    private CandidateService candidateService;

    @GetMapping("/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidate/list-no-paging";
    }

}
