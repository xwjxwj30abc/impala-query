package zx.soft.impala.query.domain;

public class Weibo {

	private long wid;
	private long username;
	private int repostscount;
	private int commentscount;
	private String text;
	private long createat;
	private long owid;
	private long ousername;
	private boolean favorited;
	private String originalpic;
	private String source;
	private String visible;
	private long lasttime;

	public long getWid() {
		return wid;
	}

	public long getUsername() {
		return username;
	}

	public int getRepostscount() {
		return repostscount;
	}

	public int getCommentscount() {
		return commentscount;
	}

	public String getText() {
		return text;
	}

	public long getCreateat() {
		return createat;
	}

	public long getOwid() {
		return owid;
	}

	public long getOusername() {
		return ousername;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public String getOriginalpic() {
		return originalpic;
	}

	public String getSource() {
		return source;
	}

	public String getVisible() {
		return visible;
	}

	public long getLasttime() {
		return lasttime;
	}

	public void setWid(long wid) {
		this.wid = wid;
	}

	public void setUsername(long username) {
		this.username = username;
	}

	public void setRepostscount(int repostscount) {
		this.repostscount = repostscount;
	}

	public void setCommentscount(int commentscount) {
		this.commentscount = commentscount;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setCreateat(long createat) {
		this.createat = createat;
	}

	public void setOwid(long owid) {
		this.owid = owid;
	}

	public void setOusername(long ousername) {
		this.ousername = ousername;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public void setOriginalpic(String originalpic) {
		this.originalpic = originalpic;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public void setLasttime(long lasttime) {
		this.lasttime = lasttime;
	}

	@Override
	public String toString() {
		return "Weibo [wid=" + wid + ", username=" + username + ", repostscount=" + repostscount + ", commentscount="
				+ commentscount + ", text=" + text + ", createat=" + createat + ", owid=" + owid + ", ousername="
				+ ousername + ", favorited=" + favorited + ", originalpic=" + originalpic + ", source=" + source
				+ ", visible=" + visible + ", lasttime=" + lasttime + "]";
	}

}
