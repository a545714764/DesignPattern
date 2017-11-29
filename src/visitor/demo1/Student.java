package visitor.demo1;

public class Student implements Person {
	private String name;
	private int paperAmount;
	private double score;
	
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public void accept(AwardCheck check) {
		check.visit(this);

	}

}
