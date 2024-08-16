import java.util.List;

public class Banco {
    
    private String nome;
    protected List<Conta> contas;       /*Pode substituir por: "contas = new ArrayList<>();" */
    protected List<Cliente> clientes;

    public Banco (String nome) {
        this.nome = nome;
    }
    
    public void setNomeBanco(String nome) {
	this.nome = nome;
    }  

    public List<Conta> getContas() {
        return contas;
    }
    
    public void setContas(List<Conta> contas) {
		this.contas = contas;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void SetClientes(List<Cliente> clientes) {
		this.clientes = clientes;
    }
}