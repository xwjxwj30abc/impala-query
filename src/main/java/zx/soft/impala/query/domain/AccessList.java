package zx.soft.impala.query.domain;

public class AccessList {
	private long id;
	private long Service_code;
	private long Net_ending_ip;
	private String Net_ending_name;
	private long Time;
	private long Net_ending_mac;
	private long Destination_ip;
	private int Port;
	private int Service_type;
	private String Keyword1;
	private String Keyword2;
	//private int Keyword3;
	private String Keyword3;
	private long Mac;
	private int Source_port;
	private String Net_ending_ipv6;
	private String Destination_ipv6;
	private int Keyword11;
	private int Keyword12;
	private int Keyword13;
	private int Keyword14;
	private long Keyword15;
	private String Keyword21;
	private String Keyword22;
	private String Keyword23;
	private String Keyword24;
	private String Keyword25;

	//private long pid;

	public long getId() {
		return id;
	}

	public long getService_code() {
		return Service_code;
	}

	public long getNet_ending_ip() {
		return Net_ending_ip;
	}

	public String getNet_ending_name() {
		return Net_ending_name;
	}

	public long getTime() {
		return Time;
	}

	public long getNet_ending_mac() {
		return Net_ending_mac;
	}

	public long getDestination_ip() {
		return Destination_ip;
	}

	public int getPort() {
		return Port;
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

	public String isKeyword3() {
		return Keyword3;
	}

	public long getMac() {
		return Mac;
	}

	public int getSource_port() {
		return Source_port;
	}

	public String getNet_ending_ipv6() {
		return Net_ending_ipv6;
	}

	public String getDestination_ipv6() {
		return Destination_ipv6;
	}

	public int getKeyword11() {
		return Keyword11;
	}

	public int getKeyword12() {
		return Keyword12;
	}

	public int getKeyword13() {
		return Keyword13;
	}

	public int getKeyword14() {
		return Keyword14;
	}

	public long getKeyword15() {
		return Keyword15;
	}

	public String getKeyword21() {
		return Keyword21;
	}

	public String getKeyword22() {
		return Keyword22;
	}

	public String getKeyword23() {
		return Keyword23;
	}

	public String getKeyword24() {
		return Keyword24;
	}

	public String getKeyword25() {
		return Keyword25;
	}

	//	public long getPid() {
	//		return pid;
	//	}

	public void setId(long id) {
		this.id = id;
	}

	public void setService_code(long service_code) {
		Service_code = service_code;
	}

	public void setNet_ending_ip(long net_ending_ip) {
		Net_ending_ip = net_ending_ip;
	}

	public void setNet_ending_name(String net_ending_name) {
		Net_ending_name = net_ending_name;
	}

	public void setTime(long time) {
		Time = time;
	}

	public void setNet_ending_mac(long net_ending_mac) {
		Net_ending_mac = net_ending_mac;
	}

	public void setDestination_ip(long destination_ip) {
		Destination_ip = destination_ip;
	}

	public void setPort(int port) {
		Port = port;
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

	public void setKeyword3(String keyword3) {
		Keyword3 = keyword3;
	}

	public void setMac(long mac) {
		Mac = mac;
	}

	public void setSource_port(int source_port) {
		Source_port = source_port;
	}

	public void setNet_ending_ipv6(String net_ending_ipv6) {
		Net_ending_ipv6 = net_ending_ipv6;
	}

	public void setDestination_ipv6(String destination_ipv6) {
		Destination_ipv6 = destination_ipv6;
	}

	public void setKeyword11(int keyword11) {
		Keyword11 = keyword11;
	}

	public void setKeyword12(int keyword12) {
		Keyword12 = keyword12;
	}

	public void setKeyword13(int keyword13) {
		Keyword13 = keyword13;
	}

	public void setKeyword14(int keyword14) {
		Keyword14 = keyword14;
	}

	public void setKeyword15(long keyword15) {
		Keyword15 = keyword15;
	}

	public void setKeyword21(String keyword21) {
		Keyword21 = keyword21;
	}

	public void setKeyword22(String keyword22) {
		Keyword22 = keyword22;
	}

	public void setKeyword23(String keyword23) {
		Keyword23 = keyword23;
	}

	public void setKeyword24(String keyword24) {
		Keyword24 = keyword24;
	}

	public void setKeyword25(String keyword25) {
		Keyword25 = keyword25;
	}

	//	public void setPid(long pid) {
	//		this.pid = pid;
	//	}

	@Override
	public String toString() {
		return "AccessList [id=" + id + ", Service_code=" + Service_code + ", Net_ending_ip=" + Net_ending_ip
				+ ", Net_ending_name=" + Net_ending_name + ", Time=" + Time + ", Net_ending_mac=" + Net_ending_mac
				+ ", Destination_ip=" + Destination_ip + ", Port=" + Port + ", Service_type=" + Service_type
				+ ", Keyword1=" + Keyword1 + ", Keyword2=" + Keyword2 + ", Keyword3=" + Keyword3 + ", Mac=" + Mac
				+ ", Source_port=" + Source_port + ", Net_ending_ipv6=" + Net_ending_ipv6 + ", Destination_ipv6="
				+ Destination_ipv6 + ", Keyword11=" + Keyword11 + ", Keyword12=" + Keyword12 + ", Keyword13="
				+ Keyword13 + ", Keyword14=" + Keyword14 + ", Keyword15=" + Keyword15 + ", Keyword21=" + Keyword21
				+ ", Keyword22=" + Keyword22 + ", Keyword23=" + Keyword23 + ", Keyword24=" + Keyword24 + ", Keyword25="
				+ Keyword25 + "]";
	}

}
