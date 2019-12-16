package com.cts.technology.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "technology")
public class Technology {

	@Id
	@NotNull
	@Column(name = "t_id")
	private int id;

	@NotEmpty(message = "please provide technology name")
	@Column(name = "t_name")
	private String name;

	@NotNull(message = "please provide technology duration")
	@Column(name = "t_duration")
	private int duration;

	@NotEmpty(message = "please provide prerequisites")
	@Column(name = "t_prerequisites")
	private String prerequisites;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	@Override
	public String toString() {
		return "Technology [id=" + id + ", name=" + name + ", duration=" + duration + ", prerequisites=" + prerequisites
				+ "]";
	}

}
