package projeto;

public class Aluno {
    public String nomeCompleto;
    public String dataNascimento;
    public char sexo;
    public String matricula;
    public String curso;
    public String cpf;
    public String rua;
    public String numero;
    public String bairro;
    public String cidade;
    public String cep;
    public String estado;
    public String telefone;

    public Aluno(String nomeCompleto, String dataNascimento, char sexo,
                 String matricula, String curso, String cpf,
                 String rua, String numero, String bairro, String cidade, String cep, 
                 String estado, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.telefone = telefone;
    }

    Aluno(String text, String text0, char sexo, String text1, String text2, String text3, String text4, String string, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String paraLinhaTexto() {
        return nomeCompleto + ";" + dataNascimento + ";" + sexo + ";" +
               matricula + ";" + curso + ";" + cpf + ";" +
               rua + ";" + numero + ";" + bairro + ";" + cidade + ";" + cep + 
               estado + ";" + telefone;
    }
}