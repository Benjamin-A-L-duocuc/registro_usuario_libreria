package registro.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import registro.usuario.model.TipoUsuario;
import registro.usuario.repository.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;

	public TipoUsuario buscarId(Long id) {
		return tipoUsuarioRepository.findById(id).orElse(null);
	}

	public List<TipoUsuario> findAll() {
		return tipoUsuarioRepository.findAll();
	}

	public TipoUsuario postTipoUsuario(TipoUsuario tipoUsuario) {
		return tipoUsuarioRepository.save(tipoUsuario);
	}

}
