/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.springboot_app.model;

import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface LocalityRepository extends CrudRepository<Locality, Long> {
	Locality findByPostalCode(String postalCode);
	Locality findByLocality(String locality);
}
