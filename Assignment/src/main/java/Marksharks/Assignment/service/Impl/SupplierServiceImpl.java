package Marksharks.Assignment.service.Impl;

import Marksharks.Assignment.model.Supplier;
import Marksharks.Assignment.repository.SupplierRepository;
import Marksharks.Assignment.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier createSupplier (Supplier supplier){
        Supplier newSupplier=new Supplier();
        Supplier savedSupplier=supplierRepository.save(supplier);
        return savedSupplier;
    }

    @Override
    public List<Supplier> searchSuppliers(String location, String natureOfBusiness, List<String> manufacturingProcesses) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
                location, natureOfBusiness, manufacturingProcesses);
    }
}
