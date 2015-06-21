package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import pojos.Saha;
import dao.islemDao;
@ManagedBean
@RequestScoped
public class sahaBean {
	private String adi;
	private String mail;
	private String adres;
	private String telNo;
	
	public String kayit(){
		Saha saha=new Saha();
		saha.setAdi(adi);
		saha.setMail(mail);
		saha.setAdres(adres);
		saha.setTelNo(telNo);
		islemDao islem=new islemDao();
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
