
public class AssistantLecturer extends Lecturer{
	public String ass_lect_id;
	
	public AssistantLecturer(String lect_id, String lect_nm, String ass_lect_id) {
		super();
		this.ass_lect_id = ass_lect_id;
	}
	
	public String getAss_lect_id() {
		return this.ass_lect_id;
	}
}
