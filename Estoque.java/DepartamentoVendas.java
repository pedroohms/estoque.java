public class DepartamentoVendas implements Observer {
    public void update(String mensagem) {
        System.out.println("Vendas: " + mensagem);
    }
}
