package br.csi.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {
	
	
	private ArrayList<Cliente> clientes;
	
	private void initClientes(){
		
		Clientes = new ArrayList<Cliente>();
		Cliente c = new Cliente();
		c.setNome("Paulo");
		c.setBairro("Centro");
		c.setRuaNroComp("duque de caxias n 187, apto 258");
		c.setCidade("Santa Maria");
		clientes.add(c);
		
		Cliente c1 = new Cliente();
		c.setNome("Fernando");
		c.setBairro("Centro");
		c.setRuaNroComp("araujio viana 123, apto 401");
		c.setCidade("Santa Maria");
		clientes.add(c1);
		
	}
	
	public boolean adiciona(Cliente c){
		
		//System.out.println("Codigo: " + c.getCodigo());
		System.out.println("Nome: " + c.getNome());
		System.out.println("RuaNroComp: " + c.getRuaNroComp());
		System.out.println("Bairro: " + c.getBairro());
		System.out.println("Cidade: " + c.getCidade());
		
		clientes.add(c);
		return true;
	}
	
	public ArrayList<Cliente> listaClientes(){
		
		return clientes;
		
	}

}
