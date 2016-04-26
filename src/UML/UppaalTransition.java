package UML;


public class UppaalTransition {
	int sourceId;

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	int targetId;
	public String[] Kind = new String[5];

	public String[] getKind() {
		return Kind;
	}

	public void setKind(String[] kind) {
		Kind = kind;
	}

	String[] nameText = new String[5];

	public String[] getNameText() {
		return nameText;
	}

	public void setNameText(String[] nameText) {
		this.nameText = nameText;
	}

	String nameS = new String();

	public String getNameS() {
		return nameS;
	}

	public void setNameS(String nameS) {
		this.nameS = nameS;
	}

	public String getNameT() {
		return nameT;
	}

	public void setNameT(String nameT) {
		this.nameT = nameT;
	}
    public String getInner() {
		return inner;
	}

	public void setInner(String inner) {
		this.inner = inner;
	}
    String time;
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	String inner;
	String nameT = new String();
	
	
	
	
	
	String fromName;
	String toName;

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}
	
	
	
	
}
