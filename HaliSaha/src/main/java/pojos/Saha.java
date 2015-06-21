package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Saha_Tbl")
public class Saha {
	private int id;
	private String adi;
	private String mail;
	private String adres;
	private String telNo;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "saha_id_seq")
	@SequenceGenerator(name = "saha_id_seq", sequenceName = "saha_id_seq", allocationSize = 1, initialValue = 10)
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "ADI", length = 50)
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	@Column(name = "MAIL", length = 50)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	@Column(name = "ADRES", length = 50)
	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	@Column(name = "TELNO", length = 50)
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
