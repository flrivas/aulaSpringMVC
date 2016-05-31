package br.csi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.csi.dao.ClienteDao;
import br.csi.modelo.Cliente;

@Controller
public class ClienteControler {
	
	
	@RequestMapping("clientes")
    public String msgTeste(){
    	System.out.println("chamou o controlador");
    	return "cliente";
	}
	
	@RequestMapping("adicionarClientes")
	public String adiciona(Cliente cliente){
		
		boolean retorno = new ClienteDao().adiciona(cliente);
		if(retorno){
			return "cliente";
		}else{
			return "erro";
		}
		
	}
	
	@RequestMapping("listaClientes")
	public ModelAndView lista(){
		ModelAndView mv = new ModelAndView("cliente");
		System.out.println("...");
        mv.addObject("clientes", new ClienteDao().listaClientes());
		return mv;
	}

}
