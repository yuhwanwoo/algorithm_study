package concept.array;

public class MapleStoryUser implements Comparable<MapleStoryUser> {
	private String nickName;
	// �г���
	private String guildName;
	// ����
	private int level;
	//����
	private int money;
	//���� �޼�
	//������
	public MapleStoryUser(String nickName, String guildName, int level, int money) {
		this.nickName = nickName;
		this.guildName = guildName;
		this.level = level;
		this.money = money;
	}
	//Getter Setter
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGuildName() {
		return guildName;
	}
	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//�г��Ӽ����� �����ϰ� ������
	/*@Override
	public int compareTo(MapleStoryUser user) {
		// TODO Auto-generated method stub
		return this.nickName.compareTo(user.getNickName());
	}*/
	
	
	// �� ������ �����ϰ� ������
	@Override
	public int compareTo(MapleStoryUser user) {
		// TODO Auto-generated method stub
		return ((Integer)money).compareTo(user.getMoney());
	}
}