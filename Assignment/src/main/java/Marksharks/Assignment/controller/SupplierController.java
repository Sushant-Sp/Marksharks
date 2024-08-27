package Marksharks.Assignment.controller;

import Marksharks.Assignment.model.Supplier;
import Marksharks.Assignment.service.SupplierService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @Autowired
    private SupplierService supplierService;


    @PostMapping("/add")
    public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier supplier){
        Supplier createdSupplier=supplierService.createSupplier(supplier);
        return new ResponseEntity<>(createdSupplier, HttpStatus.CREATED);

    }


    @GetMapping("/search")
    public ResponseEntity<List<Supplier>> searchSuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam List<String> manufacturingProcesses) {
        List<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }



}
