import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {
	private List<String> listaSelecionados;
	private List<String> listaSelecionados2;
	
	
	
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("John Wick", 1));
		usuarios.add(new Usuario("Erick Sonny", 2));
		usuarios.add(new Usuario("Sadia Perdigão", 3));
		return usuarios;
		}
	

	public void cadastrar() {
		for(String u: listaSelecionados2) {
			System.out.println(u);
			System.out.println("----");
		}
		for(String i: listaSelecionados) {
			System.out.println(i);
		}
	}
	
	
	
	public List<String> getListaSelecionados2() {
		return listaSelecionados2;
	}


	public void setListaSelecionados2(List<String> listaSelecionados2) {
		this.listaSelecionados2 = listaSelecionados2;
	}

	public CadastroBean(List<String> listaSelecionados) {
		super();
		this.listaSelecionados = listaSelecionados;
	}

	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}

	public CadastroBean() {
		super();
	}
}
