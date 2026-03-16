/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.springboot_app.model;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface RepresentationRepository extends CrudRepository<Representation, Long> {
	List<Representation> findByShow(Show show);
	List<Representation> findByLocation(Location location);
	List<Representation> findByWhen(LocalDateTime when);
}

