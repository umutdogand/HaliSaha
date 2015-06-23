package bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import pojos.Saha;
import dao.SahaDao;
import dao.islemDao;

@ManagedBean
@RequestScoped
public class sahaBean {
	private String adi;
	private String mail;
	private String adres;
	private String telNo;

	private Saha saha;
	private ArrayList<Saha> sahalar = new ArrayList<Saha>();
	
	@PostConstruct
	public void init(){
		SahaDao sdao=new SahaDao();
		List<Saha> sahaList=sdao.getAll();
		for (Saha saha : sahaList) {
			sahalar.add(saha); 
		}
	}

	public String silSaha() {
		islemDao islem=new islemDao();
		islem.delete(saha);
		return null;
	}

	public String guncelleSaha() {
		saha.setCanEdit(true);
		return null;
	}

	public String kaydetSaha() {
		for (Saha saha : sahalar) {
			saha.setCanEdit(false);
		}
		return null;
	}

	public ArrayList<Saha> getSahalar() {
		return sahalar;
	}

	public void setSaha(Saha saha) {
		this.saha = saha;
	}

	public String kayit() {
		Saha saha = new Saha();
		saha.setAdi(adi);
		saha.setMail(mail);
		saha.setAdres(adres);
		saha.setTelNo(telNo);
		islemDao islem = new islemDao();
		islem.insert(saha);
		return "";
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
