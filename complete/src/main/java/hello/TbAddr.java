package hello;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbAddr {

        @Id
        private String stnmUnonCd;
        public String getStnmUnonCd() {
                return stnmUnonCd;
        }
        public void setStnmUnonCd(String stnmUnonCd) {
                this.stnmUnonCd = stnmUnonCd;
        }

        private String cityCd;
        public String getCityCd() {
                return cityCd;
        }
        public void setCityCd(String cityCd) {
                this.cityCd = cityCd;
        }

	private String sgguCd;
	public String getSgguCd() {
		return sgguCd;
	}
	public void setSgguCd(String sgguCd) {
		this.sgguCd = sgguCd;
	}

	private String emdCd;
	public String getEmdCd() {
		return emdCd;
	}
	public void setEmdCd(String emdCd) {
		this.emdCd = emdCd;
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

	private String sgguBldgNm;
	public String getSgguBldgNm() {
		return sgguBldgNm;
	}
	public void setSgguBldgNm(String sgguBldgNm) {
		this.sgguBldgNm = sgguBldgNm;
	}

	private String ltnoAddr;
	public String getLtnoAddr() {
		return ltnoAddr;
	}
	public void setLtnoAddr(String ltnoAddr) {
		this.ltnoAddr = ltnoAddr;
	}

	private String stnmAddr;
	public String getStnmAddr() {
		return stnmAddr;
	}
	public void setStnmAddr(String stnmAddr) {
		this.stnmAddr = stnmAddr;
	}

	private String lwdgCd;
	public String getLwdgCd() {
		return lwdgCd;
	}
	public void setLwdgCd(String lwdgCd) {
		this.lwdgCd = lwdgCd;
	}
}
