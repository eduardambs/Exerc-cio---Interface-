package src.pacotes;

public class Consultorio {
    public static void qualOSeuNome(Paciente _paciente) {
        System.out.println(_paciente.dizerOla());
    }

    public static void qualOSeuProblema(Paciente _paciente) {
        System.out.println(_paciente.dizerDoenca());
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, 70.5);
        Cachorro cachorro = new Cachorro("Rex", 5, 15.2);

        Consultorio.qualOSeuNome(pessoa);
        Consultorio.qualOSeuProblema(pessoa);

        Consultorio.qualOSeuNome(cachorro);
        Consultorio.qualOSeuProblema(cachorro);
    }
}
