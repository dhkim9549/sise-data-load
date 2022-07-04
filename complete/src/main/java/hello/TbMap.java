package hello;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbMap {

	@Id
        private Integer seq;
        public Integer getSeq() {
                return seq;
        }
        public void setSeq(Integer seq) {
                this.seq = seq;
        }

	private String stnmUnonCd;
	public String getStnmUnonCd() {
		return stnmUnonCd;
	}
	public void setStnmUnonCd(String stnmUnonCd) {
		this.stnmUnonCd = stnmUnonCd;
	}

	private String siseDvcd;
	public String getSiseDvcd() {
		return siseDvcd;
	}
	public void setSiseDvcd(String siseDvcd) {
		this.siseDvcd = siseDvcd;
	}

	private String siseMapRelSeq;
	public String getSiseMapRelSeq() {
		return siseMapRelSeq;
	}
	public void setSiseMapRelSeq(String siseMapRelSeq) {
		this.siseMapRelSeq = siseMapRelSeq;
	}

	private String siseMapDstgKeyVal;
	public String getSiseMapDstgKeyVal() {
		return siseMapDstgKeyVal;
	}
	public void setSiseMapDstgKeyVal(String siseMapDstgKeyVal) {
		this.siseMapDstgKeyVal = siseMapDstgKeyVal;
	}
}	

