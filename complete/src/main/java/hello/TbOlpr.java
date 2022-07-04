package hello;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbOlpr {

	@Id
        private String pkstr;
        public String getPkstr() {
                return pkstr;
        }
        public void setPkstr(String pkstr) {
                this.pkstr = pkstr;
        }

	private String twprcDnjiNo;
	public String getTwprcDnjiNo() {
		return twprcDnjiNo;
	}
	public void setTwprcDnjiNo(String twprcDnjiNo) {
		this.twprcDnjiNo = twprcDnjiNo;
	}

	private String twprcDongNo;
	public String getTwprcDongNo() {
		return twprcDongNo;
	}
	public void setTwprcDongNo(String twprcDongNo) {
		this.twprcDongNo = twprcDongNo;
	}

	private String twprcHoNo;
	public String getTwprcHoNo() {
		return twprcHoNo;
	}
	public void setTwprcHoNo(String twprcHoNo) {
		this.twprcHoNo = twprcHoNo;
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

	private String twprcBnjiDvcd;
	public String getTwprcBnjiDvcd() {
		return twprcBnjiDvcd;
	}
	public void setTwprcBnjiDvcd(String twprcBnjiDvcd) {
		this.twprcBnjiDvcd = twprcBnjiDvcd;
	}

	private String addrBno;
	public String getAddrBno() {
		return addrBno;
	}
	public void setAddrBno(String addrBno) {
		this.addrBno = addrBno;
	}

	private String addrBuno;
	public String getAddrBuno() {
		return addrBuno;
	}
	public void setAddrBuno(String addrBuno) {
		this.addrBuno = addrBuno;
	}

	private String bldgNm;
	public String getBldgNm() {
		return bldgNm;
	}
	public void setBldgNm(String bldgNm) {
		this.bldgNm = bldgNm;
	}

	private String dtlBldgNm;
	public String getDtlBldgNm() {
		return dtlBldgNm;
	}
	public void setDtlBldgNm(String dtlBldgNm) {
		this.dtlBldgNm = dtlBldgNm;
	}

	private String bldgHo;
	public String getBldgHo() {
		return bldgHo;
	}
	public void setBldgHo(String bldgHo) {
		this.bldgHo = bldgHo;
	}

	private String apyArea;
	public String getApyArea() {
		return apyArea;
	}
	public void setApyArea(String apyArea) {
		this.apyArea = apyArea;
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

