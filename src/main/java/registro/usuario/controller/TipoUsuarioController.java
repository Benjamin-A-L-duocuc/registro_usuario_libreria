package registro.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import registro.usuario.model.TipoUsuario;
import registro.usuario.service.TipoUsuarioService;

@RestController
@RequestMapping("api/v1/tipoUsuario")
public class TipoUsuarioController {
	@Autowired
	private TipoUsuarioService tipoUsuarioService;

	@GetMapping("{id}")
	public TipoUsuario getById(@PathVariable Long id) {
		return tipoUsuarioService.buscarId(id);
	}

	@GetMapping
	public List<TipoUsuario> gettipos() {
		return tipoUsuarioService.findAll();
	}

	@PostMapping
	public TipoUsuario postTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
		return tipoUsuarioService.postTipoUsuario(tipoUsuario);
	}

}
