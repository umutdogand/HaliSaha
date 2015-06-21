package bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import pojos.Mevki;

@ManagedBean
@RequestScoped
public class oyuncuBean {
	private long id;
	private String adi;
	private String soyadi;
	private String oyuncuNo;
	private ArrayList<Mevki> mevki;
	private int formaNo;
	private int tip;
}
