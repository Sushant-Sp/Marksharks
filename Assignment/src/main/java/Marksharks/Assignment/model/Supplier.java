package Marksharks.Assignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_Id")
    private Long supplierId;

    @NotEmpty(message = "Company name must not be empty")
    @Size(max = 100, message = "Company name must not exceed 100 characters")
    @Column(name = "company_name")
    private String companyName;

    @NotEmpty(message = "Website must not be empty")
    @Column(name = "website")
    private String website;

    @NotEmpty(message = "Location must not be empty")
    @Column(name = "location")
    private String location;

    @NotEmpty(message = "Nature of business must not be empty")
    @Column(name = "nature_of_Business")
    private String natureOfBusiness;

    @ElementCollection
    private List<String> manufacturingProcesses;

}
