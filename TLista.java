public class TLista {
	private TNodo cab;
	private TNodo last;
	TLista(){
		this.cab = new TNodo();
		this.last = cab;
	}

	public void addLast(Persona info){
		TNodo newNode = new TNodo(info);
		last.setEnlace(newNode);
		last = newNode;
	}

	public void removeNode(Persona nodeInfo){
		TNodo previousNode = this.cab;
		TNodo currentNode = previousNode.getEnlace();
		TNodo nextNode = currentNode.getEnlace();
		while(currentNode.getPersona() != nodeInfo && nextNode != null){
			previousNode = currentNode;
			currentNode = currentNode.getEnlace();
			nextNode = currentNode.getEnlace();
		}
		String out;
		if (currentNode.getPersona() == nodeInfo){
			previousNode.setEnlace(nextNode);
			out = "Se ha eliminado el nodo correctamente";
		}
		else {
			out = "No se ha encontrado el nodo";
		}
		System.out.println(out);
	}

	public void insertAtStart(Persona info){
		TNodo newNode = new TNodo(info);
		newNode.setEnlace(this.cab.getEnlace());
		this.cab.setEnlace(newNode);
	}

	public void addSort(Persona info){
		TNodo newNode = new TNodo(info);
		TNodo currentNode = cab;
		TNodo nextNode = currentNode.getEnlace();
		while (nextNode != null && nextNode.getPersona().getEdad() < info.getEdad()){
			currentNode = currentNode.getEnlace();
			nextNode = currentNode.getEnlace();
		}
		newNode.setEnlace(nextNode);
		currentNode.setEnlace(newNode);
	}

	public void showList(){
		TNodo currentNode = this.cab.getEnlace();
		while (currentNode.getEnlace() != null){
			System.out.println(currentNode.getPersona());
			currentNode = currentNode.getEnlace();
		}
		System.out.println(currentNode.getPersona());
	}

	public Persona[] toArray(){
		int size = 0;
		TNodo currentNode = this.cab.getEnlace();
		while (currentNode.getEnlace() != null){
			size++;
			currentNode = currentNode.getEnlace();
		}
		size++;
		Persona[] array = new Persona[size];
		currentNode = this.cab.getEnlace();
		for (int i = 0; i < size; i++){
			array[i] = currentNode.getPersona();
			currentNode = currentNode.getEnlace();
		}
		return array;
	}
}
