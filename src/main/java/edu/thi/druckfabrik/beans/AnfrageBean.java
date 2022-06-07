/* Matthias Wimmer
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik.beans;

import java.io.Serializable;

public class AnfrageBean implements Serializable{
	private Integer anfrageID;
	private String link;
	private Integer kundenID;
	
	
	public Integer getKundenID() {
		return kundenID;
	}
	public void setKundenID(Integer kundenID) {
		this.kundenID = kundenID;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	public Integer getAnfrageID() {
		return anfrageID;
	}
	public void setAnfrageID(Integer anfrageID) {
		this.anfrageID = anfrageID;
	}
	
	
}
