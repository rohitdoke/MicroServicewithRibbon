package com.justimagine.EmployeeAppFingClient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.justimagine.Response.AddressResponse;
@FeignClient(name="addressService",path="/address-app/api")
@RibbonClient(name="addressService")
public interface AddressClient {

	
	@GetMapping(value="/address/{id}")
	public ResponseEntity<AddressResponse> getAddressByEmpoyeeId(@PathVariable Integer id);
}
