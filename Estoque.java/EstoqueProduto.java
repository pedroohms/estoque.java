import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {
    private List<Observer> observadores = new ArrayList<>();
    private boolean emEstoque;

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
        if (emEstoque) {
            notificarObservadores();
        }
    }

    public void registrarObservador(Observer observer) {
        observadores.add(observer);
    }

    public void removerObservador(Observer observer) {
        observadores.remove(observer);
    }

    public void notificarObservadores() {
        for (Observer observer : observadores) {
            observer.update("produto voltou ao estoque!");
        }
    }
}
