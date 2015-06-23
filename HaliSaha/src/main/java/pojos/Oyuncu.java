package pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Oyuncu_Tbl")
public class Oyuncu {
	
	private long id;
	private String adi;
	private String soyadi;
	private String oyuncuNo;
	private int mevki;
	private int formaNo;
	private int tip;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "oyuncu_id_seq")
    @SequenceGenerator(name = "oyuncu_id_seq", sequenceName = "oyuncu_id_seq", allocationSize = 1,initialValue = 10)
    @Column(name = "ID")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "ADI", length = 50)
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	@Column(name = "SOYADI", length = 50)
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	@Column(name = "OYUNCU_NO", length = 50)
	public String getOyuncuNo() {
		return oyuncuNo;
	}
	public void setOyuncuNo(String oyuncuNo) {
		this.oyuncuNo = oyuncuNo;
	}
	
//	@OneToMany(fetch=FetchType.EAGER)
//	@JoinColumn(name="ID")
	@Column(name = "MEVKI_ID", length = 50)
	public int getMevki() {
		return mevki;
	}
	public void setMevki(int mevki) {
		this.mevki = mevki;
	}
	
	@Column(name = "FORMA_NO", length = 50)
	public int getFormaNo() {
		return formaNo;
	}
	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}
	
	@Column(name = "TIPI", length = 50)
	public int getTip() {
		return tip;
	}
	public void setTip(int tip) {
		this.tip = tip;
	}
	
}
