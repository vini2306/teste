Import java.util.ImputMisMatchException;

Public class carro{
    private String LetrasPlaca;
    private int NumerosPlaca;
    private int NumChassi;
    private int VelocidadeAtual;
    private Motorista motorista;

    public carro(Motorista motorista){
        this.motorista = motorista;
        motorista.setVeiculo(this);
    }

    public carro(String placa, int NumChassi, Motorista motorista){
        this(motorista);
        setPlaca(placa);
        this.NumChassi = NumChassi;
    }

}
