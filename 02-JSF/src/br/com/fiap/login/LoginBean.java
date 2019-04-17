package br.com.fiap.login;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean {
	
	private String login;
	private String senha;
	private boolean termo;
	



	public String logar() {
		if(login.equals("teste") && senha.equals("teste")) {
			System.out.println("Usuario logado: " + login);
			return "comprar";
		}else {
			System.out.println("Informações inválidas");
			FacesMessage mensagem = new FacesMessage("Usuário inválido!");
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
			FacesMessage mensagem2 = new FacesMessage("Senha inválida!");
			FacesContext.getCurrentInstance().addMessage(null, mensagem2);
			return "login";
		}
	}
	
	
	public LoginBean() {
		super();
	}

	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public boolean isTermo() {
		return termo;
	}
	
	public void setTermo(boolean termo) {
		this.termo = termo;
	}
	
}
