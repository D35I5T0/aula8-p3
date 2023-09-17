public class BancoDeDados {
    private String[] lista;
    private int qtd;
    private final String login;
    private final String senha;

    public BancoDeDados(String login, String senha) {
        this.lista = new String[20];
        this.login = login;
        this.senha = senha;
    }

    public boolean checkUser(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public void adicionar(String dado, String login, String senha) {
        if (checkUser(login, senha)) {
            if (this.qtd < this.lista.length) {
                this.lista[this.qtd] = dado;
                this.qtd++;
            }
        }
    }

    public void remover(String dado, String login, String senha) {
        if (checkUser(login, senha)) {
            for (int i = 0; i < this.qtd; i++) {
                if (dado.equals(this.lista[i])) {
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

    public void atualizar(String login, String senha, String dadoAntigo, String dadoNovo) {
        if (checkUser(login, senha)) {
            for (int i = 0; i < this.qtd; i++) {
                if (this.lista[i].equals(dadoAntigo)) {
                    this.lista[i] = dadoNovo;
                }
            }
        }
    }
}