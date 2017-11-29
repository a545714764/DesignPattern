package Interpreter.Demo1;

import java.util.Stack;

public class InstructionHander {
	private String instruction;
	private AbstractNode node;
	public void handle(String instruction){
		AbstractNode left =null,right=null;
		AbstractNode direction = null,action=null,distance=null;
		Stack<AbstractNode> stack = new Stack<AbstractNode>();
		String[] words = instruction.split(" ");
		for(int i =0;i<words.length;i++){
			if(words[i].equalsIgnoreCase("and")){
				left = (AbstractNode) stack.pop();
				
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				
				String word2 = words[++i];
				action = new ActionNode(word2);
				
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				
				right = new SentenceNode(direction,action,distance);
				stack.push(new AndNode(left,right));
			}else{
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				left = new SentenceNode(direction, action, distance);
				stack.push(left);
			}
			
		}
		this.node = (AbstractNode) stack.pop();
	}
	public String output(){
		String result = node.interpret();
		return result;
	}
}
