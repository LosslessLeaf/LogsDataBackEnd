package com.providencepolice.data.logs;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CaseLogId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String casenumber;
	protected String location;
	protected String reported_date;
	protected String statute_code;
	
	public CaseLogId() {}
	
	public CaseLogId(String casenumber, String location, String reported_date, String statute_code) {
		this.casenumber = casenumber;
		this.location = location;
		this.reported_date = reported_date;
		this.statute_code = statute_code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((casenumber == null) ? 0 : casenumber.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((reported_date == null) ? 0 : reported_date.hashCode());
		result = prime * result + ((statute_code == null) ? 0 : statute_code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CaseLogId other = (CaseLogId) obj;
		if (casenumber == null) {
			if (other.casenumber != null)
				return false;
		} else if (!casenumber.equals(other.casenumber))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (reported_date == null) {
			if (other.reported_date != null)
				return false;
		} else if (!reported_date.equals(other.reported_date))
			return false;
		if (statute_code == null) {
			if (other.statute_code != null)
				return false;
		} else if (!statute_code.equals(other.statute_code))
			return false;
		return true;
	}
	
	
	
}
