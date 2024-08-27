package Marksharks.Assignment.service;

import Marksharks.Assignment.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    Supplier createSupplier(Supplier supplier);

    Page<Supplier> searchSuppliers(String location, String natureOfBusiness, List<String> manufacturingProcesses, Pageable pageable);



}
