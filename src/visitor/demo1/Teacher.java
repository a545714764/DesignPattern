package visitor.demo1;
//��ʦ�ࣺ����Ԫ����
public class Teacher implements Person {
	private String name;
	private int paperAmount;
	private double feedbackScore;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaperAmount() {
		return paperAmount;
	}

	public void setPaperAmount(int paperAmount) {
		this.paperAmount = paperAmount;
	}

	public double getFeedbackScore() {
		return feedbackScore;
	}

	public void setFeedbackScore(double feedbackScore) {
		this.feedbackScore = feedbackScore;
	}

	@Override
	public void accept(AwardCheck check) {
		check.visit(this);

	}

}
