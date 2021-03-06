package io.crnk.data.jpa.model;

import io.crnk.core.resource.annotations.JsonApiResource;

import javax.persistence.Column;
import javax.persistence.Entity;

@JsonApiResource(type = "tablePerClassChild")
@Entity
public class TablePerClassChildEntity extends TablePerClassBaseEntity {

	public static final String ATTR_intValue = "intValue";

	@Column
	private int intValue;

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

}