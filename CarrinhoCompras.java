public class CarrinhoCompras {
    private String[] lista;
    private int qtd;
    private final String login;
    private final String senha;

    public CarrinhoCompras(String login, String senha) {
        this.lista = new String[20];
        this.login = login;
        this.senha = senha;
    }

    public boolean checkUser(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public void adicionarCarrinho(String produto, String login, String senha) {
        if (checkUser(login, senha)) {
            if (this.qtd < this.lista.length) {
                this.lista[this.qtd] = produto;
                this.qtd++;
            }
        }
    }

    public void removerCarrinho(String produto, String login, String senha) {
        if (checkUser(login, senha)) {
            for (int i = 0; i < this.qtd; i++) {
                if (produto.equals(this.lista[i])) {
                    this.lista[i] = null;
                    for (int j = i; j < this.qtd - 1; j++) {
                        this.lista[j] = this.lista[j + 1];
                    }
                    this.qtd--;
                    return;
                }
            }
        }
    }

    public void listarCarrinho(String login, String senha) {
        if (checkUser(login, senha)) {
            for (int i = 0; i < this.qtd; i++) {
                System.out.println(this.lista[i]);
            }
        }
    }
}