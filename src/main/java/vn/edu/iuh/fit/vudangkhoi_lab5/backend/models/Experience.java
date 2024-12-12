package vn.edu.iuh.fit.vudangkhoi_lab5.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @Column(name = "exp_id", nullable = false)
    private Long id;

    @Column(name = "company", length = 120)
    private String company;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "role", length = 100)
    private String role;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column(name = "work_desc", length = 400)
    private String workDesc;

    @Column(name = "can_id")
    private Long canId;

}