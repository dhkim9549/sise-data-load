package hello;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbEmd {

	@Id
        private Integer seq;
        public Integer getSeq() {
                return seq;
        }
        public void setSeq(Integer seq) {
                this.seq = seq;
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

	private String emdNm;
	public String getEmdNm() {
		return emdNm;
	}
	public void setEmdNm(String emdNm) {
		this.emdNm = emdNm;
	}
}

