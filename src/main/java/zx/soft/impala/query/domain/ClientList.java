package zx.soft.impala.query.domain;

public class ClientList {

	private long id;
	private long Service_code;
	private String User_name;
	private String Certificate_type;
	private String Certificate_code;
	private long Online_time;
	private long Offline_time;
	private String Net_ending_name;
	private long Net_ending_ip;
	private long Net_ending_mac;
	private String Org_name;
	private String Contry;
	private String Note;
	private String Net_ending_ipv6;
	private String User_name_pinyin;
	private int Sex;
	private String Description;
	private long pid;

	public long getId() {
		return id;
	}

	public long getService_code() {
		return Service_code;
	}

	public String getUser_name() {
		return User_name;
	}

	public String getCertificate_type() {
		return Certificate_type;
	}

	public String getCertificate_code() {
		return Certificate_code;
	}

	public long getOnline_time() {
		return Online_time;
	}

	public long getOffline_time() {
		return Offline_time;
	}

	public String getNet_ending_name() {
		return Net_ending_name;
	}

	public long getNet_ending_ip() {
		return Net_ending_ip;
	}

	public long getNet_ending_mac() {
		return Net_ending_mac;
	}

	public String getOrg_name() {
		return Org_name;
	}

	public String getContry() {
		return Contry;
	}

	public String getNote() {
		return Note;
	}

	public String getNet_ending_ipv6() {
		return Net_ending_ipv6;
	}

	public String getUser_name_pinyin() {
		return User_name_pinyin;
	}

	public int getSex() {
		return Sex;
	}

	public String getDescription() {
		return Description;
	}

	public long getPid() {
		return pid;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setService_code(long service_code) {
		Service_code = service_code;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public void setCertificate_type(String certificate_type) {
		Certificate_type = certificate_type;
	}

	public void setCertificate_code(String certificate_code) {
		Certificate_code = certificate_code;
	}

	public void setOnline_time(long online_time) {
		Online_time = online_time;
	}

	public void setOffline_time(long offline_time) {
		Offline_time = offline_time;
	}

	public void setNet_ending_name(String net_ending_name) {
		Net_ending_name = net_ending_name;
	}

	public void setNet_ending_ip(long net_ending_ip) {
		Net_ending_ip = net_ending_ip;
	}

	public void setNet_ending_mac(long net_ending_mac) {
		Net_ending_mac = net_ending_mac;
	}

	public void setOrg_name(String org_name) {
		Org_name = org_name;
	}

	public void setContry(String contry) {
		Contry = contry;
	}

	public void setNote(String note) {
		Note = note;
	}

	public void setNet_ending_ipv6(String net_ending_ipv6) {
		Net_ending_ipv6 = net_ending_ipv6;
	}

	public void setUser_name_pinyin(String user_name_pinyin) {
		User_name_pinyin = user_name_pinyin;
	}

	public void setSex(int sex) {
		Sex = sex;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "ClientList [id=" + id + ", Service_code=" + Service_code + ", User_name=" + User_name
				+ ", Certificate_type=" + Certificate_type + ", Certificate_code=" + Certificate_code
				+ ", Online_time=" + Online_time + ", Offline_time=" + Offline_time + ", Net_ending_name="
				+ Net_ending_name + ", Net_ending_ip=" + Net_ending_ip + ", Net_ending_mac=" + Net_ending_mac
				+ ", Org_name=" + Org_name + ", Contry=" + Contry + ", Note=" + Note + ", Net_ending_ipv6="
				+ Net_ending_ipv6 + ", User_name_pinyin=" + User_name_pinyin + ", Sex=" + Sex + ", Description="
				+ Description + ", pid=" + pid + "]";
	}

}
