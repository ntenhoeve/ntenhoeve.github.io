package nth.github.page.generator.model.text;

import java.util.ArrayList;
import java.util.List;

public class NodeContainer extends Node {
	private List<Node> childeren;

	public NodeContainer() {
		childeren = new ArrayList<>();
	}

	public List<Node> getChilderen() {
		return childeren;
	}

	public void setChilderen(List<Node> childeren) {
		this.childeren = childeren;
	}
	
	public List<Node> findChilderenOfType(  Class<? extends Node> classToFind) {
		return findChilderenOfType(this, classToFind);
	}
	
	private List<Node> findChilderenOfType(Node node,  Class<? extends Node> classToFind) {
		List<Node> results=new ArrayList<>();
		if (classToFind.isInstance(node)) {
			results.add(node);
		}
		if (node instanceof NodeContainer) {
			NodeContainer nodeContainer = (NodeContainer) node;
			for (Node child:nodeContainer.getChilderen()) {
				//recursive call on children
				results.addAll(findChilderenOfType(child,classToFind));
			}	
		}
		return results;
	}

}
