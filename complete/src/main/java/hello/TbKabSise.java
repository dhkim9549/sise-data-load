package hello;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbKabSise {

	@Id
        private Integer seq;
        public Integer getSeq() {
                return seq;
        }
        public void setSeq(Integer seq) {
                this.seq = seq;
        }

	private String kabDnjiNo;
	public String getKabDnjiNo() {
		return kabDnjiNo;
	}
	public void setKabDnjiNo(String kabDnjiNo) {
		this.kabDnjiNo = kabDnjiNo;
	}

	private String kabPtyNo;
	public String getKabPtyNo() {
		return kabPtyNo;
	}
	public void setKabPtyNo(String kabPtyNo) {
		this.kabPtyNo = kabPtyNo;
	}

	private String pyngArea;
	public String getPyngArea() {
		return pyngArea;
	}
	public void setPyngArea(String pyngArea) {
		this.pyngArea = pyngArea;
	}

	private String ptyTypeNm;
	public String getPtyTypeNm() {
		return ptyTypeNm;
	}
	public void setPtyTypeNm(String ptyTypeNm) {
		this.ptyTypeNm = ptyTypeNm;
	}

	private String rschDy;
	public String getRschDy() {
		return rschDy;
	}
	public void setRschDy(String rschDy) {
		this.rschDy = rschDy;
	}

	private String excvArea;
	public String getExcvArea() {
		return excvArea;
	}
	public void setExcvArea(String excvArea) {
		this.excvArea = excvArea;
	}

	private String hhldCnt;
	public String getHhldCnt() {
		return hhldCnt;
	}
	public void setHhldCnt(String hhldCnt) {
		this.hhldCnt = hhldCnt;
	}

	private String roomCnt;
	public String getRoomCnt() {
		return roomCnt;
	}
	public void setRoomCnt(String roomCnt) {
		this.roomCnt = roomCnt;
	}

	private String bathCnt;
	public String getBathCnt() {
		return bathCnt;
	}
	public void setBathCnt(String bathCnt) {
		this.bathCnt = bathCnt;
	}

	private Long trdTopPrc;
	public Long getTrdTopPrc() {
		return trdTopPrc;
	}
	public void setTrdTopPrc(Long trdTopPrc) {
		this.trdTopPrc = trdTopPrc;
	}

	private Long trdBttmPrc;
	public Long getTrdBttmPrc() {
		return trdBttmPrc;
	}
	public void setTrdBttmPrc(Long trdBttmPrc) {
		this.trdBttmPrc = trdBttmPrc;
	}

	private Long trdAvgPrc;
	public Long getTrdAvgPrc() {
		return trdAvgPrc;
	}
	public void setTrdAvgPrc(Long trdAvgPrc) {
		this.trdAvgPrc = trdAvgPrc;
	}

	private Long jnseTopPrc;
	public Long getJnseTopPrc() {
		return jnseTopPrc;
	}
	public void setJnseTopPrc(Long jnseTopPrc) {
		this.jnseTopPrc = jnseTopPrc;
	}

	private Long jnseBttmPrc;
	public Long getJnseBttmPrc() {
		return jnseBttmPrc;
	}
	public void setJnseBttmPrc(Long jnseBttmPrc) {
		this.jnseBttmPrc = jnseBttmPrc;
	}
}
