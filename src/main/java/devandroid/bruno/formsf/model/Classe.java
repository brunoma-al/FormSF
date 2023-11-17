package devandroid.bruno.formsf.model;

public class Classe {

    private String primeiroNome;
    private String sobreNome;
    private String clienteEmail;
    private String clienteEndereco;
    private String clienteCandidatura;
    private String clienteSenha;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(String clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
    }

    public String getClienteCandidatura() {
        return clienteCandidatura;
    }

    public void setClienteCandidatura(String clienteCandidatura) {
        this.clienteCandidatura = clienteCandidatura;
    }

    public String getClienteSenha() {
        return clienteSenha;
    }

    public void setClienteSenha(String clienteSenha) {
        this.clienteSenha = clienteSenha;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", clienteEmail='" + clienteEmail + '\'' +
                ", clienteEndereco='" + clienteEndereco + '\'' +
                ", clienteCandidatura='" + clienteCandidatura + '\'' +
                ", clienteSenha='" + clienteSenha + '\'' +
                '}';
    }
}
