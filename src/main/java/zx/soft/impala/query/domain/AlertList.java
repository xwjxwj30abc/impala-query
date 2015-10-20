package zx.soft.impala.query.domain;

public class AlertList {

	private long id;
	private long Service_code;
	private String Rule_id;
	private long Destination_ip;
	private long Net_ending_ip;
	private long Net_ending_mac;
	private String Destination_ipv6;
	private String Net_ending_ipv6;
	private long Matching_time;
	private int Service_type;
	private String Keyword1;
	private String Keyword2;
	private int Keyword3;
	private String User_name;
	private String Certificate_type;
	private String Certificate_code;
	private String Org_name;
	private String Country;
	private long pid;

	public long getId() {
		return id;
	}

	public long getService_code() {
		return Service_code;
	}

	public String getRule_id() {
		return Rule_id;
	}

	public long getDestination_ip() {
		return Destination_ip;
	}

	public long getNet_ending_ip() {
		return Net_ending_ip;
	}

	public long getNet_ending_mac() {
		return Net_ending_mac;
	}

	public String getDestination_ipv6() {
		return Destination_ipv6;
	}

	public String getNet_ending_ipv6() {
		return Net_ending_ipv6;
	}

	public long getMatching_time() {
		return Matching_time;
	}

	public int getService_type() {
		return Service_type;
	}

	public String getKeyword1() {
		return Keyword1;
	}

	public String getKeyword2() {
		return Keyword2;
	}

	public int getKeyword3() {
		return Keyword3;
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

	public String getOrg_name() {
		return Org_name;
	}

	public String getCountry() {
		return Country;
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

	public void setRule_id(String rule_id) {
		Rule_id = rule_id;
	}

	public void setDestination_ip(long destination_ip) {
		Destination_ip = destination_ip;
	}

	public void setNet_ending_ip(long net_ending_ip) {
		Net_ending_ip = net_ending_ip;
	}

	public void setNet_ending_mac(long net_ending_mac) {
		Net_ending_mac = net_ending_mac;
	}

	public void setDestination_ipv6(String destination_ipv6) {
		Destination_ipv6 = destination_ipv6;
	}

	public void setNet_ending_ipv6(String net_ending_ipv6) {
		Net_ending_ipv6 = net_ending_ipv6;
	}

	public void setMatching_time(long matching_time) {
		Matching_time = matching_time;
	}

	public void setService_type(int service_type) {
		Service_type = service_type;
	}

	public void setKeyword1(String keyword1) {
		Keyword1 = keyword1;
	}

	public void setKeyword2(String keyword2) {
		Keyword2 = keyword2;
	}

	public void setKeyword3(int keyword3) {
		Keyword3 = keyword3;
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

	public void setOrg_name(String org_name) {
		Org_name = org_name;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "AlertList [id=" + id + ", Service_code=" + Service_code + ", Rule_id=" + Rule_id + ", Destination_ip="
				+ Destination_ip + ", Net_ending_ip=" + Net_ending_ip + ", Net_ending_mac=" + Net_ending_mac
				+ ", Destination_ipv6=" + Destination_ipv6 + ", Net_ending_ipv6=" + Net_ending_ipv6
				+ ", Matching_time=" + Matching_time + ", Service_type=" + Service_type + ", Keyword1=" + Keyword1
				+ ", Keyword2=" + Keyword2 + ", Keyword3=" + Keyword3 + ", User_name=" + User_name
				+ ", Certificate_type=" + Certificate_type + ", Certificate_code=" + Certificate_code + ", Org_name="
				+ Org_name + ", Country=" + Country + ", pid=" + pid + "]";
	}

}
