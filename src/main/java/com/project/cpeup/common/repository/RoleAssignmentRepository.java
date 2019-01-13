package com.project.cpeup.common.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.cpeup.common.entities.RoleAssignment;

public interface RoleAssignmentRepository extends CrudRepository<RoleAssignment, Integer> {
	
	List<RoleAssignment> findByUserId(Integer userId);
}
