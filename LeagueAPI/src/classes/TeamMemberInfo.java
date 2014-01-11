package classes;

public class TeamMemberInfo {

	private String inviteDate;
	private String joinDate;
	private long playerId;
	private String status;
	
	public String getInviteDate() {
		return inviteDate;
	}
	public void setInviteDate(String inviteDate) {
		this.inviteDate = inviteDate;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
