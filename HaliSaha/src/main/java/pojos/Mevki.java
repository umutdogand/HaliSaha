package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Mevki_Tbl")
public class Mevki {
	private long id;
	private String deger;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mevki_id_seq")
	@SequenceGenerator(name = "mevki_id_seq", sequenceName = "mevki_id_seq", allocationSize = 1, initialValue = 10)
	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name="DEGER",length=50)
	public String getDeger() {
		return deger;
	}

	public void setDeger(String deger) {
		this.deger = deger;
	}

}
