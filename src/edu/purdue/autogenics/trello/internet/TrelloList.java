package edu.purdue.autogenics.trello.internet;

public class TrelloList {
	private String id;
	private String name;
	private String board_id;
	
	private String name_keyword;
	private String owner;
	private Integer synced;

	
	public TrelloList(){
		
	}
	public TrelloList(String newId, String newName, String newBoardId, String newNameKeyword, String newOwner, Integer newSynced){
		setId(newId);
		setName(newName);
		setBoardId(newBoardId);
		setNameKeyword(newNameKeyword);
		setOwner(newOwner);
		setSynced(newSynced);
	}
	
	public void setId(String newId){
		id = newId;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setBoardId(String newBoardId){
		board_id = newBoardId;
	}
	public void setNameKeyword(String newNameKeyword){
		name_keyword = newNameKeyword;
	}
	public void setOwner(String newOwner){
		owner = newOwner;
	}
	public void setSynced(Integer newSynced){
		synced = newSynced;
	}
	
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getBoardId(){
		return board_id;
	}
	public String getNameKeyword(){
		return name_keyword;
	}
	public String getOwner(){
		return owner;
	}
	public Integer getSynced(){
		return synced;
	}
	
}