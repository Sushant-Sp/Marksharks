package Marksharks.Assignment.controller;

import Marksharks.Assignment.model.Supplier;
import Marksharks.Assignment.service.SupplierService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity<Supplier> createSupplier(@Validated @RequestBody Supplier supplier){
        Supplier createdSupplier=supplierService.createSupplier(supplier);
        return new ResponseEntity<>(createdSupplier, HttpStatus.CREATED);

    }


    @GetMapping("/search")
    public ResponseEntity<Page<Supplier>> searchSuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam List<String> manufacturingProcesses,
            @PageableDefault(size = 10) Pageable pageable)  {
        Page<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses,pageable);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }



}
