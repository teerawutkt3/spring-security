package com.project.cpeup.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ROLE_ASSIGNMENT")
@Getter
@Setter
public class RoleAssignment extends SerializableSerializer{

	private static final long serialVersionUID = -5612945029659362553L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "ROLE_ID")
	private Integer roleId;
}
