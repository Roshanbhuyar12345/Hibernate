package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int quetionId;
	
	private String quetion;
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer answer;
	
	public Question(int quetionId, String quetion, Answer answer) {
		super();
		this.quetionId = quetionId;
		this.quetion = quetion;
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuetionId() {
		return quetionId;
	}
	public void setQuetionId(int quetionId) {
		this.quetionId = quetionId;
	}
	public String getQuetion() {
		return quetion;
	}
	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [quetionId=" + quetionId + ", quetion=" + quetion + ", answer=" + answer + "]";
	}

	

}
