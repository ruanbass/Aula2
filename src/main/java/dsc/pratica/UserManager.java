package dsc.pratica;

import java.util.List;

public class UserManager {
	List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public boolean validarUsuario(String nome,String senha){
		for (int x = 0; x< usuarios.size(); x++){
			if(usuarios.get(x).getNome() == nome && usuarios.get(x).getSenha() == senha ){
				return true;
			}
			
	}
		return false;
}
}