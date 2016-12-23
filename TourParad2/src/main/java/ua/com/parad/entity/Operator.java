package ua.com.parad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Operator {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String official_name;
	private String owner_form;
	private String adress;
	private int phone_number;
	private int licence_number;
	private int bank_garancy;
	private String tax_form;
	private long tax_payment_id;
	private int bank_code;
	private String bank_name;
	private long bank_account;
	private String email;
	private String facebook_account;
	private String password;
	
	public Operator() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Operator(String name, String official_name, String owner_form, String adress, int phone_number,
			int licence_number, int bank_garancy, String tax_form, long tax_payment_id, int bank_code, String bank_name,
			long bank_account, String email, String facebook_account, String password) {
		super();
		this.name = name;
		this.official_name = official_name;
		this.owner_form = owner_form;
		this.adress = adress;
		this.phone_number = phone_number;
		this.licence_number = licence_number;
		this.bank_garancy = bank_garancy;
		this.tax_form = tax_form;
		this.tax_payment_id = tax_payment_id;
		this.bank_code = bank_code;
		this.bank_name = bank_name;
		this.bank_account = bank_account;
		this.email = email;
		this.facebook_account = facebook_account;
		this.password = password;
	}



	@ManyToOne
	private City city;
	
	@OneToMany(mappedBy="operator")
	private List <Filial> filials;
	
	@ManyToMany
	@JoinTable(name="agency_operator",
	joinColumns= @JoinColumn(name="id_agency"),
	inverseJoinColumns=@JoinColumn(name="id_operator"))
	private List <Agency> agencies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficial_name() {
		return official_name;
	}

	public void setOfficial_name(String official_name) {
		this.official_name = official_name;
	}

	public String getOwner_form() {
		return owner_form;
	}

	public void setOwner_form(String owner_form) {
		this.owner_form = owner_form;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public int getLicence_number() {
		return licence_number;
	}

	public void setLicence_number(int licence_number) {
		this.licence_number = licence_number;
	}

	public int getBank_garancy() {
		return bank_garancy;
	}

	public void setBank_garancy(int bank_garancy) {
		this.bank_garancy = bank_garancy;
	}

	public String getTax_form() {
		return tax_form;
	}

	public void setTax_form(String tax_form) {
		this.tax_form = tax_form;
	}

	public long getTax_payment_id() {
		return tax_payment_id;
	}

	public void setTax_payment_id(long tax_payment_id) {
		this.tax_payment_id = tax_payment_id;
	}

	public int getBank_code() {
		return bank_code;
	}

	public void setBank_code(int bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public long getBank_account() {
		return bank_account;
	}

	public void setBank_account(long bank_account) {
		this.bank_account = bank_account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook_account() {
		return facebook_account;
	}

	public void setFacebook_account(String facebook_account) {
		this.facebook_account = facebook_account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Filial> getFilials() {
		return filials;
	}

	public void setFilials(List<Filial> filials) {
		this.filials = filials;
	}

	public List<Agency> getAgencies() {
		return agencies;
	}

	public void setAgencies(List<Agency> agencies) {
		this.agencies = agencies;
	}
	
	

}

