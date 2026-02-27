import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente {
    public String nome = "Gustavo";
    public String cpf = "49306819098";
    public String rg = "554667296";
    public String nacionalidade = "Brasileiro";
    public Date dataNascimento = new Date(2006-1900, Calendar.APRIL,12);
    public String[] enderecos = new String[2];
    public String[] telefones = new String[3];

    public String resumoCliente() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Titular:%s%nCPF:%s%nRG:%s%nNacionalidade:%s%nDataNascimento:%s", nome, cpf, rg, nacionalidade, fmt.format(dataNascimento));
    }
}