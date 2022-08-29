package hello;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbEmm {

	@Id
	private Integer seq;
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@org.hibernate.annotations.Type( type = "text" )
	private String json; 
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
}
