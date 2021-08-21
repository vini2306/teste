public Motorista gatMotorista() {
    return motorista;
}

public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
}

void acelerar() {
    VelocidadeAtual++;
}

void acelerar(int limite){
    for(int i = VelocidadeAtual; i < limite; i++){
        acelerar();
    }
}