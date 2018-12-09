package com.cachemoney.fleetman.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cachemoney.fleetman.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
	public Vehicle findByName(String name);
}
