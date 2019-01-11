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
@Table(name = "USER")
@Getter
@Setter
public class User extends SerializableSerializer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5307439850368353248L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LAST")
	private String last;

	@Column(name = "AGE")
	private Integer age;
}
