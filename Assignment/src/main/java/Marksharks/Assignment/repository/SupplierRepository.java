package Marksharks.Assignment.repository;

import Marksharks.Assignment.model.Supplier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long> {

    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
            String location, String natureOfBusiness, List<String> manufacturingProcesses, Pageable pageable);


}
