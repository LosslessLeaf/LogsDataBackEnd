package com.providencepolice.data.logs;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Table(name="tblCaseLog")
@IdClass(CaseLogId.class)
public class CaseLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="casenumber")
	private String casenumber;
	@Id
	@Column(name="location")
	private String location;
	@Id
	@Column(name="reported_date")
	private String reported_date;
	@Id
	@Column(name="statute_code")
	private String statute_code;
	
	@Column(name="statute_desc")
	private String statute_desc;
	
	@Column(name="offense_desc")
	private String offense_desc;

	@Column(name="counts")
	private int counts;
	
	@Column(name="reporting_officer")
	private String reporting_officer;
	
	private String month;
	
	private String year;
	
	public CaseLog() {
		
	}


	public CaseLog(String casenumber, String location, String reported_date, String month,
			String year, String offense_desc, String statute_code, String statute_desc, Integer counts,
			String reporting_officer) {
		this.casenumber = casenumber;
		this.location = location;
		this.reported_date = reported_date;
		this.offense_desc = offense_desc;
		this.statute_code = statute_code;
		this.statute_desc = statute_desc;
		this.counts = counts;
		this.reporting_officer = reporting_officer;
	}


//	public Integer getCaseNumberID() {
//		return casenumber_id;
//	}
//
//
//	public void setCaseID(Integer caseNumberID) {
//		this.casenumber_id = caseNumberID;
//	}


	public String getCaseNumber() {
		return casenumber;
	}


	public void setCaseNumber(String caseNumber) {
		this.casenumber = caseNumber;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getReportedDate() {
		return reported_date;
	}


	public void setReportedDate(String reportedDate) {
		this.reported_date = reportedDate;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	public String getOffenseDesc() {
		return offense_desc;
	}


	public void setOffenseDesc(String offenseDesc) {
		this.offense_desc = offenseDesc;
	}


	public String getStatuteCode() {
		return statute_code;
	}


	public void setStatuteCode(String statuteCode) {
		this.statute_code = statuteCode;
	}


	public String getStatuteDesc() {
		return statute_desc;
	}


	public void setStatuteDesc(String statuteDesc) {
		this.statute_desc = statuteDesc;
	}


	public Integer getCounts() {
		return counts;
	}


	public void setCounts(Integer counts) {
		this.counts = counts;
	}


	public String getReportingOfficer() {
		return reporting_officer;
	}


	public void setReportingOfficer(String reportingOfficer) {
		this.reporting_officer = reportingOfficer;
	}


	@Override
	public String toString() {
		return "CaseLog [casenumber=" + casenumber + ", location=" + location
				+ ", reported_date=" + reported_date + ", month=" + month + ", year=" + year + ", offense_desc="
				+ offense_desc + ", statute_code=" + statute_code + ", statute_desc=" + statute_desc + ", counts="
				+ counts + ", reporting_officer=" + reporting_officer + "]";
	}


//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((casenumber == null) ? 0 : casenumber.hashCode());
//		result = prime * result + casenumber_id;
//		result = prime * result + counts;
//		result = prime * result + ((location == null) ? 0 : location.hashCode());
//		result = prime * result + ((month == null) ? 0 : month.hashCode());
//		result = prime * result + ((offense_desc == null) ? 0 : offense_desc.hashCode());
//		result = prime * result + ((reported_date == null) ? 0 : reported_date.hashCode());
//		result = prime * result + ((reporting_officer == null) ? 0 : reporting_officer.hashCode());
//		result = prime * result + ((statute_code == null) ? 0 : statute_code.hashCode());
//		result = prime * result + ((statute_desc == null) ? 0 : statute_desc.hashCode());
//		result = prime * result + ((year == null) ? 0 : year.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CaseLog other = (CaseLog) obj;
//		if (casenumber == null) {
//			if (other.casenumber != null)
//				return false;
//		} else if (!casenumber.equals(other.casenumber))
//			return false;
//		if (casenumber_id != other.casenumber_id)
//			return false;
//		if (counts != other.counts)
//			return false;
//		if (location == null) {
//			if (other.location != null)
//				return false;
//		} else if (!location.equals(other.location))
//			return false;
//		if (month == null) {
//			if (other.month != null)
//				return false;
//		} else if (!month.equals(other.month))
//			return false;
//		if (offense_desc == null) {
//			if (other.offense_desc != null)
//				return false;
//		} else if (!offense_desc.equals(other.offense_desc))
//			return false;
//		if (reported_date == null) {
//			if (other.reported_date != null)
//				return false;
//		} else if (!reported_date.equals(other.reported_date))
//			return false;
//		if (reporting_officer == null) {
//			if (other.reporting_officer != null)
//				return false;
//		} else if (!reporting_officer.equals(other.reporting_officer))
//			return false;
//		if (statute_code == null) {
//			if (other.statute_code != null)
//				return false;
//		} else if (!statute_code.equals(other.statute_code))
//			return false;
//		if (statute_desc == null) {
//			if (other.statute_desc != null)
//				return false;
//		} else if (!statute_desc.equals(other.statute_desc))
//			return false;
//		if (year == null) {
//			if (other.year != null)
//				return false;
//		} else if (!year.equals(other.year))
//			return false;
//		return true;
//	}
	
	

}
