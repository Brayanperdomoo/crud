package com.sena.crud_basic.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.crud_basic.repository.ICustomerRepository;
import com.sena.crud_basic.model.employeeDTO;

/*
 * Agregamos la anotación bean @Service
 * Para indicar que el archivo es un servicio
 */
@Service
public class CustomerService{

    //se realiza la conexión con el repositorio
    @Autowired
    private ICustomerRepository ICustomerRepository;

    /*
     * crear
     * eliminar
     * actualizar
     * leer lista completa
     * leer el cliente por id
     * adicional los requeridos
     * 
     */





    public List<employeeDTO> getAllCustomer(){
        return ICustomerRepository.findAll();
    }

    public employeeDTO getCustomerById(int id){
        return ICustomerRepository.findById(id).get();
    }

    public boolean save(employeeDTO customer){
        /*
         * if(customer.getId==0)register or create
         * else update
         */
        ICustomerRepository.save(customer);
        return true;
    }
    
}
