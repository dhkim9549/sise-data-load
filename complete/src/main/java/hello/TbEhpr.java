package hello;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbEhpr {

	@Id
	private String eachHsSeq;
	public String getEachHsSeq() {
		return eachHsSeq;
	}
	public void setEachHsSeq(String eachHsSeq) {
		this.eachHsSeq = eachHsSeq;
	}

	private String basisYm;
	public String getBasisYm() {
		return basisYm;
	}
	public void setBasisYm(String basisYm) {
		this.basisYm = basisYm;
	}

	private String lwdgCd;
	public String getLwdgCd() {
		return lwdgCd;
	}
	public void setLwdgCd(String lwdgCd) {
		this.lwdgCd = lwdgCd;
	}

	private String stnmAddr;
	public String getStnmAddr() {
		return stnmAddr;
	}
	public void setStnmAddr(String stnmAddr) {
		this.stnmAddr = stnmAddr;
	}

	private String cityNm;
	public String getCityNm() {
		return cityNm;
	}
	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}

	private String sgguNm;
	public String getSgguNm() {
		return sgguNm;
	}
	public void setSgguNm(String sgguNm) {
		this.sgguNm = sgguNm;
	}

	private String eubMyunNm;
	public String getEubMyunNm() {
		return eubMyunNm;
	}
	public void setEubMyunNm(String eubMyunNm) {
		this.eubMyunNm = eubMyunNm;
	}

	private String dongRiNm;
	public String getDongRiNm() {
		return dongRiNm;
	}
	public void setDongRiNm(String dongRiNm) {
		this.dongRiNm = dongRiNm;
	}

	private String slndCd;
	public String getSlndCd() {
		return slndCd;
	}
	public void setSlndCd(String slndCd) {
		this.slndCd = slndCd;
	}

	private String ltnoBno;
	public String getLtnoBno() {
		return ltnoBno;
	}
	public void setLtnoBno(String ltnoBno) {
		this.ltnoBno = ltnoBno;
	}

	private String ltnoBuno;
	public String getLtnoBuno() {
		return ltnoBuno;
	}
	public void setLtnoBuno(String ltnoBuno) {
		this.ltnoBuno = ltnoBuno;
	}

	private String bldgArea;
	public String getBldgArea() {
		return bldgArea;
	}
	public void setBldgArea(String bldgArea) {
		this.bldgArea = bldgArea;
	}

	private String cnldUnqNo;
	public String getCnldUnqNo() {
		return cnldUnqNo;
	}
	public void setCnldUnqNo(String cnldUnqNo) {
		this.cnldUnqNo = cnldUnqNo;
	}

	private Long ofntPrc;
	public Long getOfntPrc() {
		return ofntPrc;
	}
	public void setOfntPrc(Long ofntPrc) {
		this.ofntPrc = ofntPrc;
	}

	private String bldgMngNo;
	public String getBldgMngNo() {
		return bldgMngNo;
	}
	public void setBldgMngNo(String bldgMngNo) {
		this.bldgMngNo = bldgMngNo;
	}

	private String stnm;
	public String getStnm() {
		return stnm;
	}
	public void setStnm(String stnm) {
		this.stnm = stnm;
	}

	private String bldgBno;
	public String getBldgBno() {
		return bldgBno;
	}
	public void setBldgBno(String bldgBno) {
		this.bldgBno = bldgBno;
	}

	private String bldgBuno;
	public String getBldgBuno() {
		return bldgBuno;
	}
	public void setBldgBuno(String bldgBuno) {
		this.bldgBuno = bldgBuno;
	}
}
